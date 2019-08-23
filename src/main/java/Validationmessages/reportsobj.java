package Validationmessages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.belwoautomation.qa.base.Testbase;

public class reportsobj extends Testbase {
	
	@FindBy(xpath="//*[text()=\"Reports\"]")
	WebElement reportslink;
	
	@FindBy(xpath="//*[text()=\"Piece Lookup\"]")
	WebElement pieceLookuplink;
	
	@FindBy(xpath="//*[@class=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/button[3]")
	WebElement saveBtn;
	
	@FindBy(xpath="//span[text()=\"Client is required\"]")
	WebElement msg1;
	
	@FindBy(xpath="//span[text()=\"Job is required\"]")
	WebElement msg2;
	
	public reportsobj() {
		PageFactory.initElements(driver, this);
	}
	
	public reportsobj valMsgMtd()
	{
		reportslink.click();
		pieceLookuplink.click();
		saveBtn.click();
		if(msg1.isDisplayed())
		{
			if(msg2.isDisplayed())
			{
				System.out.println("Test case pass");
			}
		}
		return new reportsobj();
	}
	
}
