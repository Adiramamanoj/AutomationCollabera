package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExmapleforLocatingAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("cb-plus-user-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cb-user-mail")).sendKeys("adiramamanoj4204@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email-otp-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("digit-1")).sendKeys("8");
		driver.findElement(By.id("digit-2")).sendKeys("5");
		driver.findElement(By.id("digit-3")).sendKeys("4");
		driver.findElement(By.id("digit-4")).sendKeys("5");
		driver.findElement(By.id("digit-5")).sendKeys("8");
		driver.findElement(By.id("digit-6")).sendKeys("2");
		driver.findElement(By.id("cb-otp-btn")).click();
	}

}
