import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By buttonID = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonID);
        driver.findElement(By.name("fname"));
        driver.findElement(By.className("topSecret")); // hidden paragraf
        driver.findElement(By.tagName("input")).sendKeys("first input");  // find element / tagname finds only first element on page
        List<WebElement> inputs = driver.findElements(By.tagName("input")); // find elementS all elemensts on page to list
        System.out.println(inputs.size());
        driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.findElement(By.partialLinkText("Visit W3Schools"));

    }
}
