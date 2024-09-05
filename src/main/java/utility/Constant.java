package utility;

import org.openqa.selenium.By;

public class Constant {

	public static final String BASE_URL = "http://146.59.87.38:8080/ghostnews/#/auth/login";
	public static final String FORGOTURL = "http://146.59.87.38:8080/ghostnews/#/auth/forget-password";
	public static final String DASBOARD = "http://146.59.87.38:8080/ghostnews/#/dashboard";
	public static final String ANNOUNCEMENT = "http://146.59.87.38:8080/ghostnews/#/announcements";
	public static final String POLLS = "http://146.59.87.38:8080/ghostnews/#/polls";
	public static final String ROAMINGCOUNTRIES = "http://146.59.87.38:8080/ghostnews/#/roamings";
	public static final String FAQCATEGORY = "http://146.59.87.38:8080/ghostnews/#/faqcategory";
	public static final String FAQS = "http://146.59.87.38:8080/ghostnews/#/faq";
	public static final String SUPPORTCATEGORY = "http://146.59.87.38:8080/ghostnews/#/supportcategory";
	public static final String SUPPORT = "http://146.59.87.38:8080/ghostnews/#/support";
	public static final String MANUALCATEGORY = "http://146.59.87.38:8080/ghostnews/#/manualcategory";
	public static final String MAUALREPIES = "http://146.59.87.38:8080/ghostnews/#/manual";
	public static final String AUTOREPIES = "http://146.59.87.38:8080/ghostnews/#/shortcuts";	
	public static final String TEST ="";
	public static final String LIVE ="";



	public static final String USERNAME = "info@ghostchat.net";
	public static final String PASSWORD = "=7rnxR?,/hM4T#L";
	public static final String ALERTERRORBOX = "Invalid credentials";
	public static final String USERPLACEHOLDER = "Enter your Username";
	public static final String PASSWORDPLACEHOLDER = "Enter your password";
	public static final String USERLABEL = "Username";
	public static final String PASSWORDLABEL = "Password";
	public static final String USERBLANKERROR = "Please enter Username";
	public static final String PASSWORDBLANKERROR = "Please enter Password";
	public static final String BTNTXT = "Log In";


	public static class AnnouncementsConst {

		public static By annurl = By.xpath("http://146.59.87.38:8080/ghostnews/#/announcements");
		public static By annlink = By.xpath("//a[@data-menu-key='announcements']");
		public static By annhead = By.xpath("//h4[normalize-space()='Announcements']");// page heading  outer heading 
		public static By addbtn = By.xpath("//button[normalize-space()='Add New']"); // 
		public static By leftarrow = By.xpath("//button[@class='btn-outline-primary btn btn-outline-primary']");
		public static By rightarrow = By.xpath("//button[@class='btn-outline-primary btn btn-outline-primary']");
		public static By middlecount = By.xpath("//button[contains(text(),'1')]");


		public static By headann = By.xpath("//div[@class='modal-header']");
		public static By type = By.xpath("//label[normalize-space()='Type']");
		public static By select = By.xpath("//select[@id='select']");
		public static By annTitle = By.xpath("//label[normalize-space()='Announcement Title']");
		public static By anntxtfiled = By.xpath("//input[@id='title']");
		public static By desc = By.xpath("//p[@class='mb-1']");
		public static By cancelbtn = By.xpath("//button[normalize-space()='Cancel']");
		public static By savebtn = By.xpath("//button[normalize-space()='Save']");


		public static By bold = By.xpath("//div[@title='Bold']");
		public static By italic = By.xpath("//div[@title='Italic']");
		public static By uderline = By.xpath("//div[@title='Underline']");
		public static By strick = By.xpath("//div[@title='Strikethrough']");
		public static By monos = By.xpath("//div[@title='Monospace']");
		public static By subscrip = By.xpath("//div[@title='Superscript']");
		public static By supscrip = By.xpath("//div[@title='Subscript']");




