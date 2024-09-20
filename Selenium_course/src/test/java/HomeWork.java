import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class HomeWork {
    public void homeWorkSelector(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://poe.ninja/");

        driver.findElement(By.cssSelector("#downshift-0-input")); // by id
        driver.findElement(By.cssSelector("._text_91ms6_1 ")); // by className
      //  driver.findElement(By.cssSelector("input")).sendKeys("first"); // by tagName
      //  driver.findElement(By.cssSelector("[name='fname']")); // by name - [attribute='value']
        driver.findElement(By.cssSelector("[class='leaderboard-top']")); // by class2

        driver.findElement(By.cssSelector("*")); // find all attributes/tags
        driver.findElement(By.cssSelector("div ul"));
     //   driver.findElement(By.cssSelector("table tr"));
      //  driver.findElement(By.cssSelector("tbody tr"));
        driver.findElement(By.cssSelector("div > ul")); // div > ul - first child in div
     //   driver.findElement(By.cssSelector("tbody > tr")); // tbody > tr - first child in tbody
       // driver.findElement(By.cssSelector("label + form")); // first form after label
        //driver.findElement(By.cssSelector("label ~ form")); // all forms after label
      //  driver.findElement(By.cssSelector("input[name='fname']")); // restricted to find name in input only
        driver.findElement(By.cssSelector("[class*='flex']")); // find each attrubute that contains * /*
        driver.findElement(By.cssSelector("[class^='fle']")); // find each, that starts with * /^
        driver.findElement(By.cssSelector("[class$='ll']")); // find each, that ends with * /$
        driver.findElement(By.cssSelector("li:first-child")); // find first child of *
        driver.findElement(By.cssSelector("li:last-child")); // find last child of *
        driver.findElement(By.cssSelector("li:nth-child(3)")); // find child with * index (starts from 1)
    }

}
