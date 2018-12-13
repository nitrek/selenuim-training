package Com.Java.WebDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class Login {
	public static void main(String[] args) {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement textbx = Driver.findElement(By.name("txtUsername"));
		textbx.sendKeys("Admin");
		
		Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Driver.findElement(By.name("Submit")).click();
		
		Driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Driver.findElement(By.id("btnAdd")).click();
		
		Driver.findElement(By.name("firstName")).sendKeys("Emp");
		Driver.findElement(By.name("lastName")).sendKeys("munde");
		
		Driver.findElement(By.id("btnSave")).click();
		
		
		String outtext = Driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		
		System.out.println(outtext);
		
		Driver.findElement(By.id("btnSave")).click();

		List<WebElement> rdButton = Driver.findElements(By.name("personal[optGender]"));
		
		rdButton.get(1).click();
		
		new Select(Driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
		
		//Driver.quit();
	}
}