		public static By normal = By.xpath("//li[@class='rdw-dropdownoption-default rdw-dropdownoption-active ']");
		public static By h1  = By.xpath("//li[normalize-space()='H1']");
		public static By h2 = By.xpath("//li[normalize-space()='H2']");
		public static By h3 = By.xpath("//li[normalize-space()='H3']");
		public static By h4 = By.xpath("//li[normalize-space()='H4']");
		public static By h5 = By.xpath("//li[normalize-space()='H5']");
		public static By h6 = By.xpath("//li[normalize-space()='H6']");
		public static By block = By.xpath("//li[normalize-space()='Blockquote']");
		public static By code = By.xpath("//li[normalize-space()='Code']");


		public static By unorder = By.xpath("//div[@title='Unordered']");
		public static By order = By.xpath("//div[@title='Ordered']");
		public static By indent = By.xpath("//div[@title='Indent']");
		public static By outdent = By.xpath("//div[@title='Outdent']");
		public static By leftind = By.xpath("//div[@title='Left']");
		public static By center = By.xpath("//div[@title='Center']");
		public static By right = By.xpath("//div[@title='Right']");
		public static By justify = By.xpath("//div[@title='Justify']");
		public static By imoje = By.xpath("//div[@title='Emoji']//div[@class='rdw-option-wrapper']");
		public static By link = By.xpath("//div[@title='Link']");
		public static By unkink = By.xpath("//div[@title='Unlink']");



		public static By descerror = By.xpath("//p[@class='error mb-2 mt-0 text-danger font-12']");
		public static By annfielderror = By.xpath("//div[normalize-space()='At least 3 characters should be there']");
		public static By anntypeerror = By.xpath("//div[normalize-space()='Please select announcement type']");
		public static By annfiedblank = By.xpath("//div[normalize-space()='Please enter title']");


		public static By imo1 = By.xpath("//span[contains(text(),'😀')]");
		public static By imo2 = By.xpath("//span[contains(text(),'😍')]");
		public static By imo3 = By.xpath("//span[contains(text(),'😈')]");

		public static By datanot = By.xpath("//img[@alt='No Data Found']");// when show data nor present 
		public static By odattxt = By.xpath("//p[normalize-space()='0 Data Found']");


		public static By donetxt = By.xpath("//div[@class='bg-light text-center modal-header']");
		public static By tickicon = By.xpath("//div[@class='p-4 text-center modal-body']//*[name()='svg']");
		public static By succtxt = By.xpath("//h4[normalize-space()='Successfully Done!']");
		public static By okbtn = By.xpath("//button[normalize-space()='Okay']");


		public static By threedot = By.xpath("//a[@id='react-aria8035856139-13']//i[@class='mdi mdi-dots-horizontal m-0 text-muted h3']");
		public static By timeinblock = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/small[1]");
		public static By updatetxt = By.xpath("//span[@class=\"badge bg-blue text-white mb-0\"]");
		public static By update_img  = By.xpath("//img[@src='/ghostnews/static/media/IconUpdate.fd11b2b9.svg']");
		public static By noticetxt = By.xpath("//span[@class='badge bg-danger text-white mb-0']");
		public static By notice_img = By.xpath("//img[@src='/ghostnews/static/media/IconNotice.192226dd.svg']");


		public static By editlink = By.xpath("//a[normalize-space()='Edit']");
		public static By delelink = By.xpath("//a[normalize-space()='Delete']");
		public static By edit_img = By.xpath("//i[contains(@class,'mdi mdi-pencil me-1')]");
		public static By delet_img = By.xpath("//i[@class='mdi mdi-delete me-1']");


		// menu button 
		public static By  menubtn =By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");	


	/*	// side nav  links
		public static By das = By.xpath("//a[@data-menu-key='dashboards']");
		public static By ann = By.xpath("//a[@data-menu-key='announcements']");
		public static By poll = By.xpath("//a[@data-menu-key='polls']");
		public static By rom = By.xpath("//a[@data-menu-key='roamings']");
		public static By faqc = By.xpath("//a[@data-menu-key='faqcategory']");
		public static By fqs = By.xpath("//a[@data-menu-key='faq']");
		public static By supcat = By.xpath("//a[@data-menu-key='supportcategory']");
		public static By sup = By.xpath("//a[@data-menu-key='support']");
		public static By mancat = By.xpath("//a[@data-menu-key='manualcategory']");
		public static By manu = By.xpath("//a[@data-menu-key='manual']");
		public static By shor = By.xpath("//a[@data-menu-key='shortcuts']"); */

	}
	
