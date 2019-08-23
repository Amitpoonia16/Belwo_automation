package Validationmessages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class messages_insertsobj extends Testbase {
	@FindBy(xpath = "//*[text()=\"Message & Inserts\"]")
	WebElement message_Inserts;

	@FindBy(xpath = "//*[text()=\"Message & Insert Configuration\"]")
	WebElement messageInsertConfiguration;

	@FindBy(xpath = "//button[contains(text(),\"Add Message Areas\")]")
	WebElement addmessagebtn;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	WebElement savebutton;

	@FindBy(xpath = "//button[contains(text(),\"×\")]")
	WebElement closeIcon;
	// validation messages

	@FindBy(xpath = "//div[text()=\"This field is required.\"]")
	WebElement appValmsg;

	@FindBy(xpath = "//div[text()=\"Please select a  Template name.\"]")
	WebElement templatevalmsg;

	@FindBy(xpath = "//div[text()=\"Please select a Doc Type.\"]")
	WebElement docValmsg;

	@FindBy(xpath = "//div[text()=\"Please select a Message Areas.\"]")
	WebElement messageValmsg;

	// -------------
	@FindBy(xpath = "//a[@href=\"/MessageAndInserts/MessageAreas\"]")
	WebElement messageAreasLink;

	@FindBy(xpath = "//button[contains(text(),\"Add Message Areas\")]")
	WebElement addmessageAreasbtn;
	// ---val

	@FindBy(xpath = "//div[text()=\"Please select a Client.\"]")
	WebElement clientValMsg;

	@FindBy(xpath = "//div[text()=\"Please select a Application.\"]")
	WebElement appValMsg;

	@FindBy(xpath = "//div[text()=\"Please select a Template Name.\"]")
	WebElement templateValMsg;

	@FindBy(xpath = "//*[text()=\"Please select a Doc Type.\"]")
	WebElement docValMsg;

	@FindBy(xpath = "//*[text()=\"Please select a Slot Type.\"]")
	WebElement slotValMsg;

	@FindBy(xpath = "//*[text()=\"This field is required.\"]")
	WebElement barcodetypeValMsg;
	
	@FindBy(xpath="//div[@class=\"form-group tobehide has-error\"]/div/div")
	WebElement testnew1;

	public messages_insertsobj() {
		PageFactory.initElements(driver, this);
	}

	public messages_insertsobj messagesmtd() throws InterruptedException {
		message_Inserts.click();
		messageInsertConfiguration.click();
		addmessagebtn.click();
		Thread.sleep(1000);
		savebutton.click();
		if (appValmsg.isDisplayed()) {
			if (templatevalmsg.isDisplayed()) {
				if (docValmsg.isDisplayed()) {
					if (messageValmsg.isDisplayed()) {
						System.out.println("Test case passed");
					}
				}
			}
		}

		closeIcon.click();
		return new messages_insertsobj();
	}

	public messages_insertsobj messagesmtd1() throws InterruptedException {
		message_Inserts.click();
		messageInsertConfiguration.click();
		messageAreasLink.click();
		addmessageAreasbtn.click();
		Thread.sleep(1000);
		savebutton.click();

		Thread.sleep(1000);
		if (testnew1.isDisplayed()) {
			System.out.println("Test");
		}
		closeIcon.click();
		return new messages_insertsobj();
	}
}
