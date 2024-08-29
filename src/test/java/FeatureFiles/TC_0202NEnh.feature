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

