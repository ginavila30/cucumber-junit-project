Feature: Data Driven testing using Scenario Outline

  @google_outline
  Scenario Outline: Google capital cities search
    Given User is on google home page
    When  User searches for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
      | country     | capital          |
      | Azerbaijan  | Baku             |
      | Tajikistan  | Dushanbe         |
      | Bulgaria    | Sofia            |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | Turkey      | Ankara           |
