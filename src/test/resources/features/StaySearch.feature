Feature: Flight Search

  Scenario: Verify user can search flight
    Given user open application
    Then verify user is on home screen
    When user click on Stays menu
    And user enters stay location "stay.location"
    And select date check-in date "check-in.date"
    And checkout date "check-out.date"
    And click on search button
    Then verify list of properties are displayed on the screen

