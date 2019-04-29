package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching..........");
	}
	
	@AfterMethod
	
	public void creatingDBCOnn() {
		
		System.out.println("Creating DB Connection");
	}
	
	public void closeDBConn() {
		
		System.out.println("Closing DB Connection");
	}
	public void closeBrowser() {
		
		System.out.println("Closing browser....");
	}
	
	@Test(priority = 1)
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		
	}
	
	@Test(priority = 2, dependsOnMethods="doUserReg")
	public void doLogin() {
		System.out.println("Executing login test");
		
	}

}
