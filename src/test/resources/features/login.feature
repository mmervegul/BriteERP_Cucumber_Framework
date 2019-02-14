Feature: Login test

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button

  Scenario: As a manager user, I should be able to login
    And the manager enters valid email address
    And the manager enters valid password
    Then the manager clicks on Login button

  Scenario: As a user, I should be able to login
    And the user enters valid email address
    And the user enters valid password
    Then the user clicks on Login button
