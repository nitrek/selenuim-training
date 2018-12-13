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

public class TSRTC {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);

		Driver.get("https://tsrtconline.in/oprs-web/");
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Driver.findElement(By.id("fromPlaceName")).sendKeys("PUNE");
		WebDriverWait wait = new WebDriverWait(Driver,50);
//		wait.until(ExpectedCondition.class)
		//Thread.sleep(1000);
		Driver.findElement(By.linkText("PUNE")).click();
		
		Driver.findElement(By.id("toPlaceName")).sendKeys("HYDERABAD");
		
		Driver.findElement(By.linkText("HYDERABAD")).click();
		
		Driver.findElement(By.id("txtJourneyDate")).click();
		Driver.findElement(By.linkText("29")).click();
		
		Driver.findElement(By.xpath("//input[@value=\'Check Availability\']")).click();
		
		//Driver.findElement(By.xpath("//div[normalize-space()='8258']/ancestor::div[@class='row']//input[@name='SrvcSelectBtnForward']")).click();
		
		Driver.findElement(By.xpath("//span[@id='BtFid']")).click();
		
		Driver.findElement(By.xpath("//input[@name='A/C CLASS']")).click();

		List<WebElement> lstEle = Driver.findElements(By.className("srvceNO"));
		
		for(WebElement test : lstEle){
			
			if (test.isDisplayed()) {
				System.out.println(test.getText());
				
			}
			
			
		}
		
		/*Driver.findElement(By.name("lastname")).sendKeys("admin123");
		
		Driver.findElement(By.name("reg_email__")).sendKeys("9049296662");
		
		

		
		
		new Select(Driver.findElement(By.name("birthday_day"))).selectByVisibleText("5");
		new Select(Driver.findElement(By.name("birthday_month"))).selectByVisibleText("Dec");
		new Select(Driver.findElement(By.name("birthday_year"))).selectByVisibleText("2000");

		List<WebElement> rdButton = Driver.findElements(By.name("sex"));
		
		rdButton.get(1).click();*/
		
		
		
		
		
		
		
		
		
		//Driver.quit();
	}

}
