Feature: Starred message functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a sales manager user I should be able to click on Starred message button
    Then the manager user clicks on Starred message button


