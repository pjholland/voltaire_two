@skrill
Feature: as a user i want to log in to the Skrill website

	Scenario: I log onto skrill
		Given I am on the skrill login page
		When  I enter my credentials
		And I click the submit button
		Then  I should see the Account Overview page
		And the user logs out

	@in-progress
	Scenario: I log onto skrill as a referral user
		Given I am on the skrill login page
		When  I log in as as a "referral user"
		And I click the submit button
		Then  I should see the Account Overview page
		And the user logs out

