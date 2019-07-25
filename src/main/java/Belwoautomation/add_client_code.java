package Belwoautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_client_code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://18.235.51.169:809/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("Username")).sendKeys("admin@belwo.com");
		driver.findElement(By.id("Password")).sendKeys("BelWo@123");
		driver.findElement(By.id("ButtonId")).click();
		driver.findElement(By.xpath("//*[text()=\"Setting\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Clients\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Add Client\"]")).click();
		driver.findElement(By.id("SPOCName")).sendKeys("Test_belwo_new");
		driver.findElement(By.id("txtclientname")).sendKeys("New_test_belwo");
		driver.findElement(By.id("btnSaveData")).click();

		// validation message code start from here
		driver.findElement(By.xpath("//*[text()=\"Add Client\"]")).click();
		driver.findElement(By.id("btnSaveData")).click();
		boolean validation_message1 = driver
				.findElement(By.xpath("//div[text()=\"Name should not be less than 5 character.\"]")).isDisplayed();
		System.out.println(validation_message1);
		driver.findElement(By.className("close")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Add Client\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnSaveData")).click();
		boolean validation_message2 = driver.findElement(By.xpath("//div[text()=\"Please provide a contact name.\"]"))
				.isDisplayed();
		System.out.println(validation_message2);
//Already have account validation message code start from here
		driver.findElement(By.className("close")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Add Client\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtclientname")).sendKeys("New_test_belwo");
		driver.findElement(By.id("txtclientname")).sendKeys(Keys.TAB);
		boolean error_message = driver.findElement(By.className("control-label")).isDisplayed();
//driver.findElement(By.partialLinkText("Client Name Already Exists Please Enter Another Name")).isDisplayed();
		System.out.println(error_message);
	}

}
