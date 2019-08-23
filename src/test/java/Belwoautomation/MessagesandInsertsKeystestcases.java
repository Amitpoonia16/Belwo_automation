package Belwoautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.MessagesandInsertsKeysobj;
import com.belwoautomation.qa.pages.global_settingobj;

public class MessagesandInsertsKeystestcases extends Testbase {

	MessagesandInsertsKeysobj MessagesandInsertsKeys;
	Loginpage login;

	public MessagesandInsertsKeystestcases() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();
		MessagesandInsertsKeys = new MessagesandInsertsKeysobj();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void commonshortingmtd() throws InterruptedException {
		MessagesandInsertsKeys.messagecommon();

		MessagesandInsertsKeys.shortavailablekeys();
		Thread.sleep(1000);

		MessagesandInsertsKeys.shortmessageareamtd();
		Thread.sleep(1000);
		MessagesandInsertsKeys.shortinsertingConfigurationmtd();
		Thread.sleep(1000);

	}

	@Test
	public void availableKeys() throws InterruptedException {
		MessagesandInsertsKeys.messagecommon();

		MessagesandInsertsKeys.addKeymtd("Amit_belwo_amit");
		Thread.sleep(1000);

		MessagesandInsertsKeys.addmessageareamtd("test_belwo1");
		Thread.sleep(1000);

		MessagesandInsertsKeys.addInsertsConfigurationsmtd("test_belwo123");
		Thread.sleep(1000);

	}

	@AfterMethod
	public void logout() {

		login.logout();
	}

	@AfterClass
	public void close() {

		driver.close();
	}

}
