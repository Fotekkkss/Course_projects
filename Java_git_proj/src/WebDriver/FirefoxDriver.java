package WebDriver;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Firefox");
    }
}
