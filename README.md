# saucedemo-selenium-testng

This is Automation test suite is to automate Saucedemo website.

Approch Used for Automation:

I have used TestNG + Selenium for the automation of the workflow.


Opened the Saucedemo website and logged into the website.
Sorted the items with price low to high.
Added to two items to the shopping and asserted that the items in the shopping cart.
Removed an item from the shopping cart and then continue shopping.
Added another item to the shopping cart.
While checkout, Asserted the purchasing items are correct and total price of the items.
Completed the order.

After checking all products in a accessed month, Home page is opened prior to clicking on next months link
If a acceptence criteria is not met then the test is failed with required message and control is passed to next test

Environment used for testing

Eclipse
Selenium 
Chrome  
Chrome Driver 
Firefox
Firefox Driver
jdk 

I have used firefox and google chrome drivers,Same tests with little modification in the initilization of the browser can be used to extend the test cases to PhantomJS, HTML Unit ( both for head less automation ), Edge , IE , Opera browsers

Edit: Have shared the execution result(TestNG report) in results folder.

** have not uploaded the selenium dependency and browser drivers to the github repo. New locations of the drivers have to be updated in the commonconstants class

Libraries Used

Selenium - http://www.seleniumhq.org/
TestNG - http://testng.org/
Apache Commons Lang3 - https://commons.apache.org/proper/commons-lang/
