import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {
    @Test
    public void basicActions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();

        driver.findElement(By.id("clickOnMe")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("fname")).sendKeys("Sending keys");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByValue("volvo");

        List<WebElement> carsOptions = cars.getOptions();
        for (WebElement option : carsOptions){
            System.out.println(option.getText());
        }

        System.out.println(driver.findElement(By.name("username")).getText());
        System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

        WebElement hiddenPar = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("By text: "+hiddenPar.getText());
        System.out.println("By attribute: "+hiddenPar.getAttribute("value"));
        System.out.println("By text content: "+hiddenPar.getAttribute("textContent"));







    }
}
