Feature: Private channel functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a manager user I should be able to send private message
    Then the manager user clicks on private message plus sign button
    Then the manager user enters private valid user name
    When the manager user writes something on private message Write something box
    When the manager user clicks on private message emoji button
    And the manager user clicks on Thumbs Up emoji
    Then the manager user clicks on Send button to send private message

  Scenario: As a manager user I should be able to click on Unsubscribe button
    Then the manager user clicks on private message plus sign button
    Then the manager user enters private valid user name
    When the manager user writes something on private message Write something box
    Then the manager user clicks on Send button to send private message
    And the manager user clicks on Unsubscribe button

  Scenario: As a manager user I should be able to see private messages date
    Then the manager user clicks on private message plus sign button
    Then the manager user enters private valid user name
    When the manager user writes something on private message Write something box
    Then the manager user clicks on Send button to send private message
    Then the manager user see messages date from any private channel

  Scenario: As a manager user I should be able to add private channels when click on the plus sign on the right side
    Then the manager user clicks on private message plus sign button
    And private channel plus sign is displayed
    Then the manager user enters private valid user name

  @wip
  Scenario: As a manager user I should be able to see Add a private channel box when click on plus sign
    Then the manager user clicks on private message plus sign button
    And add a private channel box is displayed
    And the manager user enters private valid user name