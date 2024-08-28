package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	
	WebDriver driver;
	
	private By logo = By.xpath("//a[@class='logo logo-light text-center']//span[@class='logo-lg']");
	
	
	
	private By  menubtn =By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");
	private By gdrop = By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");
	private By glivepanel = By.xpath("//div[@class='navbar-custom ']//div[2]//a[1]");
	private By gtestpanel = By.xpath("//div[@class='row g-0']//div[1]");
	private By slogo = By.xpath("//img[@class='rounded-circle']");
	private By arrimg = By.xpath("//i[@class='mdi mdi-chevron-down']");
	private By logout = By.xpath("//a[@class='dropdown-item notify-item p-2 bs-2']");
	private By logoutimg = By.xpath("//i[@class='fe-log-out me-1']");
	private By heading = By.xpath("//h4[normalize-space()='Dashboard']");
	
	// this is all blog image in dashbord 
	private By imgA = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
	private By imgR = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
	private By imgF = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]");
	private By imgM = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]");
	
	
	// all this are blog in dasboard
	private By Ann = By.xpath("//p[normalize-space()='Announcements']");
	private By Rom = By.xpath("//p[normalize-space()='Roaming Countries']");
	private By faq = By.xpath("//p[normalize-space()='FAQs']");
	private By man = By.xpath("//p[normalize-space()='Manuals']");
	
   // side nav  links
	private By das = By.xpath("//a[@data-menu-key='dashboards']");
	private By ann = By.xpath("//a[@data-menu-key='announcements']");
	private By poll = By.xpath("//a[@data-menu-key='polls']");
	private By rom = By.xpath("//a[@data-menu-key='roamings']");
	private By faqc = By.xpath("//a[@data-menu-key='faqcategory']");
	private By fqs = By.xpath("//a[@data-menu-key='faq']");
	private By supcat = By.xpath("//a[@data-menu-key='supportcategory']");
	private By sup = By.xpath("//a[@data-menu-key='support']");
	private By mancat = By.xpath("//a[@data-menu-key='manualcategory']");
	private By manu = By.xpath("//a[@data-menu-key='manual']");
	private By shor = By.xpath("//a[@data-menu-key='shortcuts']");
	
	
	// group of side nav
	
	private By grop = By.xpath("//a[@class='side-nav-link-ref side-sub-nav-link side-nav-link']");
	
	
	
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
		
	
	public void click(By d)
	{
		driver.findElement(d).click();
	}
	
	public boolean ghostImg()
	{
		return driver.findElement(logo).isDisplayed();
	}
	
	public void ghostLogoClick()
	{
		driver.findElement(logo).click();
		
	}
	
	public String currurl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean menuVisible()
	{
		return driver.findElement(menubtn).isDisplayed();
	}
	public boolean menuEnable()
	{
		return driver.findElement(menubtn).isEnabled();
	}
	public void clickMenu()
	{
		click(menubtn);
	}
	
	public boolean showNavText()
	{
		return driver.findElement(das).isDisplayed();
	}
	
	
}
