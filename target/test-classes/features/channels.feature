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

  Scenario: As a manager user I should be able to leave any channel when click on the trash can icon
    Then the manager clicks on Channels button
    When the manager clicks on Events channel
    Then the manager clicks on Members button
    Then the manager clicks on Edit button
    And the manager clicks on trash can icon

  Scenario: As a manager user I should be able to click on Sales channel
    Then the manager clicks on Channels button
    When the manager clicks on sales channel
    And the channel name is equal to the sales channel name

  Scenario: As a manager user I should be able to click on sales channel user name
    Then the manager clicks on Channels button
    When the manager clicks on sales channel
    And the channel name is equal to the sales channel name
    Then the manager clicks on Members button
    And the manager clicks on sales channel user name
    And the expected user names are equal to actual user names

  Scenario: As a manager user I should be able to see members recipient and email
    Then the manager clicks on Channels button
    When the manager clicks on sales channel
    And the channel name is equal to the sales channel name
    Then the manager clicks on Members button
    And the manager sees sales channel members recipient and email

  @db
  Scenario: As a manager user I should be able to create new channel
    Then the manager clicks on Channels button
    Then the manager creates new channel when click on the Create button
    When the manager writes channel name to channel name box
    And the manager writes channel description to Description box
    Then the manager clicks on Save button to crete new channel
    Then the manager clicks on new channel
    When the manager sees channel name in Channels
    When the manager sees channel description in Channels
    Then the manager sees channel name in database
    Then the manager sees channel description in database

