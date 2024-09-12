package WebDriver;

public class DriversTest {
    public static void main(String[] args) {
        WebDriver driver = getDriver(DriverType.FIREFOX);
        driver.get();
        driver.findElement();



        /*FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElement();*/
    }

    private static WebDriver getDriver(DriverType type){
        if (type.name.equals("chrome")){
            System.out.println(type.path);
            return new ChromeDriver();
        }
        return new FirefoxDriver();

    }
}
