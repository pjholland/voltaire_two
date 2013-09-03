@ikea
Feature: search for ikea product

	@current
	Scenario:  search for product
		Given i am on the ikea homepage
		And I search for "lighting"
		Then i should see results related to "lighting"

	Scenario:  check image carousel is visble
		Given i am on the ikea homepage
		When i look at the image carousel
		Then I should see the main image first
		And i should see text
