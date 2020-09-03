package com.commonaction;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.allobject.pages.ProgramingLanguage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport extends Components {
    ExtentReports report;
    WebDriver driver;

    ProgramingLanguage languagepageobject = new ProgramingLanguage(Components.driver);

    public void reportUpdate(String currrenttest, String Title, boolean expectedvalue, boolean actualvalue) {
        System.out.println("Entered");
        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(getProperty("reportPath")));
        report = new ExtentReports();
        report.attachReporter(extent);
        ExtentTest logger = report.createTest(currrenttest);
        logger.log(Status.INFO, Title);
        if (actualvalue == expectedvalue) {
            logger.log(Status.PASS, "Verified");
        } else {
            logger.log(Status.FAIL, "NotVerified");
        }

        // logger2.fail((Markup)
        // MediaEntityBuilder.createScreenCaptureFromPath(getProperty("ScreenshotPath")+driver.getTitle()));

        report.flush();
    }

}
