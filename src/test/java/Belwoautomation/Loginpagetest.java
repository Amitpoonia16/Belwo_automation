package Belwoautomation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.addclient_obj;

import junit.framework.Assert;

public class Loginpagetest extends Testbase {

	Loginpage loginpage;
	addclient_obj addclient;

	public Loginpagetest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();

		loginpage = new Loginpage();
	}

	@Test
	public void loginPageTitleTest() {

	}

	@Test
	public void logintest() {
		addclient = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}
