package com.belwoautomation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class addclient_obj extends Testbase {

	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Clients\"]")
	WebElement clientslink;

	@FindBy(xpath = "//*[text()=\"Add Client\"]")
	WebElement addclient_button;

	@FindBy(id = "SPOCName")
	WebElement SPOCName;

	@FindBy(id = "txtclientname")
	WebElement txtclientname;

	@FindBy(id = "btnSaveData")
	WebElement btnSaveData;

	// Intializing the page Objects:
	public addclient_obj() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public addclient_obj addclient(String clientname, String spocname) {
		setting_link.click();
		clientslink.click();
		addclient_button.click();
		SPOCName.sendKeys(spocname);
		txtclientname.sendKeys(clientname);
		btnSaveData.click();

		return new addclient_obj();

	}
}
