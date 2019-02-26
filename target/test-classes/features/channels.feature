Feature: Channels functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a manager user I should be able to click on Channels button
    Then the manager clicks on Channels button

  Scenario: As a manager user I should be able to see valid public channels name
    Then the manager clicks on Channels button
    And all valid channels are displayed

  Scenario: As a manager user I should be able to join any channel when click on the Join button
    Then the manager clicks on Channels button
    When the manager clicks on join button

  @wip
  Scenario: As a manager user I should be able to leave any channel when click on the Leave button
    Then the manager clicks on Channels button
    When the manager clicks on Events channel
    Then the manager clicks on Members button
    Then the manager clicks on Edit button
    And the manager clicks on trash can icon



