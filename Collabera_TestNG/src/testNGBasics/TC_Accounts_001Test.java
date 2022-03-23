package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_001Test {
	
	
	@Test(timeOut = 10000, dependsOnGroups = {"Smoke Test", "Regression Test"})
	public void modifyAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipcart.com/");
		driver.quit();
	}
}
