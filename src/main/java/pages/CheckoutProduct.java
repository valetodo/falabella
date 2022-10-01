package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutProduct {

    private WebDriver webDriver;
    private String valueDepartamento = "CAQUETA";
    private String valueCiudad = "FLORENCIA";
    private String valueBarrio = "FLORENCIA";
    private final By DropdownListDepartamento = By.id("region");
    private final By DropdownListCiudad = By.id("region");
    private final By DropdownListBarrio = By.id("region");
    private By optionDepartamento = By.xpath(String.format("//option[text()='%s']", valueDepartamento));
    private By optionCiudad = By.xpath(String.format("//option[text()='%s']", valueCiudad));
    private By optionBarrio = By.xpath(String.format("//option[text()='%s']", valueBarrio));
    private final By buttonContinuar = By.cssSelector(".fbra_appContainer__buttonField.fbra_test_appContainer__buttonField");

    private final By textBoxAddress = By.id("address");
    private final By textBoxDepartmentNumber = By.id("departmentNumber");
    private final By buttonSetDirection = By.cssSelector(".fbra_button.fbra_test_button.fbra_formItem__useAddress");
}
