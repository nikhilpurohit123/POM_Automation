package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	
	WebDriver driver;
	
	private By logo = By.xpath("//a[@class='logo logo-light text-center']//span[@class='logo-lg']");	
	private By  menubtn =By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");	
	private By glivepanel = By.xpath("//div[@class='navbar-custom ']//div[2]//a[1]");
	private By gtestpanel = By.xpath("//div[@class='row g-0']//div[1]");
	private By inlogoimg = By.xpath("//i[@class='fe-log-out me-1']");// in logout link near logo 
	private By arrimg = By.xpath("//i[@class='mdi mdi-chevron-down']");// near arrow of ghost icon 
	private By logout = By.xpath("//a[@class='dropdown-item notify-item p-2 bs-2']");// real logout link 
	private By logoutimg = By.xpath("//img[@class='rounded-circle']");// small ghost logo in logout
	private By heading = By.xpath("//h4[normalize-space()='Dashboard']");
	private By logoutlink = By.xpath("//a[@id='dropdown-profile']"); // logout image link of small ghost icon         

	private By cat = By.xpath("//a[@id='dropdown-apps']");// category icon 
	
	private By foot = By.xpath("//div[@class='col-md-6']");
	private By glink= By.xpath("//a[normalize-space()='Ghost']");
	
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
	
	
	// blog conatainns the count number in it
	private By anncount = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
	private By roaming = By.xpath( "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
	private By faqs = By.xpath(    "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
	private By manual = By.xpath(  "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
	
	
	
	
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
	
	
	public void selectTestPannel()
	{
		click(gtestpanel);	
	}
	
	public void selectLivePannel()
	{
		click(gtestpanel);
	}
	public void back()
	{
		driver.navigate().back();
	}
	
	
	public boolean roundlogimg()// small round ghost logo
	{
		 return driver.findElement(logoutimg).isDisplayed();
		
	}
	public void roundloginClick()
	{
		click(logoutimg);
	}
	
	public boolean logimgEna()// small round ghost logo
	{
		 return driver.findElement(logoutimg).isEnabled();
		
	}
	
	
	public boolean categoryimg()// test pannel cantain  image
	{
		return driver.findElement(cat).isDisplayed();	
		
	}
	
	public boolean catimgEnabled()// test pannel cantain  image uper logo
	{
		return driver.findElement(cat).isEnabled();
		
	}
	
	
	public void clickLogout() 
	{
		click(logoutlink);		
		click(logout);
		
	}
	
	
	public boolean logoutImg()// in logout block image 
	{
		return driver.findElement(inlogoimg).isDisplayed();
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public String returntxt(By d)
	{
		return driver.findElement(d).getText();
	}
	
	
	
	public String getAnnTxt()
	{
		return returntxt(Ann);
	}
	
	public String getRomTxt()
	{
		return returntxt(Rom);
	}
	
	public String getFaqTxt()
	{
		return returntxt(faq);
		
	}
	
	public String getmanTxt()
	{
		
		return returntxt(man);
	}
	
	
	 
	public boolean  annImgVisible()
	{
		return driver.findElement(imgA).isDisplayed();
		
	}
	
	public boolean romImgVisible()
	{
		return driver.findElement(imgR).isDisplayed();
	}
	
	public boolean faqImgVisible()
	{
		return driver.findElement(imgF).isDisplayed();
	}
		
	public boolean manImgVisible()
	{
		return driver.findElement(imgM).isDisplayed();
	}
	
	

	
	public String headingTxt()
	{
		return driver.findElement(heading).getText();
	}
	
	public String footTxt()
	{
		return driver.findElement(foot).getText();
	}
	
	public boolean ghostFootLink()
	{
		return driver.findElement(glink).isDisplayed();
	}
	
	
////////////////////////////////////////////////////////////////////////////////////
	
	public String annCount()
	{
		return driver.findElement(anncount).getText();
	}
	
	public String ramCount()
	{
		return driver.findElement(roaming).getText();
	}
	
	public String faqCount()
	{
		return driver.findElement(faqs).getText();
	}
	
	public String manCount()
	{
		return driver.findElement(manual).getText();
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
	// to check the count of pacticuler blog with the page
	
	public String  countIteamOfAnnouncement()
	{
			
			return  driver.findElement(anncount).getText();
	}
		
	
	public String  countIteamOfRoaming()
	{
			
			return  driver.findElement(roaming).getText();
	}
	
	public String  countIteamOfFaqs()
	{
			
			return  driver.findElement(faqs).getText();
	}
	
	public String  countIteamOfManual()
	{
			
			return  driver.findElement(manual).getText();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	
	
	
	
/////////////////////////////////////
	
	public String  sideNavTxt()
	{
		String a[] = {"das","ann","poll","rom","faqc","fqs","supcat","sup","mancat","manu","shor"};
		
		for(String b:a)
		{
			switch(b)
			{
			case "das": return dasTxt();
			case "ann": return annTxt();
			case "poll": return pollTxt();
			case "rom": return romTxt();
			case "faqc":return faqcTxt();
			case "fqs":return fasTxt();
			case "supcat": return subcatTxt();
			case "sup":return subTxt();
			case "mancat":return mancat();
			case "manu": return man();
			case "shor":return shorTxt();
			default: System.out.print("invalid data ...!");
			
			
			}
			
		}
		return null;
		 
		
		
	}
	
	
	
	
	public String dasTxt()
	{
		return driver.findElement(das).getText();
	}
	
	
	public String annTxt()
	{
		return driver.findElement(ann).getText();
	}
	
	public String pollTxt()
	{
		return driver.findElement(poll).getText();
	}
	
	public String romTxt()
	{
		return driver.findElement(rom).getText();
	}
	
	public String faqcTxt()
	{
		return driver.findElement(faqc).getText();
	}
	
	public String fasTxt()
	{
		return driver.findElement(fqs).getText();
	}
	
	public String subcatTxt()
	{
		return driver.findElement(supcat).getText();
	}
	
	public String subTxt()
	{
		return driver.findElement(sup).getText();
	}
	
	public String mancat()
	{
		return driver.findElement(mancat).getText();
	}
	
	public String man()
	{
		return driver.findElement(manu).getText();
	}
	
	public String shorTxt()
	{
		return driver.findElement(shor).getText();
	}
}
	
	

