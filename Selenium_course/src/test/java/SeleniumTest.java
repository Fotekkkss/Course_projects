import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        WebDriver driver = getDriver("chrome");
        driver.get("https://www.google.com/");

        }

    public WebDriver getDriver(String browser){
        if (browser=="chrome"){
            System.setProperty("webdriver.chrome.driver", "C:\\Tests\\chromedriver-win64\\chromedriver.exe");
            return new ChromeDriver();
        } else if (browser=="firefox") {
            System.setProperty("webdriver.gecko.driver", "C:\\Tests\\geckodriver.exe");
            return new FirefoxDriver();
        } else if (browser=="explorer") {
            System.setProperty("webdriver.ie.driver","C:\\Tests\\IEDriverServer.exe");
            return new InternetExplorerDriver();
        }
        else {
            throw new InvalidArgumentException("Invalid browser name");
        }
    }
}
