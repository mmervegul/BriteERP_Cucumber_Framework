Feature: General channel functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  @wip
  Scenario: As a manager user I should be able to click on Channels button
    Then the manager user clicks on Channels button

