package com.stepdefination;

import com.commonaction.Components;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;

public class BasicSteps extends Components {

	@Given("^Load the chrome Browser with url$")
	public void load_the_chrome_Browser_with_url() throws Throwable {
		setupBrowser();

	}
	@Then("^generate report$")
	public void generate_report() throws Throwable {
	   System.out.println("Report gererated "+Components.getProperty("reportPath")+"Folder");
	   System.out.println("Kindly refresh the project. WebBildSG_Automation right click and refresh");
	}
}
