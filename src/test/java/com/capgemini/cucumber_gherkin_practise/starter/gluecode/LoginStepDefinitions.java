package com.capgemini.cucumber_gherkin_practise.starter.gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	@Given("^I launched guru(\\d+)$")
	public void i_launched_guru(int arg1) {
	    System.out.println("I am launching Guru99");
	}

	@When("^I enter mngr(\\d+) and YrUbyge$")
	public void i_enter_mngr_and_YrUbyge(int arg1) {
		System.out.println("I am entering"+ arg1);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		System.out.println("I clicked on login button");
	    
	}

	@Then("^I should see the welcome screen$")
	public void i_should_see_the_welcome_screen() {
		System.out.println("I am seing the welcome screen");
	    
	}
}
