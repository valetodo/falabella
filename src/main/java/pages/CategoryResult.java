package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CategoryResult {

    private WebDriver webDriver;
    private JavascriptExecutor js;

    private WebDriverWait w;

    private final By buttonProductToBuy = By.xpath("//div[@id='testId-searchResults-products']/child::div[1]//button");

    private final By buttonViewProductCard = By.xpath("//div[@id='testId-searchResults']//a[@id='linkButton']");

    private final By buttonCloseProduct = By.xpath("//*[@id='testId-searchResults']/div[1]/div/div/div/div/div[1]/button/i");

    public CategoryResult(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.js = (JavascriptExecutor) webDriver;
    }

    public void getScrollDown() {

    }

    public void selectProduct() {
        w = new WebDriverWait(this.webDriver, Duration.ofSeconds(3));
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='testId-searchResults-products']")));
        WebElement element = webDriver.findElement(buttonProductToBuy);
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void closeAddProductPopup(){
        w = new WebDriverWait(this.webDriver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.presenceOfElementLocated(buttonCloseProduct));
        WebElement element = webDriver.findElement(buttonCloseProduct);
        element.click();
    }

    public Basket viewProductCard() {
        w = new WebDriverWait(this.webDriver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.presenceOfElementLocated(buttonViewProductCard));
        WebElement element = webDriver.findElement(buttonViewProductCard);
        element.click();
        return new Basket(webDriver);
    }
}
