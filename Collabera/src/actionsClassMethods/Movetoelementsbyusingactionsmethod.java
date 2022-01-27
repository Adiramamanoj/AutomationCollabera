package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelementsbyusingactionsmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		WebElement beautyElement = driver.findElement(By.linkText("BEAUTY"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(beautyElement).perform();
		driver.findElement(By.linkText("Hair Serum")).click();
		
	}

}
