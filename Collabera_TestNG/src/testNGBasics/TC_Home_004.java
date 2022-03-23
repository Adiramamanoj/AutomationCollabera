package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Home_004 {
	
	@Test(priority = 0, groups = "Regression Test")
	public void repayLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		driver.quit();
	}
}
