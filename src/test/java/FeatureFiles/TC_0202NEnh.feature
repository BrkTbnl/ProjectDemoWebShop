#Feature: Negative login test multi scenario
#
#  Background:
#    Given Navigate to Webpage
#    And Click on Login Button
#
#  @RegressionTest
#  Scenario: Leaving email and password part empty
#    When User leaves e-mail and password part empty.
#    And Clicks on Login Button below
#    Then Error Message should be displayed
#
#  @RegressionTest
#  Scenario: Valid email, empty password
#    When User writes valid email and leave password empty
#    And Clicks on Login Button below
#    Then Error Message should be displayed
#
#  @RegressionTest
#  Scenario: Empty email, valid password
#    When User writes valid password but leaves email empty
#    And Clicks on Login Button below
#    Then Error Message should be displayed

Feature: Negative login test multi scenario

  Background:
    Given Navigate to Webpage
    And Click on element in TopNavigation
      | Login |

  @RegressionTest
  Scenario:  Invalid email, valid password
    Given User sends the keys in DialogContent
      | Email    | testerbobT@gmail.com |
      | Password | 123qwe123            |
    When Click on element in DialogContent
      | Login button |
    Then Error Message should be displayed

  @RegressionTest
  Scenario:  Valid email, invalid password
    Given User sends the keys in DialogContent
      | Email    | testerbob7@gmail.com |
      | Password | test                 |
    When Click on element in DialogContent
      | Login button |
    Then Error Message should be displayed

  @RegressionTest
  Scenario:  valid email, valid password
    Given User sends the keys in DialogContent
      | Email    | testerbobT@gmail.com |
      | Password | test                 |
    When Click on element in DialogContent
      | Login button |
    Then Error Message should be displayed

