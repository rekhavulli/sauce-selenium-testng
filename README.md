# saucedemo-selenium-testng

This automation test suite is to automate the work flow for Saucedemo website.

Framework used for Automation:

TestNG + Selenium + Page Object Model for automating of the workflow.

# Instructions to excute the project

1. Clone the repository.
2. To execute this project, please change the webdriver path in the `inter.sauce.test.tests.ProductCheckoutHappyPath.java` at `beforeMethod`.
3. Run the project using `mvn test` goal. The maven command needs to be run from folder having `pom.xml` at current folder path.
4. Test Results can be viewed at _target>surefire-reports>index.html_


Note: I have used firefox and google chrome drivers, Same tests with little modification in the initilization of the browser can be used to extend the test cases for Edge,IE and other browser.



# Steps to the work flow for automating the test suite

1. Opened the Saucedemo website and logged into the website. The Page Object File for the landing screen  is `SauceDemoLandingPage.java`
2. Sorted the items with price low to high. The Page Object File for the sorting the item with low to high is `SauceDemoProductPage.java`
3. Added two items to the shopping cart and asserted the items in the shopping cart. The Page Object File for adding items to the cart is       '     `SauceDemoProductPage.java`
4. Removed an item from the shopping cart. The Page Object File for removing the item from the cart is `SauceDemoCartPage.java`
5. Sorted the items with price low to high. The Page Object File for the sorting the item with low to high is `SauceDemoProductPage.java`
6. Added one more item to the shopping cart. The Page Object File for adding items to the cart  `SauceDemoCartPage.java`
7. While checkout, Asserted the number of items in the cart. The Page Object File for adding items to the cart `SauceDemoProductPage.java`
8. Provide the information in Checkout page. The Page Object File for adding items to the cart  `SauceDemoCheckoutPage.java`
9. Reviewed the items in the cart, Asserted whether the purchasing items are correct and the total price of the items. The Page Object File for adding items to the cart      `SauceDemoCheckoutOverviewPage.java`
10.Completed the order. The Page Object File for adding items to the cart `SauceDemoCheckoutCompletePage.java`

Have shared the execution result(TestNG report) in Results folder.


## Environment used for testing

* Eclipse

* Selenium

* Maven


## Libraries Used

* Selenium - http://www.seleniumhq.org/

* TestNG - http://testng.org/

* Apache Commons Lang3 - https://commons.apache.org/proper/commons-lang/






