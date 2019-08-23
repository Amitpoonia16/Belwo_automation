package Belwoautomation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.belwoautomation.qa.base.Testbase;
import com.belwoautomation.qa.pages.Loginpage;
import com.belwoautomation.qa.pages.global_settingobj;

public class globalsettingtestcase extends Testbase {

	global_settingobj globalsetting;
	Loginpage login;

	public globalsettingtestcase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();
		globalsetting = new global_settingobj();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void addnewsetting() throws InterruptedException {		
		globalsetting.globalcommon();
		Thread.sleep(1000);
		globalsetting.addNewSettingmtd("new.amit1", "new.test1", "test.abc", "11", "belwotest");
		Thread.sleep(1000);
		globalsetting.addNewSettingwithlocalfilesystemmtd("name.amit3");
		Thread.sleep(1000);
		globalsetting.editsetting("new.amit3", "new.test2", "test.abc", "11", "belwotest");
		Thread.sleep(1000);
		globalsetting.deleteglobalsettingmtd();
		Thread.sleep(1000);
		globalsetting.addNewcomponent("newb.elwo", "newbl.ewo", "test..belwo", "belwtesttetstetteststeetst");
		Thread.sleep(1000);
		globalsetting.editfile("testamit", "belwotest");
		Thread.sleep(1000);
		globalsetting.editcomponent("newb.elwo", "newbl.ewo", "test..belwo", "belwtesttetstetteststeetst");
		Thread.sleep(1000);
		globalsetting.changestatusmtd();
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
