package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.AmazonHome;
import com.pom.AmazonLogin;

public class Amazon_Pom {
	//singleton class
	static WebDriver dr;
	
	private AmazonHome ah;
	private AmazonLogin al;
	
	public AmazonHome getAh() {
		ah = new AmazonHome(dr);
		return ah;
	}
	public AmazonLogin getAl() {
		al = new AmazonLogin(dr);
		return al;
	}
	
	public Amazon_Pom(WebDriver dr) {
		this.dr = dr;
	}
	
	

}
