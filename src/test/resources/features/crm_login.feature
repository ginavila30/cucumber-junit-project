@login_nextbase_crm
Feature: login NextBase CRM

  User Story: as a user should be able to login and see home page
Scenario: User should be able to see all 12 months in months dropdown


Given User is on the login page of CRM
When User enters below credentials crm
| username     | hr25@cybertekschool.com    |
| password   | UserUser |
Then User should see page that contains "Portal"