package webDriverMethod;
//BY WINDOW HANDLES METHOD
// HOW TO SWITCH THE DRIVER CONTROL TO THE PARTICULAR WINDOW
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControlToParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Set<String> allWindowIds= driver.getWindowHandles();
        String expectedWindowTitle="Tech Mahindra";
        for(String windowId :allWindowIds) {
        	driver.switchTo().window(windowId);
        	String actualWindowTitle= driver.getTitle();
        	if(expectedWindowTitle.equals(actualWindowTitle)) {
        		driver.manage().window().maximize();
        		break;
        	}
        }   		
	}
 
}
