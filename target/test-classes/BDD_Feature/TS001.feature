Feature: Login
Scenario: Verify Login
Given User is Navigated to Gmail Login Page
When User Enters Username as "sam" and Password as "sam"
And User clicks on Login
Then Welcome Mesage is Displayed "True"
And Test End


Scenario: Verify Login
Given User is Navigated to Gmail Login Page
When User Enters Username as "admin" and Password as "1234"
And User clicks on Login
Then Welcome Mesage is Displayed "False"
And Test End


Scenario: Verify Signup
Given User is Navigated to Gmail Signup Page
When User Enters the following signup details
| sharon | IT | CHENNAI | 
And User clicks on Create an account
Then Welcome Mesage is Displayed "True"
And Test End


Scenario Outline: Verify Login with Parameters
Given User is Navigated to Gmail Login Page
When User Enters into Username <UserName> and Password <PASSWORD>
And User clicks on Login
Then Welcome Mesage is Displayed "False"
And Test End

Examples:
|UserName | PASSWORD|
|SAM1		  | PWD1    |
|SAM2		  | PWD2    |
|SAM3		  | PWD3    |
|SAM4		  | PWD4    |
