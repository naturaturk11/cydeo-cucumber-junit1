
Feature: Wikipedia search functionality and verification

 #45234---->POTENTİAL JİRA TİCKET NUMBER


  Scenario:  Wikipedia search functionality and verification
    Given User is on wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario:  Wikipedia search functionality and Header verification
    Given User is on wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then  User sees "Steve Jobs" is in the main header


  @scenarioOutline
  Scenario Outline:  Wikipedia search functionality and verification
    Given User is on wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And  User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then  User sees "<expectedHeader>" is in the main header

    Examples: SEARCH VALUES WE ARE GOİNG TO BE İN THİS AS BELOW
      | searchValue           | expectedTitle         | expectedHeader        |
      | Steve Jobs            | Steve Jobs            | Steve Jobs            |
      | Bob Marley            | Bob Marley            | Bob Marley            |
      | Mustafa Kemal Atatürk | Mustafa Kemal Atatürk | Mustafa Kemal Atatürk |
      | Fevzi Çakmak          | Fevzi Çakmak          | Fevzi Çakmak          |