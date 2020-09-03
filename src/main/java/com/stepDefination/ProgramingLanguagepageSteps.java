package com.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;

import com.allobject.pages.ActiveUser;
import com.commonaction.Components;
import com.allobject.pages.*;

public class ProgramingLanguagepageSteps extends Components
{

	ProgramingLanguage languagepageobject = new ProgramingLanguage(Components.driver);

	@Then("^click the Radionbutton with \"([^\"]*)\" languaage$")
	public void click_the_Radionbutton_with_languaage(String language) throws Throwable
	{
		languagepageobject.radioButtonClick(language);

	}

	@Then("^redirect to programing Language$")
	public void redirect_to_programing_Language() throws Throwable
	{
		Thread.sleep(5000);
		languagepageobject.progrmaingLanguagelink();
	}

	@Then("^subMenu Visiablity Check$")
	public void submenu_Visiablity_Check() throws Throwable
	{
		languagepageobject.langageSubMenuVisiableCheck();
	}

	@Then("^subMenus are linkied with proper page$")
	public void subMenus_are_linkied_with_proper_page() throws Throwable
	{
		languagepageobject.langageSubMenuLinkCheck();
	}

}
