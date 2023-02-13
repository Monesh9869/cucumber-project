package com.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	
	public static WebDriver dr;

	
	public AmazonLogin(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}//login to home page
	@FindBy (xpath ="//a[@id='nav-link-accountList']")private WebElement signin;
	@FindBy (name = "email")private WebElement mailid;
	@FindBy (id = "continue")private WebElement continuebtn;
	@FindBy (id = "ap_password")private WebElement pass;
	@FindBy (id = "signInSubmit")private WebElement submit;
	


	public WebElement getSignin() {
		return signin;
	}
	public WebElement getMailid() {
		return mailid;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
