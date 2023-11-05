Feature: As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page

  Background: User is already in the log in page
    Given the user is on the login page

  @andy
  Scenario Outline: Verify "Last Odometer" filter methods
    Given the user logged in as "<userType>"
    Then user navigate to fleet management Page
    And  the user clicks on filter icon
    Then  user should be able to see Manage filters button
    When the user selects from filter as "<filterType>"
    And the user clicks on filter drop down
    Then the user should see filter methods as "<methods>"
    Examples:
      | userType      | filterType      | methods  |
      | sales manager | Last Odometer   | Between, not between, equals, not equals, more than, less than, equals or more than, equals or less than, is empty, is not empty|
      | store manager | Last Odometer   | Between, not between, equals, not equals, more than, less than, equals or more than, equals or less than, is empty, is not empty|



  @andy
  Scenario Outline: When user selects "Between" method with numeric values, the results should be between the specified values
    Given the user logged in as "<userType>"
    Then user navigate to fleet management Page
    And  the user clicks on filter icon
    Then  user should be able to see Manage filters button
    When the user selects from filter as "<filterType>"
    And the user clicks on filter drop down
    When the user  clicks on a "<methods>"
    And enters some numeric value as "<value1>"and "<value2>"
    Then the user should see correct results
    Examples:
      | userType      | filterType      | methods  |value1|value2|
      | sales manager | Last Odometer   | between| 1000    |1500   |
      | store manager | Last Odometer   | between| 1000    |1500   |
