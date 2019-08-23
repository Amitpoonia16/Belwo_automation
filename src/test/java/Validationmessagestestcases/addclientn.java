package Validationmessagestestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.addclient_obj;

import Validationmessages.addclientobjn;

public class addclientn extends Testbase{
	
	addclientobjn addclientobj;
	Loginpage login;
	
	public addclientn()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();

		addclientobj= new addclientobjn();
		 login=new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void checkvaliditionmsgmtd() throws InterruptedException
	{
		addclientobj.getvalidationmessage();
		addclientobj.getvalidationmessage2();
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
		driver.close();
	}
}
