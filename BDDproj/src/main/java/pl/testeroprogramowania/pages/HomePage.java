package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.DriverFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
    public WebElement myAccountLink;

    public HomePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void goToMyAccountPage(){
        myAccountLink.click();
    }

    public void openHomePage(){
        DriverFactory.getDriver().get("http://seleniumdemo.com/");
    }
}
