Feature: As a manager user, I should be able to login.

  Scenario: Manager user - Positive login test
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    Then the manager clicks on Login button


  Scenario: User - Positive login test
    Given the manager is on the landing page
    When the user clicks on BriteErpDemo button
    And the user enters valid email address
    And the user enters valid password
    Then the user clicks on Login button
