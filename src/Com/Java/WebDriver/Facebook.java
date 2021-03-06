package Com.Java.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class Facebook {
	
	public static void main(String[] args) {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://www.facebook.com/");
		
		WebElement textbx = Driver.findElement(By.name("firstname"));
		textbx.sendKeys("Admin");
		
		Driver.findElement(By.name("lastname")).sendKeys("admin123");
		
		Driver.findElement(By.name("reg_email__")).sendKeys("9049296662");

		
		
		new Select(Driver.findElement(By.name("birthday_day"))).selectByVisibleText("5");
		new Select(Driver.findElement(By.name("birthday_month"))).selectByVisibleText("Dec");
		new Select(Driver.findElement(By.name("birthday_year"))).selectByVisibleText("2000");

		List<WebElement> rdButton = Driver.findElements(By.name("sex"));
		
		rdButton.get(1).click();
		
		
		
		
		
		
		
		
		
		//Driver.quit();
	}


}
