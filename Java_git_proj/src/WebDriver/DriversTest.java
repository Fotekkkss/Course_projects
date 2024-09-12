package WebDriver;

public class DriversTest {
    public static void main(String[] args) throws NoValidBrowserName {
        WebDriver driver = getDriver("firefoxx");
        driver.get();
        driver.findElement();



        /*FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElement();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")){
            return new ChromeDriver();
        }
        else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }
}
