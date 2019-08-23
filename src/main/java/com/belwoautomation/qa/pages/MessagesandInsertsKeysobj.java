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

	@FindBy(xpath = "//a[@title=\"Available Keys\"]")
	WebElement availablekeys;

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

	// Message area
	@FindBy(xpath = "//a[@href=\"/MessageAndInserts/MessageAreas\"]")
	WebElement messageAreasLink;

	@FindBy(xpath = "//button[contains(text(),\"Add Message Areas\")]")
	WebElement addmessageAreasbtn;

	@FindBy(id = "ClientId")
	WebElement clientid;

	@FindBy(id = "appDll")
	WebElement application;

	@FindBy(id = "txtTemplateMessAre")
	WebElement templatename;

	@FindBy(id = "DocumentTypeId")
	WebElement DocumentType;

	@FindBy(id = "MessageArea")
	WebElement messagearea;

	@FindBy(id = "IsFIxed")
	WebElement isFixed;

	@FindBy(id = "btnSave")
	WebElement savebtn;

	@FindBy(xpath = "//div[@class=\"alert alert-success\"]")
	WebElement alertsuccess;

	// Inserting Configuration
	@FindBy(xpath = "//a[text()=\"Inserting Configuration\"]")
	WebElement insertingConfigurationLink;

	@FindBy(xpath = "//div[@class=\"tab-content\"]/div[2]/button")
	WebElement addInsertsconfgbtn;

	@FindBy(id = "ddlApp")
	WebElement application1;

	@FindBy(id = "txtTemplate")
	WebElement templatename1;

	@FindBy(id = "DocTypeId")
	WebElement docType1;

	@FindBy(id = "ddlSlot")
	WebElement insertssloat;

	@FindBy(id = "ddlBarcode")
	WebElement barcode;

	// Common method
	@FindBy(id = "ddlClients")
	WebElement clientdropdown;

	@FindBy(id = "appDD")
	WebElement applicationdorpdown;

	@FindBy(id = "Clientsddl")
	WebElement clientdropdown1;

	@FindBy(id = "ddlApp")
	WebElement applicationdorpdown1;

	@FindBy(xpath = "//*[@name=\"customHouseholdingMetadataTbl_length\"]")
	WebElement displayrecordssize;

	@FindBy(name = "tblMessageArea_length")
	WebElement messageareashort;
	@FindBy(name = "tblInsertsConfigurations_length")
	WebElement messageareashort1;

	

	public MessagesandInsertsKeysobj() {
		PageFactory.initElements(driver, this);
	}

	public MessagesandInsertsKeysobj messagecommon() {
		message_Inserts.click();
		messageInsertConfiguration.click();

		return new MessagesandInsertsKeysobj();
	}

	public MessagesandInsertsKeysobj shortavailablekeys() throws InterruptedException {
		Select selclient = new Select(clientdropdown);
		selclient.selectByIndex(2);
		Thread.sleep(1000);

		Select selapp = new Select(applicationdorpdown);
		selapp.selectByIndex(1);
		Thread.sleep(1000);
		Select seldisplayrecordssize = new Select(displayrecordssize);
		seldisplayrecordssize.selectByIndex(2);

		return new MessagesandInsertsKeysobj();

	}

	public MessagesandInsertsKeysobj shortmessageareamtd() throws InterruptedException {
		messageAreasLink.click();
		Select selclient = new Select(clientdropdown1);
		selclient.selectByIndex(1);
		Thread.sleep(1000);
		Select selapp = new Select(applicationdorpdown1);
		selapp.selectByIndex(1);
		Thread.sleep(1000);
		Select seldisplayrecordssize = new Select(messageareashort);
		seldisplayrecordssize.selectByIndex(2);
		return new MessagesandInsertsKeysobj();

	}

	public MessagesandInsertsKeysobj shortinsertingConfigurationmtd() throws InterruptedException {
		insertingConfigurationLink.click();
		Select selclient = new Select(clientdropdown);
		selclient.selectByIndex(1);
		Thread.sleep(1000);
		Select selapp = new Select(applicationdorpdown);
		selapp.selectByIndex(1);
		Thread.sleep(1000);
		Select seldisplayrecordssize = new Select(messageareashort1);
		seldisplayrecordssize.selectByIndex(2);
		return new MessagesandInsertsKeysobj();

	}

	public MessagesandInsertsKeysobj addKeymtd(String keynamedata) {
		availablekeys.click();
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

	public MessagesandInsertsKeysobj addmessageareamtd(String templatenamedata) throws InterruptedException {

		messageAreasLink.click();

		addmessageAreasbtn.click();

		Thread.sleep(1000);
		Select selclient = new Select(clientid);
		selclient.selectByIndex(2);
		Thread.sleep(1000);
		Select selapplication = new Select(application);
		selapplication.selectByIndex(2);

		templatename.sendKeys(templatenamedata);

		Select selDocumentType = new Select(DocumentType);
		selDocumentType.selectByIndex(2);

		Select selmessagearea = new Select(messagearea);
		selmessagearea.selectByIndex(1);

		isFixed.click();

		savebtn.click();

		boolean success_message = alertsuccess.isDisplayed();

		if (success_message = true) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case fail");
		}
		return new MessagesandInsertsKeysobj();
	}

	public MessagesandInsertsKeysobj addInsertsConfigurationsmtd(String templatenamedata) throws InterruptedException {
		insertingConfigurationLink.click();

		addInsertsconfgbtn.click();
		Thread.sleep(1000);
		Select selclient = new Select(clientid);
		selclient.selectByIndex(2);
		Thread.sleep(1000);
		Select selapplication = new Select(application1);
		selapplication.selectByIndex(2);
		templatename1.sendKeys(templatenamedata);
		Select selDocumentType = new Select(docType1);
		selDocumentType.selectByIndex(2);

		Select selinsertssloat = new Select(insertssloat);
		selinsertssloat.selectByIndex(2);

		Select selbarcode = new Select(barcode);
		selbarcode.selectByIndex(2);

		savebtn.click();
		boolean success_message = alertsuccess.isDisplayed();

		if (success_message = true) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case fail");
		}
		return new MessagesandInsertsKeysobj();
	}
}
