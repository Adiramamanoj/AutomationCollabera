package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemCompatibilityCheckMethod {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  WebElement uTF = driver.findElement(By.id("email"));
	  WebElement pTF = driver.findElement(By.id("passContainer"));
	  Rectangle userNameRect = uTF.getRect();
	  Rectangle passwardRect = pTF.getRect();
	  int yLocOfusername = userNameRect.getY();
	  int heightOfUsername = userNameRect.getHeight();
	  final int SPACE =5;
	  int yLocOfPassward = passwardRect.getY();
	  if(yLocOfusername+ heightOfUsername+ SPACE<= yLocOfPassward) {
		  System.out.println("It is Not Clashing");
	  }
	  else {
		  System.out.println("It is Overlapping");
	  }
	}

}
