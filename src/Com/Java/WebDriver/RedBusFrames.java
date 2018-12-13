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

public class RedBusFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://www.redbus.in");

		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Boolean tFlag = false;

		while (!tFlag) {
			String textval = Driver
					.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td [@class='monthTitle']")).getText();
			if (textval.contains("Mar")) {

				Driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td [text()='20']")).click();

				tFlag = true;
			} else {
				Driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td [@class='next']/button")).click();

			}
		}
	}
}
		

	

	//WebDriverWait wait = new WebDriverWait(Driver, 50);
//		wait.until(ExpectedCondition.class)
	// Thread.sleep(1000);
