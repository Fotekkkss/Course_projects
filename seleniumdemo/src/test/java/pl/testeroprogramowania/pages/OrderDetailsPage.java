package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']")
    private WebElement orderNotice;

    @FindBy(xpath = "//td[contains(@class, 'product-name')]")
    private WebElement productName;

    @FindBy(partialLinkText = "Java Selenium WebDriver")
    private WebElement productNameSELENIUM;

    @FindBy(partialLinkText = "GIT basics")
    private WebElement productNameGIT;

    @FindBy(partialLinkText = "BDD Cucumber")
    private WebElement productNameBDD;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getGitName() {
        return productNameGIT;
    }

    public WebElement getBddName() {
        return productNameBDD;
    }

    public WebElement getSeleniumName() {
        return productNameSELENIUM;
    }

    public OrderDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public WebElement getOrderNotice() {
        return orderNotice;
    }
}
