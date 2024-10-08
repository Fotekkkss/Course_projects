package pl.seleniumdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

    private WebDriver driver;

    public HotelSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void setCity(String cityName){
        searchHotelClassName.click();
        searchHotelInput.sendKeys(cityName);
        String xpath = String.format("//span[@class='select2-match' and text()='%s']", cityName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void setDates(String checkin, String checkout){
        checkinInput.sendKeys(checkin);
        checkoutInput.sendKeys(checkout);
    }

    public void setTravelers(int adultsToAdd, int childrenToAdd){
        travelersInput.click();
        addTraveler(adultPlusBtn, adultsToAdd);
        addTraveler(childPlusBtn, childrenToAdd);
    }

    public void addTraveler(WebElement travelerBtn, int numberOfTravelers){
        for (int i=0; i<numberOfTravelers;i++){
            travelerBtn.click();
        }
    }

    public void performSearch(){
        searchBtn.click();
    }

}
