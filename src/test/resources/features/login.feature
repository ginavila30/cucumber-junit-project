@Regression
Feature: Library app login feature

  UserStory:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background:
    Given user is on log in page


@librarian @employee
 Scenario: login with valid librarian credentials
  #Given user is on log in page
  When librarian enter valid  username
  And librarian enter valid  password
  Then librarian should login successfully
  And Homepage should be displayed

@Student
  Scenario: login with valid student credentials
   # Given user is on log in page
    When student enter valid  username
    And student enter valid  password
    Then student should login successfully
    And Homepage should be displayed

  @Admin
  Scenario: login with valid admin credentials
   # Given user is on log in page
    When admin enter valid  username
    And admin enter valid  password
    Then admin should login successfully
    And Homepage should be displayed