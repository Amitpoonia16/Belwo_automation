package Belwoautomation_obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adduser {
	
	/*
	 * @FindBy(xpath="//*[text()=\"Setting\"]") WebElement settingclick;
	 */

	public static WebElement setting(WebDriver driver){
		 
        WebElement element = driver.findElement(By.xpath("//*[text()=\"Setting\"]"));

        return element;
}
	public static WebElement client(WebDriver driver)
	{
		WebElement element= driver.findElement(By.xpath("//*[text()=\"Clients\"]"));
		return element;
	}
}
