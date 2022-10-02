package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutProduct {

    private WebDriver webDriver;
    private String valueDepartamento = "CAQUETA";
    private String valueCiudad = "FLORENCIA";
    private String valueBarrio = "FLORENCIA";
    private final By DropdownListDepartamento = By.id("region");
    private final By DropdownListCiudad = By.id("region");
    private final By DropdownListBarrio = By.id("region");
    private By optionDepartamento = By.xpath(String.format("//option[text()='%s']", this.valueDepartamento));
    private By optionCiudad = By.xpath(String.format("//option[text()='%s']", this.valueCiudad));
    private By optionBarrio = By.xpath(String.format("//option[text()='%s']", this.valueBarrio));
    private final By buttonContinuar = By.cssSelector(".fbra_appContainer__buttonField.fbra_test_appContainer__buttonField");

    private final By textBoxAddress = By.id("address");
    private final By textBoxDepartmentNumber = By.id("departmentNumber");
    private final By buttonSetDirection = By.cssSelector(".fbra_button.fbra_test_button.fbra_formItem__useAddress");

    private final By buttonContinueCheckToBuy = By.xpath("//div[@id='fbra_checkoutDeliveryActions']//button");


    public CheckoutProduct(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void selectDropdownListDepartamento() {
        WebElement element = webDriver.findElement(DropdownListDepartamento);
        element.click();
    }
    public void selectDepartamento(String valueDepartamento) {
        this.valueDepartamento = valueDepartamento;
        WebElement element = webDriver.findElement(optionDepartamento);
        element.click();
    }

    public void selectDropdownListCiudad() {
        WebElement element = webDriver.findElement(DropdownListCiudad);
        element.click();
    }
    public void selectCiudad(String valueCiudad) {
        this.valueCiudad = valueCiudad;
        WebElement element = webDriver.findElement(optionCiudad);
        element.click();
    }

    public void selectDropdownListBarrio() {
        WebElement element = webDriver.findElement(DropdownListBarrio);
        element.click();
    }
    public void selectBarrio(String valueBarrio) {
        this.valueBarrio = valueBarrio;
        WebElement element = webDriver.findElement(optionBarrio);
        element.click();
    }

    public void selectButtonContinuar() {
        WebElement element = webDriver.findElement(buttonContinuar);
        element.click();
    }

    public void addAddress(String address) {
        WebElement element = webDriver.findElement(textBoxAddress);
        element.sendKeys(address);
    }

    public void addDepartmentNumber (String departmentNumber) {
        WebElement element = webDriver.findElement(textBoxDepartmentNumber);
        element.sendKeys(departmentNumber);
    }

    public void selectButtonSetDirection() {
        WebElement element = webDriver.findElement(buttonSetDirection);
        element.click();
    }

    public CheckoutPayment continueCheckToBuy() {
        WebElement element = webDriver.findElement(buttonContinueCheckToBuy);
        element.click();
        return new CheckoutPayment(this.webDriver);
    }
}
