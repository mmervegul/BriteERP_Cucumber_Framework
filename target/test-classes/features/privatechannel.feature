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

  @wip
  Scenario: As a manager user I should be able to click on Unsubscribe button
    Then the manager user clicks on private message plus sign button
    Then the manager user enters private valid user name
    When the manager user writes something on private message Write something box
    Then the manager user clicks on Send button to send private message
    And the manager user clicks on Unsubscribe button