Feature: Click on plus sign.

  @wip
  Scenario: As a manager user I should be able to click on plus sign.
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button
    Then click on direct message plus sign button