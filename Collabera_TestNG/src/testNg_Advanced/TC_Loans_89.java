package testNg_Advanced;

import org.junit.AfterClass;
import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_Loans_89 {
	
//	@BeforeSuite
//	public void accountDetails() {
//		Reporter.log("Beforesuite the Suite level log ", true);
//	}
//	@BeforeTest
//	public void userNameDetails() {
//		Reporter.log("Beforetest the Test Level log", true);
//	}
	@BeforeClass
	public void passwordDetails() {
		Reporter.log("Beforeclass the Test Level log", true);

	}
	@BeforeMethod
	public void loginDetails() {
		Reporter.log("Beforemethod the Test Level log", true);

	}
	@Test
	public void myAccountSetting() {
		Reporter.log(" At The Test Level log", true);

	}
	@Test
	public void personalDetails() {
		Reporter.log("At the second Test Level log", true);

	}
	@Test
	public void myDetails() {
		Reporter.log("jhgfjhdrfgj");
	}
	@AfterMethod
	public void logoutDetails() {
		Reporter.log("Aftermethod the Test Level log", true);

	}
	@AfterClass
	public void signUpDetails() {
		Reporter.log("AfterClass the Test Level log", true);

	}
//	@AfterTest
//	public void applicationDetails() {
//		Reporter.log("AfterTest the Test Level log", true);
//
//	}
}