	public static class DashboardConst {
		
		// locater 	
		public static By logo = By.xpath("//a[@class='logo logo-light text-center']//span[@class='logo-lg']");	
		public static By  menubtn =By.xpath("//button[@class='button-menu-mobile waves-effect waves-light d-none d-lg-block']");	
//		public static By glivepanel = By.xpath("//div[@class='navbar-custom ']//div[2]//a[1]");
		public static By gtestpanel = By.xpath("//div[@class='row g-0']//div[1]");
		public static By inlogoimg = By.xpath("//i[@class='fe-log-out me-1']");// in logout link near logo 
//		public static By arrimg = By.xpath("//i[@class='mdi mdi-chevron-down']");// near arrow of ghost icon 
		public static By logout = By.xpath("//a[@class='dropdown-item notify-item p-2 bs-2']");// real logout link 
		public static By logoutimg = By.xpath("//img[@class='rounded-circle']");// small ghost logo in logout
		public static By heading = By.xpath("//h4[normalize-space()='Dashboard']");
		public static By logoutlink = By.xpath("//a[@id='dropdown-profile']"); // logout image link of small ghost icon         
		public static By cat = By.xpath("//a[@id='dropdown-apps']");// category icon 
		public static By foot = By.xpath("//div[@class='col-md-6']");
		public static By glink= By.xpath("//a[normalize-space()='Ghost']");
		
		
		// this is all blog image in dashbord 
		public static By imgA = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
		public static By imgR = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
		public static By imgF = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]");
		public static By imgM = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]");
		
		
		// all this are blog in dasboard
		public static By Ann = By.xpath("//p[normalize-space()='Announcements']");
		public static By Rom = By.xpath("//p[normalize-space()='Roaming Countries']");
		public static By faq = By.xpath("//p[normalize-space()='FAQs']");
		public static By man = By.xpath("//p[normalize-space()='Manuals']");
		
	   // side nav  links
		public static By das = By.xpath("//a[@data-menu-key='dashboards']");
		public static By ann = By.xpath("//a[@data-menu-key='announcements']");
		public static By poll = By.xpath("//a[@data-menu-key='polls']");
		public static By rom = By.xpath("//a[@data-menu-key='roamings']");
		public static By faqc = By.xpath("//a[@data-menu-key='faqcategory']");
		public static By fqs = By.xpath("//a[@data-menu-key='faq']");
		public static By supcat = By.xpath("//a[@data-menu-key='supportcategory']");
		public static By sup = By.xpath("//a[@data-menu-key='support']");
		public static By mancat = By.xpath("//a[@data-menu-key='manualcategory']");
		public static By manu = By.xpath("//a[@data-menu-key='manual']");
		public static By shor = By.xpath("//a[@data-menu-key='shortcuts']");
		
		
		// blog conatainns the count number in it
		
		public static By anncount = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
		public static By roaming = By.xpath( "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
		public static By faqs = By.xpath(    "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
		public static By manual = By.xpath(  "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]");
		

		
		// link images
		
		public static By dimg = By.xpath("//a[@data-menu-key='dashboards']//*[name()='svg']");
		public static By aimg = By.xpath("//a[@data-menu-key='announcements']//*[name()='svg']");
		public static By pimg = By.xpath("//a[@data-menu-key='polls']//*[name()='svg']");
		public static By rimg = By.xpath("//a[@data-menu-key='roamings']//*[name()='svg']");
		public static By facimg = By.xpath("//a[@data-menu-key='faqcategory']//*[name()='svg']");
		public static By fqsimg = By.xpath("//a[@data-menu-key='faq']//*[name()='svg']");
		public static By simg = By.xpath("//a[@data-menu-key='supportcategory']//*[name()='svg']");
		public static By supimg = By.xpath("//a[@data-menu-key='support']//*[name()='svg']");
		public static By manimg = By.xpath("//a[@data-menu-key='manualcategory']//*[name()='svg']");
		public static By mimg = By.xpath("//a[@data-menu-key='manual']//*[name()='svg']");
		public static By shimg = By.xpath("//a[@data-menu-key='shortcuts']//*[name()='svg']");
		
	}


}
