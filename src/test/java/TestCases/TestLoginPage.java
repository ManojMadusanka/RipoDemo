package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoard;
import Pages.Login;

public class TestLoginPage extends TestBase {

	 Login lgpage;
	 DashBoard hmpage;
	public TestLoginPage() {
    super();
}
@BeforeMethod
public void Setup() {
	Initialization();
	lgpage=new Login();
	
}

@Test(priority=1)
public void testDashBoard() {
	
	hmpage=lgpage.logIn(prop.getProperty("uid"), prop.getProperty("pwd"));
}

@AfterMethod
public void TearDown()throws InterruptedException {
driver.quit();
}
	
}
