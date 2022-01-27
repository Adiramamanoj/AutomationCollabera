package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseThirdWindowOfNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedWindowTitle = "ICICI";
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if (expectedWindowTitle.equals(actualWindowTitle)) {
				driver.close();
				break;
			}
		}
	}

}
