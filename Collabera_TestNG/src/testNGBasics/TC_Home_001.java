package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Home_001 {

	@Test(priority = 0, enabled = true)                               // if we dont want to exceute this particular test case use enabled as false 
	public void ZomatoHomePage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		driver.quit();
	}
	
	@Test(priority = -1, invocationCount = 2, threadPoolSize = 4)                      // to run test case for multipule times in parallel
	public void ActiTimeHomePage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.quit();
	}
	
	@Test(priority = 1, invocationCount = 1)                                      // to run test case for multipule times
	public void SkillraryHomePage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		driver.quit();
	}
}
