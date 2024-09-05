package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utility.Constant;

public class Announcements {

	
	WebDriver driver;	
	
	
	
	public Announcements(WebDriver driver)
	{
		this.driver=driver;
	}	
	
	
	public void timegive(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	public void click(By d)                // used for clicking the element 
	{
		driver.findElement(d).click();
	}
			
	public void clickOnAnn()               // useing above click() for click on the 
	{
		click(Constant.AnnouncementsConst.annlink);
		
	}
	
	public String url()                    // used for the take the current url of the 
	{
		return driver.getCurrentUrl();
	}
	
	public void scrolldown() throws AWTException // page down untill Bottom
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	public void scrollup() throws AWTException   // page up untill the top
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
	}
	
/* ############################################################################################################## */	

	public boolean  annVisible()
	{
		return driver.findElement(Constant.AnnouncementsConst.annlink).isDisplayed();		
	}
	
	public boolean annEnabled()
	{
		return driver.findElement(Constant.AnnouncementsConst.annlink).isEnabled();
	}
	
	public boolean annNotSelect()
	{
		return driver.findElement(Constant.AnnouncementsConst.annlink).isSelected();
	}
	

	
/* ############################################################################################################## */	

	// check the text of side nav links
	
	
	public String dasTxt()
	{
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
	

/* ############################################################################################################## */
	
	
	// icon visible heck 
	
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
	
/* ############################################################################################################## */			
	
		/* comparing the url end ponint */ 
	
	
	public String dasUrl()
	{
		click(Constant.DashboardConst.das);
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

	
/* ############################################################################################################## */			

	// fotter link of the page 
	
	
	public String annHeadingTxt()          // take the heading of the announcement 
	{
		return driver.findElement(Constant.AnnouncementsConst.annhead).getText();
	}
	
	public String footTxt()
	{
		return driver.findElement(Constant.DashboardConst.foot).getText();
	}
	
	public boolean ghostFootLink()
	{
		return driver.findElement(Constant.DashboardConst.glink).isDisplayed();
	}
	
/* ############################################################################################################## */		
	
	// menu related operation 
	
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
	
	
/* ############################################################################################################## */	

	// side ghost logo
	
	public boolean ghostLogoVisible()
	{
		System.out.println(driver.findElement(Constant.DashboardConst.logo).isDisplayed());
		return driver.findElement(Constant.DashboardConst.logo).isDisplayed();
	}
	
	public boolean ghostLogoEnable() 
	{
		return driver.findElement(Constant.DashboardConst.logo).isEnabled();
	}
	
	public void ghostLogoClickable()
	{
		 click(Constant.DashboardConst.logo);
	}
	
/* ############################################################################################################## */		

// category 
	
	

	public boolean categoryimg()// test pannel cantain  image
	{
		return driver.findElement(Constant.DashboardConst.cat).isDisplayed();	
		
	}
	
	public boolean catimgEnabled()// test pannel cantain  image uper logo
	{
		return driver.findElement(Constant.DashboardConst.cat).isEnabled();
		
	}
	
	
	public void catgePanelClick()
	{
		click(Constant.DashboardConst.cat);
	}
	
	
}
