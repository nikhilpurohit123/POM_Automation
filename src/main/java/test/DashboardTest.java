package test;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.*;

import base.TestBase;
import page.Dashboard;
import page.Login;
import utility.Constant;

public class DashboardTest extends TestBase{

	Dashboard d ;

	@BeforeMethod
	public void init()
	{
		d = new Dashboard(driver);
	}

	@Test(priority =0)
	public void setlogin() throws InterruptedException
	{

		Login l = new Login(driver);
		l.enterUserName(Constant.USERNAME);
		l.enterPassword(Constant.PASSWORD);
		l.clickLoginbtn();
		Thread.sleep(3000);
	}



	@Test(priority =1)
	public void checkUrl()
	{
		Assert.assertEquals(d.currurl(), Constant.DASBOARD);

	}

	@Test(priority = 25)
	public void checkHeading()
	{
		Assert.assertEquals(d.headingTxt(), "Dashboard");		
	}

	@Test(priority = 26)
	public void footerTxtVisible()
	{
		Assert.assertEquals(d.footTxt(), "2024 © Ghost News by Ghost");
	}

	@Test(priority = 2)
	public void visiblelogo() 
	{
		
		Assert.assertTrue(d.ghostImg(),"Ghost logo is visible or not ");

	}


	@Test(priority =3)
	public void clickONLogo()
	{
		d.ghostLogoClick();

	}

	@Test(priority = 4)
	public void checkMenuVisible()
	{
		Assert.assertTrue(d.menuVisible(), "check the menu button visible");
	}

	@Test(priority =5)
	public void checkkMenuEnable()
	{
		Assert.assertTrue(d.menuEnable(), "check the menu button is enabled");
	}

	@Test(priority = 6)
	public void clickOnMenu()
	{
		d.clickMenu();
		Assert.assertTrue(d.showNavText(), "when clikc on menu side nav text will hide ");
	}



	@Test(priority = 50,enabled = false)
	public void changePannel()
	{
		d.selectTestPannel();
		//  Assert.assertEquals(d.currurl(), Constant.Test);	  
	}


	@Test(priority = 51,enabled = false)
	public void goLivePannel()
	{
		d.selectLivePannel();
		//	Assert.assertEquals(d.currurl(), Constant.LIVEP);		
	}

	@Test(priority = 7)
	public void categotyBoxVisible()
	{
		Assert.assertTrue(d.categoryimg(), "check the category");		
	}

	@Test(priority = 8)
	public void categoryBoxEna()
	{
		Assert.assertTrue(d.catimgEnabled(), "check the category img is clickable");
	}

	@Test(priority = 9)
	public void logoutImgVisible()
	{
		d.roundloginClick();
		Assert.assertTrue(d.logoutImg(),"check the logout image");
	}	

	@Test(priority = 10)
	public void logoutimgEnabled()
	{
		Assert.assertTrue(d.logimgEna(), "check the img is clickabled or not");
	}	

	
/*##################################################################################################################*/	
	
	@Test(priority = 20)
	public void checkLogoutImg()
	{
		Assert.assertTrue(d.logoutImg(), "checking the logut icon in the logout block");

	}
	
	@Test(priority = 62)
	public void Logout() 
	{		
		d.clickLogout();		
	}	

/*##################################################################################################################*/

	@Test(priority = 12)
	public void  annblogTxtinScreen()
	{
		Assert.assertEquals(d.getAnnTxt(), "Announcements");
	}

	@Test(priority = 13)
	public void manblogTxtinScreen()
	{
		Assert.assertEquals(d.getmanTxt(), "Manuals");
	}


	@Test(priority = 14)
	public void faqbloginTxtScreen()
	{
		Assert.assertEquals(d.getFaqTxt(), "FAQs");
	}

	@Test(priority = 15)
	public void rombloginTxtScreen()
	{
		Assert.assertEquals(d.getRomTxt(), "Roaming Countries");
	}

	
/*##############################################################################################################*/
	
	@Test(priority = 16)
	public void annImageMatch()
	{
		Assert.assertTrue(d.annImgVisible(), "check the in dasboard announcement blog contain the icon");
	}

	@Test(priority = 17)
	public void romImageMatch()
	{
		Assert.assertTrue(d.romImgVisible(), "check the in dasboard romaning countries blog contain the icon");
	}

	@Test(priority = 18)
	public void faqImageMatch()
	{
		Assert.assertTrue(d.faqImgVisible(), "check the in dasboard faq blog contain the icon");
	}

	@Test(enabled = false)
	public void checktheCount()
	{
		// blank 		

	}

/* #############################################################################################################################*/
	
	@Test(priority = 28)
	public void dasSideNavTxtMatch()
	{
		Assert.assertEquals(d.dasTxt(),"Dashboard");		
	}

