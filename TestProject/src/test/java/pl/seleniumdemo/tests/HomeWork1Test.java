package pl.seleniumdemo.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HotelSearchPage;
import pl.seleniumdemo.pages.ResultsPage;
import pl.seleniumdemo.utils.SeleniumHelper;

import java.io.IOException;

public class HomeWork1Test extends BaseTest {


    @Test
    public void searchNoCityTest() throws IOException {
        ExtentTest test = extentReports.createTest("Search Hotel Test");
        HotelSearchPage hotelSearchPage = new HotelSearchPage(driver);
        hotelSearchPage.setDates("17/05/2025", "30/05/2025");
        test.log(Status.PASS, "Setting dates done", SeleniumHelper.getScreenshot(driver));
        hotelSearchPage.setTravelers(1,1);
        test.log(Status.PASS, "Setting travelers done",SeleniumHelper.getScreenshot(driver));
        hotelSearchPage.performSearch();
        test.log(Status.PASS, "Performing search done",SeleniumHelper.getScreenshot(driver));

        ResultsPage resultsPage = new ResultsPage(driver);

        Assert.assertTrue(resultsPage.resultHeading.isDisplayed());
        Assert.assertEquals(resultsPage.getHeadingText(),"No Results Found");

        test.log(Status.PASS, "Assertion",SeleniumHelper.getScreenshot(driver));

    }
}
