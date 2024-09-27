import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ElementExistsTest {
    WebDriver driver;
    @Test
    public void elementExists(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        System.out.println(isElementExists(By.tagName("p")));
        System.out.println(isElementExists(By.id("topSecret")));
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());

        System.out.println("==========================================================");
        WebElement checkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
    }

    public boolean isElementExists(By locator){
        /*try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }*/
                 // OR
        return driver.findElements(locator).size()>0;
    }
}
