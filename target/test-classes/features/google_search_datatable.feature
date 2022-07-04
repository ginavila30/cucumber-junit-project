Feature: passing multiple parameters to the step
@datatable
  Scenario: User searches for multiple items
    Given User is on google home page
    Then User should be able to search for following:
      | java          |
      | selenium      |
      | cucumber bdd  |
      | QA automation |
      | wooden spoon  |
