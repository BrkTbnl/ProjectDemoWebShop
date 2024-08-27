Feature: Using coupon code Negative test

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page
    Given user clicks on Computer and selects Desktops in the left navigation bar
    And selects a model from there and clicks on Add to Cart below the model
    And clicks on the Add to Car button
    Then Success message displayed

    @RegressionTest
    Scenario:Using coupon code Negative test
      Given the user clicks on the Shopping Cart at the top of the window
      When User enters his promo code
      And clicks on Apply Coupon button
      Then error message should be displayed