@createCustomer
Feature: Create a Customer

Logged in User should be able to Navigate to Create Customer Screen
User should be able to create New Customer

Rules:
	- User should enter first, last name, DOB, phone and email
	 
	Scenario: Create a Customer in Guru99
		Given I am in Add New Customer Page
    When I enter all customer data
    And save the Customer
    Then I should be able to see Customer Registered Successfully