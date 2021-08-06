package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import pages.AmazonPage;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class AmazonPageStepDefinition extends BasePage {
    @Before
    public void initBrowser() {
        openBrowser();
    }

    @After
    public void closeBrowser() {
        quitBrowser();
    }

    public AmazonPage amazonPage;
    @Given("^User able to navigate to required URL$")
    public void user_able_to_navigate_to_required_URL() throws Throwable {
        driver.get(prop.getProperty("URL").toString());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^User clicks hamburger menu$")
    public void user_clicks_hamburger_menu() throws Throwable {
        amazonPage = new AmazonPage(driver);
        amazonPage.clickHamburgerMenu();
    }

    @When("^User Selects Kindle under Digital Content and Devices menu$")
    public void user_Selects_Kindle_under_Digital_Content_and_Devices_menu() throws Throwable {
        amazonPage.clickDigitalContentAndDevicesKindleLink();
    }

    @When("^User selects Kindle under Kindle E-Reader menu$")
    public void click_selects_Kindle_under_Kindle_E_Reader_menu() throws Throwable {
        amazonPage.clickKindleEReadersKindleLink();
    }

    @Then("^User verifies \"([^\"]*)\" product page opens$")
    public void user_verifies_product_page_opens(String productTitle) throws Throwable {
        Assert.assertTrue("Product Title Not Matched", amazonPage.getProductTitle().contains(productTitle));
    }

    @When("^User selects Buy Now button$")
    public void user_selects_Buy_Now_button() throws Throwable {
        amazonPage.clickBuyNowBtn();
    }

    @Then("^User able to see \"([^\"]*)\" Label$")
    public void user_able_to_see_Label(String labelText) throws Throwable {
        Assert.assertTrue("Label Not Matched", amazonPage.getSignIn_EmailAddressOrMobilePhoneNumberLabel().equals(labelText));
    }
}
