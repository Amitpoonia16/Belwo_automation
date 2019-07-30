package Belwoautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Applications_obj;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.addclient_obj;

public class Applications extends Testbase{

	Applications_obj applicationobj;
	Loginpage login;
	public Applications()
	{
		super();
	}
	@BeforeMethod
	public void setUp() {

		initialization();

		applicationobj= new Applications_obj();
		 login=new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void add_app()
	{
		applicationobj.Add_app("added by automation10");
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
