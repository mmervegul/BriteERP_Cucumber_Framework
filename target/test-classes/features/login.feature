Feature: Login test

  Background: Go to login page from homepage
    Given the manager is on the landing page

  @managerpositivelogin
  Scenario: As a manager user, I should be able to login
    And the manager enters valid email address
    And the manager enters valid password
    Then the manager clicks on Login button

   @managernegativelogin
   Scenario Outline: As a user, I should not be able to login
     And the manager enters valid email address
     And the manager enters invalid password
     Then the manager clicks on Login button
     Then the manager sees "<error>" message
     Examples:
       | error                |
       | Wrong login/password |

  @userpositivelogin
  Scenario: As a user, I should be able to login
    And the user enters valid email address
    And the user enters valid password
    Then the user clicks on Login button

  @usernegativelogin
  Scenario Outline: As a user, I should not be able to login
    And the user enters valid email address
    And the user enters invalid password
    Then the user clicks on Login button
    Then the user sees "<error>" message
    Examples:
      | error                |
      | Wrong login/password |

