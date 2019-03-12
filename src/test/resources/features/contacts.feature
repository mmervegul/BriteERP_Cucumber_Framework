Feature: Contacts functionality

  Background: Go to login page from homepage
    Given the manager is on the landing page
    And the manager enters valid email address
    And the manager enters valid password
    And the manager clicks on Login button

  @db @wip
  Scenario Outline: As a manager user I should be able to create contacts
    When the manager clicks on Contacts button
    Then the manager clicks on Create button to create contacts
    And the manager enters "<Contact Name>" to contact name box
    And the manager enters "<Website>" to website box
    And the manager enters "<Job Position>" to job position box
    And the manager enters "<Email>" to email box
    And the manager enters "<Phone>" to phone box
    And the manager enters "<Notes>" to internal notes box
    And the manager creates new contact when clicks on the Save button
    Then the manager sees contact name, website, job position, email, phone number and notes from database
    And the manager sees contact name, website, job position, email, phone number and notes from excel sheet

    Examples:
      |Contact Name |Website   |Job Position|Email                   |Phone    |Notes        |
      |Mike Brown   |www.mikebrown.com|QA Engineer |mikebrown@example.com   |231123333|New account 1|
      |Harry Johnson|www.harryjohnson.com|Scrum Master|harryjohnson@example.com|487563908|New account 2|
      |Bob Taylor   |www.bobtaylor.com|SDET        |bobtaylor@example.com   |765676567|New account 3|
      |Mary Miller  |www.marymiller.com|QA Analyst  |marymiller@example.com  |214324678|New account 4|
      |Eric Kriss   |www.erickriss.com|QA Analyst  |erickriss@example.com   |840531356|New account 5|


