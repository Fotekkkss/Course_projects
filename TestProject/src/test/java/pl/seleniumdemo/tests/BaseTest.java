package pl.seleniumdemo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.seleniumdemo.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = DriverFactory.getDriver("google");
        ChromeOptions optionsChrome = new ChromeOptions();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
