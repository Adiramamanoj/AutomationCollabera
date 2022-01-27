package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleUrlPagesourceOfTheFlipcartWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String flipkartTitle = driver.getTitle();
		System.out.println(flipkartTitle);
		String flipkartUrl = driver.getCurrentUrl();
		System.out.println(flipkartUrl);
		String flipkartPagesource = driver.getPageSource();
		System.out.println(flipkartPagesource);
	}

}
