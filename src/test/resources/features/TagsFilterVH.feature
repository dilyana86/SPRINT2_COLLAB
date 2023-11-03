@B30G9-214
Feature: Default

		#@B30G9-213
		  Background: User is already in the log in page
		    Given the user is on the login page

	@B30G9-210
	Scenario Outline: Verify "Tags" filter is selected
		Given the user logged in as "<userType>"
		    When user hovers over fleet in dashboard menu and clicks on vehicles
		    And user clicks on the Filter icon
		    And user clicks on Manage Filters dropdown
		    And user selects Tags option from Manage Filters dropdown
		    Then Tags filter is selected
		
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |	

	@B30G9-211
	Scenario Outline: Verify > Is Not Any Of > Is Any Of methods shown in "Tags" filter
		Given the user logged in as "<userType>"
		    When user hovers over fleet in dashboard menu and clicks on vehicles
		    And user clicks on the Filter icon
		    And user clicks on Manage Filters dropdown
		    And user selects Tags option from Manage Filters dropdown
		    And user clicks on Tags:All dropdown button
		    And user clicks on Is Any Of option from Tags:All button dropdown
		    Then user should see two methods shown Is Any Of and Is Not Any Of 
		    |Is Any Of|
		    |Is Not Any Of|
		
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |	

	@B30G9-212
	Scenario Outline: Verify "Is any Of" method with "Compact" option include corresponding value
		Given the user logged in as "<userType>"
		    When user hovers over fleet in dashboard menu and clicks on vehicles
		    And user clicks on the Filter icon
		    And user clicks on Manage Filters dropdown
		    And user selects Tags option from Manage Filters dropdown
		    And user clicks on Tags:All dropdown button
		    And user clicks on Is Any Of option from Tags:All button dropdown
		    And user clicks on Is Any Of option method
		    And user enters "Compact" option in Is Any Of method field and presses ENTER
		    Then user should see correspondent value for "Compact" option
		
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |