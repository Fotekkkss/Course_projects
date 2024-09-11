package WebDriver;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome");
    }
}
