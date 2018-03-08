@createCustomerWithValues
Feature: Create a Customer
	Scenario Outline: Create a Customer in Guru99
		Given I am in Add New Customer Page
    When I enter <customerName>, <gender>, <dob>, <address>, <city>, <state>, <pin>, <mobileNumber>, <eMail> and <password>
    And save the Customer
    Then I should be able to see Customer Registered Successfully
  Examples:
  |customerName|gender|dob       |address|city    |state   |pin   |mobileNumber|eMail             |password|
  |sdfsdfsdf   |Male  |01/03/1987|sdfdsgf|ggeeeffg|bjvfbvjf|767543|66464646663 |sdfsfdf@vduds.com|1234567 |
  |sdfsdfsdf1  |Male  |01/02/1987|sdfdsgf|ggeeeffg|bjvfbvjf|767543|66464646663 |sdfsfdf1@vduds.com|1234567 |
  