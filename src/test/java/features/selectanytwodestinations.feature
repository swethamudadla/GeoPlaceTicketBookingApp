Feature: Flights from any two destinations

  As a user i should select flights from any two destinations

  Scenario Outline: Validate the flights are available from any two destinations

    Given I am in flights homepage
    When I click on from destination field
    And I enter from destination "<From Destination>"
    And I select first from destination from displayed values
    And I click on to destination field
    And I enter to destination "<To Destination>"
    And I select to destination from displayed values
    Then I click on search button
    Examples:
      | From Destination | To Destination |
      | LHR              | DEL            |
      |Gatwick           |Mumbai          |

