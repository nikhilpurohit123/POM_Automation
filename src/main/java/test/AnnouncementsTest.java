package test;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.*;

import base.TestBase;
import page.Announcements;
import utility.Constant;
import page.Login;

public class AnnouncementsTest extends TestBase{

	Announcements a;


	@BeforeMethod
	public void initDriver()
	{
		a = new Announcements(driver);
	}


	@Test(priority =0)
	public void setupLogin() throws InterruptedException
	{

		Login l = new Login(driver); 
		l.enterUserName(Constant.USERNAME);
		l.enterPassword(Constant.PASSWORD);
		l.clickLoginbtn();
		Thread.sleep(3000);

	}


	@Test(priority = 1)
	public void checkUrl()
	{
		a.timegive(2);
		a.clickOnAnn();
		Assert.assertEquals(a.url(),Constant.ANNOUNCEMENT);

	}



	@Test(priority = 2)
	public void annHeadingCkeck() 
	{

		a.timegive(5);
		Assert.assertEquals(a.annHeadingTxt(), "Announcements");
	}


/*#########################################################################################################################*/

	// give the  side nav link text 

	@Test(priority = 3)
	public void dasSideNavTxtMatch()
	{
		Assert.assertEquals(a.dasTxt(),"Dashboard");		
	}

	@Test(priority = 4)
	public void annSideNavTxtMatch()
	{
		Assert.assertEquals(a.annTxt(),"Announcements");
	}

	@Test(priority = 5)
	public void pollSideNavTxtMatch()
	{
		Assert.assertEquals(a.pollTxt(), "Polls");
	}

	@Test(priority = 6)
	public void romSideNavTxtMatch()
	{
		Assert.assertEquals(a.romTxt(), "Roaming Countries");
	}

	@Test(priority = 7)
	public void faqcSideNavTxtMatch()
	{
		Assert.assertEquals(a.faqcTxt(), "FAQ Category");
	}

	@Test(priority = 8)
	public void faqSideNavTxtMatch() 
	{
		Assert.assertEquals(a.fqsTxt(), "FAQs");
	}

	@Test(priority = 9)
	public void supcSideNavTxtMatch()
	{
		Assert.assertEquals(a.supcatTxt(), "Support Category");
	}

	@Test(priority = 10)
	public void supSideNavTxtMatch()
	{
		Assert.assertEquals(a.supTxt(), "Support");
	}

	@Test(priority = 11)
	public void mancSideNavTxtMatch()
	{
		Assert.assertEquals(a.mancatTxt(), "Manual Category");
	}

	@Test(priority = 12)
	public void manrSideNavTxtMatch()
	{
		Assert.assertEquals(a.manuTxt(), "Manual Replies");
	}

	@Test(priority = 13)
	public void shortSideNavTxtMatch()
	{		 
		Assert.assertEquals(a.shorTxt(), "Auto Replies");			  
	}

/*#########################################################################################################################*/	

	// menu 
	
	@Test(priority = 14)
	public void menubtnVisible()
	{
		Assert.assertTrue(a.menuVisible());
	}
	
	@Test(priority = 15)
	public void menubtnEnabled()
	{
		Assert.assertTrue(a.menuEnable());
	}
	
	@Test(priority = 16)
	public void menubtnClick()
	{
		a.clickMenu();  
	}
	
/*#########################################################################################################################*/

 // display the side nav link icon 
	
	@Test(priority =17 )
	public void dasIconCheck()
	{
		Assert.assertTrue(a.dasImg());
		
	}
	
	@Test(priority =18)
	public void annIconCheck()
	{
		Assert.assertTrue(a.annImg());
	}
	
	@Test(priority = 19)
	public void pollIconCheck()
	{
		Assert.assertTrue(a.pollImg());
	}
	
	@Test(priority = 20)
	public void romcIconCheck()
	{
		Assert.assertTrue(a.romcImg());
	}
	
	@Test(priority = 21)
	public void faqcIconCheck()
	{
		Assert.assertTrue(a.faqcImg());
	}
	
	@Test(priority = 22)
	public void faqIconCheck()
	{
		Assert.assertTrue(a.faqImg());
	}
	
