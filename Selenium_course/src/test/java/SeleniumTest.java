import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    //@Test
    public void openGooglePage(){
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(optionsChrome);
                //getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement agree = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        agree.click();
        driver.switchTo().defaultContent();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));
        Assert.assertTrue(result.isDisplayed());
        }






    public WebDriver getDriver(String browser){
        if (browser=="chrome"){
            return new ChromeDriver();
        } else if (browser=="firefox") {
            return new FirefoxDriver();
        } else if (browser=="explorer") {
            return new InternetExplorerDriver();
        }
        else {
            throw new InvalidArgumentException("Invalid browser name");
        }
    }
}
