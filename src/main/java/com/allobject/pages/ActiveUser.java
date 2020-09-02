package com.allobject.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonaction.Components;

public class ActiveUser extends Components {

	WebDriver driver;
	ArrayList<String> url = new ArrayList<String>();
	ArrayList<String> linktext = new ArrayList<String>();

	ArrayList<String> linktextvalue = new ArrayList<String>();
	ArrayList<String> ActivityTrackerurl = new ArrayList<String>();

	@FindBy(xpath = "//ul[@class='list-graph']/li[4]/a")
	WebElement programingpage;

	// @FindBy(xpath="//div[@id='events-per-group']//a")
	@FindBy(xpath = "//div[@id='events-per-group']//a")
	public List<WebElement> activenewUserGroup;

	@FindBy(xpath = "//*[@id='events-per-group']/div/div[2]")
	List<WebElement> activeUserGroupvalues;

	@FindBy(xpath = "//*[@class='list-social']/li[1]/a")
	WebElement HomeMain;
	@FindBy(xpath = "//*[@class='list-social']/li[2]/a")
	WebElement HomeLive;

	@FindBy(xpath = "//ul[@class='list-graph']/li/a")
	List<WebElement> ActivityTrackerlist;

	@FindBy(xpath = "//*[@class='social']/li/a")
	List<WebElement> SocialMediacontainerlist;

	@FindBy(xpath = "//*[@class='social']/li/a/span")
	List<WebElement> SocialMediacontainerlogs;

	@FindBy(xpath = "//*[@id='search']")
	public static WebElement Searchdata;

	public ActiveUser(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	public void Activeuserpagelink() {
		programingpage.click();
	}

	public void loadLInkTxtValues(String ActiveGroupvalue) {
		int count = 0;
		boolean check = false;

		for (WebElement element : activenewUserGroup) {
			if (element.getText().length() > 2) {
				linktext.add(element.getText());
			}
			if (element.getText().trim().equalsIgnoreCase(ActiveGroupvalue)) {

				check = true;
				break;
			} else {
				count++;
			}

		}
		if (check == true) {
			Assert.assertEquals(true, true);
		} else {
			Assert.assertEquals(false, true);
		}
	}

	public void loadLInkurlValue() {
		int count = 0;

		for (WebElement element : activenewUserGroup) {
			if (element.getAttribute("href").toString().length() >= 1) {
				url.add(element.getAttribute("href").toString());
				count++;
			}

		}
		// System.out.println(linktext.size()+" "+url.size());

		Assert.assertEquals(count >= url.size(), true);
	}

	public void loadLInktxtvalue(String value) {
		int newvalue = Integer.parseInt(value);

		for (WebElement element : activeUserGroupvalues) {

			if (Integer.parseInt(element.getText()) >= newvalue) {

				Assert.assertEquals(true, true);
			} else {
				Assert.assertEquals(false, true);
			}
		}
	}

	public void ActivegroupPagevalidation(String groupname) throws InterruptedException {

		int count = 1;
		boolean status = false;

		for (WebElement element : activenewUserGroup) {

			if (element.getText().trim().equalsIgnoreCase(groupname)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='events-per-group']/div[" + count + "]/div[1]/a")).click();
				status = true;
				Assert.assertEquals(status, true);
				break;
			} else {
				count++;
			}
		}
	}

}
