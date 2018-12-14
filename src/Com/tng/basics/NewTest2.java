package Com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	@BeforeClass
	public void openApplication() {
		System.out.println("Application opened");
	}

	@AfterClass
	public void closeApplication() {
		System.out.println("Application closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged into application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Loggedout of application");
	}
	
	@Test
	public void checkMail() {
		System.out.println("mail checked");
		Assert.fail("sample fail");

	}
	
	@Test
	public void sendMail() {
		System.out.println("mail Sent");
	}
	
}
