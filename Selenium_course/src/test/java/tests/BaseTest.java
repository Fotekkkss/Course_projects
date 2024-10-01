package tests;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test message");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method message");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test message");
    }
    @AfterMethod

    public void afterMethod(){
        System.out.println("After method message");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite message");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class message");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite message");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class message");
    }
}