	@Test(priority = 29)
	public void annSideNavTxtMatch()
	{
		Assert.assertEquals(d.annTxt(),"Announcements");
	}

	@Test(priority = 30)
	public void pollSideNavTxtMatch()
	{
		Assert.assertEquals(d.pollTxt(), "Polls");
	}

	@Test(priority = 31)
	public void romSideNavTxtMatch()
	{
		Assert.assertEquals(d.romTxt(), "Roaming Countries");
	}

	@Test(priority = 32)
	public void faqcSideNavTxtMatch()
	{
		Assert.assertEquals(d.faqcTxt(), "FAQ Category");
	}

	@Test(priority = 33)
	public void faqSideNavTxtMatch() 
	{
		Assert.assertEquals(d.fqsTxt(), "FAQs");
	}
	
	@Test(priority = 34)
	public void supcSideNavTxtMatch()
	{
		Assert.assertEquals(d.supcatTxt(), "Support Category");
	}

	@Test(priority = 35)
	public void supSideNavTxtMatch()
	{
		Assert.assertEquals(d.supTxt(), "Support");
	}

	@Test(priority = 36)
	public void mancSideNavTxtMatch()
	{
		Assert.assertEquals(d.mancatTxt(), "Manual Category");
	}

	@Test(priority = 37)
	public void manrSideNavTxtMatch()
	{
		Assert.assertEquals(d.manuTxt(), "Manual Replies");
	}

	@Test(priority = 38)
	public void shortSideNavTxtMatch()
	{		 
		  Assert.assertEquals(d.shorTxt(), "Auto Replies");			  
	}

	
/* #########################################################################################################################*/
	
	@Test(priority = 39)
	public void dasUrlCheck()
	{
		Assert.assertEquals(d.dasUrl(), Constant.DASBOARD);
	}
	
	@Test(priority = 40)
	public void annUrlCheck()
	{
		Assert.assertEquals(d.annUrl(), Constant.ANNOUNCEMENT);
	}


	@Test(priority = 41)
	public void pollUrlCheck()
	{
		Assert.assertEquals(d.pollUrl(), Constant.POLLS);
	}

	@Test(priority = 42)
	public void romcUrlCheck()
	{
		Assert.assertEquals(d.romcUrl(), Constant.ROAMINGCOUNTRIES);
	}

	@Test(priority = 43)
	public void faqcUrlCheck()
	{
		Assert.assertEquals(d.faqcUrl(), Constant.FAQCATEGORY);
	}

	@Test(priority = 44)
	public void faqUrlCheck()
	{
		Assert.assertEquals(d.faqsUrl(), Constant.FAQS);
	}

	@Test(priority = 45)
	public void supcUrlCheck()
	{
		Assert.assertEquals(d.supcUrl(), Constant.SUPPORTCATEGORY);
	}
	
	@Test(priority = 46)
	public void supUrlCheck()
	{
		Assert.assertEquals(d.supUrl(), Constant.SUPPORT);
	}
	
	@Test(priority = 47)
	public void mancUrlCheck()
	{
		Assert.assertEquals(d.manUrl(), Constant.MANUALCATEGORY);
	}

	@Test(priority = 48)
	public void manrUrlCheck()
	{
		Assert.assertEquals(d.manrUrl(), Constant.MAUALREPIES);
	}

	@Test(priority = 49)
	public void autoUrlCheck()
	{
		Assert.assertEquals(d.autoUrl(), Constant.AUTOREPIES);
	}
	
/*###############################################################################################################################*/
	
	
	@Test(priority =50 )
	public void dasIconCheck()
	{
		Assert.assertTrue(d.dasImg());
		
	}
	
	@Test(priority =51 )
	public void annIconCheck()
	{
		Assert.assertTrue(d.annImg());
	}
	
	@Test(priority = 52)
	public void pollIconCheck()
	{
		Assert.assertTrue(d.pollImg());
	}
	
	@Test(priority = 53)
	public void romcIconCheck()
	{
		Assert.assertTrue(d.romcImg());
	}
	
	@Test(priority = 54)
	public void faqcIconCheck()
	{
		Assert.assertTrue(d.faqcImg());
	}
	
	@Test(priority = 55)
	public void faqIconCheck()
	{
		Assert.assertTrue(d.faqImg());
	}
	
	@Test(priority = 56)
	public void supcIconCheck()
	{
		Assert.assertTrue(d.supcImg());
	}
		
	@Test(priority =57 )
	public void supIconCheck()
	{
		Assert.assertTrue(d.supImg());
	}
	
	@Test(priority =58 )
	public void mancIconCheck()
	{
		Assert.assertTrue(d.mancImg());
	}
	
	@Test(priority = 60)
	public void manIconCheck()
	{
		Assert.assertTrue(d.manuImg());
	}
	
	@Test(priority = 61)
	public void autorIconCheck()
	{
		Assert.assertTrue(d.shorImg());
	}
}
