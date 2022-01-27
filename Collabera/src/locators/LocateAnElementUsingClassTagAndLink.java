package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingClassTagAndLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("RamManoj");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("ka36n4204");
		Thread.sleep(2000);
//		using Link-Text method
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		// using partial Link-Text method 
		driver.findElement(By.partialLinkText("Forgot ")).click();
	}

}
