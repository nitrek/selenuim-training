package Com.Java.WebDriver;

import java.util.List;
import java.util.Set;
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

public class RedBusCalenderWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://www.redbus.in");
		Driver.manage().window().maximize();

		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.linkText("HOTELS")).click();
		Driver.findElement(By.xpath("//div[@class='profile-menu icon icon-account']")).click();
		Driver.findElement(By.xpath("//li[text()='SignIn / SignUp']")).click();
		WebElement frm = Driver.findElement(By.className("modalIframe"));

		Driver.switchTo().frame(frm);
		Driver.findElement(By.id("mobileNoInp")).sendKeys("12345");

		String mainwndw = Driver.getWindowHandle();

		Driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();

		// Driver.switchTo().defaultContent();

		Set<String> wndhnd = Driver.getWindowHandles();

		for (String wnd : wndhnd) {
			System.out.println(wnd);
			Driver.switchTo().window(wnd);
			
			if (Driver.getTitle().contains("Facebook")) {
				break;
			}
		}
		
		Driver.findElement(By.id("email")).sendKeys("test");
		Driver.close();
		Driver.switchTo().window(mainwndw);
		Driver.switchTo().frame(frm);

		Driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();

	}
}
