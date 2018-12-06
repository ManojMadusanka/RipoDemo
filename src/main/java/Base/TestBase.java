package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream input=new FileInputStream("C:\\Users\\pissu_hadei\\eclipse-workspace\\TestAutomate\\src\\main\\java\\Config\\config.properties");
		    prop.load(input);
		    
		} 
		catch (Exception e) {
			
			
		}
		
	}	
	
	public static void Initialization() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));	
		
	}
	
	
	
}



