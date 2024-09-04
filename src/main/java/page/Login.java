package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;




	private By uname = By.xpath("//input[@id='username']");
	private By pass = By.xpath("//input[@id='password']");
	private By clickLogin = By.xpath("//button[normalize-space()='Log In']");
	private By userlabel = By.xpath("//label[normalize-space()='Username']");
	private By passlabel = By.xpath("//label[normalize-space()='Password']");
	private By errorbox = By.xpath("//div[@role='alert']");
	private By uerror = By.xpath("//div[@class='invalid-feedback']");
	private By perror = By.xpath("//div[@class='d-block invalid-feedback']");
	private By imglogo = By.xpath("//a[@class='logo logo-dark text-center']//img");
	private By forgotLink = By.xpath("//a[normalize-space()='Forgot your password?']");
//	private By backtologin  = By.xpath("//div[@class='mt-3 row']//p[1]");












	// inlized the web driver 
	public Login(WebDriver driver)
	{
		this.driver = driver;

	}

	// for click a specific elenement
	public void click(By element)
	{
		driver.findElement(element).click();
	}
	
	// for get txt value of element 
	public String getTextEl(By elemenet)
	{
		return driver.findElement(elemenet).getText();
	}
	

	public boolean userfield()
	{
		return driver.findElement(uname).isDisplayed();
	}

	public boolean passField()
	{
		return driver.findElement(pass).isDisplayed();
	}
	
	
	public boolean buttonPre()
	{
		return driver.findElement(clickLogin).isDisplayed();
	}
	
	
	public void enterUserName(String username)
	{

		driver.findElement(uname).sendKeys(username);
	}


	public void enterPassword(String password)
	{
		driver.findElement(pass).sendKeys(password);

	}

	public void clickLoginbtn()
	{
		click(clickLogin);

	}

	public void cleanuserField()
	{

		driver.findElement(uname).clear();

	}

	public void cleanpassField()
	{

		driver.findElement(pass).clear();

	}


	// clean both field
	public void cleanbothfield()
	{

		cleanuserField();
		cleanpassField();
	}

	//return the user field text  
	public String userfieldTxt()
	{

		return  driver.findElement(uname).getAttribute("placeholder");

	}

	public String userLabel()
	{
		return getTextEl(userlabel);

	}

	public String passwordFieldTxt()
	{
		return driver.findElement(pass).getAttribute("placeholder");
	}

	public String passLabel()
	{
		return getTextEl(passlabel);

	}

	public String alertError()
	{
		return getTextEl(errorbox);
	}

	public String errorUserWithoutData()
	{
		return getTextEl(uerror);
	}

	public String errorpassWithoutData()
	{
		return getTextEl(perror);
	}

	public void clickOnlogo()
	{
		click(imglogo);		

	}

	public void refresh()
	{
		driver.navigate().refresh();
	}

	public String forgotLinkTxt()
	{
		return getTextEl(forgotLink);

	}

	public boolean forgotLink()
	{
		return driver.findElement(forgotLink).isDisplayed();
	}

	public boolean EnableforgotLink()
	{
		return driver.findElement(forgotLink).isEnabled();

	}

	public void clickForgotLink()
	{
		click(forgotLink);
	}

	public String currentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	// not give responce
	public boolean errorDispaly()
	{
		
		return driver.findElement(uerror).isDisplayed() ;

	}

	public void back()
	{
		driver.navigate().back();
	}
	
	
	public String btntxt()
	{
		return getTextEl(clickLogin);
	}

	public  boolean btnEnabled()
	{

		return driver.findElement(clickLogin).isEnabled();
	}

	public boolean btnSelected()
	{
		return driver.findElement(clickLogin).isSelected();
	}
	
	public String inuserFormat(String format)
	{
		return driver.findElement(uname).getAttribute(format);
	}

	public String inupassFormat(String format)
	{
		return driver.findElement(pass).getAttribute(format);
	}

}




