package Com.Java.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class TSRTCAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://tsrtconline.in/oprs-web/");
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Driver.findElement(By.xpath("//input[@value=\'Check Availability\']")).click();
		
		Alert alertsam = Driver.switchTo().alert();
		
		alertsam.accept();
		

		// Driver.findElement(By.xpath("//div[normalize-space()='8258']/ancestor::div[@class='row']//input[@name='SrvcSelectBtnForward']")).click();

	}

}
