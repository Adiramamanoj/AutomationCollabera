package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeOfTheWindowBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension dimensionsize = driver.manage().window().getSize();
		System.out.println(dimensionsize);
		Thread.sleep(2000);
		Dimension dimensionSetSize = new Dimension(100, 200);
		driver.manage().window().setSize(dimensionSetSize);
	}

}
