package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheWindowTitlesOfBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentWindowTitle = driver.getTitle();
		System.out.println(parentWindowTitle);
		String parentTitle = driver.getWindowHandle();
		Set<String> allWindowsTitles = driver.getWindowHandles();
		allWindowsTitles.remove(parentTitle);
		for (String childTitles : allWindowsTitles) {
			driver.switchTo().window(childTitles);
			String childWindowTitles = driver.getTitle();
			System.out.println(childWindowTitles);
		}
	}

}
