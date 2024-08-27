Feature: Payment negative test with Credit Card with invalid cart info

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page
    Given user clicks on Computer and selects Desktops in the left navigation bar
    And selects a model from there and clicks on Add to Cart below the model
    And clicks on the Add to Car button
    And Success message displayed
    When user clicks on Shopping Cart at the top of the window
    Then user should be able to see his order in the shopping cart

  @RegressionTest
  Scenario:Payment negative test with Credit Card with invalid cart info
    Given the user clicks on the Shopping Cart at the top of the window
    And clicks on the accept terms button and then clicks on Checkout
    And the user chooses his billing address and click on Continue until payment method
    And User selects Credit Cart from the payment method section and clicks Continue
    When User enters his cart information and clicks on Continue
    Then payment type should not be accepted

