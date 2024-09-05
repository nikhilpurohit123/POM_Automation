package page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Constant;

public class Dashboard {
	
	
	WebDriver driver;	
	
	
	
	
	
	
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
		return driver.findElement(Constant.DashboardConst.logo).isDisplayed();
	}
	
	public void ghostLogoClick()
	{
		driver.findElement(Constant.DashboardConst.logo).click();
		
	}
	
	public String currurl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean menuVisible()
	{
		return driver.findElement(Constant.DashboardConst.menubtn).isDisplayed();
	}
	
	
	public boolean menuEnable()
	{
		return driver.findElement(Constant.DashboardConst.menubtn).isEnabled();
	}
	
	
	public void clickMenu()
	{
		click(Constant.DashboardConst.menubtn);
	}
	
	public boolean showNavText()
	{
		return driver.findElement(Constant.DashboardConst.das).isDisplayed();
	}
	
	
	public void selectTestPannel()
	{
		click(Constant.DashboardConst.gtestpanel);	
	}
	
	public void selectLivePannel()
	{
		click(Constant.DashboardConst.gtestpanel);
	}
	
	
	
	public void back()    // back function create 
	{
		driver.navigate().back();
	}
	
	
	public boolean roundlogimg()// small round ghost logo
	{
		 return driver.findElement(Constant.DashboardConst.logoutimg).isDisplayed();
		
	}
	public void roundloginClick()
	{
		click(Constant.DashboardConst.logoutimg);
	}
	
	public boolean logimgEna()// small round ghost logo
	{
		 return driver.findElement(Constant.DashboardConst.logoutimg).isEnabled();
		
	}
	
	
	public boolean categoryimg()// test pannel cantain  image
	{
		return driver.findElement(Constant.DashboardConst.cat).isDisplayed();	
		
	}
	
	public boolean catimgEnabled()// test pannel cantain  image uper logo
	{
		return driver.findElement(Constant.DashboardConst.cat).isEnabled();
		
	}
	
	
	public void clickLogout() 
	{
		click(Constant.DashboardConst.logoutlink);		
		click(Constant.DashboardConst.logout);
		
	}
	
	
	public boolean logoutImg()// in logout block image 
	{
		return driver.findElement(Constant.DashboardConst.inlogoimg).isDisplayed();
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
		return returntxt(Constant.DashboardConst.Ann);
	}
	
	public String getRomTxt()
	{
		return returntxt(Constant.DashboardConst.Rom);
	}
	
	public String getFaqTxt()
	{
		return returntxt(Constant.DashboardConst.faq);
		
	}
	
	public String getmanTxt()
	{
		
		return returntxt(Constant.DashboardConst.man);
	}
	
/////////////////////////////////////////////////////////////////////////////
	
	/* block image checking */
	
	 
	public boolean  annImgVisible()
	{
		return driver.findElement(Constant.DashboardConst.imgA).isDisplayed();		
	}
	
	public boolean romImgVisible()
	{
		return driver.findElement(Constant.DashboardConst.imgR).isDisplayed();
	}
	
	public boolean faqImgVisible()
	{
		return driver.findElement(Constant.DashboardConst.imgF).isDisplayed();
	}
		
	public boolean manImgVisible()
	{
		return driver.findElement(Constant.DashboardConst.imgM).isDisplayed();
	}
	
	
//////////////////////////////////////////////////////////////////////////////////
	
	/* foot txt and link */
	
	public String headingTxt()
	{
		return driver.findElement(Constant.DashboardConst.heading).getText();
	}
	
	public String footTxt()
	{
		return driver.findElement(Constant.DashboardConst.foot).getText();
	}
	
	public boolean ghostFootLink()
	{
		return driver.findElement(Constant.DashboardConst.glink).isDisplayed();
	}
	
	
