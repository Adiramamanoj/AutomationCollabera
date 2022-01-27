package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrlWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		 String currentUrl=driver.getCurrentUrl();
		 System.out.println(currentUrl);
	}

}
