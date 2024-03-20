**1. Registration Feature :**
 
Description:
you need to create only one scenario in this feature file to verify that user could signup with valid account
 
@smoke
Feature: F01_Register | users could register with new accounts
Scenario: guest user could register with valid data successfully
Step 1 user go to register page
Step 2 user select gender type
Step 3 user enter first name "automation" and last name "tester"
Step 4 user enter date of birth
Step 5 user enter email "test@example.com" field
Step 6 user fills Password fields "P@ssw0rd" "P@ssw0rd"
Step 7 user clicks on register button
Step 8 success message is displayed
 
* Follow same thing with all the remaining steps and don't forget to apply POM Design pattern on each step
* In step 4
you should check if the birthdate lists are static or dynamic then decide if you will use Select class in Selenium to handle
the dropdown list or not
* In Step 8 (Assertions):
Use soft assertion to verify the following
- Success message is displayed "Your registration completed"
- the color of this message is green rgba(76, 177, 124, 1)
Note: we need to get the "color" not "background-color" using getCssValue command which is already explained
in Selenium Commands Chapter
 



  
**2. Login Feature: **
 
in your feature file write the following
@smoke
Feature: F02_Login | users could use login functionality to use their accounts
Scenario: user could login with valid email and password
Step 1 user go to login page
Step 2 user login with "valid" "test@example.com" and "P@ssw0rd"
Step 3 user press on login button
Step 4 user login to the system successfully
Scenario: user could login with invalid email and password
Step 1 user go to login page
Step 2 user login with "invalid" "wrong@example.com" and "P@ssw0rd"
Step 3 user press on login button
Step 4 user could not login to the system
* 
For Scenario 1
Use soft assertion to verify the following
1- getCurrentUrl and verify it equals https://demo.nopcommerce.com/
2- "My account" tab isDisplayed
don't forget assertAll()
For Scenario 2
Use soft assertion to verify the following
1- error message contains "Login was unsuccessful."
2- the color of this message is red "#e4434b"
don't forget assertAll()
  
  
**3.Currencies Feature :**
 
Steps:
1- Select Euro currency from the dropdown list on the top left of home page
2- Use hard assertion to verify Euro Symbol (€) is shown on the 4 products displayed in Home page
in this step you should create for loop
2.1- use findElements with get(i) method then use getText()
2.2- save the output inside variable
2.3- do hard assert to verify that the variable contains "€"
 

**4.Search Feature:**
 

Scenario Outline 1
Use soft assertion to verify the following
1- url contains https://demo.nopcommerce.com/search?q=
2- search shows relevant results
2.1- Count number of search results using findElements & size()
2.2- Create for loop and verify each result contains the search word
You should use toLowerCase() method
Scenario Outline 2
1- search with sku (You should pass parameter from Feature File in this step)
2- After searching, you need to click on the product in search result
3- Use hard assertion to verify the following
3.1- get the sku shown in this page then make sure it contains the sku that you are using in search
 






 
**5.Scenario steps:**
1- in Home page, there are 3 main categories contains sub-categories
[Computers, Electronics, Apparel]
2- you need to select random one of the three main categories
3- you should hover on the selected category
Note: there's a difference between click and hover command
How to do Hover action? you could get help from this project
https://github.com/KhaledAMRS/SeleniumCommands
4- after hovering, you need to select random one of the three sub cateogries like [Desktops, Notebooks, Software]
4.1- get the text of this sub-category
4.2- click on it
5- after opening sub-category page, you need to get text of the page title
div[class="page-title"] h1
6- Assert that the sub-category title is (equal or contains) the one you get it while selecting random sub-category
Note: you are supposed to use below functions
toLowerCase().trim(); // this will change "Desktops " to "desktops"
How to automate this test case in advanced method
Note: it's not mandatory to do the advanced method in the project, it's just to learn something new in Selenium course
1- Select any random category whether it contains sub cateogry or not
2- do if condition
if (selected category contains sub-category)
{
click on random sub-category then assert the opened page contains sub-category name
}
else if (selected category doesn't contains sub-category)
{
click on the main category itself then assert the opened page contains main category name
}
Note: before doing if condition you supposed to reduce implicitlyWait to 2 seconds
 then after the if condition return implicitlyWait time again
Try to figure out why it's recommended to do something like this
Reviewers will check the following
1- Student selects the correct Keywords in feature file
2- Hover action is being used in the code
3- toLowerCase() & trim() are used in the code
4- POM Design pattern is applied in step definition class correctly
5- Student is doing assertion correctly
homeSliders Feature
2 scenarios are required
Prepare your files:
your feature file will be:
src >> main >> resources >> features >> F06_homeSliders.feature (Remember to add @smoke)
your step definition class will be:
src >> test >> java >> org.example >> stepDefs >> D06_homeSlidersStepDef
your class to apply pom design pattern in your project will be:
src >> test >> java >> org.example >> pages >> P03_homePage
What do you need to test in this feature?
you will find two sliders when you open home page https://demo.nopcommerce.com/
First slider is Nokia Lumia 1020
Second slider is iPhone
you need to automate two scenarios
Scenario 1: first slider is clickable on home page
It's expected when click on first slider to direct user to this url https://demo.nopcommerce.com/nokia-lumia-1020
but the actual is that the url will keep on https://demo.nopcommerce.com/
so we could consider this is a bug and automation test scenario should be failed
Scenario 2: second slider is clickable on home page
It's expected when click on second slider to direct user to this url https://demo.nopcommerce.com/iphone-6
but the actual is that the url will keep on https://demo.nopcommerce.com/
so we could consider this is a bug and automation test scenario should be failed
Note: It's better to use explicit wait until the url contains the expected result
because sometimes the driver get the url before the new page is completely loading with the new url
So it's prefered to give your page the time needed to load and the new url is shown
Reviewers will check the following
1- Student selects the correct Keywords in feature file
2- POM Design pattern is applied in step definition class correctly
3- Student is doing assertion correctly








followUs Feature
4 scenarios are required
Prepare your files:
your feature file will be:
src >> main >> resources >> features >> F07_followUs.feature (Remember to add @smoke)
your step definition class will be:
src >> test >> java >> org.example >> stepDefs >> D07_followUsStepDef
your class to apply pom design pattern in your project will be:
src >> test >> java >> org.example >> pages >> P03_homePage
What do you need to test in this feature?
- go to https://demo.nopcommerce.com/
- you will find "Follow us" links at the end of the page
- you need to create scenario for each button to make sure it works properly
Scenario 1: user opens facebook link
Scenario 2: user opens twitter link
Scenario 3: user opens rss link
Scenario 4: user opens youtube link
Note: Scenario 3 will failed because the link doesn't open a valid url
actual result is https://demo.nopcommerce.com/news/rss/1
however expected result should be https://demo.nopcommerce.com/new-online-store-is-open
What you will learn?
you will learn How to handle multiple windows in Selenium using getWindowHandles() method
for example if you have (tab 0 , tab 1)
you will learn how to switch between the two tabs and how to close tab 1 and get back to tab 0 and so on
you could get help from this project
https://github.com/KhaledAMRS/SeleniumCommands
Feature File:
src >> main >> resources >> features >> F07_followUs.feature
@smoke
Feature: F07_followUs | users could open followUs links
Scenario: user opens facebook link
Step 1 user opens facebook link
 Step 2 "https://www.facebook.com/nopCommerce" is opened in new tab
Scenario: user opens twitter link
 Step 1 user opens twitter link
 Step 2 "https://twitter.com/nopCommerce" is opened in new tab
Scenario: user opens rss link
 Step 1 user opens rss link
 Step 2 "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab
 Scenario: user opens youtube link
 Step 1 user opens youtube link
 Step 2 "https://www.youtube.com/user/nopCommerce" is opened in new tab
Replace Steps with the appropriate Keywords (Given, When, Then, And)
Let's take Scenario 1
Step 1: After opening https://demo.nopcommerce.com/ you will click on facebook icon at the end of home page
Step 2:
2.1- It's preferred to start your method by waiting around 2 seconds
Why?
to give opportunity to the driver to open the second tab after click on facebook icon
Now you have 2 tabs
tab 0 >> https://demo.nopcommerce.com/
tab 1 >> https://www.facebook.com/nopCommerce
2.3- you need to switch to tab 1 which contains this url https://www.facebook.com/nopCommerce
2.4- use hard assert to veify that current url is equal to https://www.facebook.com/nopCommerce
Note: the expected result in this step will come from feature file (passing parameters)
2.5- Optional step: you could close your current tab and get back to tab 0
and it's not a problem if you didn't do this step because the whole driver will quit and all tabs will be closed
- You will implement Scenario 2, 3, 4 the same way
- You could use the same method to implement step 2 for all scenarios by passing the expected url for each scenario
form feature file
- Don't forget that scenario 3 will be failed because it will not open the link in new tab and your expected result should
be https://demo.nopcommerce.com/new-online-store-is-open however the actual result is
https://demo.nopcommerce.com/news/rss/1
Remember:
The difference between driver.close() not driver.quit()
if you want to close only one tab without closing the whole browser >> you should use driver.close()
if you want to close all tabs and the whole browser >> you should use driver.quit()
Reviewers will check the following
1- You selected the correct Keywords in your feature file
2- You applied the code for multi window handling correctly
3- You already could switch between tab 1 & tab 2 successfully
4- POM Design pattern is applied in step definition class correctly
5- Student is doing assertion correctly





  
Wishlist Feature
2 scenarios are required
Prepare your files:
your feature file will be:
src >> main >> resources >> features >> F08_Wishlist.feature (Remember to add @smoke)
your step definition class will be:
src >> test >> java >> org.example >> stepDefs >> D08_WishlistStepDef
your class to apply pom design pattern in your project will be:
src >> test >> java >> org.example >> pages >> P03_homePage
Before coding you need to understand what you will test exactly
Scenario 1
- go to https://demo.nopcommerce.com/
- you will find 4 products in the middle of the home page [Build your own computer, Apple MacBook Pro 13-inch, HTC
One M8 Android L 5.0 Lollipop, $25 Virtual Gift Card]
- if you click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
you will see success message "The product has been added to your wishlist" with green background color
- Use Soft assertion to verify the following
success message is displayed
background color is green
Note: if you choose to verify Hex value then you will have to convert the color from RGBA to Hex
Scenario 2
- go to https://demo.nopcommerce.com/
- you click on wishlist button ❤️ on same product "HTC One M8 Android L 5.0 Lollipop"
- wait until this success message with green color to disappear then click on "Wishlist" Tab on the top of the page
(beside "Register", "Log in" tabs)
Note: there's easier ways to handle success message like click on x button without having to wait but we will choose this
way to use explicity wait
So you should use explicit wait in this step to wait until success message becomes invisible after that click on "Wishlist"
tab
- you should get Qty value and verify it's bigger than 0
Note: You need to decide whether you will choose getText or getAttribute or getCssValue

Reviewers will check the following
1- You selected the correct Keywords in your feature file
2- How you will get the background color and assert green color
3- You applied explicit wait in your code
4- which command you will use to get Qty value
5- How you will assert Qty is bigger than zero
6- POM Design pattern is applied in step definition class correctly