////////////////////////////////////////////////////////////////////////////////////
	
	// giving the block text 
	
	public String annCount()
	{
		return driver.findElement(Constant.DashboardConst.anncount).getText();
	}
	
	public String ramCount()
	{
		return driver.findElement(Constant.DashboardConst.roaming).getText();
	}
	
	public String faqCount()
	{
		return driver.findElement(Constant.DashboardConst.faqs).getText();
	}
	
	public String manCount()
	{
		return driver.findElement(Constant.DashboardConst.manual).getText();
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
	
	/* to check the count of pacticuler blog with the page */
	 
	public String  countIteamOfAnnouncement()
	{
			
			return  driver.findElement(Constant.DashboardConst.anncount).getText();
	}
		
	
	public String  countIteamOfRoaming()
	{
			
			return  driver.findElement(Constant.DashboardConst.roaming).getText();
	}
	
	public String  countIteamOfFaqs()
	{
			
			return  driver.findElement(Constant.DashboardConst.faqs).getText();
	}
	
	public String  countIteamOfManual()
	{
			
			return  driver.findElement(Constant.DashboardConst.manual).getText();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	/* giveing the side navigation text */
	
	public String dasTxt()
	{
		click(Constant.DashboardConst.menubtn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		return driver.findElement(Constant.DashboardConst.das).getText();
		
	}

	public String annTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.ann).getText();
	}
		
	public String pollTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.poll).getText();
	}
	
	public String romTxt()
	{
		return driver.findElement(Constant.DashboardConst.rom).getText();
	}
	
	public String faqcTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.faqc).getText();
	}
		
	public String fqsTxt() 
	{		
		
		return driver.findElement(Constant.DashboardConst.fqs).getText();
	}
	    
	public String supcatTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.supcat).getText();
	}
	
	public String supTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.sup).getText();
	}
	
	public String mancatTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.mancat).getText();
	}
	
	public String manuTxt()
	{
		
		return driver.findElement(Constant.DashboardConst.manu).getText();
	}
	
	public String shorTxt() 
	{
		
		return driver.findElement(Constant.DashboardConst.shor).getText();
	
	}
	
////////////////////////////////////////////////////////////////////////////////////
	
	/* comparing the url end ponint */ 
	
	
	
	public String dasUrl()
	{
		
		return driver.getCurrentUrl();
	}
	
	public String annUrl()
	{
		click(Constant.DashboardConst.ann);
		return driver.getCurrentUrl();
	}

	public String pollUrl()
	{
		click(Constant.DashboardConst.poll);
		return driver.getCurrentUrl();
	}

	public String romcUrl()
	{
		click(Constant.DashboardConst.rom);
		return driver.getCurrentUrl();
	}

	public String faqcUrl()
	{
		click(Constant.DashboardConst.faqc);
		return driver.getCurrentUrl();
	}

	public String faqsUrl()
	{
		click(Constant.DashboardConst.fqs);
		return driver.getCurrentUrl();
	}

	public String supcUrl()
	{
		click(Constant.DashboardConst.supcat);
		return driver.getCurrentUrl();
	}

	public String supUrl()
	{
		click(Constant.DashboardConst.sup);
		return driver.getCurrentUrl();
	}

	public String manUrl()
	{
		click(Constant.DashboardConst.mancat);
		return driver.getCurrentUrl();
	}

	public String manrUrl()
	{
		click(Constant.DashboardConst.manu);
		return driver.getCurrentUrl();
	}

	public String autoUrl()
	{
		click(Constant.DashboardConst.shor);
		return driver.getCurrentUrl();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public boolean giveImgStatus(By d)
	{
		return driver.findElement(d).isDisplayed();
	}
	
	
	public boolean dasImg()
	{
		return giveImgStatus(Constant.DashboardConst.dimg);
	}
	
	public boolean annImg()
	{
		return giveImgStatus(Constant.DashboardConst.aimg);
	}
	
	public boolean pollImg()
	{
		return giveImgStatus(Constant.DashboardConst.pimg);
	}
	
	public boolean romcImg()
	{
		return giveImgStatus(Constant.DashboardConst.rimg);
	}
	
	public boolean faqcImg()
	{
		return giveImgStatus(Constant.DashboardConst.facimg);
	}
	
	public boolean faqImg()
	{
		return giveImgStatus(Constant.DashboardConst.fqsimg);
	}
	
	public boolean supcImg()
	{
		return giveImgStatus(Constant.DashboardConst.simg);
	}
	
	public boolean supImg()
	{
		return giveImgStatus(Constant.DashboardConst.supimg);
	}
	
	public boolean mancImg()
	{
		return giveImgStatus(Constant.DashboardConst.manimg);
	}
	
	public boolean manuImg()
	{
		return giveImgStatus(Constant.DashboardConst.mimg);
	}
	
	public boolean shorImg()
	{
		return giveImgStatus(Constant.DashboardConst.shimg);
	}
	
	
	
	
}
	
	

