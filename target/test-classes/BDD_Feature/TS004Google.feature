Feature: Google Search

Scenario: Verify Search
Given User is navigated to Google.com Page
When User Enters "IPL 2020" and click Search Button
Then "IPL 2020" Search page is Displayed
And Browser Closed


Scenario: Verify Videos
Given User is navigated to Google.com Page
When User Enters "IPL 2020" and click Search Button
And User Clicks on the videos
Then All IPL Videos Displayed
And Browser Closed