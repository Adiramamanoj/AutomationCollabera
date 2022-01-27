package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterInTextfieldUsingElementLocators {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("ap_email")).sendKeys("adiramamanoj4204@gmail.com");
	}

}
