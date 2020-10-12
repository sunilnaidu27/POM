package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DL_Login_ScrutinyPage extends BasePage {
	BasePage basepage = new BasePage();

	// Initilization
	WebDriver driver;

	public DL_Login_ScrutinyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelementss
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	WebElement Login;
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;
	@FindBy(how = How.XPATH, using = "//*[@id='crd3']")
	WebElement Radiobutton;
	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement login;

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[6]/a")
	WebElement General;
	@FindBy(how = How.XPATH, using = "//a[text()='SCRUTINY']")
	WebElement Scrutiny;
	@FindBy(how = How.XPATH, using = "//input[@name='applicationNumber']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='_scrutiny_proceed']")
	WebElement Proceed;


	@FindBy(how = How.XPATH, using = "//input[@id='approveButton']")
	WebElement Scrutinybutton;

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

	public void Clickon_General_button() {
		stepstatus = basepage.clickElement(General);
		reportEvent(stepstatus, "Able to click on General BUtton", "Unable to click on General Button", driver, true);
	}

	public void Clickon_Scrutiny_Link() {
		stepstatus = basepage.clickElement(Scrutiny);
		reportEvent(stepstatus, "Able to click on Scrutiny BUtton", "Unable to click on Scrutiny Button", driver, true);
	}

	public void Set_Application_Number(String value) {
		stepstatus = basepage.setText(Application_Number, value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	public void Clickon_Proceed_button() {
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click on Proceed BUtton", "Unable to click on Proceed Button", driver, true);
		basepage.scrooldown(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Verification of Documents']")
	WebElement VerificationofDocuments;
	public void Clickon_VerificationofDocuments_Link() {
		stepstatus = basepage.clickElement(VerificationofDocuments);
		// reportEvent(stepstatus, "Able to click on VerificationofDocuments_Link",
		// "Unable to click on VerificationofDocuments_Link", driver);
		// wait(2);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	@FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/th[3]/following::td[3]/i")
	WebElement Firstprooflink;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/th[3]/following::tr[2]/td[3]/i")
	WebElement Secondprooflink;
	// @FindBy(how = How.XPATH, using = "//i[text()='Passport']")
	// WebElement Thirdprooflink;
	@FindBy(how = How.XPATH, using = "//input[@id='documentsapproval_0']")
	WebElement windowSubmit;

	public void Clickon_prooflinks() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String firstprooftitle = driver.getTitle();
		System.out.println(firstprooftitle);
		// basepage.SwitchtoWindowByTitle(firstprooftitle, driver);
		basepage.closeWindowByTitle(firstprooftitle, driver);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		/*
		basepage.clickElement(Secondprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String Secondprooftitle = driver.getTitle();
		System.out.println(Secondprooftitle);
		// basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		basepage.closeWindowByTitle(Secondprooftitle, driver);

		// basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		// basepage.clickElement(Thirdprooflink);
		// basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		// basepage.closeWindowByTitle(":::Image Displaying:::", driver);  

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver); */
		basepage.clickElement(windowSubmit);
		// basepage.closeWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		basepage.SwitchtoWindowByTitle("Scrutiny", driver);

	}

	public void Clickon_Scrutinybutton() {
		stepstatus = basepage.clickElement(Scrutinybutton);
		reportEvent(stepstatus, "Able to click on Scrutinybutton", "Unable to click on Scrutinybutton", driver, true);
	}
}
