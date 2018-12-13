package Com.Java.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class AppconfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);
		
		Driver.get("https://www.google.co.in");
		String Title = Driver.getTitle();
		
		System.out.println("Title is " +Title);
		
		Driver.quit();
		

	}

}
