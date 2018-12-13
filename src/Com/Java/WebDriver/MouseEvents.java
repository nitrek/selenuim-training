package Com.Java.WebDriver;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		Actions actions = new Actions(driver);
	/*	
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//WebElement element = driver.findElement(By.linkText("Support"));
		
			
//		actions.moveToElement(element);
		driver.findElement(By.linkText("Forum")).click();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		actions.contextClick(element).build().perform();
		//Drag and drop
		*/
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml5_draganddrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement iframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(10000);
		WebElement source = driver.findElement(By.id("drag1"));
		System.out.println("drag1 found");
		
		WebElement target = driver.findElement(By.id("div1"));
		System.out.println("div1 found");
		actions.dragAndDrop(source, target).build().perform();
		System.out.println("drag drop done");
		//driver.close();
	}

}
