Feature: Direct message functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a manager user I should be able to click on plus sign
    Then click on direct message plus sign button

  Scenario: As a manager user I should be able to enter valid user name
    Then click on direct message plus sign button
    Then the manager enters valid user name


  Scenario: As a manager user I should be able to click on user name
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user

  @wip
  Scenario: As a manager user I should be able to click on Write something box
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on Write something box


