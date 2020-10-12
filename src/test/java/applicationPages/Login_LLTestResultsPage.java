package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_LLTestResultsPage extends BasePage
{
	BasePage basepage = new BasePage();
	
	WebDriver driver;
	
	
	public Login_LLTestResultsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//define webelementss
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	WebElement Login;
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;
	@FindBy(how = How.XPATH, using = "//input[@id='crd2']")
	WebElement Radiobutton;
	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement login;
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement LL;
	@FindBy(how = How.XPATH, using = "//a[text()='LL TEST RESULTS']")
	WebElement LLTestResultsLink;
	@FindBy(how = How.XPATH, using = "//input[@name='app_no']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='fetch']")
	WebElement Fetchbutton;
	@FindBy(how = How.XPATH, using = "//select[@name='app_result']")
	WebElement TestResult;
	@FindBy(how = How.XPATH, using = "//input[@id='submitllOffLine']")
	WebElement Submitbutton;
	
	// related methods to perform operation on webelements
		boolean stepstatus;

		public void Clickon_Login_Button() {
			stepstatus = basepage.clickElement(Login);
			reportEvent(stepstatus, "Able to click on Login button", "Unable to click on Login button", driver, true);
		}

		public void setUserName(String Strusername) {
			stepstatus = basepage.setText(Username, Strusername);
			reportEvent(stepstatus, "Able to enter username", "Unable to enter username", driver, true);
		}

		public void setpassword(String Strpassword) {
			stepstatus = basepage.setText(Password, Strpassword);
			reportEvent(stepstatus, "Able to enter password", "Unable to enter password", driver, true);
		}

		public void ClickonLogin() {
			stepstatus = basepage.clickElement(Singin);
			reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button", driver, true);
		}
		public void SelectRTOtype() {
			stepstatus = basepage.clickElement(Radiobutton);
			reportEvent(stepstatus, "Able to click on Radiobutton", "Unable to click on Radiobutton", driver, true);
		}

		public void Clickonlogin() {
			stepstatus = basepage.clickElement(login);
			reportEvent(stepstatus, "Able to click on login-In BUtton", "Unable to click on login Button", driver, true);
		}


		public void ClickonLL_Link() {
			stepstatus = basepage.clickElement(LL);
			reportEvent(stepstatus, "Able to click on LL Link", "Unable to click on LL Link", driver, true);
		}
		public void ClickonLLTestResultsLink() {
			stepstatus = basepage.clickElement(LLTestResultsLink);
			reportEvent(stepstatus, "Able to click on LLTestResults Link", "Unable to click on LLTestResults Link", driver, true);
		}
		public void Set_Application_Number(String value) {
			stepstatus = basepage.setText(Application_Number, value);
			reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
		}
		
		public void ClickonFetchbutton() {
			stepstatus = basepage.clickElement(Fetchbutton);
			reportEvent(stepstatus, "Able to click on Fetchbutton", "Unable to click on Fetchbutton", driver, true);
		}
		
		public void Set_TestResult(String option) {
			stepstatus = basepage.setOptionInSelectBox(TestResult, option);
			reportEvent(stepstatus, "Able to Select TestResult", "Unable to Select TestResult", driver, true);
		}
		public void ClickonbSubmitutton() {
			stepstatus = basepage.clickElement(Submitbutton);
			reportEvent(stepstatus, "Able to click on Submitbutton", "Unable to click on Submitbutton", driver, true);
		}
	
	
	
	
	
}
