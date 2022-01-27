package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheWindowId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String >allWindowIds= driver.getWindowHandles();// its a generic method so we using string of setcollection( properties like it will not maintain order and it will not accept duplicate 
		for(String windowIds:allWindowIds) {
			System.out.println(windowIds);
		}
	}

}
