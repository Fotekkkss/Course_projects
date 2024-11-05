package pl.testeroprogramowania.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//span[text()='Shop']")
    private WebElement shopLink;

    @FindBy(name = "nimble_name")
    private WebElement nameInput;

    @FindBy(name = "nimble_email")
    private WebElement emailInput;

    @FindBy(name = "nimble_message")
    private WebElement messageInput;

    @FindBy(name = "nimble_submit")
    private WebElement submitButton;

    @FindBy(xpath = "//span[@class='sek-form-message']")
    private WebElement formSubmittionMessage;

    @FindBy(xpath = "//span[@class='sek-form-message']")
    private WebElement formSubmittionError;

    @FindBy(partialLinkText = "Search")
    private WebElement searchButton;

    @FindBy(className = "czr-title")
    private WebElement secondPostage;

    @FindBy(id = "s-6714b2f1341f6")
    private WebElement searchInput;

    @FindBy

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public SearchResultsPage findProduct(String productName){
        searchButton.click();
        searchInput.sendKeys(productName);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchResultsPage(driver);
    }

    public MyAccountPage openMyAccountPage() {
        myAccountLink.click();
        return new MyAccountPage(driver);
    }

    public ProductListPage openShopPage() {
        shopLink.click();
        return new ProductListPage(driver);
    }

    public WebElement fillContactUsFormValidData(String name, String email, String message){
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        messageInput.sendKeys(message);
        submitButton.click();
        return formSubmittionMessage;
    }

    public WebElement fillContactUsFormInvalidData(String name, String email, String message){
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        messageInput.sendKeys(message);
        submitButton.click();
        return formSubmittionError;
    }

    public WebsiteCommentsPage openCommentsPage(){
        secondPostage.click();
        return new WebsiteCommentsPage(driver);
    }
}
