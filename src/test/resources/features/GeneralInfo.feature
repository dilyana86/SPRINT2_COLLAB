@B30G9-168
Feature: Fleet Management vehicle information

  Background: User is already in the log in page
    Given the user is on the login page

  @AC1
  Scenario Outline: User can see the "General Information" page by clicking on any vehicle (row), under 'Fleet-Vehicle' module
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    And user click any vehicle row in the list
    Then user should see vehicle information displayed
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
      | Logo                      |
      | Vehicle Model             |
      | Vehicle Make              |


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  @AC2
  Scenario Outline: User can see the "General Information" page clicking on the "Eye (View)" icon at the end of each row, under 'Fleet-Vehicle' module
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    And user click Eye icon at the end of each row
    Then user should see vehicle information displayed
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
      | Logo                      |
      | Vehicle Model             |
      | Vehicle Make              |


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


    @AC3
  Scenario Outline: User can see the "General Information" page by clicking on any vehicle (row), under 'Fleet-Vehicle' module
    Given the user logged in as "<userType>"
    Then the user hover over fleet and click on vehicles
    And user click any vehicle row in the list
    Then user should see vehicle information displayed
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
      | Logo                      |
      | Vehicle Model             |
      | Vehicle Make              |

      Then sales manager and store manager should see Edit, Delete and Add Event buttons on the General Information page

    Examples:
      | userType      |
      | sales manager |
      | store manager |