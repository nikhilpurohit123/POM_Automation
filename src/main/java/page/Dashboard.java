package page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	
	WebDriver driver;
	
	
	
	// locater 	
	private By logo = By.xpath("//a[@class='logo logo-light text-center']//span[@class='logo-lg']");	
	private By  menubtn =By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");	
//	private By glivepanel = By.xpath("//div[@class='navbar-custom ']//div[2]//a[1]");
	private By gtestpanel = By.xpath("//div[@class='row g-0']//div[1]");
	private By inlogoimg = By.xpath("//i[@class='fe-log-out me-1']");// in logout link near logo 
//	private By arrimg = By.xpath("//i[@class='mdi mdi-chevron-down']");// near arrow of ghost icon 
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
	

	
	// link images
	
	private By dimg = By.xpath("//a[@data-menu-key='dashboards']//*[name()='svg']");
	private By aimg = By.xpath("//a[@data-menu-key='announcements']//*[name()='svg']");
	private By pimg = By.xpath("//a[@data-menu-key='polls']//*[name()='svg']");
	private By rimg = By.xpath("//a[@data-menu-key='roamings']//*[name()='svg']");
	private By facimg = By.xpath("//a[@data-menu-key='faqcategory']//*[name()='svg']");
	private By fqsimg = By.xpath("//a[@data-menu-key='faq']//*[name()='svg']");
	private By simg = By.xpath("//a[@data-menu-key='supportcategory']//*[name()='svg']");
	private By supimg = By.xpath("//a[@data-menu-key='support']//*[name()='svg']");
	private By manimg = By.xpath("//a[@data-menu-key='manualcategory']//*[name()='svg']");
	private By mimg = By.xpath("//a[@data-menu-key='manual']//*[name()='svg']");
	private By shimg = By.xpath("//a[@data-menu-key='shortcuts']//*[name()='svg']");
	
	
	
	
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
	
	
	
	public void back()    // back function create 
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
	
	/* function which give text */ 
	
	
	public String returntxt(By d)
	{
		return driver.findElement(d).getText();
	}
	
////////////////////////////////////////////////////////////////////////////
	
	/* block text */
	
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
	
/////////////////////////////////////////////////////////////////////////////
	
	/* block image checking */
	
	 
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
	
	
//////////////////////////////////////////////////////////////////////////////////
	
	/* foot txt and link */
	
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
	
	// giving the block text 
	
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
	
	
	/* to check the count of pacticuler blog with the page */
	 
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

	/* giveing the side navigation text */
	
	public String dasTxt()
	{
		click(menubtn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
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
		
	public String fqsTxt() 
	{		
		
		return driver.findElement(fqs).getText();
	}
	    
	public String supcatTxt()
	{
		
		return driver.findElement(supcat).getText();
	}
	
	public String supTxt()
	{
		
		return driver.findElement(sup).getText();
	}
	
	public String mancatTxt()
	{
		
		return driver.findElement(mancat).getText();
	}
	
	public String manuTxt()
	{
		
		return driver.findElement(manu).getText();
	}
	
	public String shorTxt() 
	{
		
		return driver.findElement(shor).getText();
	
	}
	
////////////////////////////////////////////////////////////////////////////////////
	
	/* comparing the url end ponint */ 
	
	
	
	public String dasUrl()
	{
		
		return driver.getCurrentUrl();
	}
	
	public String annUrl()
	{
		click(ann);
		return driver.getCurrentUrl();
	}

	public String pollUrl()
	{
		click(poll);
		return driver.getCurrentUrl();
	}

	public String romcUrl()
	{
		click(rom);
		return driver.getCurrentUrl();
	}

	public String faqcUrl()
	{
		click(faqc);
		return driver.getCurrentUrl();
	}

	public String faqsUrl()
	{
		click(fqs);
		return driver.getCurrentUrl();
	}

	public String supcUrl()
	{
		click(supcat);
		return driver.getCurrentUrl();
	}

	public String supUrl()
	{
		click(sup);
		return driver.getCurrentUrl();
	}

	public String manUrl()
	{
		click(mancat);
		return driver.getCurrentUrl();
	}

	public String manrUrl()
	{
		click(manu);
		return driver.getCurrentUrl();
	}

	public String autoUrl()
	{
		click(shor);
		return driver.getCurrentUrl();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public boolean giveImgStatus(By d)
	{
		return driver.findElement(d).isDisplayed();
	}
	
	
	public boolean dasImg()
	{
		return giveImgStatus(dimg);
	}
	
	public boolean annImg()
	{
		return giveImgStatus(aimg);
	}
	
	public boolean pollImg()
	{
		return giveImgStatus(pimg);
	}
	
	public boolean romcImg()
	{
		return giveImgStatus(rimg);
	}
	
	public boolean faqcImg()
	{
		return giveImgStatus(facimg);
	}
	
	public boolean faqImg()
	{
		return giveImgStatus(fqsimg);
	}
	
	public boolean supcImg()
	{
		return giveImgStatus(simg);
	}
	
	public boolean supImg()
	{
		return giveImgStatus(supimg);
	}
	
	public boolean mancImg()
	{
		return giveImgStatus(manimg);
	}
	
	public boolean manuImg()
	{
		return giveImgStatus(mimg);
	}
	
	public boolean shorImg()
	{
		return giveImgStatus(shimg);
	}
	
	
	
	
	
	
}
	
	

