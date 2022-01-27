package webDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformTheBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		// for To() methods example
		driver.navigate().to("https://getbootstrap.com/");
		URL url = new URL("https://getbootstrap.com/");
		driver.navigate().to(url);
		
	}

}
