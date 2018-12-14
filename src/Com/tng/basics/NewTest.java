package Com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeGroups(groups="sn")
	public void beforeSN() {
		System.out.println("this group pre condition");
	}
	
	@BeforeSuite
	public void initReport() {
		System.out.println("Report initialized for suite");
	}
	
	@AfterSuite
	public void closeReport() {
		System.out.println("Report closed");
	}
	
	@BeforeTest
	public void initData() {
		System.out.println("this is before test");
	}
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
	
	@Test(groups="sn")
	public void checkMail() {
		System.out.println("mail checked");
		Assert.fail("sample fail");

	}
	
	@Test
	public void sendMail() {
		System.out.println("mail Sent");
	}
	
}
