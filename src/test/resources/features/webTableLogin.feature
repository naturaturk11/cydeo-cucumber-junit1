Feature: User should be ableto login using correct credentials

Background: USER İS ON THE PAGE
  Given user is on the login page of web table app

  Scenario: Positive login scenario

    When user enters username "username"
    And user enters password "password"
    And user clicks login button
    Then user see URL contains orders

  Scenario: Positive login scenario

    When user enters username "username" password "password" logins
    Then user see URL contains orders



  Scenario: User should be able to see all 12 months in dropdown
  months
  dropdown

    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user see URL contains orders