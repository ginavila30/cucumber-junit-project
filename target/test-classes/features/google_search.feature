Feature: Google Search

  User story: As a user when I am on google page I should be able to search whatever I want and see relevant results.


  Background:
    Given User is on google home page

 @july2
 Scenario: User is able to search whatever and see relevant results
   When User types apple in the google search box and hits enter
   Then User sees apple – Google Search is in the google title

 @july2
  Scenario: User is able to search whatever and see relevant results
    When User types "apple" in the google search box and hits enter
    Then User sees "apple - Google Search" is in the google title