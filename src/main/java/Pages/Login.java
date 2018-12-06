package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Login extends TestBase {

    public static DashBoard dashBoard;
	@FindBy(xpath="//input[@id='inputName']")
	WebElement txtUid;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement txtPwd;
/*	
	@FindBy(xpath="//button[@id='submit']")
	WebElement btnLogIn;
	*/
	 public Login() {
		PageFactory.initElements(driver, this);
	}
	
	 public DashBoard logIn(String Uid,String Pwd) 
	 {
		 		 
		 txtUid.sendKeys(prop.getProperty("uid"));
		 txtUid.sendKeys(prop.getProperty("pwd"));
       //  btnLogIn.click();
		 return new DashBoard();
		 
	 }
	 
	 

}
