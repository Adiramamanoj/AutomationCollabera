package webElementMethods;
// to copy paste the username to password using enum properies interview question
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://twitter.com/");
	Thread.sleep(3000);
	WebElement signUpButton= driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a/div"));
	signUpButton.click();
	Thread.sleep(2000);
	WebElement usernameTextField = driver.findElement(By.name("Name"));
	usernameTextField.clear();
	usernameTextField.sendKeys("Adi Rama Venkata Manoj",Keys.CONTROL+"a");
	usernameTextField.sendKeys(Keys.CONTROL+"c");
	
	/*usernameTextField.sendKeys("manoj_arv", Keys.CONTROL+"a");
	Thread.sleep(2000);
	usernameTextField.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(2000);
	WebElement passwordTextField = driver.findElement(By.name("password"));
	passwordTextField.clear();
	Thread.sleep(2000);
	passwordTextField.sendKeys(Keys.CONTROL+"v");*/
	
}
}
