Feature: Movie suggestion feature

  As a user
  I should be able to get movies according to my preferences

  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "comedy"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search data table
    Given I like below favorite movie with certain type
      | actions   | John Wick   |
      | drama     | Titanic     |
      | cartoon   | Tom & Jerry |
      | adventure | Tomb Raider |
    When I go to homepage
    Then I should get right recommendation

    Scenario: Movie search datatable List of list
      Given I like below movies with ratings

        | actions   | John Wick   |9.3|
        | drama     | Titanic     |9.6|
        | cartoon   | Tom & Jerry |10 |
        | adventure | Tomb Raider |8.5|
      When I go to homepage
      Then I should get right recommendation

  Scenario: Movie search datatable List of Map
    Given I like below movie table with ratings

      |Genre      |Movie Name   |Rate|
      | actions   | John Wick   |9.3 |
      | drama     | Titanic     |9.6 |
      | cartoon   | Tom & Jerry |10  |
      | adventure | Tomb Raider |8.5 |
    When I go to homepage
    Then I should get right recommendation




