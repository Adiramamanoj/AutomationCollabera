package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingIdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Adi Rama Venkata Manoj");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("ka36n4204");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}

}
