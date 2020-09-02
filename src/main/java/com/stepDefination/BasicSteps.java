package com.stepdefination;

import com.commonaction.Components;

import cucumber.api.java.en.Given;

public class BasicSteps extends Components {

	@Given("^Load the chrome Browser with url$")
	public void load_the_chrome_Browser_with_url() throws Throwable {
		setupBrowser();

	}

}
