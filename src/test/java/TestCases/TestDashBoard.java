package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoard;
import Pages.Login;
import Pages.StudentAffairs;

public class TestDashBoard extends TestBase {
	
	Login lgPage;
	DashBoard dshbrdPage;
	StudentAffairs studentAffiresPage;
	
	
	public TestDashBoard()
	{
        super();
    }

	@BeforeMethod
	public void Setup() {
		Initialization();
		lgPage=new Login();
		dshbrdPage=new DashBoard();
		dshbrdPage=lgPage.logIn(prop.getProperty("uid"),prop.getProperty("pwd"));
		
	}
	@Test(priority=1)
	public void ClickStdMenue() {
		dshbrdPage.clickStudentAffairsLink();
		
	}
	
	
	@AfterMethod
	public void Quit() {
		driver.quit();
	}
}
