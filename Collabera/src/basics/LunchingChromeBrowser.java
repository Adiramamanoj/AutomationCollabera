package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepo.LoginPage;

public class LunchingChromeBrowser {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	LoginPage loginPage= new LoginPage(driver);
	loginPage.getUserNameTextField().sendKeys("admin");
	loginPage.getPasswordTextField().sendKeys("manager");
	loginPage.getLoginButton().click();
	
}
}
