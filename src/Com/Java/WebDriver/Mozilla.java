package Com.Java.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mozilla {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\Browser\\geckodriver.exe");
		FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.google.co.in");
		String Title = Driver.getTitle();
		
		System.out.println("Title is " +Title);
		
		Driver.quit();
		
		
	}

}
