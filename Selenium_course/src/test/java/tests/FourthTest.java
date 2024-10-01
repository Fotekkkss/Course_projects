package tests;

import org.testng.annotations.Test;

public class FourthTest extends BaseTest {

    @Test(dependsOnMethods = {"thirdTest"})
    public void firstTest(){
        System.out.println("I`m first");
    }
    @Test(dependsOnMethods = {"firstTest"})
    public void secondTest(){
        System.out.println("I`m second");
    }
    @Test
    public void thirdTest(){
        System.out.println("I`m third");
    }
}
