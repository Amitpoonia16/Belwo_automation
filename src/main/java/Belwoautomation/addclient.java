package Belwoautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Belwoautomation_obj.Adduser;

public class addclient extends Adduser {

	WebDriver driver;
	testclass test;

	@BeforeClass
	public void login_before()
	{
		
	}
	@Test
	public void addclient1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Before test 2");
		test = new testclass();
		test.login();
		System.out.println("Before test 1");
		System.out.println("Test cases start");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Setting\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Clients\"]")).click();

		System.out.println("Test cases end");

	
	}
	@BeforeClass
	public void logout() throws InterruptedException
	{
		//test.logout();
	}
}
