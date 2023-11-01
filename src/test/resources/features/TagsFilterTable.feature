Feature:

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |