package base;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ReportManager;
import helper.ScreenShotHelper;
import webDrivers.DriveFactory;

public abstract class BaseTest {
    protected WebDriver webDriver;
    protected DriveFactory driveFactory;

    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportManager.init("Reports", "falabella");
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(ITestResult iTestResult, String browser){
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
        driveFactory = new DriveFactory();
        webDriver = driveFactory.getWebDriver(browser);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failed");
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passed");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }

            if(iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null){
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(webDriver != null)
                webDriver.quit();
        }
    }

    @AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }

    @AfterSuite
    public static void tearDownSuite(){
        ReportManager.getInstance().flush();
    }
}
