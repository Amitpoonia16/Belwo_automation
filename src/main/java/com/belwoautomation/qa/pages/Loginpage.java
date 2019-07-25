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
}
