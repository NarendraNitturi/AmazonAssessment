package pages;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class AmazonPage{
    WebDriver driver;
    private static Logger LOGGER = LoggerFactory.getLogger(AmazonPage.class);
    public AmazonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "nav-hamburger-menu")
    static WebElement hamburgerMenu;

    @FindBy(xpath = "//div[text()='digital content and devices']/parent::li/following-sibling::li//div[text()='Kindle']")
    static WebElement digitalContentAndDevices_kindleLink;

    @FindBy(xpath = "//div[text()='kindle e-readers']/parent::li/following-sibling::li//a[text()='Kindle']")
    static WebElement kindleEReaders_kindleLink;

    @FindBy(id="productTitle")
    static WebElement productTitle;

    @FindBy(id="buy-now-button")
    static WebElement buyNowBtn;

    @FindBy(xpath = "//label[contains(text(),'E-mail address or mobile phone number')]")
    static WebElement signIn_EmailAddressOrMobilePhoneNumberLabel;

    public void clickHamburgerMenu(){
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            hamburgerMenu.click();
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }

    }

    public void clickDigitalContentAndDevicesKindleLink(){
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            digitalContentAndDevices_kindleLink.click();
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }
    }

    public void clickKindleEReadersKindleLink(){
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            kindleEReaders_kindleLink.click();
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }
    }

    public String getProductTitle(){
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }
        return productTitle.getText();
    }

    public void clickBuyNowBtn(){
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            buyNowBtn.click();
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }
    }

    public String getSignIn_EmailAddressOrMobilePhoneNumberLabel() {
        try {
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        }
        catch(TimeoutException e){
            LOGGER.error("Element Not Visible");
            Assert.assertTrue("Element Not Found",false);
        }
        return signIn_EmailAddressOrMobilePhoneNumberLabel.getText();
    }

}