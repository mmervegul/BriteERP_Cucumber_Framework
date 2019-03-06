Feature: Leaves functionality
  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  Scenario Outline:  As a manager user I should be able to save Leaves Summary
    When the manager clicks on Leaves button
    Then the manager enters valid "<Description>" description
    Then the manager selects valid "<Leave Type>" type
    And the manager selects valid "<Duration1>" date and time
    And the manager selects valid "<Duration2>" date and time
    And the manager enters valid duration "<days>"
    Then the manager clicks on Save button

      Examples:
      |     Description     |Leave Type|    Duration1       |     Duration2      |days|
      |account@cybertek.com |Unpaid    |3/13/2019 9:48:36 PM|3/28/2019 9:48:36 PM|15  |
