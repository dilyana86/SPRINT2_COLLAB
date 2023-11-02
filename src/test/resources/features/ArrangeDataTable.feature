Feature: Arrange Vehicle Table Columns via Grid Settings
  Agile Story: As a user, I should be able to arrange vehicle table columns via "grid settings" functionality
  under Fleet-Vehicles page.

  Background: User is already in the log in page
    Given the user is on the login page

  @Hanna
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    When the user clicks on the gear icon
    Then Grid Settings should be visible
    And the column names in grid settings should be displayed as follows:
      | Id                        |
      | License Plate             |
      | Tags                      |
      | Driver                    |
      | Location                  |
      | Chassis Number            |
      | Model Year                |
      | Last Odometer             |
      | Immatriculation Date      |
      | First Contract Date       |
      | Catalog Value (VAT Incl.) |
      | Seats Number              |
      | Doors Number              |
      | Color                     |
      | Transmission              |
      | Fuel Type                 |
      | CO2 Emissions             |
      | Horsepower                |
      | Horsepower Taxation       |
      | Power (KW)                |

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |
