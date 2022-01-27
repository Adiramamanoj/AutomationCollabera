package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForLocatingElementUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Job of SRE in IT']")).click();
	}
}
