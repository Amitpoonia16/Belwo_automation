package com.belwoautomation.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.belwoautomation.qa.util.TestUtil;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;

	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Workstation-6\\eclipse-workspace\\11\\src"
					+ "\\main\\java\\com\\belwoautomation\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");

		// if (browserName.contentEquals("chrome")) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver = new ChromeDriver();

		// }
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
