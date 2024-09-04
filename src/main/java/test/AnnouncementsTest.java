package test;

import org.testng.Assert;
import org.testng.annotations.*;

import base.TestBase;
import page.Announcements;
import utility.Constant;
import page.Login;

public class AnnouncementsTest extends TestBase{
	
	Announcements a;
	

	@BeforeMethod
	public void init()
	{
		a = new Announcements(driver);
	}

	
	  @Test public void setup()
	  {
			/*
			  Login l = new Login(driver); 
			  l.enterUserName(Constant.USERNAME);
			  l.enterPassword(Constant.PASSWORD);
			  l.clickLoginbtn();*/
			 
	  
	  }
	 
	
	
	/*
	 * @Test public void checkUrl() { Assert.assertEquals(a.url(),
	 * Constant.ANNOUNCEMENT); }
	 */
}