	@Test(priority = 23)
	public void supcIconCheck()
	{
		Assert.assertTrue(a.supcImg());
	}
		
	@Test(priority =24 )
	public void supIconCheck()
	{
		Assert.assertTrue(a.supImg());
	}
	
	@Test(priority =25 )
	public void mancIconCheck()
	{
		Assert.assertTrue(a.mancImg());
	}
	
	@Test(priority = 26)
	public void manIconCheck()
	{
		Assert.assertTrue(a.manuImg());
	}
	
	@Test(priority = 27)
	public void autorIconCheck()
	{
		Assert.assertTrue(a.shorImg());
	}


/*#########################################################################################################################*/	
	
	// url end point test 
	
	@Test(priority = 39)
	public void dasUrlCheck()
	{
		Assert.assertEquals(a.dasUrl(), Constant.DASBOARD);
	}
	
	@Test(priority = 40)
	public void annUrlCheck()
	{
		Assert.assertEquals(a.annUrl(), Constant.ANNOUNCEMENT);
	}


	@Test(priority = 41)
	public void pollUrlCheck()
	{
		Assert.assertEquals(a.pollUrl(), Constant.POLLS);
	}

	@Test(priority = 42)
	public void romcUrlCheck()
	{
		Assert.assertEquals(a.romcUrl(), Constant.ROAMINGCOUNTRIES);
	}

	@Test(priority = 43)
	public void faqcUrlCheck()
	{
		Assert.assertEquals(a.faqcUrl(), Constant.FAQCATEGORY);
	}

	@Test(priority = 44)
	public void faqUrlCheck()
	{
		Assert.assertEquals(a.faqsUrl(), Constant.FAQS);
	}

	@Test(priority = 45)
	public void supcUrlCheck()
	{
		Assert.assertEquals(a.supcUrl(), Constant.SUPPORTCATEGORY);
	}
	
	@Test(priority = 46)
	public void supUrlCheck()
	{
		Assert.assertEquals(a.supUrl(), Constant.SUPPORT);
	}
	
	@Test(priority = 47)
	public void mancUrlCheck()
	{
		Assert.assertEquals(a.manUrl(), Constant.MANUALCATEGORY);
	}

	@Test(priority = 48)
	public void manrUrlCheck()
	{
		Assert.assertEquals(a.manrUrl(), Constant.MAUALREPIES);
	}

	@Test(priority = 49)
	public void autoUrlCheck() throws AWTException
	{
		a.scrolldown();
		Assert.assertEquals(a.autoUrl(), Constant.AUTOREPIES);
	}

/*#########################################################################################################################*/		

	//footer 
	
	@Test(priority=50)
	public void  footerTxtVisivle()
	{
		Assert.assertTrue(a.ghostFootLink());
	}
	
	@Test(priority = 51)
	public void footerTxtCheck() throws AWTException
	{		
		Assert.assertEquals(a.footTxt(), "2024 © Ghost News by Ghost");
	}

	
/*#########################################################################################################################*/		
	
	@Test(priority = 1)
	public void clickGhostLogoVisible() 							// 52 53 54
	{		
		Assert.assertTrue(a.ghostLogoVisible());
	}
	
	@Test(priority = 2)
	public void ghostLogoEnable()
	{
		Assert.assertTrue(a.ghostLogoEnable());
	}
	
	@Test(priority = 3)
	public void ghostLogoClick()
	{		
		a.ghostLogoClickable();
		Assert.assertEquals(a.url(), Constant.DASBOARD);
	}
	
	
/*#########################################################################################################################*/		
	
// catergory panal
	@Test(priority =55 )
	public void catgPanalIconVisible()
	{
		Assert.assertTrue(a.categoryimg());
	}
	
	@Test(priority = 56)
	public void catgPanelEnabled()
	{
		Assert.assertTrue(a.catimgEnabled());
	}

	@Test(priority = 57)
	public void clickOnCatergoryPanaIcon()
	{
		a.catgePanelClick();
	}


	// Test panel
	
	

    // lIVE panel

}
