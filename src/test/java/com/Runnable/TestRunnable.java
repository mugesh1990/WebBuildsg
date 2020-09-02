package com.runnable;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
glue = { "com/stepdefination"}, 
plugin ={"html:target/cucumber-html-report"}, 
tags = {"@HomePage"}
)
public class TestRunnable {

	@Before
	public void loadBrowser() {

	}
}
