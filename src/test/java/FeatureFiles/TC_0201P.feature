Feature: Successful log-in

  Scenario:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page
