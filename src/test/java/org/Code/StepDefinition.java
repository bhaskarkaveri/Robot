package org.Code;

import org.BaseClass.Reusable;
import org.Locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Reusable {
	@Given("user navigates to RobotManager")
	public void user_navigates_to_RobotManager() {
		launch("https://app.robotmanager.io/#/login");
	}

	@When("user enters correct email address")
	public void user_enters_correct_email_address() {
		LoginPageLocators a=new LoginPageLocators();
		pass(a.getUser(),"kaveri.b@sybrant.com");
		
	}
	
	@When("User enters correct password")
	public void user_enters_correct_password() {
		LoginPageLocators b=new LoginPageLocators();
		pass( b.getPassword(), "India@123");
}
	@When("User click on {string} button")
	public void user_click_on_button(String string) {
		LoginPageLocators c=new LoginPageLocators();
		button( c.getSubmit().get(0));
	
	}
		@Then("User should see {string}")
		public void user_should_see(String string) {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

	
		
	}




	
		
	

	
	
