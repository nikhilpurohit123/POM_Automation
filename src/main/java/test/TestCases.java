package test;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.Constant;
import base.TestBase;
import page.Login;


public class TestCases extends TestBase{

	Login l;

	@BeforeMethod()
	public void initDriver()
	{
		l = new Login(driver);
	}

	// login with valid username and password

	@Test(priority =26)
	public void loginWithValid() throws InterruptedException 
	{		
		
		l.cleanbothfield();
		l.enterUserName(Constant.USERNAME);
		l.enterPassword(Constant.PASSWORD);
		l.clickLoginbtn();
		Thread.sleep(3000);
		Assert.assertEquals(l.currentUrl(),Constant.DASBOARD," checking the url" );

	}

	// check the title of weibsite

	@Test(priority =0)
	public void title()
	{
		Assert.assertEquals(driver.getTitle(), "Ghost News", "Matching the website title");

	}


	
	@Test(priority =1)
	public void userFieldVisible()
	{
		Assert.assertTrue(l.userfield(), "user fiels is visible or not ");
	}
	
	@Test(priority =2)
	public void passField()
	{
		Assert.assertTrue(l.passField(), "pass fiels is visible or not ");
	}

	// login with invalid username and password 

	@Test(priority =13)
	public void loginWithInvalid() throws InterruptedException
	{
				
		l.enterUserName("testing by auto "); 		
		l.enterPassword("12345678");
		l.clickLoginbtn();
		Thread.sleep(2000);
		Assert.assertEquals(l.alertError(), Constant.ALERTERRORBOX,"error message come");
	}

	// login with blank username and password

	@Test(priority =14 )
	public void loginWithBlankData() throws InterruptedException 
	{
		
		l.cleanbothfield();
		l.enterUserName(" "); 		
		l.enterPassword(" ");
		Thread.sleep(2000);
		l.clickLoginbtn();
		Assert.assertEquals(l.alertError(), Constant.ALERTERRORBOX,"alert box error maching ");
	}

	//ckeck the user field placeholder  

	@Test(priority =4)  
	public void userFieldPlacholderText()
	{
		
		Assert.assertEquals(l.userfieldTxt() ,Constant.USERPLACEHOLDER, "Matching the user field");

	}

	// ckeck the password field placeholder

	@Test(priority= 5)
	public void passwordFieldPlaceholderText()
	{
		
		Assert.assertEquals(l.passwordFieldTxt(), Constant.PASSWORDPLACEHOLDER,"Matching the password");

	}


	// check the user label text

	@Test(priority =6)
	public void userLabelText()
	{
		
		Assert.assertEquals(l.userLabel(),Constant.USERLABEL, "Maching the userlabel");

	}


	// check the password label text

	@Test(priority =7)
	public void passwordLabelText()
	{
		
		Assert.assertEquals(l.passLabel(), Constant.PASSWORDLABEL,"Maching the password label");

	}
		
	
	@Test(priority =15)
	public void checkPasswordInDottedForm()
	{
		l.cleanbothfield();
		l.enterPassword("1234567");
		Assert.assertEquals(l.inupassFormat("type"),"password");
		
	}
	
	@Test(priority =25)
	public void checkUserFieldInText()
	{
		l.cleanbothfield();
		l.enterUserName("abcdefghijklmnopq");
		Assert.assertEquals(l.inuserFormat("type"), "text");
		
	}

	// check the blank error without given username and password	

	@Test(priority =16)
	public void withoutDataEnter() 
	{
	
		l.cleanbothfield();
		l.clickLoginbtn();		
		Assert.assertEquals(l.errorUserWithoutData(),Constant.USERBLANKERROR,"maching the userblank error");
		Assert.assertEquals(l.errorpassWithoutData(),Constant.PASSWORDBLANKERROR,"maching the passwordblank error");

	}

	// click on login button without enter username
	
