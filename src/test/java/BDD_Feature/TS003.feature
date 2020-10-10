Feature: Login

@Release1
Scenario: Verify Login
Given User is Navigated to Gmail Login Page
When User Enters Username as "sam" and Password as "sam"
And User clicks on Login
Then Welcome Mesage is Displayed "True"
And Test End

@Release1
Scenario: Verify Login
Given User is Navigated to Gmail Login Page
When User Enters Username as "admin" and Password as "1234"
And User clicks on Login
Then Welcome Mesage is Displayed "False"
And Test End

@Release2
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