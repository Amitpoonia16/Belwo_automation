package com.belwoautomation.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.belwoautomation.qa.base.Testbase;

public class global_settingobj extends Testbase {

	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Global Settings\"]")
	WebElement globalSetting;

	@FindBy(xpath = "//*[contains(text(),\"Add new Setting\")]")
	WebElement Addnewsettingbtn;

	@FindBy(id = "Name")
	WebElement name;

	@FindBy(id = "QueueType")
	WebElement type1;

	@FindBy(id = "Host")
	WebElement host;

	@FindBy(id = "FileTransferUserName")
	WebElement FileTransferUserName;

	@FindBy(name = "Port")
	WebElement Port;

	@FindBy(name = "FileTransferPassword")
	WebElement FileTransferPassword;

	@FindBy(id = "btnSave")
	WebElement savebtn;

	// Edit setting
	@FindBy(xpath = "//a[@title=\"Edit setting\"]")
	WebElement editSetting;

	// delete setting

	@FindBy(xpath = "//a[@title=\"Delete setting\"]")
	WebElement deleteicon;

	@FindBy(xpath = "//button[text()=\"OK\"]")
	WebElement okButton;

	// Components

	@FindBy(xpath = "//a[text()=\"Components\"]")
	WebElement componentsLink;

	@FindBy(xpath = "//button[contains(text(),'Add new Component')]")
	WebElement addNewComponentbtn;

	@FindBy(id = "ComponentName")
	WebElement componentName;

	@FindBy(id = "ShortName")
	WebElement shortName;

	@FindBy(id = "ComponentExe")
	WebElement ComponentExe;

	@FindBy(id = "Detail")
	WebElement Detail;
	
	@FindBy(xpath="//button[@class=\"btn btn-success\"]")
	WebElement btn_success;
	
	@FindBy(xpath="//table[@id=\"tblComponents\"]/tbody/tr/td[5]/a[1]/i")
	WebElement file;
	
	@FindBy(id="TriggerFilelocation")
	WebElement TriggerFilelocation;
	
	@FindBy(id="StepStatusLocation")
	WebElement StepStatusLocation;
	
	@FindBy(xpath="//table[@id=\"tblComponents\"]/tbody/tr/td[5]/a[2]/i")
	WebElement edit_icon;
	
	@FindBy(xpath="//table[@id=\"tblComponents\"]/tbody/tr/td[4]")
	WebElement change_status;

	public global_settingobj() {
		PageFactory.initElements(driver, this);
	}

	public global_settingobj globalcommon() {
		setting_link.click();
		globalSetting.click();
		return new global_settingobj();
	}

	public global_settingobj addNewSettingmtd(String namedata, String hostdata, String FileTransferUserNamedata,
			String portdata, String FileTransferPassworddata) {

		Addnewsettingbtn.click();
		name.sendKeys(namedata);

		Select type = new Select(type1);
		type.selectByIndex(3);
		host.sendKeys(hostdata);
		FileTransferUserName.sendKeys(FileTransferUserNamedata);
		Port.sendKeys(portdata);
		FileTransferPassword.sendKeys(FileTransferPassworddata);
		savebtn.click();
		return new global_settingobj();

	}

	public global_settingobj addNewSettingwithlocalfilesystemmtd(String namedata) {

		Addnewsettingbtn.click();
		name.sendKeys(namedata);

		Select type = new Select(type1);
		type.selectByIndex(2);
		savebtn.click();
		return new global_settingobj();
	}

	public global_settingobj editsetting(String namedata, String hostdata, String FileTransferUserNamedata,
			String portdata, String FileTransferPassworddata) throws InterruptedException {

		editSetting.click();
		Thread.sleep(1000);
		name.clear();
		name.sendKeys(namedata);
		Select type = new Select(type1);
		type.selectByIndex(3);
		host.clear();
		host.sendKeys(hostdata);
		FileTransferUserName.clear();
		FileTransferUserName.sendKeys(FileTransferUserNamedata);
		Port.click();
		Port.sendKeys(portdata);
		FileTransferPassword.clear();
		FileTransferPassword.sendKeys(FileTransferPassworddata);
		savebtn.click();
		return new global_settingobj();
	}

	public global_settingobj deleteglobalsettingmtd() {

		deleteicon.click();
		okButton.click();
		return new global_settingobj();
	}

	public global_settingobj addNewcomponent(String componentNamedata, String shortNamedata, String ComponentExedata,
			String Detaildata) throws InterruptedException {
		componentsLink.click();
		addNewComponentbtn.click();
		componentName.sendKeys(componentNamedata);
		shortName.sendKeys(shortNamedata);
		ComponentExe.sendKeys(ComponentExedata);
		Detail.sendKeys(Detaildata);
		Detail.sendKeys(Keys.ENTER);
	
		return new global_settingobj();
	}
	
	public global_settingobj editfile(String TriggerFilelocationdata,String StepStatusLocationdata) throws InterruptedException
	{
		componentsLink.click();
		file.click();
		Thread.sleep(1000);
		TriggerFilelocation.clear();
		StepStatusLocation.clear();
		TriggerFilelocation.sendKeys(TriggerFilelocationdata);
		StepStatusLocation.sendKeys(StepStatusLocationdata);
		savebtn.click();
		return new global_settingobj();
	}
	
	public global_settingobj editcomponent(String componentNamedata, String shortNamedata, String ComponentExedata,
			String Detaildata) throws InterruptedException {
		componentsLink.click();
		edit_icon.click();
		Thread.sleep(1000);
		componentName.clear();
		componentName.sendKeys(componentNamedata);
		shortName.clear();
		shortName.sendKeys(shortNamedata);
		ComponentExe.clear();
		ComponentExe.sendKeys(ComponentExedata);
		Detail.clear();
		Detail.sendKeys(Detaildata);
		Detail.sendKeys(Keys.ENTER);
	
		return new global_settingobj();
	}
	
	public global_settingobj changestatusmtd() throws InterruptedException {
		componentsLink.click();
		Thread.sleep(1000);
		change_status.click();
		okButton.click();
		return new global_settingobj();
	}

}
