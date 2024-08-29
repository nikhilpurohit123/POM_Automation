package test;

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
	
	
	@Test(priority = 2)
	public void visiblelogo()
	{
		Assert.assertTrue(d.ghostImg(),"Ghost logo is visible oe not ");
		
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
	
	
	
	  @Test(enabled=false)
	  public void changePannel()
	  {
		  d.selectTestPannel();
	   //  Assert.assertEquals(d.currurl(), Constant.Test);
	  
	  }
	
	
	@Test(enabled=false)
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
	
	
	
	@Test(priority = 21)
	public void Logout() 
	{		
		d.clickLogout();		
	}
	
	
	@Test(priority = 20)
	public void checkLogoutImg()
	{
		Assert.assertTrue(d.logoutImg(), "checking the logut icon in the logout block");
		
	}
	
	
	
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
	
	@Test(priority = 19)
	public void manImageMatch()
	{
		Assert.assertTrue(d.manImgVisible(), "check the in dasboard manual blog contain the icon");
	}


}
