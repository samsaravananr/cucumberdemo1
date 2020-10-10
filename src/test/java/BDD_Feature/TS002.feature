Feature: Signup

Background:
Given Browser Chrome 
When Launch Browser
Then Browser Launches with default URL
And Test Starts

@Release3
Scenario: Verify Signup
Given User is Navigated to Gmail Signup Page
When User Enters the following signup details
| sharon | IT | CHENNAI | 
And User clicks on Create an account
Then Welcome Mesage is Displayed "True"
And Test End

@Release3
Scenario: Verify Login
Given User is Navigated to Gmail Login Page
When User Enters Username as "admin" and Password as "1234"
And User clicks on Login
Then Welcome Mesage is Displayed "False"
And Test End