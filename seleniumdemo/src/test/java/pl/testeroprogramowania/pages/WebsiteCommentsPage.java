package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteCommentsPage {

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement entryTitle;

    @FindBy(id = "comment")
    private WebElement commentInput;

    @FindBy(id = "author")
    private WebElement commentNameInput;

    @FindBy(id = "email")
    private WebElement commentEmailInput;

    @FindBy(id = "url")
    private WebElement commentURLInput;

    @FindBy(id = "submit")
    private WebElement postCommentButton;

    public WebDriver driver;

    public WebsiteCommentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getEntryTitle(){
        return entryTitle;
    }

    public WebsiteCommentsPage leaveCommentValidData(String comment, String name, String email, String websiteUrl){
        commentNameInput.sendKeys(name);
        commentEmailInput.sendKeys(email);
        commentURLInput.sendKeys(websiteUrl);
        commentInput.sendKeys(comment);
        postCommentButton.click();
        return new WebsiteCommentsPage(driver);
    }
    public PostCommentErrorPage leaveCommentInvalidData(String comment, String name, String email, String websiteUrl){
        commentNameInput.sendKeys(name);
        commentEmailInput.sendKeys(email);
        commentURLInput.sendKeys(websiteUrl);
        commentInput.sendKeys(comment);
        postCommentButton.click();
        return new PostCommentErrorPage(driver);
    }
}
