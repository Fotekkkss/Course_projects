package pl.seleniumdemo.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pl.seleniumdemo.utils.DriverFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected static ExtentSparkReporter reporter;
    protected static ExtentReports extentReports;

    @BeforeSuite
    public void beforeSuite(){
        reporter = new ExtentSparkReporter("index.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }

    @AfterSuite
    public void afterSuite(){
        extentReports.flush();
    }

    @BeforeMethod
    public void setup() throws IOException {
        driver = DriverFactory.getDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        //driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
