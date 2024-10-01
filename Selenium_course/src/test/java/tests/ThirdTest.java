package tests;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    @Test(priority = 2)
    public void firstTest(){
        System.out.println("I`m first");
    }
    @Test(priority = 0)
    public void secondTest(){
        System.out.println("I`m second");
    }
    @Test(priority = 1)
    public void thirdTest(){
        System.out.println("I`m third");
    }
}
