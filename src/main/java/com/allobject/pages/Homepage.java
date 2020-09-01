package com.allobject.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonAction.Components;
import com.commonAction.Extentreport;
import com.commonAction.Components;
import com.allobject.pages.*;


public class Homepage extends Components {

	@FindBy(xpath="//*[@class='list-social']/li[1]/a")
	public 
    WebElement HomeMain;
	@FindBy(xpath="//*[@class='list-social']/li[2]/a")
	public 
    WebElement HomeLive;
	
	
	@FindBy(xpath="//ul[@class='list-graph']/li/a")
	public
    List<WebElement> ActivityTrackerlist;
	public
	@FindBy(xpath="//*[@class='social']/li/a")

    List<WebElement> SocialMediacontainerlist;
	
	@FindBy(xpath="//*[@class='social']/li/a/span")
	public
	 
    List<WebElement> SocialMediacontainerlogs;
	
	@FindBy(xpath="//*[@id='search']")
	 public static WebElement Searchdata;
	
	WebDriver driver;
	public static ArrayList<String> ActivityTrackerurl=new ArrayList<String>();
	
	public Homepage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
         }
	
	public void mainMenuClick()
	{
		HomeMain.click();
	}

	public void liveMenuClick()
	{
		HomeLive.click();
	}
	
	
	

	public void clearInputSearch(String value)
	{
		Searchdata.clear();
	}
	public Boolean liveMenuVisiable()
	{
		boolean value=false;
		
		if(HomeLive.isDisplayed())
		{
			Assert.assertEquals(true, true);
			value=true;
		}
		else {
			Assert.assertEquals(true, false);
			value=false;
		}
			
		return value;
		
	}
	
	public Boolean mainMenuVisiable()
	{
		boolean value=false;
		
		if(HomeMain.isDisplayed())
		{
			Assert.assertEquals(true, true);
			value=true;
		}
		else 
		{
			Assert.assertEquals(true, false);
			value=false;
		}
			
		return value;
		
	}
	
	public void ActivityTrackerMenulist()
	{
		int count=0;
			boolean checked=false;
			//To retrieve radion button list using lable
				for(WebElement element: ActivityTrackerlist)
			    {
					if(element.getAttribute("href").toString().length()>5)
					{
						ActivityTrackerurl.add(element.getAttribute("href").toString()); 
					      count++;
					}
					
			    }
				System.out.println(ActivityTrackerurl.size()+" "+count);
				Assert.assertEquals(ActivityTrackerurl.size()>=count, true);
	 }
	
	
	public void SocialMediacontaner()
	{
		int count=0,count1=0;
			boolean checked=false;
			//To retrieve radion button list using lable
				for(WebElement element: SocialMediacontainerlist)
			    {
					if(element.getAttribute("href").toString().length()>5)
					{
						ActivityTrackerurl.add(element.getAttribute("href").toString()); 
					      count++;
					}
					
			    }
				
				//To validate the conatiner links
				Assert.assertEquals(SocialMediacontainerlist.size()>=count1, true);
				
				
				for(WebElement element: SocialMediacontainerlogs)
			    {
					
					count1++;
			    }
				
				//To validate the container are having log's
				Assert.assertEquals(SocialMediacontainerlogs.size()>=count1, true);
				
				
				
	 }
	
	
	
	
}
