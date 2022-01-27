package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageTheWebPage {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.swiggy.com/");
         
	}

}
