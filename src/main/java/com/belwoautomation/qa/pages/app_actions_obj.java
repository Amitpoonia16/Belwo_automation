package com.belwoautomation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.belwoautomation.qa.base.Testbase;

public class app_actions_obj extends Testbase {

	// Common
	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Applications\"]")
	WebElement application_link;

	// Clone app
	@FindBy(xpath = "//a[@title=\"Clone application\"]")
	WebElement appClone;

	@FindBy(xpath = "//*[@title=\"Name\"]")
	WebElement name;

	@FindBy(xpath = "//*[@title=\"Code\"]")
	WebElement title;

	@FindBy(xpath = "//*[@title=\"Mask\"]")
	WebElement mask;

	@FindBy(id = "btnSave")
	WebElement saveButton;

	// Delete app

	@FindBy(xpath = "//a[@title=\"Delete Application\"]")
	WebElement deleteapp;

	@FindBy(xpath = "//button[text()=\"OK\"]")
	WebElement okButton;

	// Edit app
	@FindBy(xpath = "//a[@class=\"green btnEdit\"]")
	WebElement editapp;

	@FindBy(id = "ClientId")
	WebElement ClientId_dropdown;

	@FindBy(id = "txtAppName")
	WebElement AppName;

	@FindBy(id = "ProcessingType")
	WebElement ProcessingType;

	@FindBy(id = "SLA")
	WebElement SLA;

	@FindBy(id = "btnSave")
	WebElement Save_button;
	
	//Application shorting
	
	@FindBy(id="ddlClients")	
	WebElement Client;
	
	@FindBy(id="ddlTypes")
	WebElement Types;
	
	@FindBy(id="chkStatus")
	WebElement Status;
	
	@FindBy(xpath="//table[@id=\"grid-table\"]/tbody/tr/td")
	WebElement result;
	
	@FindBy(xpath="//table[@id=\"grid-table\"]/tbody/tr/td[8]/input")
	WebElement changestatus;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	WebElement confirm_btn;

	public app_actions_obj() {
		PageFactory.initElements(driver, this);
	}


	public app_actions_obj clone_app(String name_data, String title_data, String mask_data) {
		setting_link.click();
		application_link.click();
		appClone.click();
		name.sendKeys(name_data);
		title.sendKeys(title_data);
		mask.sendKeys(mask_data);
		saveButton.click();
		return new app_actions_obj();
	}

	public app_actions_obj delete_app() {
		setting_link.click();
		application_link.click();

		deleteapp.click();

		okButton.click();
		return new app_actions_obj();
	}

	public app_actions_obj editapp(String appName) {
		setting_link.click();
		application_link.click();

		editapp.click();

		Select sel_client = new Select(ClientId_dropdown);
		sel_client.selectByVisibleText("Belwo Client");

		AppName.sendKeys(appName);

		Select processing_Type = new Select(ProcessingType);
		processing_Type.selectByIndex(2);

		Select sLA = new Select(SLA);
		sLA.selectByIndex(2);

		Save_button.click();
		return new app_actions_obj();
	}
	
	public app_actions_obj shortapp()
	{
		
		setting_link.click();
		application_link.click();
		Select sel_client = new Select(Client);
		sel_client.selectByVisibleText("Belwo Client");
		
		Select processing_Type = new Select(Types);
		processing_Type.selectByIndex(1);
		
		Select status = new Select(Status);
		status.selectByIndex(0);
		boolean results=result.isDisplayed();
		
		if(results=true)
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		return new app_actions_obj();
	}

	public app_actions_obj changestatus()
	{
		changestatus.click();
		confirm_btn.click();
		return new app_actions_obj();
	}
}
