package com.belwoautomation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.belwoautomation.qa.base.Testbase;

public class Applications_obj extends Testbase {

	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Applications\"]")
	WebElement application_link;

	@FindBy(xpath = "//*[text()=\"Add Application\"]")
	WebElement add_app_btn;

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

	public Applications_obj() {
		PageFactory.initElements(driver, this);
	}

	public Applications_obj Add_app(String appName) {
		setting_link.click();
		application_link.click();
		add_app_btn.click();

		Select sel_client = new Select(ClientId_dropdown);
		sel_client.selectByVisibleText("Belwo Client");

		AppName.sendKeys(appName);

		Select processing_Type = new Select(ProcessingType);
		processing_Type.selectByIndex(2);

		Select sLA = new Select(SLA);
		sLA.selectByIndex(2);

		Save_button.click();
		return new Applications_obj();
	}
}
