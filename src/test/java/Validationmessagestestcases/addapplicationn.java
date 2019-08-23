package Validationmessagestestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;

import Validationmessages.addapplicationsobjn;
import Validationmessages.addclientobjn;

public class addapplicationn extends Testbase {

	addapplicationsobjn addapplications;
	Loginpage login;

	public addapplicationn() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();

		addapplications = new addapplicationsobjn();
		login = new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void appvalmtd() {
		addapplications.addapplicationvalmtd();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		login.logout();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}
