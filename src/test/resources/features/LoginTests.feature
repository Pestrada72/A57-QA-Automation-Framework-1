Feature: Login feature

  Scenario: Login Success
    Given I open Login page
    When I enter email "pearl.estrada@testpro.io"
    And I enter password "April969!!"
    And I click submit
    Then I am logged in