package testNg_Advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Support_001 {

	@DataProvider(parallel = true)
	public String[] sendMobileInfo(){
	 Workbook workbook= null;
	try {
		FileInputStream fis= new FileInputStream("./testresources/testData.xlsx");
		workbook= WorkbookFactory.create(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	Sheet dataSheet = workbook.getSheet("sheet1");
	int rowCount = dataSheet.getPhysicalNumberOfRows();
//	By Using New Keyword
	
	String[] arr= new String[rowCount];
	for(int i=0; i<rowCount;i++) {
		arr[i]=dataSheet.getRow(i).getCell(0).getStringCellValue();
	}
	return arr;
	
	 
		
//		By directly intializing and declaring the array
//		String[] arr= {"iphone", "poco", "redmi", "onePlus"};
//		return arr;
		
	}
	
	
	
	
	
	@Test(dataProvider = "sendMobileInfo")
	public void searchproducts(String mobileName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName, Keys.ENTER);
		driver.quit();
	}
}
