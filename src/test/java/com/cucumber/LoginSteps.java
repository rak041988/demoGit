package com.cucumber;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	LoginPage login = new LoginPage();

	@Given("^I am on Login page$")
	public void i_am_on_Login_page() {
		login.isOnLoginPage();
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String userName, String password) {
		login.doLogin(userName, password);
	}

	@When("^I click on Submit button$")
	public void i_click_on_Submit_button() {
		login.clickOnSubmitButton();
	}

	@Then("^I should be logged into HRM$")
	public void i_should_be_logged_into_HRM() {
		boolean b=login.isDahboardPresent();
		Assert.assertTrue(b);

	}

	@Then("^I should see Logout$")
	public void i_should_see_Logout() {
		boolean b =login.isLogoutPresent();
		Assert.assertTrue(b);

	}

	@Then("^I should see Welcome$")
	public void i_should_see_Welcome() {

	}

	@Then("^I should not be logged into HRM$")
	public void i_should_not_be_logged_into_HRM() {

	}
}
