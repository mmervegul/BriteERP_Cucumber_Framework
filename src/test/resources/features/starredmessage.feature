Feature: Starred message functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario: As a manager user I should be able to click on Starred message button
    Then the manager user clicks on Starred message button

  Scenario: As a manager user I should be able to add message to the starred message
    When the manager clicks on general channel
    Then the general channel messages are displayed
    And the manager clicks on star icon
    Then this message is displayed in starred message

  Scenario: As a manager user I should be able to see starred message count
    When the manager clicks on general channel
    Then the general channel messages are displayed
    And the manager clicks on star icon
    Then this message is displayed in starred message
    Then the starred message count is displayed



