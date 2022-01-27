package synchronizationMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForImplicitWaitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	    WebDriverWait explicictWait = new WebDriverWait(driver, 10);
//		FluentWait fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(300, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		          
		driver.get("https://www.instagram.com/");
//		explicictWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("manoj_arv");
	}

}
