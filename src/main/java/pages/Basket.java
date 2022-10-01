package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basket {
    private WebDriver webDriver;
    private final By buttonIncreaseProduct = By.className("increase");
    private final By buttonDecreaseProduct = By.className("decrease");
    private final By labelTotalProduct = By.id("quantityInput");
    private final By goToBuyProduct = By.className("fb-order-status__cta");

    private final By DropdownWarranty = By.cssSelector(".fb-warranty-dropdown.fb-inline-dropdown__link.js-inline-dropdown__link");
    private final By textSelectedWarrantyNothanks = By.xpath("//a[contains(text(),'No, gracias')]");
    private final By textSelectedWarrantyOneYear = By.xpath("//a[contains(text(),'1 año')]");
    private final By textSelectedWarrantyTwoYear = By.xpath("//a[contains(text(),'2 años')]");
    private final By textSelectedWarrantyThreeYear = By.xpath("//a[contains(text(),'3 años')]");

    public Basket (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void addQuantityProduct() {

    }
}
