package Com.Java.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver getDriverFor(String brName) {
		switch (brName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Software\\Browser\\chromedriver.exe");
			ChromeOptions Coption = new ChromeOptions();
			Coption.addArguments("--disable-notifications");
			return new ChromeDriver(Coption);
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Software\\Browser\\geckodriver.exe");
			return new FirefoxDriver();

		default:
			System.out.println("No Browser Found");
			return null;
		}
	}
}
