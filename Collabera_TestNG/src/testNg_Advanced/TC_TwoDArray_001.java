package testNg_Advanced;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class TC_TwoDArray_001 {

		@DataProvider 
		public String[][] credintials(){
			String [][] arr= {
					             {"admin", "manager"},
					             {"trainee", "trainee"}
		                     };
			return arr;
		}
		
		
		
		
		@Test(dataProvider = "credintials")
		public void searchproducts(String[] data) {
			System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			
			driver.findElement(By.id("username")).sendKeys(data [0]);
			driver.findElement(By.id("pwd")).sendKeys(data [1]);
			driver.findElement(By.id("loginButton")).click();
			driver.quit();
		}
	}
