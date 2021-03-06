package inter.sauce.test.tests;

import inter.sauce.test.pages.*;
import inter.sauce.test.util.CommonConstants;
import inter.sauce.test.util.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import inter.sauce.test.util.UtilityMethods;

import java.util.concurrent.TimeUnit;

public class ProductCheckoutHappyPath {

    WebDriver driver;


    @Test(priority = 0)
    public void productCheck() throws InterruptedException {
        // POM classes 
        SauceDemoLandingPage sauceDemoLandingPage = new SauceDemoLandingPage(driver);
        sauceDemoLandingPage.performLogin();
        SauceDemoProductsPage sauceDemoProductsPage = new SauceDemoProductsPage(driver);
        sauceDemoProductsPage.sortProductsFromLowtoHigh();
        sauceDemoProductsPage.selectTwoItemsToCart();
        SauceDemoCartPage sauceDemoCartPage = new SauceDemoCartPage(driver);
        sauceDemoCartPage.editCart();
        sauceDemoCartPage.continueShoppingAfterRemove();
        sauceDemoProductsPage.sortProductsFromLowtoHigh();
        sauceDemoProductsPage.selectOneMoreItemsToCart();
        sauceDemoCartPage.continueCheckout();
        SauceDemoCheckoutPage sauceDemoCheckoutPage = new SauceDemoCheckoutPage(driver);
        sauceDemoCheckoutPage.performCheckOut();
        SauceDemoCheckoutOverviewPage sauceDemoCheckoutOverviewPage = new SauceDemoCheckoutOverviewPage(driver);
        sauceDemoCheckoutOverviewPage.itemsInCart();
        SauceDemoCheckoutCompletePage sauceDemoCheckoutCompletePage = new SauceDemoCheckoutCompletePage(driver);
        sauceDemoCheckoutCompletePage.validateCheckout();
        
    }

    /**
     * This method takes the browser type from testNG and open the corresponding browser for automation
     * By default if "firefox" or "chrome" is not provided then chrome is taken by default
     *
     * @param browser
     */
    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser) throws InterruptedException {
        if ("firefox".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.gecko.driver", "/Users/rekha/downloads/geckodriver");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "/Users/rekha/downloads/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(CommonConstants.STORE_URL);
            UtilityMethods.checkIfPageLoaded(driver, 10);
        }

    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

}