	@Test(priority =17)
	public void userErrorNoDataClickLogin() 
	{
		
		l.enterPassword(Constant.PASSWORD);
		l.cleanuserField();
		l.clickLoginbtn();
		Assert.assertEquals(l.errorUserWithoutData(),Constant.USERBLANKERROR,"  Maching the user blank error");

	}

	
	// click on login button without enter passwrod
	
	@Test(priority =18)
	public void passErrroNoDataClickLogin() 
	{
		l.enterUserName(Constant.USERNAME);
		l.cleanpassField();
		l.clickLoginbtn();	
		Assert.assertEquals(l.errorpassWithoutData(), Constant.PASSWORDBLANKERROR," Maching error password blank enter");

	}
	
	// click on logo icon
	
	@Test(priority =19)
	public void clickOnLogoImage()
	{
		l.enterUserName(Constant.USERNAME);
		l.enterPassword(Constant.PASSWORD);
		l.clickOnlogo();
		Assert.assertEquals(l.userfieldTxt(), Constant.USERPLACEHOLDER, " refresh the field");
		Assert.assertEquals(l.passwordFieldTxt(),Constant.PASSWORDPLACEHOLDER," refresh the field");		
	}
	
	// refreshing the web page
	 
	@Test(priority =20)
	public void refreshPage()
	{
		
		l.enterUserName(Constant.USERNAME);
		l.enterPassword(Constant.PASSWORD);
		l.refresh();
		
	}
	
	// check the forgot link is present
	
	@Test(priority =8)
	public void forgotLinkVisible()
	{
		Assert.assertTrue(l.forgotLink(), "forgot link present");
	}
	
	
	// ckeck forogt link is clickablr or not
	
	@Test(priority =12)
	public void forgotLinkClickable()
	{
		Assert.assertTrue(l.EnableforgotLink(), "checking the link is clickable or not");
		
	}
	
	// click on forgot link 
	
	
	@Test(priority =21)
	public void clickOnForgotLink() throws InterruptedException
	{
		l.clickForgotLink();
		Assert.assertEquals(l.currentUrl(),Constant.FORGOTURL,"check the forgot url");
		Thread.sleep(2000);
		l.back();
		
	}
	
	// incomplete
	@Test(priority = 22)
	public void errorRemoveEnterDataInField() throws InterruptedException
	{
		
		l.cleanbothfield();
		l.clickLoginbtn();
		if(l.errorUserWithoutData().equals(Constant.USERBLANKERROR))
		{
			l.enterUserName(Constant.USERNAME);
		}
		try
		{
			l.errorpassWithoutData().equals(Constant.USERBLANKERROR);
		}
		catch(NoSuchElementException e)
		{
			System.out.print("Error message remove");
		}
		
		
	}
	

	@Test(priority = 23)
	public void passDataEnterErrorRemove() throws InterruptedException
	{
		
		l.cleanbothfield();		
		l.clickLoginbtn();
		
		if(l.errorpassWithoutData().equals(Constant.PASSWORDBLANKERROR))
		{
			l.enterPassword(Constant.PASSWORD);
		}
		try
		{
			l.errorpassWithoutData().equals(Constant.PASSWORDBLANKERROR);
		}
		catch(NoSuchElementException e)
		{
			System.out.print("Error message remove");
		}
		
		
	}
	
	
	@Test(priority =3)
	public void buttonVisible()
	{
		
		Assert.assertTrue(l.buttonPre(), "check the button present in the page");
	}
	
	@Test(priority =9)
	public void buttonTxt()
	{
		Assert.assertEquals(l.btntxt(), Constant.BTNTXT,"check the button text");
	}
	
	@Test(priority =10)
	public void buttonEnabled()
	{
		Assert.assertTrue(l.btnEnabled(),"button is clickable or not");		
	}
	
	@Test(priority =11)
	public void buttonSelected()
	{		
		Assert.assertFalse(l.btnSelected(), "button is not already selected");
	}
	
}
