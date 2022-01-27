package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectLastOptionInDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/vams/Downloads/dropDown.html");
		WebElement categoriesDropdown = driver.findElement(By.id("s1"));
		
		Select select= new Select(categoriesDropdown);
		List<WebElement> allOptions = select.getOptions();
	    select.selectByIndex(allOptions.size()-1);
	}

}
