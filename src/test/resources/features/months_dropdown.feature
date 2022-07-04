@dropdown
Feature: Month selection

  User Story: As a user I should see the 12 months under month dropdown

  Scenario: User should see the month dropdown values

Given User is on the dropdowns page of practice tool
Then User should see below info in month dropdown
|January  |
|February |
|March    |
|April    |
|May      |
|June     |
|July     |
|August   |
|September|
|October  |
|November |
|December |