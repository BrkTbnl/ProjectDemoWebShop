Feature: Check and Obtain order documents

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

  Scenario:
    Given User clicks on his mail address on top navigation bar to see his profile
    And clicks on Orders button on left navigation bar
    When clics on Details button to inspect his last order
    Then Order status should be visible