package inter.sauce.test.pages;

    import inter.sauce.test.util.UtilityMethods;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.testng.Assert;

	public class SauceDemoCheckoutOverviewPage {

	    WebDriver driver;
	    
	    private static By cartItems1(){
            return By.xpath("//a[@id='item_0_title_link']/div[@class='inventory_item_name']");
        }
	    
	    private static By cartItems2(){
            return By.xpath("//a[@id='item_1_title_link']/div[@class='inventory_item_name']");
        }
	    
	    private static By totalPrice(){
            return By.xpath("//div[@class='summary_total_label']");
        }
	    
	    private static By finishButton(){
	        return By.id("finish");
	        }

	    public SauceDemoCheckoutOverviewPage(WebDriver driver) {
	        this.driver = driver;
	    
	    }

	    public void itemsInCart() {
	        UtilityMethods.checkIfPageLoaded(driver, 10);
	        driver.findElement(cartItems1());
	        Assert.assertEquals(driver.findElement(cartItems1()).getText(), "Sauce Labs Bike Light", "The shopping cart item should be equal to Sauce Labs Bike Light");
	        driver.findElement(cartItems2());
	        Assert.assertEquals(driver.findElement(cartItems2()).getText(), "Sauce Labs Bolt T-Shirt", "The shopping cart item should be equal to Sauce Labs Bolt T-Shirt");
	        driver.findElement(totalPrice());
	        Assert.assertEquals(driver.findElement(totalPrice()).getText(), "Total: $28.06", "The total price of the  items should be equal to Total: $28.06");
	        UtilityMethods.checkIfPageLoaded(driver, 5);
	        
	        driver.findElement(finishButton()).click();
	   
	}


	}

