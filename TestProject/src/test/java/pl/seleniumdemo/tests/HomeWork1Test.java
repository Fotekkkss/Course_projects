package pl.seleniumdemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork1Test extends BaseTest {


    @Test
    public void searchNoCityTest(){

        driver.findElement(By.name("checkin")).sendKeys("17.04.2025");
        driver.findElement(By.name("checkout")).click();
        driver.findElements(By.xpath("//td[@class='day ' and text()='21']")).stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .ifPresent(WebElement::click);
        driver.findElement(By.id("travellersInput")).click();
        driver.findElement(By.id("adultPlusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();
        driver.findElement(By.xpath("//button[text()=' Search']")).click();
        WebElement noResultFound = driver.findElement(By.xpath("//h2[text()='No Results Found']"));
        Assert.assertTrue(noResultFound.getText().contains("No Results Found"));

    }
}
