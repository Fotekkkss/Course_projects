package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.DriverFactory;

import java.security.cert.X509Certificate;
import java.util.List;

public class RegisterUserPage {

    @FindBy(id = "reg_email")
    public WebElement usernameInput;

    @FindBy(id = "reg_password")
    public WebElement passwordInput;

    @FindBy(name = "register")
    public WebElement registerButton;

    @FindBy(name = "register")
    public List<WebElement> registerButtons;

    @FindBy(id = "reg_email")
    public List<WebElement> usernameInputs;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    public WebElement errorMessage;

    public RegisterUserPage(){
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public void registerUser(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        registerButton.click();
    }
    public String getErrorText(){
        return errorMessage.getText();
    }

    public int getUsernameInpputSize(){
        return usernameInputs.size();
    }
}
