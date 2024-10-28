package BDDdef;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pl.testeroprogramowania.utils.DriverFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

import java.time.Duration;


public class UserRegistrationStepDefs {

    @After

    public void tearDown(){
        DriverFactory.quitDriver();
    }

    @Given("User is on main shop age")
    public void user_is_on_main_shop_age() {
        DriverFactory.getDriver().manage().window().maximize();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        DriverFactory.getDriver().get("http://seleniumdemo.com/");
    }

    @When("Go to My Account page")
    public void goToMyAccountPage() {
        DriverFactory.getDriver().findElement(By.xpath("//span[text()='My account']")).click();
    }

    @And("Enter correct data to registration form")
    public void enterCorrectDataToRegistrationForm() {
        int random = (int) (Math.random()*1000);
        DriverFactory.getDriver().findElement(By.id("reg_email")).sendKeys("test"+random+"@test.com");
        DriverFactory.getDriver().findElement(By.id("reg_password")).sendKeys("testassworaboba%@d123");
        for (int i=0;i<3;i++){
            if (DriverFactory.getDriver().findElements(By.name("register")).size()>0){
                DriverFactory.getDriver().findElement(By.name("register")).click();
            }
        }

    }

    @Then("User is redirected to My Account page")
    public void userIsRedirectedToMyAccountPage() throws InterruptedException {
        SeleniumHelper.waitForElementToExist(By.linkText("Dashboard"));
        Assert.assertEquals(DriverFactory.getDriver().findElement(By.linkText("Dashboard")).getText(), "Dashboard" );
    }

    @But("Register form is not visible")
    public void registerFormIsNotVisible() {
        int emailInputsSize = DriverFactory.getDriver().findElements(By.id("reg_email")).size();
        Assert.assertTrue(emailInputsSize==0);
    }

    @And("Enter incorrect data to registration form")
    public void enterIncorrectDataToRegistrationForm() throws InterruptedException {
        DriverFactory.getDriver().findElement(By.id("reg_email")).sendKeys("test@test.com");
        DriverFactory.getDriver().findElement(By.id("reg_password")).sendKeys("testassword123");
        for (int i=0;i<3;i++){
            if (DriverFactory.getDriver().findElements(By.xpath("//ul[@class='woocommerce-error']//li")).size()==0){
                DriverFactory.getDriver().findElement(By.name("register")).click();
            }
        }
    }

    @Then("Invalid email error appears")
    public void invalidEmailErrorAppears() {
        String error = DriverFactory.getDriver().findElement(By.xpath("//ul[@class='woocommerce-error']//li")).getText();
        Assert.assertTrue(error.contains("An account is already registered with your email address"));
    }
}
