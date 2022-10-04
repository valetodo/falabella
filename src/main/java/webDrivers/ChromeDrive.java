package webDrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

public class ChromeDrive implements IDriver{
    @Override
    public WebDriver webDriver() {
        WebDriverManager.getInstance(CHROME).setup();
        return new ChromeDriver();
    }
}
