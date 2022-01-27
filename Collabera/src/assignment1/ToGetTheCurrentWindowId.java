package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCurrentWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentWindowTitle = driver.getTitle();
		System.out.println(currentWindowTitle);
	}

}
