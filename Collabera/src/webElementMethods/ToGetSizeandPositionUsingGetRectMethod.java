package webElementMethods;
// System Compatibility Check
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeandPositionUsingGetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Rectangle emailIdTextField = driver.findElement(By.id("email")).getRect();
		System.out.println(emailIdTextField.x);
		
		System.out.println(emailIdTextField.y);
		Rectangle passwardTextField = driver.findElement(By.id("passContainer")).getRect();
		System.out.println(passwardTextField.x);
		System.out.println(passwardTextField.y);
	}

}
