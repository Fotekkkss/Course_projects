import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AnnotationsTest {
    @FindBys({
            @FindBy(tagName = "table"),//where to search
            @FindBy(tagName = "th")//what to search
    })
    List<WebElement> elements;

    //find all elements inside
    @FindAll({
            @FindBy(tagName = "table"),
            @FindBy(tagName = "th")
    })
    List<WebElement> elements1;

    @Test
    public void basicActions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();
        System.out.println(elements.size());
        System.out.println(elements1.size());

    }
}
