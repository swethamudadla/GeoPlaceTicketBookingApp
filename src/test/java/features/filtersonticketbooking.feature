Feature: Filters On Flight Ticket Booking
  As a user i should apply Date, Passenger, Travel Class filters on while booking flight ticket

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

  Scenario Outline: Validate Filters On Flight Ticket Booking
    Given I am in flight selection page
    When I click on change search link
    And I click on date outbound
    And I select out bound date from the calendar "<outBoundDate>"
    And I click add return button
    And I select return date from the calendar "<returnDate>"
    And I click on passengers dropdown
    And I select adults and childrens
    And I click on travel class
    And I select travel class as business
    Then I click on filter search button
    Examples:
      | outBoundDate | returnDate |
      |22/08/2021    |12/09/2021  |
