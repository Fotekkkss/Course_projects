package WebDriver;

public class ExcetionExample{
    public static void main(String[] args) {
      /*  int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;

        for (int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
*/
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElement();

        /*FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElement();*/
    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")){
            return new ChromeDriver();
        }
        else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
