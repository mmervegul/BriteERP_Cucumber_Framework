Feature: Crm functionality
  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  @db
  Scenario Outline: As a manager user I should be able to create an opportunity
    When the manager clicks on CRM button
    Then the manager clicks on Crm Create button
    Then the manager enters opportunity title to "<Opportunity Title>"
    Then the manager enters customer title to "<Customer>"
    Then the manager enters expected revenue to "<Expected Revenue>"
    And the manager selects priority from "<Priority>"
    And the manager clicks on create button
    Then the manager should be able to see "<Opportunity Title>" opportunity
    Then the manager should be able to see "<Customer>" customer title
    Then the manager should be able to see "<Expected Revenue>" expected revenue
    Then the manager should be able to see "<Priority>" priority
    Then the manager should be able to see "<Opportunity Title>" opportunity title from excel sheet
    Then the manager should be able to see "<Customer>" customer from excel sheet
    Then the manager should be able to see "<Expected Revenue>" expected revenue from excel sheet
    Then the manager should be able to see "<Priority>" priority from excel sheet

    Examples:
      |Opportunity Title   |Customer     |Expected Revenue|Priority|
      |Sports Team Project |Mike Smith   |2500            |1       |
      |New Team Project    |John Byron   |1000            |1       |
      |Team Lead Project   |Emma Verton  |2010            |1       |
      |Test1               |Robert Miller|1200            |1       |
      |Active Users Project|Mary Taylor  |1020            |1       |



