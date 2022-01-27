package assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMoveTheWindowPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point pointPosition = driver.manage().window().getPosition();
		System.out.println(pointPosition);
		Point pointSetPostion = new Point(100, 50);
		driver.manage().window().setPosition(pointSetPostion);
	}

}
