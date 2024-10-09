package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class SignUpPage {

    @FindBy(name="firstname")
    private WebElement firstNameInput;

    @FindBy(name="lastname")
    private WebElement lastNameInput;

    @FindBy(name="phone")
    private WebElement phoneInput;

    @FindBy(name="email")
    private WebElement emailInput;

    @FindBy(name="password")
    private WebElement passwordInput;

    @FindBy(name="confirmpassword")
    private WebElement confirmpasswordInput;

    @FindBy(xpath="//button[text()=' Sign Up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']//p")
    private List<WebElement> errors;

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstname){
        firstNameInput.sendKeys(firstname);
    }
    public void setLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    public void setPhone(String phone){
        phoneInput.sendKeys(phone);
    }
    public void setEmail(String email){
        emailInput.sendKeys(email);
    }
    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        confirmpasswordInput.sendKeys(confirmPassword);
    }
    public void signUp(){
        signUpButton.click();
    }
    public List<String> getErrors(){
        return errors.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
    /*public void fillSignUpForm(String firstname, String lastname, String phone, String email, String password){
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        phoneInput.sendKeys(phone);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmpasswordInput.sendKeys(password);
        signUpButton.click();
    }*/
}
