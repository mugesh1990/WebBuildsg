package com.commonaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.allobject.pages.Homepage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Components {

    public static String value = "";
    static ExtentReports report;
    public static WebElement Elementcurrentvalue;
    public static String FilePath = "src/test/resources/PropertyFiles/Home.property";
    public static WebDriver driver;
    public static ExtentTest logger;

    ArrayList<String> linktextvalue = new ArrayList<String>();
    static ArrayList<String> ActivityTrackerurl = new ArrayList<String>();
    static Homepage home;

    // to ready property file value
    public static String getProperty(String key) {
        try {
            // System.out.println("entered");
            Properties pro = new Properties();
            pro.load(new FileInputStream(new File(FilePath)));
            value = pro.getProperty(key).toString();
            // System.out.println(value);
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return value;
    }

    // execute the script and maximize the browser

    public static void setupBrowser() {
        try {
            System.setProperty(getProperty("driver"), getProperty("path"));
            // System.out.println("level2");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get(getProperty("url"));
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(getProperty("reportPath")));
            report = new ExtentReports();
            report.attachReporter(extent);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    // Close the browser
    public static void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    // get the curent page title
    public String getPageTitle(WebDriver driver) {
        String title = driver.getTitle();

        return title;

    }

    // get the current element attribute of text value
    public String getElementText(WebElement element) {
        String Elementvalue = element.getText();
        return Elementvalue;
    }

    // get the multiple element attripute of txt value
    public List getMultipleElementText(List<WebElement> list) {
        ArrayList<String> elementvalues = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            Elementcurrentvalue = list.get(i);
            elementvalues.add(Elementcurrentvalue.getText());
        }

        return elementvalues;
    }

    public void reportUpdate(String currrenttest, String Title, boolean expectedvalue, boolean actualvalue) {

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

    public void extentReportUpdate(ExtentTest logger, String currrenttest, String Title, boolean expectedvalue,
            boolean actualvalue) throws IOException {
        logger = report.createTest(currrenttest);
        logger.log(Status.INFO, Title);
        if (actualvalue == expectedvalue) {
            logger.log(Status.PASS, "Verified");
        } else {
            logger.log(Status.FAIL, "NotVerified");
        }

        // logger2.fail((Markup)

        String temp = getScreenshot(driver);

        logger.pass("Test", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

        // logger.pass((Markup)
        // MediaEntityBuilder.createScreenCaptureFromPath(getProperty("ScreenshotPath")+driver.getTitle()));
        report.flush();

    }

    public static String getScreenshot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png";

        File destination = new File(path);

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("Capture Failed " + e.getMessage());
        }

        return path;
    }

}
