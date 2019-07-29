package com.belwoautomation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class Loginpage extends Testbase{

	@FindBy(id="Username")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ButtonId")
	WebElement Login_button;
	
	@FindBy(xpath="//*[@class=\"user-info\"]")
	WebElement user_info;
	
	@FindBy(xpath="//*[text()=\"Logout \"]")
	WebElement logout;
	
	@FindBy(xpath="//*[text()=\"OK\"]")
	WebElement ok_btn;
	//Intializing the page Objects:
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public addclient_obj login(String un, String pass)
	{
		username.sendKeys(un);
		Password.sendKeys(pass);
		Login_button.click();
		return new addclient_obj();
		
	}
	
	public addclient_obj logout()
	{
		user_info.click();
		logout.click();
		ok_btn.click();
		return new addclient_obj();
	}
	
	public addclient_obj logout1()
	{
		user_info.click();
		logout.click();
		return new addclient_obj();
	}
}
