package Belwoautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://18.235.51.169:809/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("Username")).sendKeys("admin@belwo.com");
		driver.findElement(By.id("Password")).sendKeys("BelWo@123");
		driver.findElement(By.id("ButtonId")).click();
		String title = driver.getTitle();
		String exp_title = "Running Jobs";
		if (title.equals(exp_title)) {
			System.out.println("User login successfully");
		} else {
			System.out.println("User not login");
		}
	}
	@Test
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.id("logOff")).click();
		System.out.println("User logout successfully");
		driver.quit();
	}

}
