@july2
Feature: Wikipedia search
  User Story: As a user I should be able to search anything, so that I can see information page related to the search term.

  Background:
    Given user is on Wikipedia home page

  Scenario Outline: User is able to search <SearchKey>and the search term appears on the page Title
    When User types <SearchKey> in the wiki search box
    And User clicks wiki search button
    Then User sees <SearchKey> is in the wiki title
    Examples:
      | SearchKey    |
      | "Shakira"    |
      | "Joe Biden"  |
      | "Steve Jobs" |
      | "Donald Trump" |

  Scenario Outline: User is able to search <SearchKey> and the search term appears on the main header
    When User types <SearchKey> in the wiki search box
    And User clicks wiki search button
    Then User sees <SearchKey> is in the main header
    Examples:
      | SearchKey    |
      | "Shakira"    |
      | "Joe Biden"  |
      | "Steve Jobs" |

  Scenario Outline: User is able to search <SearchKey> and the search term appears on the image header
    When User types <SearchKey> in the wiki search box
    And User clicks wiki search button
    Then User sees <SearchKey> is in the image header

    Examples:
      | SearchKey    |
      | "Shakira"    |
      | "Joe Biden"  |
      | "Steve Jobs" |