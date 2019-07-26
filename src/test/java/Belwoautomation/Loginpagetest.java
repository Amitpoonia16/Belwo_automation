package Belwoautomation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Homepage;
import com.belwoautomation.qa.pages.Loginpage;

import junit.framework.Assert;

public class Loginpagetest extends Testbase {

	Loginpage loginpage;
	Homepage homepage;

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
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}
