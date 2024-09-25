import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowTest {
    @Test
    public void testNewWindow(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();
        String currentWindow = driver.getWindowHandle();

        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles();
        for (String window : windowNames){
            if (!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        WebElement agree = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        agree.click();
        driver.findElement(By.name("q")).sendKeys("Selenium");



    }
}
