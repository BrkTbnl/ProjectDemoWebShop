Feature: Negative login test multi scenario

  Background:
    Given Navigate to Webpage
    And Click on Login Button

  @ignore
  @RegressionTest
  Scenario: Leaving email and password part empty
    When User leaves e-mail and password part empty.
    And Clicks on Login Button below
    Then Error Message should be displayed

  @ignore
  @RegressionTest
  Scenario: Valid email, empty password
    When User writes valid email and leave password empty
    And Clicks on Login Button below
    Then Error Message should be displayed

  @ignore
  @RegressionTest
  Scenario: Empty email, valid password
    When User writes valid password but leaves email empty
    And Clicks on Login Button below
    Then Error Message should be displayed

