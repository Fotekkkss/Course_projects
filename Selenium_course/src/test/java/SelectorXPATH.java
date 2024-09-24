import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorXPATH {
    @Test
    public void findXpath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);
        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        driver.findElement(By.xpath("/html/body/button[@id='clickOnMe']"));
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        driver.findElement(By.xpath("//input[@name='fname']"));
        driver.findElement(By.xpath("//p[@class='topSecret']"));
        driver.findElement(By.xpath("//input")).sendKeys("First");
        List<WebElement> inputsXpath = driver.findElements(By.xpath("//input"));
        System.out.println(inputsXpath.size());
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        driver.findElement(By.xpath("//a[contains(text(), 'Visit')]"));

        driver.findElement(By.xpath("//*"));
        driver.findElement(By.xpath("(//input)[2]"));
        driver.findElement(By.xpath("(//input)[last()]"));
        driver.findElement(By.xpath("//*[@name]"));
        driver.findElement(By.xpath("//*[@name='fname']"));
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        driver.findElement(By.xpath("//*[@id!='clickOnMe']"));
        driver.findElement(By.xpath("//*[contains(@name, 'ame')]"));
        driver.findElement(By.xpath("//*[starts-with(@name, 'user')]"));
        driver.findElement(By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']"));
        driver.findElement(By.xpath("//div/child::ul")); // child of ul
        driver.findElement(By.xpath("//div/descendant::ul")); // all tags after ul
        driver.findElement(By.xpath("//div/ancestor::*")); // all tags before div
        driver.findElement(By.xpath("//div/../..")); // shows previous tags / like cd ..
        driver.findElement(By.xpath("//img/following::*")); //
        driver.findElement(By.xpath("//img/following-sibling::*"));//after out tag on same lvl
        driver.findElement(By.xpath("//img/preceding::*"));//all tags before img
        driver.findElement(By.xpath("//img/preceding-sibling::*"));//tags before img but on same level

        driver.findElement(By.xpath("//input[@name='fname' or @id='fname']"));
        driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));// operator AND for tags with value
        driver.findElement(By.xpath("//div | //a"));// operator | (and) for tags







    }
}
