Feature:Create user account negative test with using used mail

  @RegressionTest
  Scenario: Create user account negative test with using used mail
    Given Navigate to Webpage
    And Click on element in TopNavigation
      | Register |
    And Click on element in DialogContent
      | Gender |
    When User sends the keys in DialogContent
      | Name             | bob                  |
      | LastName         | tester               |
      | Email            | testerbob7@gmail.com |
      | Password         | 123qwe123            |
      | Password Confirm | 123qwe123            |
    And Click on element in DialogContent
      | Register button |

    Then Error message should be displayed