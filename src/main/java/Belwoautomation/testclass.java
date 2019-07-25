package Belwoautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testclass {

	WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.out.println("Test1");

		testclass test = new testclass();
		test.login();

		test.addkey1();
		test.addkey2();
		test.addkey3();
		test.addkey();
		//test.check_added_key();
		test.logout();
	}

	public void login() {

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

	public void addkey() throws InterruptedException {
		driver.findElement(By.linkText("Message & Inserts")).click();
		driver.findElement(By.linkText("Message & Insert Configuration")).click();
		int size_ofnevtop = driver.findElements(By.xpath("//*[@class=\"nav nav-tabs\"]/li")).size();
		System.out.println("Size of nev top is== " + size_ofnevtop);
		if (size_ofnevtop == 3) {
			System.out.println("Test cases is passed");
		}
		Thread.sleep(1000);
		driver.findElement(By.id("AddKey")).click();
		Thread.sleep(1000);
		WebElement client = driver.findElement(By.id("ddlClientsAdd"));
		Select sel_client = new Select(client);
		sel_client.selectByVisibleText("Belwo Client");

		WebElement application = driver.findElement(By.id("ddlApplicationAdd"));
		Select sel_application = new Select(application);
		sel_application.selectByValue("2012");

		driver.findElement(By.id("keyName")).sendKeys("Test123123123");
		driver.findElement(By.id("messagesKeyValue")).click();
		driver.findElement(By.id("insertsKeyValue")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[1]")).click();
		Thread.sleep(1000);
		boolean keyadded = driver.findElement(By.xpath("//div[text()=\"New Key added successfully.\"]")).isDisplayed();
		if (keyadded = true) {
			System.out.println("Key add test case pass");
		} else {
			System.out.println("Test case is failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		System.out.println("test cases end here");

	}

	public void addkey1() throws InterruptedException {
		// -ve test cases if user didn't select the client and click on save button
		Thread.sleep(1000);
		driver.findElement(By.id("AddKey")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[1]")).click();
		boolean client_error_message = driver.findElement(By.id("ddlClientsAddError")).isDisplayed();
		if (client_error_message = true) {
			System.out.println("Client validation message test case is passed");
		} else {
			System.out.println("Client validation message test case is failed");
		}
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[2]")).click();
	}

	public void addkey2() throws InterruptedException {
		// -ve test cases if user didn't select the client and click on save button
		Thread.sleep(1000);
		driver.findElement(By.id("AddKey")).click();
		Thread.sleep(1000);
		WebElement client = driver.findElement(By.id("ddlClientsAdd"));
		Select sel_client = new Select(client);
		sel_client.selectByVisibleText("Belwo Client");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[1]")).click();
		boolean Application_error_message = driver.findElement(By.id("ddlApplicationAddError")).isDisplayed();
		if (Application_error_message = true) {
			System.out.println("Application validation message test case is passed");
		} else {
			System.out.println("Application validation message test case is failed");
		}
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[2]")).click();
	}

	public void addkey3() throws InterruptedException {
		// -ve test cases if user didn't select the client and click on save button
		Thread.sleep(1000);
		driver.findElement(By.id("AddKey")).click();
		Thread.sleep(1000);
		WebElement client = driver.findElement(By.id("ddlClientsAdd"));
		Select sel_client = new Select(client);
		sel_client.selectByVisibleText("Belwo Client");
		Thread.sleep(1000);
		WebElement application = driver.findElement(By.id("ddlApplicationAdd"));
		Select sel_application = new Select(application);
		sel_application.selectByValue("2012");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[1]")).click();
		boolean key_error_message = driver.findElement(By.id("keyNameError")).isDisplayed();
		if (key_error_message = true) {
			System.out.println("KeyNameError validation message test case is passed");
		} else {
			System.out.println("KeyNameError validation message test case is failed");
		}
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[2]")).click();

	}

	public void check_added_key() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		  WebElement client = driver.findElement(By.id("ddlClientsAdd")); Select
		  sel_client = new Select(client);
		  sel_client.selectByVisibleText("Belwo Client");
		  
		  WebElement application = driver.findElement(By.id("ddlApplicationAdd"));
		  Select sel_application = new Select(application);
		  sel_application.selectByValue("2012");
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"dataTables_filter\"]/label/input")).sendKeys("jfjkjkfjkfdjjkd");
		Thread.sleep(1000);
		boolean zero_message = driver.findElement(By.xpath("//td[text()=\"No matching records found\"]")).isDisplayed();
		System.out.println("Message " + zero_message);
	}

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.id("logOff")).click();
		System.out.println("User logout successfully");
		driver.quit();
	}

}
