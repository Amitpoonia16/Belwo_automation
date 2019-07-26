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
	
	public Homepage login(String un, String pass)
	{
		username.sendKeys(un);
		Password.sendKeys(pass);
		Login_button.click();
		return new Homepage();
		
	}
}
