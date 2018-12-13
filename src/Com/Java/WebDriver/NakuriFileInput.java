package Com.Java.WebDriver;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Java.Util.DriverFactory;
import Com.wd.Config.Config;

public class NakuriFileInput {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(Config.BROWSER_NAME);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input_resumeParser")));
		String fpath ="C:\\Users\\adm\\Desktop\\data\\Resume.docx";
		driver.findElement(By.id("input_resumeParser")).click();//.sendKeys(fpath);
		try {
		Robot robot = new Robot();
		Clipboard clipboard =Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(new StringSelection(fpath), null);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bd_name")));
		driver.findElement(By.id("bd_name")).sendKeys("Test Name");
		
		
	}

}
