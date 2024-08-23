Feature: Create user account

  Scenario: User successfully creates an account on akakce.com
    Given Navigate to Webpage
    And Click on Register button
    When Enter all required information and Click Register button
    Then Success message should be displayed
