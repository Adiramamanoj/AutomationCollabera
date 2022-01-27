package actionsClassMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToKeyUpAndKeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait= new WebDriverWait(driver, 10);
		driver.get("https://myntra.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions= new Actions(driver);
		
		for(WebElement ele: navBarElements) {
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
		driver.switchTo().window(parentWindowId);
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedTitle = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		for(String actualTitle1: allWindowIds) {
			
			driver.switchTo().window(actualTitle1);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle)) {
				
			driver.close();
			break;
		}
		}
	}

}
