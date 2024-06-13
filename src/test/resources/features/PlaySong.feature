Feature: Play A Song feature

  Scenario: Play a Song
    Given: I am logged in
    When: I choose all songs list
    And: I choose first song
    And: I choose play option
    Then: Verify song is playing
