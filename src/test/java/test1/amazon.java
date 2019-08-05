package test1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
	
	@Test
	public void aa()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement serach=driver.findElement(By.id("twotabsearchtextbox"));
		serach.sendKeys("shoes");
		serach.sendKeys(Keys.ENTER);
	java.util.List<WebElement> badge=	driver.findElements(By.linkText("Best seller"));
	
	System.out.println(badge.size());
	}

}
