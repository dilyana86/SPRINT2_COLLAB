Feature: Arrange Vehicle Table Columns via Grid Settings
  Agile Story: As a user, I should be able to arrange vehicle table columns via "grid settings" functionality
  under Fleet-Vehicles page.

  @Hanna
  Scenario: User arranges vehicle table columns using grid settings
    Given the user is on the Fleet-Vehicles page
    When the user clicks on the gear icon
    Then "Grid Settings" should be visible
    And the column names in grid settings should be displayed as follows:
      | id                       |
      | License Plate            |
      | Tags                     |
      | Driver                   |
      | Location                 |
      | Chassis Number           |
      | Model Year               |
      | Last Odometer            |
      | Immatriculation Date     |
      | First Contact Date       |
      | Catalog Value (VAT Incl.)|
      | Seats Number             |
      | Doors Number             |
      | Color                    |
      | Transmission             |
      | Fuel Type                |
      | CO2 Emissions            |
      | Horsepower               |
      | Horsepower Taxation      |
      | Power                    |