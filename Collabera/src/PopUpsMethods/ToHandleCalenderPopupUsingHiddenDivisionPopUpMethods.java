package PopUpsMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalenderPopupUsingHiddenDivisionPopUpMethods {

	public static void main(String[] args) throws AWTException {
		// Reading System Date And Time By Java Methods
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		String month = ldt.getMonth().name();
		String monthFormat = "Jan";
		month = month.substring(0, 1).toUpperCase() + month.substring(1, month.length()).toLowerCase();
		String month1 = month.replaceAll(month, monthFormat);
		int year = ldt.getYear();
		int days = ldt.getDayOfYear();

		// Step:1 To Open The Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step:2 Open The Given URL
		driver.get("https://in.via.com/");

		// Step:3 Handling The Hidden Division PopUp
		driver.findElement(By.id("wzrk-cancel")).click();

		// Step:4 To Click on the Departure Calendar Pop-up
		driver.findElement(By.id("departure")).click();

		/*
		 * For Selecting a date randomly 
		 * driver.findElement(By.xpath("//span[@class='vc-month-box-head-cell vc-month-controls icon-Rightarrowthin vc-month-control-active js-next-month']")).click();
		 * driver.findElement(By.xpath("(//span[.='Feb 2022']/../..//div[text()='18']").click();
		 */

		/*
		 * Selecting Todays Date Always By Reading System Date and Time
		 * driver.findElement(By.xpath("//span[@class='vc-month-box-head-cell vc-month-controls icon-Rightarrowthin vc-month-control-active js-next-month']")).click(); 
		 * driver.findElement(By.xpath("//span[.='"+month1+" "+year+"']/../..//div[text()='"+days+"']")).click();
		 */

                //  Step:5  To Select The Date For One year From Now  
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[.='" + month1 + " " + year + "']/../..//div[text()='" + days+"']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@class='vc-month-box-head-cell vc-month-controls icon-Rightarrowthin vc-month-control-active js-next-month']")).click();

			}
			
		}
//         Robot robot= new Robot();
//         robot.keyPress(KeyEvent.VK_ALT);
//         robot.keyRelease(KeyEvent.VK_ALT);
	}

}
