package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPayment {

    private WebDriver webDriver;

    private final By selectGiftCard = By.xpath("//div[@id='fbra_checkoutAddGiftCard']//div[@class='fbra_falabellaComponent fbra_falabellaComponentCheckoutAddGiftCard']");

    private final By textBoxGiftCardNumber = By.id("giftCardNumber");
    private final By textBoxSecurityCode = By.id("giftCardSecurityCode");
    private final By buttonAdd = By.xpath("//div[@id='fbra_checkoutAddGiftCard']//button");

    public CheckoutPayment(WebDriver webDriver) {

        this.webDriver = webDriver;
    }


}
