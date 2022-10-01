package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product {
    private WebDriver webDriver;

    private final By buttonWarrantyOneYear = By.id("testId-warranty-option-btn-1-año de");
    private final By buttonWarrantyTwoYear = By.id("testId-warranty-option-btn-2-años de");
    private final By buttonWarrantyThreeYear = By.id("testId-warranty-option-btn-3-años de");
    private final By buttonWarrantyFourYear = By.id("testId-warranty-option-btn-4-años de");
    private final By buttonWarrantyNothanks = By.id("testId-warranty-option-btn-nothanks");
    private final By buttonAddToCard = By.id("buttonForCustomers");
    private final By buttonPopUpGoToCard = By.id("linkButton");
}
