package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CategoryResult {

    private WebDriver webDriver;
    private JavascriptExecutor js;

    private WebDriverWait w;

    private final By buttonProductToBuy = By.xpath("//div[@id='testId-searchResults-products']/child::div[1]//button");

    private final By buttonViewProductCard = By.xpath("//div[@id='testId-searchResults']//a[@id='linkButton']");

    public CategoryResult(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.js = (JavascriptExecutor) webDriver;
    }

    public void getScrollDown() {

    }

    public void selectProduct() {
        w = new WebDriverWait(this.webDriver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='testId-searchResults-products']")));
        WebElement element = webDriver.findElement(buttonProductToBuy);
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public Basket viewProductCard() {
        WebElement element = webDriver.findElement(buttonViewProductCard);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        element.click();
        return new Basket(webDriver);
    }
}
