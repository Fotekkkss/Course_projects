package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class ContactUsFormTest extends BaseTest{
    @Test
    public void contactUsFormValidDataTest(){
        WebElement postSubmitMessage = new HomePage(driver)
                .fillContactUsFormValidData("Bob","bob.tester@test.com","Test message for contact us form");

        Assert.assertEquals(postSubmitMessage.getText(), "It is demo page! We are not sending emails!");
    }
    @Test
    public void contactUsFormInvalidDataTest(){
        WebElement postSubmitError = new HomePage(driver)
                .fillContactUsFormInvalidData("Bob","bob.tester","Test message for contact us form");

        Assert.assertEquals(postSubmitError.getText(), "Invalid form submission : some fields have not been entered properly. The following field is not well formed : Test Data.");
    }

}
