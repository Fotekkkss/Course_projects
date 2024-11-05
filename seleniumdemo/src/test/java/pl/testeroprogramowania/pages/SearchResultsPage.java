package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage{

    private WebDriver driver;

    @FindBy(partialLinkText = "Java Selenium WebDriver")
    private WebElement searchResultSelenium;

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openFoundProduct(){
        searchResultSelenium.click();
        return new ProductPage(driver);
    }
}
