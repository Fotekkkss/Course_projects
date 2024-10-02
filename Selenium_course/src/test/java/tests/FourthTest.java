package tests;

import org.testng.annotations.DataProvider;
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

    @Test(dataProvider = "data")
    public void dpTest(String value){
        System.out.println(value);
    }

    @DataProvider(name="data")
    public Object[][] dataProvider(){
        return new Object[][] {{"I`m first test"}, {"I`m second test"}, {"I`m third test"}};
    }
}
