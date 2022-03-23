package testNg_Advanced;

import org.testng.annotations.Test;

import pomRepo.HomePage;


public class TC_Loans_100 extends baseClass{

	
	@Test
	public void actiTimeApp() {
		HomePage hp= new HomePage(driver);
		hp.getTasksModulelink().click();
	}
}
