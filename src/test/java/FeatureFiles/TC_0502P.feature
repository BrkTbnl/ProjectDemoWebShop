Feature: Payment test with Check/Money order

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

  Scenario:
    Given the user clicks on the Shopping Cart at the top of the window
    And clicks on the accept terms button and then clicks on Checkout
    And the user enters their billing address and clicks on Continue
    And the user checks and selects Continue at every step
    When the user clicks on Confirm in the confirm order section
    Then a success message for the order should be displayed
