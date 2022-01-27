package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
//		driver.close();  IT IS FOR CLOSING PARENT WEB PAGE
		/*Set<String> allWindowIds= driver.getWindowHandles();
		String expectedParentPageTitle="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		for(String windowId: allWindowIds) {
			driver.switchTo().window(windowId);
			String actualParentPage= driver.getTitle();                1ST METHOD FOR CLOSING CHILD WINDOWS
			if(!expectedParentPageTitle.equals(actualParentPage)) {
				driver.close();
			}
			
		}*/
		
		String ParentWindowId= driver.getWindowHandle();
		Set<String> allWindowsIds= driver.getWindowHandles();
		allWindowsIds.remove(ParentWindowId);
		for(String windowId:allWindowsIds) {               // FOR MORE OPTIMIZATION WE WILL USE THS CODING 
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(ParentWindowId);
       driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Mechanical");
	}

}
