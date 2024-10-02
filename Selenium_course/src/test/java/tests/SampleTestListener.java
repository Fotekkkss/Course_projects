package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static tests.FirstTest.driver;

public class SampleTestListener implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("I`m starting test");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        int randomNumber = (int) (Math.random()*1000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenOnFailure = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "screenshotOnFailure"+randomNumber+".png";
        try {
            FileUtils.copyFile(screenOnFailure, new File("src/test/resources/"+fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
