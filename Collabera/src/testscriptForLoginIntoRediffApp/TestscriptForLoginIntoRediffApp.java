package testscriptForLoginIntoRediffApp;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestscriptForLoginIntoRediffApp {

	public static void main(String[] args) throws InterruptedException, NoSuchElementException{
		//		Step:1  Opening The Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		Step:2  Enter The Test URL
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();

		//		Step:3  Enter Username into Username Text Field
		WebElement usernameTextField = driver.findElement(By.id("login1"));
		usernameTextField.clear();
		usernameTextField.sendKeys("adiramTY@rediffmail.com");

		//		Step:4  Enter Password Into Password Text Field
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Ka36n4204@");

		//   	Step:5	Enter The Sign In Button
		driver.findElement(By.name("proceed")).click();

		//	Step:6	 To Click on the Write Mail Option
		Thread.sleep(2000);
		driver.findElement(By.linkText("Write mail")).click();

		//	Step:7	 Enter The To Email Address in To Text Field
		WebElement emailEntered = driver.findElement(By.id("TO_IDcmp2"));
		emailEntered.clear();
		emailEntered.sendKeys("adiramTY@rediffmail.com", Keys.ENTER);

		//	Step:8	 Enter the Subject Email Address into Subject Text Field
		WebElement subjectEntered = driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']"));
		subjectEntered.clear();
		subjectEntered.sendKeys("Adi Rama Venkata Manoj");

		//	Step:9	 Enter The Body Into Text Area 
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(frameElement);
		WebElement bodyTextEntered = driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
		bodyTextEntered.clear();
		bodyTextEntered.sendKeys("Hi Sir, Gud Afternoon");
		driver.switchTo().defaultContent();

		//	Step:10	 Click on the Send Button
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(2000);

		//	Step:11	 To Click On The Check Box
		for(;;) {
			try {
				driver.findElement(By.xpath("//li[@subject='Adi Rama Venkata Manoj']/..//cite[@title='Select mail']")).click();

				//	Step:12	 To Delete The Mail Sent
				driver.findElement(By.xpath("//span[text()='Delete']/../../../..//span[@class='rd_fil_del']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}
			catch(NoSuchElementException e) {
				((WebDriver) e).navigate().refresh();
			}
		} 

	}

}
