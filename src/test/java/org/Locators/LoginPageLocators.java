package org.Locators;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;

import org.BaseClass.Reusable;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class LoginPageLocators extends Reusable {
	
	public  LoginPageLocators() {
		PageFactory.initElements(getDriver(), this);
		

	}

	@FindBy(id="emailID")
	private WebElement user;
	
	@FindBy(id="text")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='login-btn mat-button']")
	private List<WebElement> submit;

	

	public WebElement getUser() {
		return user;
	}

	public void setId(WebElement id) {
		this.user = id;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public List<WebElement> getSubmit() {
		return submit;
	}

	public void setSubmit(List<WebElement> submit) {
		this.submit = submit;
	}

	
	}

	
	



		

	
	


	
	


