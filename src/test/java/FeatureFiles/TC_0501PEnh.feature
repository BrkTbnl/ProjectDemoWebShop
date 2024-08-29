Feature: Purchasing steps

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


  @SmokeTest
  Scenario: Purchasing steps
    Given Click on element in DialogContent
      | AcceptTerms |
      | CheckOut    |
    And Select item from select box
      | Country | Poland |
    And User sends the keys in DialogContent
      | City    | none      |
      | Address | none      |
      | Zip     | 123123    |
      | Phone   | 123123123 |
    When Click on element in DialogContent
      | Continue Billing         |
      | Continue Shipping        |
      | Continue Shipping Method |
      | Continue Payment Method  |
      | Continue Payment Info    |
      | Confirm Order            |
    Then a success message for the order should be displayed
