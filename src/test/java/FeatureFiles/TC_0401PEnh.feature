Feature: Adding item to shopping cart

  Background:
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
  Scenario:
    Given Click on element in LeftNavBar
      | Computers |
      | Desktops  |

    And Click on element in DialogContent
      | HighEndPc |
      | AddToCart |
    Then Success message displayed

    When Click on element in TopNavigation
      | ShoppingCart |
    Then user should be able to see his order in the shopping cart