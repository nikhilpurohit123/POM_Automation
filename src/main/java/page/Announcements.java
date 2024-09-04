package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Announcements {

	WebDriver driver;
	
	private By annurl = By.xpath("http://146.59.87.38:8080/ghostnews/#/announcements");
	private By annhead = By.xpath("//h4[normalize-space()='Announcements']");// page heading  outer heading 
	private By addbtn = By.xpath("//button[normalize-space()='Add New']"); // 
	private By leftarrow = By.xpath("//button[@class='btn-outline-primary btn btn-outline-primary']");
	private By rightarrow = By.xpath("//button[@class='btn-outline-primary btn btn-outline-primary']");
	private By middlecount = By.xpath("//button[contains(text(),'1')]");
	
	
	private By headann = By.xpath("//div[@class='modal-header']");
	private By type = By.xpath("//label[normalize-space()='Type']");
	private By select = By.xpath("//select[@id='select']");
	private By annTitle = By.xpath("//label[normalize-space()='Announcement Title']");
	private By anntxtfiled = By.xpath("//input[@id='title']");
	private By desc = By.xpath("//p[@class='mb-1']");
	private By cancelbtn = By.xpath("//button[normalize-space()='Cancel']");
	private By savebtn = By.xpath("//button[normalize-space()='Save']");
	
	
	private By bold = By.xpath("//div[@title='Bold']");
	private By italic = By.xpath("//div[@title='Italic']");
	private By uderline = By.xpath("//div[@title='Underline']");
	private By strick = By.xpath("//div[@title='Strikethrough']");
	private By monos = By.xpath("//div[@title='Monospace']");
	private By subscrip = By.xpath("//div[@title='Superscript']");
	private By supscrip = By.xpath("//div[@title='Subscript']");
	
	
	
	
	private By normal = By.xpath("//li[@class='rdw-dropdownoption-default rdw-dropdownoption-active ']");
	private By h1  = By.xpath("//li[normalize-space()='H1']");
	private By h2 = By.xpath("//li[normalize-space()='H2']");
	private By h3 = By.xpath("//li[normalize-space()='H3']");
	private By h4 = By.xpath("//li[normalize-space()='H4']");
	private By h5 = By.xpath("//li[normalize-space()='H5']");
	private By h6 = By.xpath("//li[normalize-space()='H6']");
	private By block = By.xpath("//li[normalize-space()='Blockquote']");
	private By code = By.xpath("//li[normalize-space()='Code']");
	
	
	private By unorder = By.xpath("//div[@title='Unordered']");
	private By order = By.xpath("//div[@title='Ordered']");
	private By indent = By.xpath("//div[@title='Indent']");
	private By outdent = By.xpath("//div[@title='Outdent']");
	private By leftind = By.xpath("//div[@title='Left']");
	private By center = By.xpath("//div[@title='Center']");
	private By right = By.xpath("//div[@title='Right']");
	private By justify = By.xpath("//div[@title='Justify']");
	private By imoje = By.xpath("//div[@title='Emoji']//div[@class='rdw-option-wrapper']");
	private By link = By.xpath("//div[@title='Link']");
	private By unkink = By.xpath("//div[@title='Unlink']");
	
	
	
	private By descerror = By.xpath("//p[@class='error mb-2 mt-0 text-danger font-12']");
	private By annfielderror = By.xpath("//div[normalize-space()='At least 3 characters should be there']");
	private By anntypeerror = By.xpath("//div[normalize-space()='Please select announcement type']");
	private By annfiedblank = By.xpath("//div[normalize-space()='Please enter title']");
	
	
	
	
	
	private By imo1 = By.xpath("//span[contains(text(),'😀')]");
	private By imo2 = By.xpath("//span[contains(text(),'😍')]");
	private By imo3 = By.xpath("//span[contains(text(),'😈')]");
	
	private By datanot = By.xpath("//img[@alt='No Data Found']");// when show data nor present 
	private By odattxt = By.xpath("//p[normalize-space()='0 Data Found']");
	
	
	private By donetxt = By.xpath("//div[@class='bg-light text-center modal-header']");
	private By tickicon = By.xpath("//div[@class='p-4 text-center modal-body']//*[name()='svg']");
	private By succtxt = By.xpath("//h4[normalize-space()='Successfully Done!']");
	private By okbtn = By.xpath("//button[normalize-space()='Okay']");
	
	
	private By threedot = By.xpath("//a[@id='react-aria8035856139-13']//i[@class='mdi mdi-dots-horizontal m-0 text-muted h3']");
	private By timeinblock = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/small[1]");
	private By updatetxt = By.xpath("//span[@class=\"badge bg-blue text-white mb-0\"]");
	private By update_img  = By.xpath("//img[@src='/ghostnews/static/media/IconUpdate.fd11b2b9.svg']");
	private By noticetxt = By.xpath("//span[@class='badge bg-danger text-white mb-0']");
	private By notice_img = By.xpath("//img[@src='/ghostnews/static/media/IconNotice.192226dd.svg']");
	
	
	private By editlink = By.xpath("//a[normalize-space()='Edit']");
	private By delelink = By.xpath("//a[normalize-space()='Delete']");
	private By edit_img = By.xpath("//i[contains(@class,'mdi mdi-pencil me-1')]");
	private By delet_img = By.xpath("//i[@class='mdi mdi-delete me-1']");
 	
	
	
	
	
/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/	
	
	
	
	
	public Announcements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click(By d)
	{
		driver.findElement(d).click();
	}
			
	public void clickOnAnn()
	{
		click(annurl);
	}
	
	public String url()
	{
		return driver.getCurrentUrl();
	}
	
	public String annHeadingTxt()
	{
		return driver.findElement(annhead).getText();
	}
	
	
	
	
}
