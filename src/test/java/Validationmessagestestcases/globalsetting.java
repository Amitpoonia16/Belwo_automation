package Validationmessagestestcases;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;

import Validationmessages.addapplicationsobjn;
import Validationmessages.globalsettingobj;

public class globalsetting extends Testbase {

	globalsettingobj globalsettingvr;
	Loginpage login;

	public globalsetting() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();

		globalsettingvr = new globalsettingobj();
		login = new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void getmsg() throws InterruptedException {
		globalsettingvr.Server_Connection_Settingsvldmsg();
		globalsettingvr.othersettingmtd();
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		 Thread.sleep(1000);
		 login.logout1();
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
