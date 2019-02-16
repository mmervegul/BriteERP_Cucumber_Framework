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

  Scenario: As a manager user I should be able to click on Write something box
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on Write something box

  Scenario: As a manager user I should be able to click on Write something box
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on Write something box
    When write something on Write something box

  Scenario: As a manager user I should be able to click on emoji
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on Write something box
    When click on emoji button
    And click on party emoji

  Scenario: As a manager user I should be able to click on Send button
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on Write something box
    When write something on Write something box
    When click on emoji button
    And click on party emoji
    Then click on Send button

  Scenario: As a manager user I should be able to click on the x sign
    Then click on direct message plus sign button
    Then the manager enters valid user name
    And the manager clicks on user
    And click on x sign



