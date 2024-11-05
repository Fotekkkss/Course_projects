package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class CartPage {

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    private WebElement proceedToCheckoutButton;

    @FindBy(className = "input-text")
    private WebElement quantityInput;

    @FindBy(name = "update_cart")
    private WebElement updateCartButton;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AddressDetailsPage openAddressDetails() {
        SeleniumHelper.waitForClickable(proceedToCheckoutButton,driver);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }
    public AddressDetailsPage addAdditionalProducts(String amount){
        quantityInput.clear();
        quantityInput.sendKeys(amount);
        updateCartButton.click();
        driver.navigate().refresh();
        SeleniumHelper.waitToBePresent(By.xpath("//a[@class='checkout-button button alt wc-forward']"),driver);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }
}
