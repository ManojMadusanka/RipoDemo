package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoard extends TestBase{
	
   StudentAffairs studentAffairsPage;
   Login loginPage;
	
	@FindBy(xpath="//a[@title='Support Services']")
	WebElement mnuSupportServices;
	
	@FindBy(xpath="//a[@title='Student Affairs']")
	WebElement drpStudentAffairs;
	
	public DashBoard()
	{
    PageFactory.initElements(driver, this);	
    }
	
	public void clickStudentAffairsLink() {
		Actions action=new Actions(driver);
		action.moveToElement(mnuSupportServices).build().perform();
		drpStudentAffairs.click();
		
		}
	
}
