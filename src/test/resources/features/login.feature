@Regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin



  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student @db
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard


  Scenario: Login  as guest
    When  user enters guest username
    And user enters guest password
    Then user should see the dashboard

#this is how we add comments in feature file