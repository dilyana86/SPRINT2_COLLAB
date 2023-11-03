Feature:As a store manager and sales manager, I should be able to add an event AT

  Background: User is already in the log in page
    Given the user is on the login page


@Angela
  Scenario Outline: Store Manager and Sales manager can click "Add Event" button
      #(by clicking on any vehicle/row under Fleet-Vehicle module)
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    And click on vehicles row
    And user should click on the add event button

    Examples:
      | userType      |
      | store manager |
      | sales manager |


  @Angela
  Scenario Outline: Store Manager and Sales manager can click "Add Event" button
      #(by clicking on any vehicle/row under Fleet-Vehicle module)
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    And click on vehicles row
    And user should click on the add event button
    Then user should see the add event page

    Examples:
      | userType      |
      | store manager |
      | sales manager |



















