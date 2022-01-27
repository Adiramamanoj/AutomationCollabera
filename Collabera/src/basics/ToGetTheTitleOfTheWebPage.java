package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);  // to get the title
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);  // for pagesource method
	}

}
