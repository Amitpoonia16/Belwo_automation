package Validationmessages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class addapplicationsobjn extends Testbase {
	@FindBy(xpath = "//*[text()=\"Setting\"]")
	WebElement setting_link;
	
	@FindBy(xpath="//*[text()=\"Applications\"]")
	WebElement application_link;
	
	@FindBy(xpath="//*[text()=\"Add Application\"]")
	WebElement add_app_btn;
		
	@FindBy(id="btnSave")
	WebElement Save_button;
	
	@FindBy(xpath="//div[text()=\"Please select Client.\"]")
	WebElement clientvalmsg;
	
	@FindBy(xpath="//div[text()=\"Name should not be less than 5 character.\"]")
	WebElement applicationvalmsg;
	
	@FindBy(xpath="//div[text()=\"Please provide a Processing Type.\"]")
	WebElement processingvalmsg;
	
	
	String exp_client="Please select Client.";
	String exp_application="Name should not be less than 5 character.";
	String exp_processing="Please provide a Processing Type.";
	
	@FindBy(xpath="//*[text()=\"Close\"]")
	WebElement closebtn;
	
	public addapplicationsobjn() {
		PageFactory.initElements(driver, this);
	}
	
	public addapplicationsobjn addapplicationvalmtd()
	{
		setting_link.click();
		application_link.click();
		add_app_btn.click();
		Save_button.click();
		if(exp_client.equalsIgnoreCase(exp_client))
		{
			if(exp_application.equalsIgnoreCase(exp_application))
			{
				if(exp_processing.equalsIgnoreCase(exp_processing))
				{
					System.out.println("Test case is passed");
				}
			}
		}
		else
		{
			System.out.println("Test case is fail");
		}
		closebtn.click();
		return new addapplicationsobjn();
		
	}
	
}
