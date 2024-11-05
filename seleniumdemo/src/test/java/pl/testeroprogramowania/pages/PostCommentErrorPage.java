package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostCommentErrorPage {

    @FindBy(id = "error-page")
    private WebElement errorMessage;

    public WebDriver driver;

    public PostCommentErrorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}

