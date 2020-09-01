package com.Runnable;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
glue={"com/stepDefination"},
plugin= {"html:target/cucumber-html-report"},
tags={"@ActivenUserPage"}
)
public class TestRunnable {
	
	@Before
	public void loadBrowser()
	{
		System.out.println("browserLoaded");
	}
	}
