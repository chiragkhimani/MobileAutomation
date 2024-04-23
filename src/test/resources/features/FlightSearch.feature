Feature: Flight Search

  Scenario: Verify user can search flight
    Given user open application
    Then verify user is on home screen
    When user click on Flights menu
    Then verify user is on flight search screen