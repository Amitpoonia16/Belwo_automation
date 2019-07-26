package Belwoautomation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.addclient_obj;

public class addclient extends Testbase{
	
	addclient_obj addclient;
	
	public addclient()
	{
		super();
	}
	@BeforeMethod
	public void setUp() {

		initialization();

		addclient= new addclient_obj();
		Loginpage login=new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void addcliet()
	{
		addclient.addclient("testbelwo123", "test321");
	}

}
