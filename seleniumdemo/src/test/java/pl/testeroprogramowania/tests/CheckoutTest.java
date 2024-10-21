package pl.testeroprogramowania.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.OrderDetailsPage;
import pl.testeroprogramowania.pages.ProductPage;

public class CheckoutTest extends BaseTest {

    private String[] titles = {"Java Selenium Webdriver", "BDD cucumber", "GIT basics"};

    @Test
    public void checkoutTest() throws InterruptedException {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer, "Some comment)");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 1");
    }


    @Test
    public void checkoutWithAddingProductsTest() throws InterruptedException {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .addAdditionalProducts(String.valueOf(15))
                .fillAddressDetails(customer, "Some comment)");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 15");
    }

    @Test
    public void checkoutAllroductsTest() throws InterruptedException {
        Customer customer = new Customer();


        ProductPage orderDetailsPageJava = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart();

        ProductPage orderDetailsPageBDD = new HomePage(driver)
                .openShopPage()
                .openProduct("BDD Cucumber")
                .addProductToCart();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("GIT basics")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer, "Some comment)");

       Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
       Assert.assertEquals(orderDetailsPage.getSeleniumName().getText(), "Java Selenium WebDriver");
       Assert.assertEquals(orderDetailsPage.getGitName().getText(), "GIT basics");
       Assert.assertEquals(orderDetailsPage.getBddName().getText(), "BDD Cucumber");

    }
}
