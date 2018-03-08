package com.capgemini.cucumber_gherkin_practise.starter.gluecode;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomerStepDefinitions {
	@Given("^I am in Add New Customer Page$")
	public void i_am_in_Add_New_Customer_Page() {
		System.out.println("Inside Given");
	}

	@When("^I enter all customer data$")
	public void i_enter_all_customer_data() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^save the Customer$")
	public void save_the_Customer() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^I should be able to see Customer Registered Successfully$")
	public void i_should_be_able_to_see_Customer_Registered_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("^I enter (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) and (.*)$")
	public void i_enter_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("^i created customer$")
	public void i_created_customer() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^verify \"([^\"]*)\" message$")
	public void verify_message(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("***************************");
		System.out.println(arg1);
		System.out.println("***************************");
		System.out.println(arg2);
		System.out.println("***************************");
	}
	
	@Given("^user is having below examples$")
	public void user_is_having_below_examples(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> list = arg1.raw();
		for (List<String> arrayList : list) {
			for (String string : arrayList) {
				System.out.print("\t"+string);
			}
			System.out.println("");
		}
	}
}
