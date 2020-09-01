package com.stepDefination;

import com.allobject.pages.ActiveUser;
import com.allobject.pages.ProgramingLanguage;
import com.commonAction.Components;

import cucumber.api.java.en.Then;


public class ActveUserpageSteps {
	
	ActiveUser activeUser =new ActiveUser(Components.driver); 
	

@Then("^redirect to Activeuser page$")
public void redirect_to_Activeuser_page() throws Throwable {
	activeUser.Activeuserpagelink();
	
}

@Then("^check the activegoup with \"([^\"]*)\"$")
public void check_the_activegoup_with(String gname) throws Throwable {
	activeUser.loadLInkTxtValues(gname);
}

@Then("^All active group should tag with page$")
public void all_active_group_should_tag_with_page() throws Throwable {
	activeUser.loadLInkurlValue();
}

@Then("^check the active group value more then \"([^\"]*)\"$")
public void check_the_active_group_value_more_then(String arg1) throws Throwable {
	activeUser.loadLInktxtvalue(arg1);
}
@Then("^check the \"([^\"]*)\" link with proper page landing$")
public void check_the_link_with_proper_page_landing(String arg1) throws Throwable {
	activeUser.ActivegroupPagevalidation(arg1);
}
	
}
