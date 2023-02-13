package com.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {

	public static WebDriver dr;

	public AmazonHome(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
     //signin to amazon home page

       @FindBy (name = "field-keywords")private WebElement searchbox;
       @FindBy (id = "nav-search-submit-button")private WebElement searchbtn;

	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
       
      
       
       
}