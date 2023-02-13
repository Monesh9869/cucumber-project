package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\com\\featurefile",
		glue = "com\\stepdef",
		monochrome = true,
		stepNotifications = true,
		dryRun = false,
		publish = true
		)



public class Amazon_runner {
	
//	@BeforeClass
//	public static void beforeclass() {
//		System.out.println("before class");  			
//
//	}
//	
//	@AfterClass
//	public static void afterclass() {
//		System.out.println("after class");
//	}

}
