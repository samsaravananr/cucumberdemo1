Feature: Google Search

@SeleniumTest
Scenario: Verify Search
Given User is navigated to Google.com Page
When User Enters "IPL 2020" and click Search Button
Then "IPL 2020" Search page is Displayed

@RegressionTest
Scenario Outline: Verify Videos
Given User is navigated to Google.com Page
When User Enters <TEAM> and click Search
And User Clicks on the videos
Then All IPL Videos Displayed

Examples:
|TEAM     |
|CSK      |
|RCB      |
