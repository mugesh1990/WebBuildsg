package com.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.allobject.pages.*;
import com.allobject.pages.Homepage;
import com.allobject.pages.ActiveUser;
import com.allobject.pages.ProgramingLanguage;
import com.aventstack.extentreports.ExtentTest;
import com.commonaction.*;

public class HomePageSteps extends Components {

    Homepage homepage = new Homepage(driver);

    @Then("^Check The Activity tracker menu are linked with proper page$")
    public void check_The_Activity_tracker_menu_s_are_linked_with_proper_page() throws Throwable {

        homepage.activityTrackerMenulist();
    }

    @Then("^I search \"([^\"]*)\" with search data filed to filter activity tracker$")
    public void i_search_with_search_data_filed_to_filter_activity_tracker(String arg1) throws Throwable {
        homepage.inputSearch(arg1);
    }

    @Then("^Validate all activity tracker menus are having log$")
    public void validate_all_activity_tracker_menus_are_having_log() throws Throwable {
        homepage.activityTrackerMenulist();
    }

    @Then("^Validate the Social media container are having log$")
    public void validate_the_Social_media_container_are_having_log() throws Throwable {

        int count = 0, count1 = 0;
        boolean checked = false;
        ExtentTest logger = null;
        // To retrieve radion button list using lable
        for (WebElement element : homepage.SocialMediacontainerlist) {
            if (element.getAttribute("href").toString().length() > 5) {
                homepage.ActivityTrackerurl.add(element.getAttribute("href").toString());
                count++;
            }

        }

        // To validate the conatiner links
        // Assert.assertEquals(homepage.SocialMediacontainerlist.size() >= count1,
        // true);

        for (WebElement element : homepage.SocialMediacontainerlogs) {

            count1++;
        }

        // To validate the container are having log's
        Assert.assertEquals(homepage.SocialMediacontainerlogs.size() >= count1, true);
        extentReportUpdate(logger, "Home Page", driver.getTitle(), homepage.SocialMediacontainerlogs.size() >= count1,
                true);
    }

    @Then("^Social media menu are landing on proper page while clicking$")
    public void social_media_menu_are_landing_on_proper_page_while_clicking() throws Throwable {
        homepage.socialMediacontaner();
    }

    @Then("^close the Broswer$")
    public void close_the_Broswer() throws Throwable {
        closeBrowser();
    }
    @Then("^generate report$")
    public void generate_report() throws Throwable {
       System.out.println("Report gererated "+Components.getProperty("reportPath")+"Folder");
       System.out.println("Kindly refresh the project. WebBildSG_Automation right click and refresh");
    }
    

}
