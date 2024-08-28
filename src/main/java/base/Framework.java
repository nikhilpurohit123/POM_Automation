package base;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework {
	
	
	
	
	public static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome ...");
	
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.navigate().to(appURL);
		return chromedriver;
	}
	
	
	
	public static WebDriver intiDriver(String driver , String url)
	{
		
		try
		{
			WebDriver driver1;
			switch(driver)
			{
			case "chrome": driver1 = initChromeDriver(url);break;
			default: throw new InvalidParameterException("Invalid diver .....! ");
			
			}
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return driver1;
		}catch(Exception e)
		{
			e.getStackTrace();
			return null;
		}
	}

}
