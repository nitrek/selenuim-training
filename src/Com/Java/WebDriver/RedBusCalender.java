package Com.Java.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class RedBusCalender {

	public static void main(String[] args) {
		// open chrome browser
		WebDriver driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		// wait for page load
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// wait for elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// explicit wait condition
		WebDriverWait wait = new WebDriverWait(driver, 50);

		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		
		boolean isMonthFound = false;
		while(!isMonthFound) {
			
			//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']
			String monthTitle = driver.findElement(By.cssSelector("div#rb-calendar_onward_cal td.monthTitle")).getText();
			if(monthTitle.contains("Mar")) {
				driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[text()='14']")).click();
				isMonthFound = true;
			}else {
				//div[@id='rb-calendar_onward_cal']//td[@class='next']/button
				driver.findElement(By.cssSelector("div#rb-calendar_onward_cal td.next button")).click();
			}
			
		}

	}

}