# saucedemo-selenium-testng

This automation test suite is to automate the work flow for Saucedemo website.

Approach Used for Automation:

I have used TestNG + Selenium + Page Object Model for the automation of the workflow.

# Steps to the Work Flow in automation test suite

Opened the Saucedemo website and logged into the website. This is the Page Object File for the landing screen -(SauceDemoLandingPage.java)

Sorted the items with price low to high. This is the Page Object File for the sorting the item with low to high -(SauceDemoProductPage.java)

Added two items to the shopping cart and asserted the items in the shopping cart. This is the Page Object File for adding items to the cart  -(SauceDemoProductPage.java)

Removed an item from the shopping cart and then continue shopping. This is the Page Object File for removing the item from the cart -SauceDemoCartPage.java

Added two more item to the shopping cart. This is the Page Object File for adding items to the cart  -(SauceDemoProductPage.java)

While checkout, Asserted the purchasing items are correct and total price of the items. This is the Page Object File for adding items to the cart  -(SauceDemoProductPage.java)

Provide the information in Checkout page. This is the Page Object File for adding items to the cart  -(SauceDemoCheckoutPage.java)


Completed the order. This is the Page Object File for adding items to the cart  -(SauceDemoCheckoutCompletePage.java)


If a acceptence criteria is not met then the test is failed with required message and control is passed to next test

Environment used for testing

Eclipse

Selenium

Maven

# Instructions to excute the project

Please clone the repository.

Run the project using mvn test goal.

I have used firefox and google chrome drivers,Same tests with little modification in the initilization of the browser can be used to extend the test cases Edge,IE and other browser.

I have configured TestNG runner 

Edit: Have shared the execution result(TestNG report) in Results folder.

** have not uploaded the selenium dependency and browser drivers to the github repo. New locations of the drivers have to be updated in the commonconstants class

Libraries Used

Selenium - http://www.seleniumhq.org/

TestNG - http://testng.org/

Apache Commons Lang3 - https://commons.apache.org/proper/commons-lang/






