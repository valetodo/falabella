package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
//        WebElement p=webDriver.findElement(By.name("q"));
//        p.sendKeys("falabella colombia");
//        WebDriverWait w = new WebDriverWait(webDriver, 5);
//        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Lo encontré en Falabella.com']")));
//        WebElement ingresar = webDriver.findElement(By.xpath("//h3[text()='Lo encontré en Falabella.com']"));
//        ingresar.click();
//        p.submit();
    }

    @AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }
}
