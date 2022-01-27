package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleOnlyMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/vams/Downloads/dropDown.html");
		
		WebElement m1ListBox = driver.findElement(By.id("m1"));
		Select select= new Select(m1ListBox);
//		for Selecting The Options In Drop-Down
		System.out.println(select.isMultiple());
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("4");
		Thread.sleep(2000);
		select.selectByVisibleText("Apple");
		
//		For De-selecting The Options In Drop-Down
		select.deselectByIndex(1);
		Thread.sleep(2000);
		select.deselectByValue("4");
		Thread.sleep(2000);
		select.deselectByVisibleText("Apple");
		
		//select.deselectAll();
	}

}
