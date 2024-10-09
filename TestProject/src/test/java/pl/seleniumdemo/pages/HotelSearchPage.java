package pl.seleniumdemo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HotelSearchPage {

    @FindBy(className = "select2-chosen")
    private WebElement searchHotelClassName;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchHotelInput;


    @FindBy(name = "checkin")
    private WebElement checkinInput;

    @FindBy(name = "checkout")
    private WebElement checkoutInput;


    @FindBy(id = "travellersInput")
    private WebElement travelersInput;

    @FindBy(id = "adultPlusBtn")
    private WebElement adultPlusBtn;

    @FindBy(id = "childPlusBtn")
    private WebElement childPlusBtn;

    @FindBy(xpath = "//button[text()=' Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//li[@id='li_myaccount']")
    private List<WebElement> myAccountLink;

    @FindBy(xpath = "//a[text()='  Sign Up']")
    private List<WebElement> signUpLink;

    private WebDriver driver;

    private static final Logger logger = LogManager.getLogger();

    public HotelSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setCity(String cityName) {
        logger.info("Setting city " + cityName);
        searchHotelClassName.click();
        searchHotelInput.sendKeys(cityName);
        String xpath = String.format("//span[@class='select2-match' and text()='%s']", cityName);
        driver.findElement(By.xpath(xpath)).click();
        logger.info("City setting done");
    }

    public void setDates(String checkin, String checkout) {
        logger.info("Setting dates check-in " + checkin + " check-out " + checkout);
        checkinInput.sendKeys(checkin);
        checkoutInput.sendKeys(checkout);
        logger.info("Setting dates done");
    }

    public void setTravelers(int adultsToAdd, int childrenToAdd) {
        logger.info("Adding adults: " + adultsToAdd + " Adding children: " + childrenToAdd);
        travelersInput.click();
        addTraveler(adultPlusBtn, adultsToAdd);
        addTraveler(childPlusBtn, childrenToAdd);
        logger.info("Setting travellers done");
    }

    public void addTraveler(WebElement travelerBtn, int numberOfTravelers) {
        for (int i = 0; i < numberOfTravelers; i++) {
            travelerBtn.click();
        }
    }

    public void performSearch() {
        logger.info("Performing search");
        searchBtn.click();
        logger.info("Search done");
    }

    public void openSignUpForm() {
        myAccountLink.stream().filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        signUpLink.get(1).click();
    }

}
