@B26G12-8
Feature: Vehicles

	User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons
	#This tests the click-ability of the reset button on the vehicle feature under fleet module


	@B26G12-44 @B26G12-8
	Scenario: Automation User should be able click reset button
		Given that user is logged in and on "vehicles" feature under fleet module
		When the user clicks on reset
		Then reset button is clickable and the grid returns to default settings


		#This tests the click-ability of the refresh button on vehicle feature under fleet module.

	@B26G12-43 @B26G12-8
	Scenario: Automation User should be able to click refresh button
		Given that user is logged in and on "vehicles" feature under fleet module
		When the user clicks on refresh
		Then refresh button is clickable