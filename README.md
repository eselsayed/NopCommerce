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
 
 
 
**6.homeSliders Feature**
2 scenarios are required
 
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
 

 

**7.followUs Feature**
 
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
 
 
  
**8.Wishlist Feature**
 
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
 
