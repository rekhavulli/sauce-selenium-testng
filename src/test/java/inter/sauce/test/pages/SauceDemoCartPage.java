package inter.sauce.test.pages;

import inter.sauce.test.util.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SauceDemoCartPage {
    static WebDriver driver;


    private static By checkOut() {
        return By.id("checkout");
    }

    private static By cartItemsList(){
        return By.xpath("//div[@class='cart_item']");
    }

    private static By cartItemsQuantity(){
        return By.xpath("//div[@class='cart_item']/div[@class='cart_quantity']");
    }
    
    private static By removeItem(){
        return By.xpath("//div[@class='item_pricebar'][1]/button[@id='remove-sauce-labs-onesie']");
    }
    
    private static By continueShopping(){
        return By.xpath("//div[@class='cart_footer']//button[1]");
    }

    

    public SauceDemoCartPage(WebDriver driver) {
        SauceDemoCartPage.driver = driver;
    }
  
    public void editCart() {
        driver.findElement(removeItem()).click();
        UtilityMethods.checkIfPageLoaded(driver, 10);
        }
    
    public void continueShoppingAfterRemove() {
        driver.findElement(continueShopping()).click();
        UtilityMethods.checkIfPageLoaded(driver, 10);
        }
    
    
    public void continueCheckout() {
        Assert.assertEquals(driver.findElements(cartItemsList()).size(),2,"The number of items in the cart should be two");
        List<WebElement> cartElements = driver.findElements(cartItemsQuantity());
        for (WebElement cartElement : cartElements) {
            Assert.assertEquals(cartElement.getText(), "1", "The quantity in the cart should be 1");
        }
        driver.findElement(checkOut()).click();
        UtilityMethods.checkIfPageLoaded(driver, 10);
    }

  
    
}
