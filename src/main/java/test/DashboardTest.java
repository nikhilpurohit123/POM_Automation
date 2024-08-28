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
		Thread.sleep(2000);
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
	
	
}
