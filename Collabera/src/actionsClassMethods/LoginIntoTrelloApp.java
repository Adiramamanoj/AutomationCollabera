package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginIntoTrelloApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait= new WebDriverWait(driver, 10);
		driver.get("https://trello.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("adiramamanoj4204@gmail.com");
		
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("ka36n4204");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Adi Rama Venkata Manoj']")).click();
		Actions actions= new Actions(driver);
		Thread.sleep(3000);
		WebElement srcElement = driver.findElement(By.xpath("//h2[text()='Manual Testing']/../..//span[text()='OOPS']"));
		WebElement destElement = driver.findElement(By.xpath("//h2[text()='Java']/../..//a[.='Add a card']"));
		actions.dragAndDrop(srcElement, destElement).perform();
	}

}
