package Validationmessages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class globalsettingobj extends Testbase {

	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Global Settings\"]")
	WebElement globalSetting;

	@FindBy(xpath = "//*[contains(text(),\"Add new Setting\")]")
	WebElement Addnewsettingbtn;

	@FindBy(id = "btnSave")
	WebElement savebtn;

	@FindBy(xpath = "//div[text()=\"Please provide a name.Should have atleast 3 character\"]")
	WebElement name_val_msg;

	@FindBy(xpath = "//div[text()=\"Please select a queue type.\"]")
	WebElement queuetype_val_msg;

	@FindBy(xpath = "//button[text()=\"×\"]")
	WebElement closeIcon;

	// Component code will updated once validation part is fix currently validation
	// is not working

	@FindBy(xpath = "//*[contains(text(),\"Add new Component\")]")
	WebElement addNewComponentbtn;

	// Other setting

	@FindBy(xpath = "//a[text()=\"Other Settings\"]")
	WebElement otherSetting;

	@FindBy(id = "JobInitExePath")
	WebElement jobInitExebox;

	@FindBy(xpath = "//*[text()=\"The Job Init Exe field is required.\"]")
	WebElement jobinitexevalmsg;

	public globalsettingobj() {
		PageFactory.initElements(driver, this);
	}

	public globalsettingobj Server_Connection_Settingsvldmsg() throws InterruptedException {

		setting_link.click();
		globalSetting.click();
		Addnewsettingbtn.click();
		Thread.sleep(1000);
		savebtn.click();
		if (name_val_msg.isDisplayed()) {
			if (queuetype_val_msg.isDisplayed()) {
				System.out.println("Test cases passed");
			}
		}
		closeIcon.click();
		return new globalsettingobj();
	}

	public globalsettingobj othersettingmtd() throws InterruptedException {
		/*
		 * setting_link.click(); globalSetting.click();
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		otherSetting.click();
		Thread.sleep(1000);
		jobInitExebox.clear();
		savebtn.click();
		if (jobinitexevalmsg.isDisplayed()) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		Thread.sleep(1000);

		return new globalsettingobj();
	}
}
