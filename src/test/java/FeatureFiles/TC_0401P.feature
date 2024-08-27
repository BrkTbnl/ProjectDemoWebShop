Feature: Adding item to shopping cart

  Background:
    Given Navigate to Webpage
    And Click on Login Button
    When User enters username and password and click on login button
    Then User should see his mail address on top of the page


  @SmokeTest
  Scenario:Adding item to shopping cart
    Given user clicks on Computer and selects Desktops in the left navigation bar
    And selects a model from there and clicks on Add to Cart below the model
    And clicks on the Add to Car button
    And Success message displayed
    When user clicks on Shopping Cart at the top of the window
    Then user should be able to see his order in the shopping cart


