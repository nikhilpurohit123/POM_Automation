package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utility.Constant;
public class TestBase {

	public WebDriver driver;

	
	
	
	
	@BeforeSuite
    public void setup()
    {
		
		  driver = new ChromeDriver(); driver.get(Constant.BASE_URL);
		  driver.manage().window().maximize();
		 
		
		
		//Framework.intiDriver("chrome", Constant.BASE_URL);
	 
		System.out.print(" WeDriver Insilizer ");
   }
	
	
	
	
	
	
	@AfterSuite
	public void close()
	{
		System.out.print("close the browser ");
		driver.close();
		driver.quit();
		
	}
	
		
}
