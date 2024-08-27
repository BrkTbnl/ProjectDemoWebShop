Feature: Using coupon code Negative test

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page

    Scenario:
      Given the user clicks on the Shopping Cart at the top of the window
      When User enters his promo code
      And clicks on Apply Coupon button
      Then error message should be displayed