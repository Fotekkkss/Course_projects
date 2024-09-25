import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class SelectTrueFalseHomework {

    public static void main(String[] args) {
        System.out.println(homework("Saab"));
    }

    @Test
    public static boolean homework(String optionName){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-search-engine-choice-screen");
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();



        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);

        List<WebElement> carsOptions = cars.getOptions();
        boolean result = false;
        for (WebElement option : carsOptions){
            if (Objects.equals(option.getText(), optionName)){
                result = true;
            }
        }
        return result;
    }
}
