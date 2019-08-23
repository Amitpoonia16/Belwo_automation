package Validationmessagestestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;

import Validationmessages.messages_insertsobj;
import Validationmessages.reportsobj;

public class reports extends Testbase{
	
	reportsobj reportsvar;
	Loginpage login;
	
	public reports()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		reportsvar = new reportsobj();
		login = new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void mtd1()
	{
		reportsvar.valMsgMtd();
	}
	
	
	  @AfterMethod public void logout() throws InterruptedException {
	  Thread.sleep(1000); login.logout1(); }
	  
	  @AfterClass public void closebrowser() { driver.close(); }
	 

}
