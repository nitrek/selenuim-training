package Com.Java.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\Browser\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.co.in");
		String Title = Driver.getTitle();
		
		System.out.println("Title is " +Title);
		
		Driver.quit();
		
	}

}
