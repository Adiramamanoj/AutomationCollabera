package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextUsingGetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedText= "Please identify yourself";
		WebElement pleaseIdentifyYourself = driver.findElement(By.id("headerContainer"));
		String actualText = pleaseIdentifyYourself.getText();
		System.out.println(actualText);
		if(expectedText.equals(actualText)) {
			System.out.println("Text is Properly Displayed");
		}
		else
		{
			System.out.println("Text Displayed is Error");
		}
		
		String expectedAdminText= "Administrator:";
		WebElement AdminCreditsText = driver.findElement(By.id("adminCredentialsHeader"));
		String actualAdminText = AdminCreditsText.getText();
		System.out.println(actualAdminText);
		if(expectedAdminText.equals(actualAdminText)) {
			System.out.println("Text is Displayed Properly");
		}
		else {
			System.out.println("Text is Not Displayed Properly");
		}
		String expectedManagerYText= "manager";
		WebElement managerText = driver.findElement(By.xpath("//b[text()='manager']"));
		String actualManagerText = managerText.getText();
		System.out.println(actualManagerText);
		if(expectedManagerYText.equals(actualManagerText)) {
			System.out.println("Text Is Displayed Properly");
		}
		else {
			System.out.println("Text is Not Displayed Properly");
		}
		 driver.get("https://www.cricbuzz.com/");
		 String expectedElementTitle= "Live Cricket Score";
		 WebElement webElementTitle = driver.findElement(By.linkText("Live Scores"));
		 String actualElementTitle = webElementTitle.getAttribute("title");
		 System.out.println(actualElementTitle);
		 if(expectedElementTitle.equals(actualElementTitle)) {
			 System.out.println("Element Title is Displayed properly");
		 }
		 else {
			 System.out.println("Element Title is not Displayed Properly");
		 }
	}

}
