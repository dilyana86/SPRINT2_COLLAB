Feature: As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    Then the user should click on filter icon
    Then the user should be able to see Manage filters button


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @lastOdometerFilter
  Scenario: Verify "Last Odometer" filter methods
    Given the user is on the 'Fleet-Vehicles' page
    When the user selects the "Last Odometer" filter
    Then the user should see the following filter methods:
      | Method                |
      | Between               |
      | Not Between           |
      | Equals                |
      | Not Equals            |
      | More Than             |
      | Less Than             |
      | Equals or More Than   |
      | Equals or Less Than   |
      | Is Empty              |
      | Is Not Empty          |