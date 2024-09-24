import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkXpath {
    @Test
    public void findByXpath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");

        driver.get("https://poe.ninja/builds/settlers");

        By fullPath = By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/div[19]");
        driver.findElement(fullPath);
        By shortPath = By.xpath("//div[19]");
        driver.findElement(shortPath);

        driver.findElement(By.xpath("/html/body/header//ul[@class='_nav-list-wrapper_1o3mc_43']"));
        driver.findElement(By.xpath("//button[@class='button whitespace-normal']"));
        driver.findElement(By.xpath("//input[@class='_text-input_ce0x4_14 ']"));
       // driver.findElement(By.xpath("//p[@class='topSecret']"));
        driver.findElement(By.xpath("//input")).sendKeys("First");
        List<WebElement> inputsXpath = driver.findElements(By.xpath("//input"));
        System.out.println(inputsXpath.size());
        driver.findElement(By.xpath("//a[text()='poe.ninja']"));
        driver.findElement(By.xpath("//a[contains(text(), 'ninja')]"));

        driver.findElement(By.xpath("//*"));
        driver.findElement(By.xpath("(//input)[1]"));
        driver.findElement(By.xpath("(//input)[last()]"));
        //driver.findElement(By.xpath("//*[@name]"));
       // driver.findElement(By.xpath("//*[@name='fname']"));
       // driver.findElement(By.xpath("//button[@class='button whitespace-normal']"));
        driver.findElement(By.xpath("//*[@id!='clickOnMe']"));
        driver.findElement(By.xpath("//*[contains(@class, 'white')]"));
        driver.findElement(By.xpath("//*[starts-with(@class, 'button')]"));
        driver.findElement(By.xpath("//*[substring(@class,string-length(@class)-string-length('button ')+1)='button ']"));
        driver.findElement(By.xpath("//div/child::div")); // child of ul
        driver.findElement(By.xpath("//div/descendant::header")); // all tags after ul
        driver.findElement(By.xpath("//div/ancestor::*")); // all tags before div
        driver.findElement(By.xpath("//div/../..")); // shows previous tags / like cd ..
        driver.findElement(By.xpath("//img/following::*")); //
        driver.findElement(By.xpath("//label/following-sibling::*"));//after out tag on same lvl
        driver.findElement(By.xpath("//label/preceding::*"));//all tags before img
        driver.findElement(By.xpath("//label/preceding-sibling::*"));//tags before img but on same level

        driver.findElement(By.xpath("//input[@class='_text-input_ce0x4_14 ' or @class='_text-input_ce0x4_15']"));
        driver.findElement(By.xpath("//select[@id='Time machine' and @title='Time machine - see the league at earlier stages']"));// operator AND for tags with value
        driver.findElement(By.xpath("//div | //a"));// operator | (and) for tags
    }
}
