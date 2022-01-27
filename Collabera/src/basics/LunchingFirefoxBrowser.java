package basics;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LunchingFirefoxBrowser {

	public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\vams\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("https://getbootstrap.com/");
	  // for Internet Explorer web page driver
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\vams\\Downloads\\IEDriverServer_x64_4.0.0\\iedriverserver.exe");
	  InternetExplorerDriver  driver1=new InternetExplorerDriver();
	}

}
 