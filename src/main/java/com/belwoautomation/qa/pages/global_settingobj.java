package com.belwoautomation.qa.pages;

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
	
	//delete setting
	
	@FindBy(xpath="//a[@title=\"Delete setting\"]")
	WebElement deleteicon;
	
	@FindBy(xpath = "//button[text()=\"OK\"]")
	WebElement okButton;
	
	//Components
	
	@FindBy(xpath="//a[text()=\"Components\"]")
	WebElement componentsLink;
	
	@FindBy(xpath="//button[contains(text(),'Add new Component')]")
	WebElement addNewComponentbtn;
	
	@FindBy(id="ComponentName")
	WebElement componentName;
	
	@FindBy(id="ShortName")
	WebElement shortName;
	
	@FindBy(id="ComponentExe")
	WebElement ComponentExe;
	
	@FindBy(id="Detail")
	WebElement Detail;

	public global_settingobj() {
		PageFactory.initElements(driver, this);
	}
	public global_settingobj globalcommon()
	{
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
	
	public global_settingobj deleteglobalsettingmtd()
	{
		
		deleteicon.click();
		okButton.click();
		return new global_settingobj();
	}
	
	public global_settingobj  addNewcomponent()
	{
		
		deleteicon.click();
		okButton.click();
		return new global_settingobj();
	}

}
