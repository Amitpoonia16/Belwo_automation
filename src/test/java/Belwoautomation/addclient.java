package Belwoautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.addclient_obj;

public class addclient extends Testbase{
	
	addclient_obj addclient;
	Loginpage login;
	
	public addclient()
	{
		super();
	}
	@BeforeMethod
	public void setUp() {

		initialization();

		addclient= new addclient_obj();
		 login=new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void addclientmtd()
	{
		addclient.addclient("testbelwo1234", "test3211");
		System.out.println("Test");
	}
	
	@AfterMethod
	public void logout()
	{
		login.logout();
	}
	@AfterClass
	public void closewindow()
	{
		driver.close();
	}

}
