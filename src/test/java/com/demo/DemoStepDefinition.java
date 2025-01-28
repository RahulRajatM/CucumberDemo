package com.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefinition {
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
   // TODO document why this method is empty
 }

	@Given("the user has valid credentials")
	public void the_user_has_valid_credentials() {
	  
	}

	@When("the user enters their username and password")
	public void the_user_enters_their_username_and_password() {
	   
	}

	@When("they click the {string} button")
	public void they_click_the_button(String string) {
	  
	}

	@Then("they should be redirected to the homepage")
	public void they_should_be_redirected_to_the_homepage() {
	  
	}

	@Then("they should see a welcome message")
	public void they_should_see_a_welcome_message() {
	   
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String string, String string2) {
	   
	}

	@Then("they should see an error message")
	public void they_should_see_an_error_message() {
	   
	}

	@When("the user leaves both username and password fields empty")
	public void the_user_leaves_both_username_and_password_fields_empty() {
	   
	}

	@Then("they should see a validation message that says {string}")
	public void they_should_see_a_validation_message_that_says(String string) {
	
	}



}

