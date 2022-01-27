package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetHeightAndWidthOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		Dimension dimension=new Dimension(1240,850);
		driver.manage().window().setSize(dimension);
	}

}
 