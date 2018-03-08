@deleteCustomer
Feature: Delete a Customer

Background:
		Given I created a new Customer Successfully
    
Scenario: Delete created Customer
		Given I am in Delete Customer Screen
		When I enter Customer ID
		And click on Submit
		Then Customer Should be deleted successfully 