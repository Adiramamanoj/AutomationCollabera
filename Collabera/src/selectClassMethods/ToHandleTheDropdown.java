package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleTheDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805955&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9062077%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAoY-PBhCNARIsABcz772mgc1jiVgYEZiHoGybV71Y9IRieSxGnhjfomzoBO3JLhDM_dYTcnAaAjnBEALw_wcB");
	    WebElement dayListBox = driver.findElement(By.id("day"));
	    WebElement monthListBox = driver.findElement(By.id("month"));
	    WebElement yearListBox = driver.findElement(By.id("year"));
	    
	    
//	    Step:1  For Day Dropdown
	    
	    Select select = new Select(dayListBox);
	    System.out.println(select.isMultiple());
	    List<WebElement> daylistBoxOptions = select.getOptions();
	    for(WebElement ele: daylistBoxOptions) {
	    	System.out.println(ele.getText());
	    }
	    
	    
//	    Step:2 For month Dropdown
	    
	    Select select1 = new Select(monthListBox);
	    System.out.println(select1.isMultiple());
	    List<WebElement> monthListBoxoptions = select.getOptions();
	    for(WebElement ele1: monthListBoxoptions) {
	    	System.out.println(ele1.getText());
	    }
	    
	    
	    
//	    Step:3 For Year Dropdown
	    
	    Select select2= new Select(yearListBox);
	    System.out.println(select2.isMultiple());
	    List<WebElement> yearListBoxOptions = select.getOptions();
	    for(WebElement ele2: yearListBoxOptions) {
	    	System.out.println(ele2.getText());
	    }
	    
	    
	    
	    }

}
