Feature: uohouadhvuodhv
@tag1
Scenario: Verify user can click About us link
Given Launch <"URL"> application
Then Click About us link
And Verify user can click About us link

@tag2 
Scenario: Verify user can play video on the HomePage
Given Launch <"URL"> NET
Then Play the video
And Click the video

@tag3
Scenario: Verify user can mouse hover
Given Launch <"URL"> RGPS
Then Mouse hover to Academics link
And Click on Library page
Then Verify user can mouse hover

@tag4
Scenario: Verify user can drop down 
Given Launch <"URL"> OpenCart
Then Mouse hover to Desktop link
And Drop down to Show All Catagory

@tag5
Scenario: Verify user can scroll down
Given Launh <"URL">
Then Scroll down the webpage

@tag6
Scenario: Verify user can search items
Given Launh <"URL"> JCPenney
Then Type Mens Cologn & click search icon
And Verify user can search items is searchbox

@tag7 
Scenario: Verify user can drop down on ebay
Given Launh <"URL"> ebay
Then Click on Daily Deals
And Mouse hover to Techs
Then Click Cell phones
And Verify user can drop down on ebay

@tag8
Scenario: Verify user can add items in cart and land in the payment page
Given Launh ebay <"URL"> 
And Search Laptops in searchbox
Then Add Lenovo Thinkpad X1 in the cart
Then Click Add to Cart button and Proceed to Checkout
And Click Go To Checkout
And Hit Continue As Guest 
Then Verify user can add items in cart and land in the payment page

@tag9
Scenario: Verify user can apply 
Given Launh RGPS <"URL"> 
Then Click Apply Now button
Then Enter Email and Password and Click Sign in button
And Scroll down till First Name
Then Fill out the form
And Click Submit button
Then Verify user can apply 

@tag10
Scenario: Verify user can sign up smoothly
Given Launh <"URL"> BestBuy
Then Click on Account link
And Click Create Account button
Then Enter name email passwoed confirm password mobile number
And Click Create an Account button

@tag11
Scenario: Verify user can sign in smoothly
Given Launh BestBuy <"URL"> 
Then Click on Account button
And Click Signin button
Then Enter email enter password and Click Signin button
And Verify user can sign in smoothly

@tag12
Scenario: Verify user can ad Macbook Pro to cart page
Given Launh BestBuy <"URL"> application
Then Search Macbook Pro in the search box and click search icon
And Look for item and Click Add to Cart button
Then Click Go to cart button from the popup page
Then Take a screenshot
Then Click on checkout button

@tag13
Scenario: Verify user can add items in cart and order food 
Given Launh <"URL"> Chick-fil-A
Then Click Order Now button
And Click Pickup button and Search address and click Find Restaurant button
Then Click Select this restaurant and click Drive-thru
Then Click on Meals and click on Honey Pepper meal and click Next button
Then Click on waffle fries and click Next and select Diet Lemonade and click Review meal button and click add to order button
And Click on My Order button and click Checkout button and click Signin button 
Then Verify user can add items in cart and order food 

@tag14
Scenario: Verify user can select Free shipping and Scroll down the page
Given Launh ebay <"URL"> application
Then Click on Brand outlet link ands click on Clothing link
Then Select Champion link and Scroll downthe page
And Select Free Shipping box and Scroll down to the bottom of the page

@tag15
Scenario: Verify user can navigate to the desired page
Given Launh <"URL"> Dell
Then Mouse hover to Computers link and droopdown to Laptops
Then The select XPS Laptops
And Verify user can navigate to the desired page

@tag16
Scenario: Verify user can buy an iphone 15 pro max
Given Launh <"URL"> Apple
Then Click on Buy button and Scroll down the page and click on 15 pro max link and choose Blue Titanium color
Then Scroll down the page and Click on 1TB link select No Trade in button and click on Buy button
And Click on Connect to Carrier Later button and click on No coverage link
And Scroll down and click on Add to bag button and click on Review bag and click Checkout button and click Continue as Guest button
And Verify user can buy an iphone 15 pro max

@tag17
Scenario: Verify user can add item in the cart
Given Launh <"URL"> Temu
Then Enter email and click Continue button Enter password and click on signin button 
Then Search Monitor Light bar in the searchbox and click on Search icon
And Select item and click on QTY and select 2 and click on Add to Cart button
Then Close Cart page and search wireless mechanical key board and click on Search icon
Then Select item and click on Red Switch option and click on Add to Cart button and Click Go to Cart button
Then Click on Checkout button and Click on Continue as a Guest button

@tag18
Scenario: Verify user can book a ticket
Given Launh <"URL"> Southwest Airlines
Then Select Depart and Arrival destinations
And Select dates and select passengers
Then Click on Search button 

@tag19
Scenario: Verify user can book a ticket
Given Launh <"URL"> Turkish
Then Click on From and To airport and select destinations
And Click on dates and select dates and add Passengers and Click Search Flights button

@tag20
Scenario: Verify user can sent email and get Successful message
Given Launch NextETicket <"URL"> 
Then Scroll down to Subscribe to newsletter
And Verify user can sent email and get Successful message

@tag21
Scenario: Verify Learn More button is displaying
Given Launch NeT <"URL">
Then Verify Learn More button is displaying

@tag22
Scenario: Verify Learn More button is displaying
Given Launch NeT <"URL">

