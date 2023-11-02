@B30G9-199
Feature: Default

	Background:
		#@B30G9-196
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
		

	#{color:#00875a}+_*User Story:*_+{color}
	#
	#As a user, I should be able to arrange vehicle table columns via "grid settings" functionality under Fleet-Vehicles page.
	#
	#{color:#00875a}+_*Acceptance Criteria:*_+{color}
	#
	#1. "Grid Settings" should be visible when user clicks on the gear icon
	#
	# 
	@B30G9-197
	Scenario Outline: "Grid Settings" should be visible when user clicks on the gear icon
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

	#{color:#00875a}+_*User Story:*_+{color}
	#
	#As a user, I should be able to arrange vehicle table columns via "grid settings" functionality under Fleet-Vehicles page.
	#
	#{color:#00875a}+_*Acceptance Criteria:*_+{color}
	#2. Column names in grid settings should be shown as below
	#
	#-Id                                               
	#
	#-License Plate                                           
	#
	#-Tags                                     
	#
	#-Driver                                                           
	#
	#-Location                   
	#
	#-Chassis Number                         
	#
	#-Model Year                                             
	#
	#-Last Odometer                     
	#
	#-Immatriculation Date                                   
	#
	#-First Contact Date     
	#
	#-Catalog Value (VAT Incl.)           
	#
	#-Seats Number                                         
	#
	#-Doors Number                   
	#
	#-Color                                                             
	#
	#-Transmission             
	#
	#-Fuel Type                                   
	#
	#-CO2 Emissions                                         
	#
	#-Horsepower                       
	#
	#-Horsepower Taxation                                     
	#
	#-Power (KW)
	@B30G9-198
	Scenario Outline: Column names in grid settings should be shown as below
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