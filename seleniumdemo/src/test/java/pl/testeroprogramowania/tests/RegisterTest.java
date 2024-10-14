package pl.testeroprogramowania.tests;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest(){
        new HomePage(driver).openMyAccountPage()
                .registerUser("test@test.com","test@test.com");

    }
}
