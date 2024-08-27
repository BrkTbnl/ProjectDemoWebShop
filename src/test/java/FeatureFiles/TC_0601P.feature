Feature: Community Pool survey

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

    Scenario:
      Given User selects an option in the Community poll
      When Clicks on Vote button
      Then user should be able to see how many people veted before