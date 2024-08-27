Feature: Successful Logout

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

  @SmokeTest
  Scenario:
    When Click on Log out Button
    Then User should not be able to see his mail on top of the page