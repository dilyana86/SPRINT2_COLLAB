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