Feature: Private channel functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    When the manager clicks on BriteErpDemo button
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  @wip
  Scenario: As a manager user I should be able to send private message
    Then click on private message plus sign button
    Then the manager enters private valid user name
    When write something on private message Write something box
    When click on private message emoji button
    And click on Thumbs Up emoji
    Then click on Send button to send private message
