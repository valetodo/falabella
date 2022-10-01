package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryResult {

    private WebDriver webDriver;

    private final By buttonProductToBuy = By.xpath("//div[@id='testId-searchResults-products']/child::div[1]//button");

    private final By buttonViewProductCard = By.xpath("//div[@id='testId-searchResults']//a[@id='linkButton']");
    public CategoryResult(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void selectProduct() {
        WebDriverWait w = new WebDriverWait(webDriver, 3);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='testId-searchResults-products']")));
        WebElement element = webDriver.findElement(buttonProductToBuy);
        element.click();

    }

    public Basket viewProductCard () {
        WebElement element = webDriver.findElement(buttonViewProductCard);
        element.click();
        return new Basket(webDriver);
    }
}
