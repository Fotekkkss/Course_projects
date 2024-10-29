package pl.testeroprogramowania.pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.DriverFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class LoggedUserPage {

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

    public LoggedUserPage(){
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public boolean isDashboardLinkDisplayed(){
        SeleniumHelper.waitForElementToExist(By.linkText("Dashboard"));
        return dashboardLink.isDisplayed();
    }
}
