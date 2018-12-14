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

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	public void openApplication(String brName) {
		// open chrome browser
		 driver = DriverFactory.getDriverFor(brName);

		// open orange hrm
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}
}
