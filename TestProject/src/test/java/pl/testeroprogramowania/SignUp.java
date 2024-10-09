package pl.testeroprogramowania;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HotelSearchPage;
import pl.seleniumdemo.pages.LoggedUserPage;
import pl.seleniumdemo.pages.SignUpPage;
import pl.seleniumdemo.tests.BaseTest;

public class SignUp extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(SignUp.class);

    @Test
    public void signUpTest(){
        String lastName = "Tested";
        int randomNumber = (int) (Math.random()*1000);

        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.openSignUpForm();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.setFirstName("Bob");
        signUpPage.setLastName(lastName);
        signUpPage.setPhone("+4922244455");
        signUpPage.setEmail("bob.tested"+randomNumber+"@gmail.com");
        signUpPage.setPassword("tester12345");
        signUpPage.setConfirmPassword("tester12345");
        signUpPage.signUp();


        LoggedUserPage loggedUserPage = new LoggedUserPage(driver);

        Assert.assertTrue(loggedUserPage.getHeadingText().contains(lastName));
        Assert.assertEquals(loggedUserPage.getHeadingText(), "Hi, Bob Tested");

    }






    /*@Test
    public void signUpTest2(){
        String lastName = "Tested";
        int randomNumber = (int) (Math.random()*1000);
        String email = "bob.tested"+randomNumber+"@gmail.com";
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.openSignUpForm();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.fillSignUpForm("Bob","Tested","+444444444",email,"tester12345");

        LoggedUserPage loggedUserPage = new LoggedUserPage(driver);

        Assert.assertTrue(loggedUserPage.getHeadingText().contains(lastName));
        Assert.assertEquals(loggedUserPage.getHeadingText(), "Hi, Bob Tested");

    }*/
}
