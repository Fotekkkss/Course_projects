import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HomeWork2 {
    @Test
    public void noDataProvided() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");

        driver.findElements(By.xpath("//li[@id='li_myaccount']")).stream().filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        driver.findElements(By.xpath("//a[text()='  Sign Up']")).get(1).click();
        driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();
        List<String> errorsNoData = driver.findElements(By.xpath("//div[@class='alert alert-danger']//p"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errorsNoData.contains("The Email field is required."));
        softAssert.assertTrue(errorsNoData.contains("The Password field is required."));
        softAssert.assertTrue(errorsNoData.contains("The Password field is required."));
        softAssert.assertTrue(errorsNoData.contains("The First name field is required."));
        softAssert.assertTrue(errorsNoData.contains("The Last Name field is required."));
        softAssert.assertAll();
    }

    @Test
    public void wrongEmailProvided() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");

        driver.findElements(By.xpath("//li[@id='li_myaccount']")).stream().filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        driver.findElements(By.xpath("//a[text()='  Sign Up']")).get(1).click();
        driver.findElement(By.name("firstname")).sendKeys("Bob");
        driver.findElement(By.name("lastname")).sendKeys("Tested");
        driver.findElement(By.name("phone")).sendKeys("+4922244455");
        driver.findElement(By.name("email")).sendKeys("bob.tested.com");
        driver.findElement(By.name("password")).sendKeys("tester12345");
        driver.findElement(By.name("confirmpassword")).sendKeys("tester12345");
        driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();

        List<String> errorEmail = driver.findElements(By.xpath("//div[@class='alert alert-danger']//p"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        Assert.assertTrue(errorEmail.contains("The Email field must contain a valid email address."));
    }
}