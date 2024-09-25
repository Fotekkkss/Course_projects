
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class IFrameTest {
    @Test
    public void testNewWindow(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");

        WebElement iFrame = driver.findElement(By.cssSelector("[src='basics.html']"));
        // driver.switchTo().frame("id value or name value");  where is applicable
        driver.switchTo().frame(iFrame);
        driver.findElement(By.name("fname")).sendKeys("Admin");




    }
}
