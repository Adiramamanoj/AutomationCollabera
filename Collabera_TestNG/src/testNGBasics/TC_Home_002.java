package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Home_002 {

	
	@Test(priority = 1, timeOut = 2000)
	public void createLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.quit();
	}
	
	
	
	@Test(priority = -1, dependsOnMethods = "createLoan")
	public void modifyLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bookmyshow.com/");
		driver.quit();
	}
	
	@Test(priority = 2, dependsOnMethods = "createLoan")
	public void repayLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.twitter.com/");
		int i= 1/0;
		driver.quit();
	}
	@Test(priority = 0, dependsOnMethods = "repayLoan")
	public void deleteLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.quit();
	}
}
