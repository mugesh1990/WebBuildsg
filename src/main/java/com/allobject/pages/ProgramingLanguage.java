package com.allobject.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.commonAction.*;

import cucumber.api.java.en.Then;

public class ProgramingLanguage extends Components {
	
	WebDriver driver;
	Extentreport extentreport;
	ExtentReports report;
	
	@FindBy(xpath="//*[@id='select-language']/li/label")
    List<WebElement> RadioButtonLabelList;
	
	@FindBy(xpath="//*[@id='repos-per-programming-language']/p/a")
    List<WebElement> LanguageSubList;
	
	@FindBy(xpath="//ul[@class='list-graph']/li[6]/a")
    WebElement programingpage;
	
	@FindBy(xpath="//*[@class='mr-2 flex-self-stretch']/a")
    WebElement githubtxtvalue;
	
	
	/**
	 * 
	 * To intilize the driver
	 * 
	 * @param driver
	 */
	public ProgramingLanguage(WebDriver driver)
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
	public void progrmaingLanguagelink()
	{
		programingpage.click();
	}
	
	public void pageBack()
	{
		driver.navigate().back();
	}
	
	
	public String pageTitle()
	{
		return driver.getTitle();
	}
	
	public void RadioButtonClick(String language) throws InterruptedException
	{
	      Thread.sleep(5000);	
		   boolean checked=false;
		   int count =0;
		  
		   //To retrieve radion button list using lable
		   for(WebElement element: RadioButtonLabelList)
		   {
			   if(element.getText().trim().equalsIgnoreCase(language))
			   {
				RadioButtonLabelList.get(count).click();
				checked=true;
				break;
			   }
			   else
			   {
				   count++;
			   }
		   }
		   
		   	if(checked==true)
		   	{
			//extentreport.reportUpdate(pageTitle().toString(), pageTitle(), true, true);
		   		Assert.assertEquals(checked, true);
		   	}
		   	else
		   	{
			//extentreport.reportUpdate(pageTitle(), pageTitle(), checked, true);
		   		Assert.assertEquals(false, true);
		   	}
		
	  }
	
	
	public void langageSubMenuVisiableCheck() throws InterruptedException
	{
	
		boolean checked=false;
		//To retrieve radion button list using lable
			for(WebElement element: LanguageSubList)
		    {
			       if(element.isDisplayed())
			       {
			    	   Assert.assertEquals(element.isDisplayed(), true);
			    		//extentreport.reportUpdate(driver.getTitle(), driver.getTitle(), checked, element.isDisplayed());
			       }
			      
		    }
	}
	
	
	public void langageSubMenuLinkCheck() throws InterruptedException
	{
	
		int count =0;
		//To retrieve radion button list using lable
		ArrayList<String> url=new ArrayList<String>();
		
		for(WebElement element: LanguageSubList)
	    {
			if(element.getAttribute("href").toString().length()>5)
			{
			url.add(element.getAttribute("href").toString());
			count++;
			}
			
			
	    }
		
		Assert.assertEquals( LanguageSubList.size()==url.size(), true);
		//extentreport.reportUpdate(driver.getTitle(), driver.getTitle(), LanguageSubList.size()==url.size(), true);
		
	 }
	
	
	
	
}
