package basics;
//   for Instagram
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForLocatingElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		//driver.navigate().back();
		driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("manoj_arv");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("ka36n4204@");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"sqdOP  L3NKy   y3zKF     \"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("svg[aria-label=\"Messenger\"]")).click();
		   
	}

}
