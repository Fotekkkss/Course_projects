import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork1 {

    @Test
    public void searchNoCity(){
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");

        driver.findElement(By.name("checkin")).sendKeys("17.04.2025");
        driver.findElement(By.name("checkout")).click();
        driver.findElements(By.xpath("//td[@class='day ' and text()='21']")).stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .ifPresent(WebElement::click);
        driver.findElement(By.id("travellersInput")).click();
        driver.findElement(By.id("adultPlusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();
        driver.findElement(By.xpath("//button[text()=' Search']")).click();
        WebElement noResultFound = driver.findElement(By.xpath("//h2[text()='No Results Found']"));
        Assert.assertTrue(noResultFound.getText().contains("No Results Found"));
    }
}
