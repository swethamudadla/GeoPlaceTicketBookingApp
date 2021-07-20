Feature: Book a ticket and flight seat selection
  As a user i should be able to book a ticket and select either aisle or window seat

  Scenario Outline: Validate the flights are available from any two destinations

    Given I am in virgin atlantic flights homepage
    When I click on from destination field in virgin atlantic
    And I enter from destination value"<From Destination>"
    And I select from destination from displayed values
    And I click on to destination field in virgin atlantic
    And I enter to destination value "<To Destination>"
    And I select to destination value from displayed values
    And I select one way trip
    And I click on date from date
    And I select from date from the calendar "<outBoundDate>"
    And I click on passenger dropdown
    And I select adults and children
    And I click on search button field
    And I click business class ticket for outbound
    And I select business class ticket for outbound
    Then I click on choose seat link
    And I should be select aisle seat or window seat
    Examples:
      | From Destination | To Destination | outBoundDate |
      |LHR               |BOM             |12/10/2021    |
