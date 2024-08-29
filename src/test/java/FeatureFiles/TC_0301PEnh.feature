Feature: Successful Logout


  Background: Scenario: Successful log-in
    Given Navigate to Webpage
    And Click on element in TopNavigation
      | Login |
    When User sends the keys in DialogContent
      | Email    | testerbob7@gmail.com |
      | Password | 123qwe123            |

    And Click on element in DialogContent
      | Login button |
    Then User should see his mail address on top of the page

  @SmokeTest
  Scenario: Successful logout
    When Click on element in TopNavigation
    |Logout|
    Then User should not be able to see his mail on top of the page