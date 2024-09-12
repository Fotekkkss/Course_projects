package WebDriver;

public enum DriverType {
    CHROME("chrome","/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefoxdriver.exe");

    String name;
    String path;

    DriverType(String name, String path){
       this.name = name;
       this.path = path;
    }

    DriverType() {

    }
}
