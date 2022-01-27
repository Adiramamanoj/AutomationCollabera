package makeMyTripAssignment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripAssgn {

	public static void main(String[] args) {
		LocalDateTime ldt= LocalDateTime.now();
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		Actions actions= new Actions(driver);
		actions.click().perform();

		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		actions.click().perform();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New Delhi,India");
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();

		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
		actions.click().perform();
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		List<WebElement> flightDepatureTimeList = driver.findElements(By.xpath("//span[text()='Departure']/../../../../../..//div[@class='listingCard']"));
		for(WebElement ele: flightDepatureTimeList) {
			System.out.print(ele.getText());
			System.out.println(ele.getText());
		}

	}

}
