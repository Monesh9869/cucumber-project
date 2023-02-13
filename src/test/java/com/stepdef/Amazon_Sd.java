package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.Baseclass.BaseMethod;
import com.helper.Amazon_Pom;
import com.helper.ConfigurationReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Sd extends BaseMethod {
	static Amazon_Pom ap;

	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		ap = new Amazon_Pom(driver);
		ap.getAl().getSignin().click();
		
	}

	@When("enter {string} and enter {string}")
	public void enter_username_and_enter_password (String username,String password) {
		ap.getAl().getMailid().sendKeys(username);
		ap.getAl().getContinuebtn().click();
		ap.getAl().getPass().sendKeys(password);
		System.out.println("login details passed");
	}
	
	@Then("user clicks login button")
	public void user_clicks_login_button() {
		ap.getAl().getSubmit().click();
		System.out.println("login success");
	}

	@Given("user finds the searchbar and clear")
	public void user_finds_the_searchbar_and_clear() {
		ap.getAh().getSearchbox().clear();
		System.out.println("search data cleared for input");
	}

	@When("user gives the input in searchbar")
	public void user_gives_the_input_in_searchbar() {
		ap.getAh().getSearchbox().sendKeys("iphone");
		System.out.println("input data given");
		
	}
	@Then("user click search icon")
	public void user_click_search_icon() {
		ap.getAh().getSearchbtn().click();
		System.out.println("search successful");
	}

}
