package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for (String childWindowId : allWindowIds) {
			driver.switchTo().window(childWindowId);
			driver.close();
		}

	}
 
}
