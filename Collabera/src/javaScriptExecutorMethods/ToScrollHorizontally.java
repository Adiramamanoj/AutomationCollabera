package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement elementScroll = driver.findElement(By.linkText("View all companies"));
		
//		for ScrollBy Method
//		js.executeScript("window.scrollBy(0,3000);");
		
//		For ScrollTo Method
//		js.executeScript("window.scrollTo(0,4000);");
		
//      For Scroll Into View Method 
		js.executeScript("arguments[0].scrollIntoView(false);", elementScroll);
	}

}
