package com.stepdef;

import com.Baseclass.BaseMethod;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HookClass extends BaseMethod {
	
	@Before
	public void before() {
		System.out.println("before");

	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("before step");

	}

	@After
	public void after() {
		System.out.println("after");

	}
	@AfterStep
	public void afterStep() {
		System.out.println("after step");

	}
}

	