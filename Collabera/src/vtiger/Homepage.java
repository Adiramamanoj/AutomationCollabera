package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://localhost:9988/");
	    
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("root");
	    driver.findElement(By.id("submitButton")).click();
	    
	    WebElement moreOptionElement = driver.findElement(By.linkText("More"));
	    Actions actions= new Actions(driver);
	    actions.moveToElement(moreOptionElement).click().perform();
	    driver.findElement(By.linkText("Purchase Order")).click();
	    
	    driver.findElement(By.xpath("//img[@title='Create Purchase Order...']")).click();
	    WebElement statusListBox = driver.findElement(By.name("postatus"));
	    Select select= new Select(statusListBox);
	    select.selectByValue("Approved");
	    
	    
	    driver.findElement(By.xpath("(//span[text()=' Administrator']/../..//td[@class='small'])[1]")).click();
	    driver.findElement(By.linkText("Sign Out")).click();
	    
	}

}
