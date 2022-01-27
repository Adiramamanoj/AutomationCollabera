package flipkartAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddAndRemoveProductsUsingWebElementMethods {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.linkText("Login")).click();

		WebElement emailIdTextField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailIdTextField.clear();
		emailIdTextField.sendKeys("9108945970");
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Ka36n4204@");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.clear();
		searchTextField.sendKeys("Iphone13 Pro Max",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Silver, 512 GB)']")).click();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String productWindowId: allWindowIds) {
			driver.switchTo().window(productWindowId);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("realme mobiles");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Black, 64 GB)']")).click();
		
		String product1WindowId = driver.getWindowHandle();
		Set<String> allWindowIds2 = driver.getWindowHandles();
		allWindowIds2.remove(product1WindowId);
		allWindowIds2.remove(parentWindowId);
		for(String product2WindowId: allWindowIds2) {
			driver.switchTo().window(product2WindowId);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("redmi mobile");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[text()='REDMI 9i (Sea Blue, 64 GB)']")).click();
		String product2WindowId = driver.getWindowHandle();
		Set<String> allWindowIds3 = driver.getWindowHandles();
		allWindowIds3.remove(product2WindowId);
		allWindowIds3.remove(product1WindowId);
		allWindowIds3.remove(parentWindowId);
		for(String product3WindowId: allWindowIds3) {
			driver.switchTo().window(product3WindowId);
//			WebDriverWait explicictWait = new WebDriverWait(driver, 10);
//			explicictWait.until(ExpectedConditions.visibilityOf(searchTextField)).click();
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
	}

}
