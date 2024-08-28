#Feature: Successful log-in
#
#  @ignore
#  @SmokeTest
#  Scenario: Successful log-in
#    Given Navigate to Webpage
#    And Click on Login Button
#    When User enters username and password and click on login button
#    Then User should see his mail address on top of the page
Feature: Successful log-in

  @SmokeTest
  Scenario: Successful log-in
    Given Navigate to Webpage
    And Click on element in TopNavigation
      | Login |
    When User sends the keys in DialogContent
      | Email    | testerbob7@gmail.com |
      | Password | 123qwe123            |

    And Click on element in DialogContent
      | Login button |
    Then User should see his mail address on top of the page
