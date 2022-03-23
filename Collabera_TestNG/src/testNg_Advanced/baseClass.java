package testNg_Advanced;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepo.HomePage;
import pomRepo.LoginPage;

public class baseClass {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		 driver= new ChromeDriver();
		Reporter.log("Browser is launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://demo.actitime.com/login.do");
		 lp= new LoginPage(driver);
		lp.loginToApp("admin", "manager");
		String expectedHomePageTitle= "actiTIME - Enter Time-Track";
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equalsIgnoreCase(expectedHomePageTitle)) {
			Reporter.log("Login in to application successfully", true);
		}
		else {
			Reporter.log("Login has Failed", true);
		}
	}
	
	@AfterMethod
	public void afterMethod() {
		 hp= new HomePage(driver);
		hp.getUserLogoutButton().click();
		String expectedLoginPageTitle="actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equalsIgnoreCase(expectedLoginPageTitle)) {
			Reporter.log("Logged out successfully from application",true);
		}
		else {
			Reporter.log("Login has Failed",true);
		}
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		Reporter.log("Browser is successfully Closed");
	}
}











