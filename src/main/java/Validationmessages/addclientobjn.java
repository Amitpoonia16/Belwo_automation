package Validationmessages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;

public class addclientobjn extends Testbase {

	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;

	@FindBy(xpath = "//*[text()=\"Clients\"]")
	WebElement clientslink;

	@FindBy(xpath = "//*[text()=\"Add Client\"]")
	WebElement addclient_button;

	@FindBy(id = "btnSaveData")
	WebElement savebtn;

	@FindBy(xpath = "//div[text()=\"Name should not be less than 5 character.\"]")
	WebElement nameValidationmessage;

	@FindBy(xpath = "//div[text()=\"Please provide a contact name.\"]")
	WebElement spocNameValidationmessage;

	@FindBy(xpath = "//button[@class=\"btn btn-cancel\"]")
	WebElement cancelbtn;

	@FindBy(xpath = "//button[@class=\"close\"]")
	WebElement closebtn;

	String exp_nameValidationmessage = "Name should not be less than 5 character.";
	String exp_spocNameValidationmessage = "Please provide a contact name.";

	public addclientobjn() {
		PageFactory.initElements(driver, this);
	}

	public addclientobjn getvalidationmessage() throws InterruptedException {
		setting_link.click();
		clientslink.click();
		addclient_button.click();
		savebtn.click();
		String ac_nameValidationmessage = nameValidationmessage.getText();
		String ac_spocNameValidationmessage = spocNameValidationmessage.getText();
		if (exp_nameValidationmessage.equalsIgnoreCase(ac_nameValidationmessage)) {
			if (exp_spocNameValidationmessage.equalsIgnoreCase(ac_spocNameValidationmessage)) {
				System.out.println("Test case passed");
			}
		} else {
			System.out.println("Test case fail");
		}
		cancelbtn.click();

		return new addclientobjn();
	}

	public addclientobjn getvalidationmessage2() throws InterruptedException {
		addclient_button.click();
		closebtn.click();

		return new addclientobjn();
	}
}
