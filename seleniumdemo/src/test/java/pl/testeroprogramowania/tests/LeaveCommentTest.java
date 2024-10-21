package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.PostCommentErrorPage;
import pl.testeroprogramowania.pages.WebsiteCommentsPage;

import java.util.Random;

public class LeaveCommentTest extends BaseTest{
    @Test
    public void leaveCommentValidDataTest() {
        int rnd = (int) (Math.random() * 1000);
        WebsiteCommentsPage websiteCommentsPage = new HomePage(driver)
                .openCommentsPage()
                .leaveCommentValidData("test comment"+rnd, "Bob", "bob.tester@test.com", "youtube.com");

        Assert.assertEquals(websiteCommentsPage.getEntryTitle().getText(), "Second post");

    }
    @Test
    public void leaveCommentInvalidDataTest() {
        PostCommentErrorPage postCommentErrorPage = new HomePage(driver)
                .openCommentsPage()
                .leaveCommentInvalidData("test comment", "Bob", "bob.tester", "youtube.com");

        Assert.assertEquals(postCommentErrorPage.getErrorMessage().getText(), "ERROR: please enter a valid email address." +
                "« Back");

    }
}
