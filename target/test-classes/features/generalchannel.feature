Feature: General channel functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a manager user I should be able to click on Channels button
    Then the manager user clicks on Channels button

  Scenario: As a manager user I should be able to click on channels plus sign
    When the manager user clicks on channels plus sign
    And channels plus sign is clickable

  Scenario: As a manager user I should be able to see Add a channel box
    When the manager user clicks on channels plus sign
    And channels plus sign is clickable
    And Add a channel box is displayed

  Scenario: As a manager user I should be able to write new channel name
    When the manager user clicks on channels plus sign
    And channels plus sign is clickable
    And Add a channel box is displayed
    When the manager user clicks on Add a channel box
    Then the manager user writes channel name to the Add a channel box
    Then the manager clicks on Create link
    And the manager sees new channel name

  @wip
  Scenario: As a manager user I should be able to click on channel name
    When the manager user clicks on channels plus sign
    And channels plus sign is clickable
    And Add a channel box is displayed
    When the manager user clicks on Add a channel box
    Then the manager user writes channel name to the Add a channel box
    Then the manager clicks on Create link
    And the manager sees new channel name
    And the manager clicks on channel name
    Then the manager sees created channel message when click on the channel name


