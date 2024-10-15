package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetailsPage {

    @FindBy(id = "billing_first_name")
    private WebElement nameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_address_1")
    private WebElement addressInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "select2-billing_country-container")
    private WebElement countrySelect;

    @FindBy(id = "billing_address_2")
    private WebElement addressSecondInput;

    @FindBy(id = "billing_postcode")
    private WebElement postcodeInput;

    @FindBy(id = "billing_city")
    private WebElement cityInut;

    @FindBy(id = "billing_email")
    private WebElement emailInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    @FindBy(id = "order_comments")
    private WebElement orderCommentsInput;

    private WebDriver driver;

    public AddressDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
