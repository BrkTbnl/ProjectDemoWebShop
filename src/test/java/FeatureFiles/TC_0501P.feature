Feature: Purchasing steps

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

  @SmokeTest
  Scenario:
    Given user clicks on Computer and selects Desktops in the left navigation bar
    And selects a model from there and clicks on Add to Cart below the model
    And clicks on the Add to Car button
    And Success message displayed
    When user clicks on Shopping Cart at the top of the window
    Then user should be able to see his order in the shopping cart

  @SmokeTest
  Scenario:
    Given the user clicks on the Shopping Cart at the top of the window
    And clicks on the accept terms button and then clicks on Checkout
    And the user enters their billing address and clicks on Continue
    And the user checks and selects Continue at every step
    When the user clicks on Confirm in the confirm order section
    Then a success message for the order should be displayed



