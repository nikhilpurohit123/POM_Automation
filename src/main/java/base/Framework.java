package base;

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

}
