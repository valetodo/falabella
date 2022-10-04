package webDrivers;

import org.openqa.selenium.WebDriver;

public class DriveFactory {

    public WebDriver getWebDriver(String typeBrowser) {
        if (typeBrowser.equals("chrome")) {
            return new ChromeDrive().webDriver();
        } else if (typeBrowser.equals("firefox")) {
            return new FirefoxDrive().webDriver();
        } else {
            return null;
        }
    }
}
