
Feature: as a user i want to check my settings

	Scenario: User goes to the settings page
		Given I am on the skrill login page
		And  I enter my credentials
		And I click the submit button
		And I click on the Settings tab
		Then I should see my settings
		And the user logs out
