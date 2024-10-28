package pl.testeroprogramowania.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {

    public static void waitForElementToExist(By locator){
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        wait.until(driver->driver.findElements(locator).size()>0);
    }
}
