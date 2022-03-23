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
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addTaskButtonId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Select Customer and Project to Add Tasks for']/..//div[@class='dropdownButton'])[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Galaxy Corporation']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Select Customer and Project to Add Tasks for']/..//div[@class='dropdownButton'])[2]")).click();
	}

}
