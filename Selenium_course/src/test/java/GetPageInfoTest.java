import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class GetPageInfoTest {
    @Test
    public void getPageInfo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
