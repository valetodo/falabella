package pages;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    WebDriverWait wait;

    private WebDriver webDriver;
    private Shadow shadow;
    private By inputTextSearchProduct = By.id("testId-SearchBar-Input");
    private By buttonSearchProduct = By.xpath("//div[@id='testId-search-wrapper']//button");
    private By buttonPopupNoSubscribe = By.xpath("//div[@class='airship-html-prompt-shadow']");
    private By quantityProductInBasket = By.xpath("//li[@id='testId-UserAction-basket']//i");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickNoPopupSubscribe(){
        shadow = new Shadow(webDriver);
        WebElement element = shadow.findElementByXPath("//button[@class='airship-btn airship-btn-deny']");
        element.click();
    }

    public String getQuantityProductInBasket(){
        WebElement element = webDriver.findElement(quantityProductInBasket);
        String productInBasket = element.getAttribute("data-count");
        return productInBasket;
    }

    public CategoryResult searchAProduct(String product) {
        WebElement element = webDriver.findElement(inputTextSearchProduct);
        element.sendKeys(product);
        element = webDriver.findElement(buttonSearchProduct);
        element.click();
        return new CategoryResult(webDriver);
    }

    public static MainPage searchPage(WebDriver webDriver, String pageToSearch) {
        WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys(pageToSearch);
        element.submit();
        WebDriverWait w = new WebDriverWait(webDriver, 10);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Lo encontré en Falabella.com']")));
        WebElement page = webDriver.findElement(By.xpath("//h3[text()='Lo encontré en Falabella.com']"));
        page.click();
        return new MainPage(webDriver);
    }
}
