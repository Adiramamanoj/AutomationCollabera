package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheSizeOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		Dimension dimension = driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width= dimension.getWidth();
		System.out.println("height: "+height+ "and width: "+width);
	}

}
