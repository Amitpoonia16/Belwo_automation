package Validationmessagestestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;

import Validationmessages.globalsettingobj;
import Validationmessages.messages_insertsobj;

public class messages_inserts extends Testbase {

	messages_insertsobj messagesinsertsobj;
	Loginpage login;

	public messages_inserts() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		messagesinsertsobj = new messages_insertsobj();
		login = new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void valmsgmtd() throws InterruptedException {
		messagesinsertsobj.messagesmtd1();
	}

	
	  @AfterMethod public void logout() throws InterruptedException {
	  Thread.sleep(1000); login.logout1(); }
	  
	  @AfterClass public void closebrowser() { driver.close(); }
	 

}
