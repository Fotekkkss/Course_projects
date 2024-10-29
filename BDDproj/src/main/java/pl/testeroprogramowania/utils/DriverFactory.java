package pl.testeroprogramowania.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            ChromeOptions optionsChrome = new ChromeOptions();
            optionsChrome.addArguments("--disable-search-engine-choice-screen");
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver = null;
        }
    }
}
