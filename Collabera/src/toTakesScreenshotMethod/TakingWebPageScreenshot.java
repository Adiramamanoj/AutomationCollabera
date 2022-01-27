package toTakesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://www.skillrary.com/");
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  File tempFile = ts.getScreenshotAs(OutputType.FILE);
		  System.out.println(tempFile);
		  
		  File destinFile = new File("./errorshots/screenshot1.png");	
		  
		  FileUtils.copyFile(tempFile, destinFile);
		  
		 /* File tempElementFile = driver.findElement(By.xpath("//div[@class='sc-hUfwpO jAOBGr logo']")).getScreenshotAs(OutputType.FILE);   
		  File destElementFile =  new File("./errorshots/screenshotElement1.png");
		  tempElementFile.renameTo(destElementFile);*/
		  }

}
