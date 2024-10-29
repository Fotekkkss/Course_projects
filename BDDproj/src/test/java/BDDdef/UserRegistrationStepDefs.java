package BDDdef;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.LoggedUserPage;
import pl.testeroprogramowania.pages.RegisterUserPage;
import pl.testeroprogramowania.utils.DriverFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;


public class UserRegistrationStepDefs {

    public HomePage homePage;

    @After
    public void tearDown(){
        DriverFactory.quitDriver();
    }

    @Given("User is on main shop age")
    public void user_is_on_main_shop_age() {
        homePage = new HomePage();
        homePage.openHomePage();
    }

    @When("Go to My Account page")
    public void goToMyAccountPage() {
        homePage.goToMyAccountPage();
    }

    @And("Enter correct data to registration form")
    public void enterCorrectDataToRegistrationForm() {
        int random = (int) (Math.random()*1000);
        RegisterUserPage registerUserPage = new RegisterUserPage();
        registerUserPage.registerUser("test"+random+"@test.com","testassworaboba%@d123");
    }

    @Then("User is redirected to My Account page")
    public void userIsRedirectedToMyAccountPage() throws InterruptedException {
        LoggedUserPage loggedUserPage = new LoggedUserPage();
        Assert.assertTrue(loggedUserPage.isDashboardLinkDisplayed());
    }

    @But("Register form is not visible")
    public void registerFormIsNotVisible() {
        RegisterUserPage registerUserPage = new RegisterUserPage();
        Assert.assertTrue(registerUserPage.getUsernameInpputSize()==0);
    }

    @And("Enter incorrect data to registration form")
    public void enterIncorrectDataToRegistrationForm() throws InterruptedException {
        RegisterUserPage registerUserPage = new RegisterUserPage();
        registerUserPage.registerUser("test@test.com", "testassword123");
    }

    @Then("Invalid email error appears")
    public void invalidEmailErrorAppears() {
        RegisterUserPage registerUserPage = new RegisterUserPage();
        Assert.assertTrue(registerUserPage.getErrorText().contains("An account is already registered with your email address"));
    }

    @And("Enter email {string} and password {string}")
    public void enterEmailAndPassword(String email, String password) {
        int random = (int) (Math.random()*1000);
        RegisterUserPage registerUserPage = new RegisterUserPage();
        registerUserPage.registerUser(email,password);
    }
}
