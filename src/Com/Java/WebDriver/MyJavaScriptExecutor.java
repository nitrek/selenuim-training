package Com.Java.WebDriver;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class MyJavaScriptExecutor {

	public static void main(String[] args) throws Exception {

		WebDriver driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MyJavaScriptExecutor my = new MyJavaScriptExecutor();
		//my.border(driver);
		my.spamGoogle(driver);
		//driver.close();	
		}
	public void scroll(WebDriver driver) throws Exception {
		
		driver.get("https://bitnami.com/");
		//Thread.sleep(5000);
		String taskname = "selection";
		int i = 0;
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/h2"));
		///Actions act= new Actions(driver);
		MyUtil.takeSnapShot(driver, "screenshot/"+i+++taskname+".png");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = (String) js.executeScript("return arguments[0].innerText",element);
		System.out.println(text);
		js.executeScript("console.log(arguments[0])",text);
		MyUtil.takeSnapShot(driver, "screenshot/"+i+++taskname+".png");
		
	}
	public void spamGoogle(WebDriver driver) throws Exception {
		driver.get("https://www.google.com");
		String taskname = "search";
		int i =0;
		MyUtil.takeSnapShot(driver, "screenshot/"+i+++taskname+".png");
		WebElement element =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
		MyUtil.takeSnapShot(driver, "screenshot/"+i+++taskname+".png");
		WebElement element2 =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]"));
		element.sendKeys("test using selenium");
		element2.click();
		MyUtil.takeSnapShot(driver, "screenshot/"+i+++taskname+".png");
	}
		public void border(WebDriver driver) throws Exception
		{
			TakesScreenshot scr = ((TakesScreenshot) driver);
			int i = 0;
			// open app
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Actions actions = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			MyUtil.takeSnapShot(driver, "screenshot/"+i+++"start.png");
			WebElement username = driver.findElement((By.id("txtUsername")));
			WebElement password = driver.findElement((By.xpath("//*[@id=\"txtPassword\"]")));
			js.executeScript("arguments[0].style.border='5px dotted red'", username);

			MyUtil.takeSnapShot(driver, "screenshot/"+i+++"border.png");
			username.sendKeys("Admin");
			password.sendKeys("admin123");
			MyUtil.takeSnapShot(driver, "screenshot/"+i+++"login.png");
			js.executeScript("document.getElementById('btnLogin').click()");
			MyUtil.takeSnapShot(driver, "screenshot/"+i+++"dashboard.png");
			js.executeScript("window.scrollTo(0, 500)");
			MyUtil.takeSnapShot(driver, "screenshot/"+i+++"photo.png");
		}

}
