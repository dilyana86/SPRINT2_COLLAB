@B30G9-227
Feature: Default

  Background: User is already in the log in page
    Given the user is on the login page

  @B30G9-223
  Scenario Outline: Verify user can see all vehicle information under 'Fleet-Vehicles' module
    Given the user logged in as "<userType>"
    And the user hover over fleet and click on vehicles
    Then user should see all vehicle information

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B30G9-224
  Scenario Outline: Verify user can see the total page number
    Given the user logged in as "<userType>"
    And the user hover over fleet and click on vehicles
    Then user should see total page number

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B30G9-225
  Scenario Outline: Verify user  can go to next page clicking ">" button and can go to previous page clicking "<" button
    Given the user logged in as "<userType>"
    And the user hover over fleet and click on vehicles
    And user click on the next page button
    Then user should go to next page
    And user click on the previous page button
    Then user should go to previous page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B30G9-226
  Scenario Outline: Verify user can see the total page number
    Given the user logged in as "<userType>"
    And the user hover over fleet and click on vehicles
    Then user should see total recordings of vehicles

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |



