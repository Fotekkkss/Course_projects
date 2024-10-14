package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import pl.testeroprogramowania.utils.DriverFactory;

import java.time.Duration;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverFactory.getDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
