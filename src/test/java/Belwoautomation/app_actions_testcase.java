package Belwoautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.app_actions_obj;

public class app_actions_testcase extends Testbase {

	app_actions_obj appactionobj;
	Loginpage login;

	public app_actions_testcase() {
		super();
	}

	@BeforeMethod
	public void login() {
		initialization();
		appactionobj = new app_actions_obj();
		login = new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void appclone() throws InterruptedException {
		appactionobj.clone_app("test_newbelwo5", "123", "123");
		appactionobj.editapp("amitnewapp7");
		appactionobj.delete_app();
		appactionobj.shortapp();
		Thread.sleep(1000);
		appactionobj.changestatus();

	}

	@AfterMethod
	public void logout() {
		login.logout();
	}

	@AfterClass
	public void closewindow() {
		// driver.quit();
	}
}
