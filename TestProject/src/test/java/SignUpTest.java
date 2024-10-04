import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
    @Test
    public void signUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.manage().window().maximize();
        driver.get("http://www.kurs-selenium.pl/demo/");

        String lastName = "Tested";
        int randomNumber = (int) (Math.random()*1000);

        driver.findElements(By.xpath("//li[@id='li_myaccount']")).stream().filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        driver.findElements(By.xpath("//a[text()='  Sign Up']")).get(1).click();
        driver.findElement(By.name("firstname")).sendKeys("Bob");
        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.name("phone")).sendKeys("+4922244455");
        driver.findElement(By.name("email")).sendKeys("bob.tested"+randomNumber+"@gmail.com");
        driver.findElement(By.name("password")).sendKeys("tester12345");
        driver.findElement(By.name("confirmpassword")).sendKeys("tester12345");
        driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();

        WebElement header = driver.findElement(By.xpath("//h3[@class='RTL']"));
        Assert.assertTrue(header.getText().contains(lastName));
        Assert.assertEquals(header.getText(), "Hi, Bob Tested");

    }
}
