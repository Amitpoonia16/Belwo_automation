package Belwoautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.MessagesandInsertsKeysobj;
import com.belwoautomation.qa.pages.global_settingobj;

public class MessagesandInsertsKeystestcases extends Testbase{
	
	MessagesandInsertsKeysobj MessagesandInsertsKeys;
	Loginpage login;
	
	public MessagesandInsertsKeystestcases()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();
		MessagesandInsertsKeys = new MessagesandInsertsKeysobj();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void availableKeys()
	{
		MessagesandInsertsKeys.messagecommon();
		MessagesandInsertsKeys.addKeymtd("Amit_belwo_amit");
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		login.logout();
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
