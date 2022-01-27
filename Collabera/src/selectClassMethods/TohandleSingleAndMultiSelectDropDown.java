package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandleSingleAndMultiSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/vams/Downloads/dropDown.html");
//	    List<WebElement> listBoxOptions = driver.findElements(By.id("m1"));
//	    for(WebElement ele: listBoxOptions) {
//	    	System.out.println(ele.getText());
//	    }
		
//		Step:1 For Single Select Drop-Down
		WebElement s1ListBox = driver.findElement(By.id("s1"));
		Select select1=new Select(s1ListBox);
		System.out.println(select1.isMultiple());
		select1.selectByIndex(0);		
		
		select1.selectByValue("4");
		
		select1.selectByVisibleText("Java");
		
		
//		Step:2  For Multi-select Drop-Down
		WebElement listBoxElements = driver.findElement(By.id("m1"));
		Select select= new Select(listBoxElements);
		System.out.println(select.isMultiple());
		select.selectByIndex(0);
		
		select.selectByValue("3");
		
		select.selectByVisibleText("Mango");
	}

}
