package fullScriptForLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScriptForLoginToApp {

	public static void main(String[] args) {
		
//		Step:1  Text Data 
		String testUrl="https://www.instagram.com/";
		String username="manoj_arv";
		String password="ka36n4204@";
		String expectedLoginPage="Instagram";
		String expectedHomePage="Instagram";
		
//		Step:2  Open The Browser And Enter the URL 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser Launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testUrl);
		String actualLoginPage = driver.getTitle();
		if(actualLoginPage.equals(expectedLoginPage)) {
			System.out.println("Login Page Displayed Successfully");
		}
		else {
			System.out.println("Login Page is nit displayed succesfully");
		}
		
//		Step:3  Enter The User-name into User-name Text field 
		WebElement usernameTextfield = driver.findElement(By.name("username"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(username);
		String actualusernameEntered = usernameTextfield.getAttribute("value");
		if(actualusernameEntered.equals(username)) {
			System.out.println("Username is Entered successfully");
		}
		else {
			System.out.println("the Entered Username is Invalid");
		}
		
//		Step:4    Enter the Password into Password Text Field 
		WebElement passwordEntered = driver.findElement(By.name("password"));
		passwordEntered.clear();
		passwordEntered.sendKeys(password);
		String actualPasswordEntered = passwordEntered.getAttribute("value");
		if(actualPasswordEntered.equals(password)) {
			System.out.println("Password is Entered Successfully");
		}
		else {
			System.out.println("Entered Password is Invaild ");
			
		}
		
//		Step:5  Click On The Login Button
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		String actualHomePage = driver.getTitle();
		if(actualHomePage.equals(expectedHomePage)) {
			System.out.println("Home Page is Displayed Successfully");
		}
		else {
			System.out.println("Home Page is Not Displayed Successfully");
		}
	}

}
