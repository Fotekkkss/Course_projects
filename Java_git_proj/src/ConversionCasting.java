import WebDriver.FirefoxDriver;
import WebDriver.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b;

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefox = (FirefoxDriver) driver;
        firefox.findElement();
    }
}
