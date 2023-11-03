@B30G9-222
Feature: Default


		#@B30G9-218
		#Feature: When user clicks on filter icon "Manage filters" should be visible
		
		  Background: User is already in the log in page
		    Given the user is on the login page
		

	
	@B30G9-219
		Scenario Outline:  When user clicks on filter icon, "Manage Filter" button should be visible
		    Given the user logged in as "<userType>"
		    When user hover over on Fleet button and click Vehicle button
		    And  user  clicks on filter icon
		    Then  user should be able to see Manage filters button
		
		
		    Examples:
		      | userType      |
		      | driver     |
		     # | sales manager |
		      #| store manager |	

	
	@B30G9-220
		Scenario Outline: User can apply filters by clicking on filter name, from 'Manage Filters' menu.
		    Given the user logged in as "<userType>"
		    When user hover over on Fleet button and click Vehicle button
		    And  user  clicks on filter icon
		    And the user clicks to the Manage filters button
		    Then User should be able to click filter type in the dropdown
		
		
		      |License Plate|
		      |Tags|
		      |Driver|
		      |Location|
		      |Chassis Number|
		      |Model Year|
		      |Last Odometer|
		      |Immatriculation Date|
		      |First Contract Date|
		      |Catalog Value (VAT Incl.)|
		      |Seats Number|
		      |Doors Number|
		      |Transmission|
		      |Fuel Type|
		      |CO2 Emissions|
		      |Horsepower|
		      |Horsepower Taxation|
		      |Power (KW)|
		
		   Examples:
		      | userType      |
		      | driver        |
		    #  | sales manager |
		    #  | store manager |	

	
	@B30G9-221
		Scenario Outline:User can apply filters by typing the filter name, from 'Manage Filters' menu.
		    Given the user logged in as "<userType>"
		    When user hover over on Fleet button and click Vehicle button
		    And  user  clicks on filter icon
		    And  the user clicks to the Manage filters button
		    Then user enters filter name in the search bar and should be able to see selected filter name
		
		
		   #   |License Plate|
		    #  |Tags|
		   #   |Driver|
		   #   |Location|
		
		
		   Examples:
		      | userType      |
		      | driver        |
		#      | sales manager |
		#      | store manager |