package Com.wd.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.wd.Config.Config;
import Com.Java.Util.DriverFactory;

public class OhrmLoginTest_Param2 extends BaseTest{

	@Test
	public void login() {
		// enter user name
		WebElement txtUser = driver.findElement(By.id("txtUsername"));
		txtUser.sendKeys("Admin");

		// enter password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click on login
		driver.findElement(By.id("btnLogin")).click();

	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.partialLinkText("Add Emp")).click();

		driver.findElement(By.name("firstName")).sendKeys("selenium");

		driver.findElement(By.id("lastName")).sendKeys("hq");

		driver.findElement(By.id("btnSave")).click();

	}

}
