package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleTestListener implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("I`m starting test");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Taking a screenshot");
    }
}
