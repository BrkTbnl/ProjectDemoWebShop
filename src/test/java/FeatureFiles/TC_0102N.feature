Feature: Create user account negative test with using used mail

  @ignore
  @RegressionTest
  Scenario: User successfully creates an account on demoWeb
    Given Navigate to Webpage
    And Click on Register button
    When Enter all required information and Click Register button
    Then Error message should be displayed
