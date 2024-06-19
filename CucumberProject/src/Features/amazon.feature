Feature: Amazon in check my orders 

Background:
Given user click on the amazon page
Given user on amazon login page
When user enter username and password
Then user click on the login button
Then user navigate to order page

Scenario: check previous order detials 
When user click on the previous order link
Then user check the previous order details

Scenario: check buyagain order details
When user click on the buyagain order link
Then user check buyagain order details

Scenario: check the cancle order details
When user click on the cancle order link 
Then user check the cancle order details




