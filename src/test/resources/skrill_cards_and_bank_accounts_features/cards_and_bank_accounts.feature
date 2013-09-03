Feature: cards_and_bank_accounts

	Scenario: I want to add a bank account
		Given I am on the skrill login page
		And I enter my credentials
		And I click the submit button
		When I click on "Cards and Bank Accounts" tab
		Then I should see the Cards and Bank Accounts page

