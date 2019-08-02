package com.belwoautomation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import com.belwoautomation.qa.base.Testbase;

public class MessagesandInsertsKeysobj extends Testbase {

	@FindBy(xpath = "//*[text()=\"Message & Inserts\"]")
	WebElement message_Inserts;

	@FindBy(xpath = "//*[text()=\"Message & Insert Configuration\"]")
	WebElement messageInsertConfiguration;

	@FindBy(id = "AddKey")
	WebElement addKey;

	@FindBy(id = "ddlClientsAdd")
	WebElement clientsAdd;

	@FindBy(id = "ddlApplicationAdd")
	WebElement applicationAdd;

	@FindBy(id = "keyName")
	WebElement keyName;

	@FindBy(id = "messagesKeyValue")
	WebElement messagesKeyValue;

	@FindBy(id = "insertsKeyValue")
	WebElement insertsKeyValue;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	WebElement savebutton;

	@FindBy(xpath = "//button[text()=\"OK\"]")
	WebElement okButton;

	//Message area
	@FindBy(xpath="//a[@href=\"/MessageAndInserts/MessageAreas\"]")
	WebElement messageAreasLink;
	
	public MessagesandInsertsKeysobj() {
		PageFactory.initElements(driver, this);
	}

	public MessagesandInsertsKeysobj messagecommon() {
		message_Inserts.click();
		messageInsertConfiguration.click();

		return new MessagesandInsertsKeysobj();
	}

	public MessagesandInsertsKeysobj addKeymtd(String keynamedata) {
		addKey.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select clientadd = new Select(clientsAdd);
		clientadd.selectByIndex(1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select application = new Select(applicationAdd);
		application.selectByIndex(1);
		keyName.sendKeys(keynamedata);

		messagesKeyValue.click();
		insertsKeyValue.click();

		savebutton.click();
		okButton.click();
		return new MessagesandInsertsKeysobj();
	}

}
