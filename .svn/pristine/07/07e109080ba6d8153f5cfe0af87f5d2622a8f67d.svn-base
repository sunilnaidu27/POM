package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LLBacklogPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public LLBacklogPage(WebDriver driver) {
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
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//input[@id='logmode']")
	WebElement otptext;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td/input")
	WebElement Radiobutton;
	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement login;

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement LL;
	@FindBy(how = How.XPATH, using = "//a[text()='LL BACKLOG']")
	WebElement LLBacklog;
	@FindBy(how = How.XPATH, using = "//input[@id='llIssueDate']")
	WebElement Issuedate;
	@FindBy(how = How.XPATH, using = "//input[@id='llNo']")
	WebElement OriginalLLno;
	@FindBy(how = How.XPATH, using = "//input[@id='numLicNo']")
	WebElement NumaricLLNo;
	@FindBy(how = How.XPATH, using = "//input[@name='fname']")
	WebElement NameofLicence;
	@FindBy(how = How.XPATH, using = "//input[@name='lname']")
	WebElement NameofLicenceLastname;
	@FindBy(how = How.XPATH, using = "//select[@id='relation']")
	WebElement Relation;
	@FindBy(how = How.XPATH, using = "//input[@id='gender1']")
	WebElement Gender;
	@FindBy(how = How.XPATH, using = "//input[@id='rfname']")
	WebElement Relationfirstname;
	@FindBy(how = How.XPATH, using = "//input[@id='rlname']")
	WebElement Relationlastname;
	@FindBy(how = How.XPATH, using = "//input[@id='age']")
	WebElement Age;
	@FindBy(how = How.XPATH, using = "//input[@id='mobile']")
	WebElement Mobilephone;
	@FindBy(how = How.XPATH, using = "//select[@id='eduqua']")
	WebElement Qualification;
	@FindBy(how = How.XPATH, using = "//select[@id='prDistrict']")
	WebElement District;
	@FindBy(how = How.XPATH, using = "//select[@id='prSubDistrict']")
	WebElement Tahsil;
	@FindBy(how = How.XPATH, using = "//input[@id='prHouseNo']")
	WebElement Flat_Houseno;
	@FindBy(how = How.XPATH, using = "//input[@id='prStreet']")
	WebElement Street_Locality;
	@FindBy(how = How.XPATH, using = "//input[@id='prPinCode']")
	WebElement Pincode;
	@FindBy(how = How.XPATH, using = "//input[@id='copy']")
	WebElement CopytoPermanentAddressCheckbox;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectClassofVechile;
	@FindBy(how = How.XPATH, using = "//button[text()='=>']")
	WebElement RightarrowClick;
	@FindBy(how = How.XPATH, using = "//button[@id='LLbacklogForm_2']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//input[@id='prPinCode']")
	WebElement PincodeinLLBacklog;

	// related methods to perform operation on webelements

	public void m1(String sv) {

		switch (sv) {
		
		case "S4Preprod": 
			System.out.println("one"); 
			break; 
		case "S4testing": 
			System.out.println("two"); 
			break; 
		case "SarathiCOV": 
			System.out.println("three"); 
			break; 
		default: 
			System.out.println("no match"); 

		}
	}

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

	public void ClickonNext() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click on Next BUtton", "Unable to click on Next Button", driver, true);
	}

	public void setotptext(String Strpassword) {
		stepstatus = basepage.setText(otptext, Strpassword);
		reportEvent(stepstatus, "Able to enter otptext", "Unable to enter otptext", driver, true);
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

	public void Clickon_LL_Link() {
		stepstatus = basepage.clickElement(LL);
		reportEvent(stepstatus, "Able to click on LL Link", "Unable to click on LL Link", driver, true);
	}

	public void Clickon_LLBacklog() {
		stepstatus = basepage.clickElement(LLBacklog);
		reportEvent(stepstatus, "Able to click on LLBacklog", "Unable to click on LLBacklog", driver, true);
	}

	public void Set_Issuedate(String value) {
		stepstatus = basepage.setText(Issuedate, value);
		reportEvent(stepstatus, "Able to Enter Issue Date", "Unable to Enter Issue Date", driver, true);

	}

	public void Set_OriginalLLno(String value) {
		stepstatus = basepage.setText(OriginalLLno, value);
		reportEvent(stepstatus, "Able to Enter OriginalLLno", "Unable to Enter OriginalLLno", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='LL BACKLOG APPROV']")
	WebElement LLBacklogApprove;
	@FindBy(how = How.XPATH, using = "//input[@id='applicationNumber']")
	WebElement LLBacklogApplicationno;
	@FindBy(how = How.XPATH, using = "//input[@id='proceed']")
	WebElement LLBacklogApplicationnoProceed;
	@FindBy(how = How.XPATH, using = "//input[@id='approve']")
	WebElement LLBacklogApprovebutton;

	public void Clickon_LLBacklogApprove() {
		stepstatus = basepage.clickElement(LLBacklogApprove);
		reportEvent(stepstatus, "Able to Click LLBacklogApprove", "Unable to Click LLBacklogApprove", driver, true);
	}

	public void Clickon_LLBacklogApplicationno() {
		stepstatus = basepage.setText(LLBacklogApplicationno, getdata("RefNo"));
		reportEvent(stepstatus, "Able to Click LLBacklogApplicationno", "Unable to Click LLBacklogApplicationno",
				driver, true);
	}

	public void Clickon_LLBacklogApplicationnoProceed() {
		stepstatus = basepage.clickElement(LLBacklogApplicationnoProceed);
		reportEvent(stepstatus, "Able to Click LLBacklogApplicationnoProceed",
				"Unable to Click LLBacklogApplicationnoProceed", driver, true);
	}

	public void Clickon_LLBacklogApprovebutton() {
		stepstatus = basepage.clickElement(LLBacklogApprovebutton);
		reportEvent(stepstatus, "Able to Click LLBacklogApprovebutton", "Unable to Click LLBacklogApprovebutton",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement Logout;

	public void Clickon_Logout() {
		stepstatus = basepage.clickElement(Logout);
		reportEvent(stepstatus, "Able to click on Logout", "Unable to click on Logout", driver, true);
	}

	public void Clickon_LLLink() {
		stepstatus = basepage.clickElement(LL);
		reportEvent(stepstatus, "Able to click on LL", "Unable to click on LL", driver, true);
	}

	public void Set_NumaricLLNo(String value) {
		stepstatus = basepage.setText(NumaricLLNo, value);
		reportEvent(stepstatus, "Able to Enter NumaricLLNo", "Unable to Enter NumaricLLNo", driver, true);
		driver.findElement(By.xpath("//input[@id='numLicNo']")).sendKeys(Keys.TAB);
		wait(3);
		if (basepage.alertExist(driver)) {
			String alerttext = basepage.alertGetText(driver);
			System.out.println(alerttext);
			basepage.acceptAlert(driver);
			String alerttext1 = basepage.alertGetText(driver);
			System.out.println(alerttext1);
			basepage.acceptAlert(driver);
			wait(3);

		} else {

			System.out.println("Fail");
		}

		if (basepage.alertExist(driver)) {
			String alerttext = basepage.alertGetText(driver);
			System.out.println(alerttext);
			basepage.acceptAlert(driver);
			String alerttext1 = basepage.alertGetText(driver);
			System.out.println(alerttext1);
			basepage.acceptAlert(driver);

		} else {

			stepstatus = basepage.setText(NameofLicence, getdata("NL"));
			reportEvent(stepstatus, "Able to Enter NameofLicence", "Unable to Enter NameofLicence", driver, true);

			stepstatus = basepage.setText(NameofLicenceLastname, getdata("NLL"));
			reportEvent(stepstatus, "Able to Enter NameofLicenceLastname", "Unable to Enter NameofLicenceLastname",
					driver, true);

			stepstatus = basepage.clickElement(Gender);
			reportEvent(stepstatus, "Able to Select Gender", "Unable to Select Gender", driver, true);

			stepstatus = basepage.setOptionInSelectBox(Relation, getdata("RLT"));
			reportEvent(stepstatus, "Able to Enter NameofLicenceLastname", "Unable to Enter NameofLicenceLastname",
					driver, true);

			stepstatus = basepage.setText(Relationfirstname, getdata("RFN"));
			reportEvent(stepstatus, "Able to Enter Relationfirstname", "Unable to Enter Relationfirstname", driver,
					true);

			stepstatus = basepage.setText(Relationlastname, getdata("RFLN"));
			reportEvent(stepstatus, "Able to Enter Relationlastname", "Unable to Enter Relationlastname", driver, true);

			stepstatus = basepage.setText(Age, getdata("age"));
			reportEvent(stepstatus, "Able to Enter Age", "Unable to Enter Age", driver, true);

			stepstatus = basepage.setOptionInSelectBox(Qualification, getdata("Qual"));
			reportEvent(stepstatus, "Able to Select Qualification", "Unable to Select Qualification", driver, true);

			stepstatus = basepage.setText(Mobilephone, getdata("Mobilephone"));
			reportEvent(stepstatus, "Able to Enter Mobilephone", "Unable to Enter Mobilephone", driver, true);

			stepstatus = basepage.setOptionInSelectBox(District, getdata("Dist"));
			reportEvent(stepstatus, "Able to Select District", "Unable to Select District", driver, true);

			stepstatus = basepage.setOptionInSelectBox(Tahsil, getdata("Tah"));
			reportEvent(stepstatus, "Able to Select Tahsil", "Unable to Select Tahsil", driver, true);

			stepstatus = basepage.setText(Flat_Houseno, getdata("houseno"));
			reportEvent(stepstatus, "Able to Enter Flat_Houseno", "Unable to Enter Flat_Houseno", driver, true);

			stepstatus = basepage.setText(Street_Locality, getdata("Locality"));
			reportEvent(stepstatus, "Able to Enter Street_Locality", "Unable to Enter Street_Locality", driver, true);

			stepstatus = basepage.setText(PincodeinLLBacklog, getdata("Pin"));
			reportEvent(stepstatus, "Able to Enter Pincode", "Unable to Enter Pincode", driver, true);

			stepstatus = basepage.clickElement(CopytoPermanentAddressCheckbox);
			reportEvent(stepstatus, "Able to Click CopytoPermanentAddressCheckbox",
					"Unable to Click CopytoPermanentAddressCheckbox", driver, true);

			/* Adding First COV */
			stepstatus = basepage.setOptionInSelectBox(SelectClassofVechile, getdata("COV"));
			reportEvent(stepstatus, "Able to Select ClassofVechile", "Unable to Select ClassofVechile", driver, true);

			
			/* Adding Second COV */
		//	stepstatus = basepage.setOptionInSelectBox(SelectClassofVechile, getdata("COV1"));
		//	reportEvent(stepstatus, "Able to Select ClassofVechile", "Unable to Select ClassofVechile", driver, true);

			/* Adding Third COV */
		//	stepstatus = basepage.setOptionInSelectBox(SelectClassofVechile, getdata("COV2"));
		//	reportEvent(stepstatus, "Able to Select ClassofVechile", "Unable to Select ClassofVechile", driver, true);

			
			stepstatus = basepage.clickElement(RightarrowClick);
			reportEvent(stepstatus, "Able to Click RightarrowClick", "Unable to Click RightarrowClick", driver, true);

			stepstatus = basepage.clickElement(Submit);
			reportEvent(stepstatus, "Able to Click Submit", "Unable to Click Submit", driver);

			wait(2);

			if (basepage.alertExist(driver)) {

				basepage.acceptAlert(driver);
			} else {
				basepage.dismissAlert(driver);
			}

		}

	}

}
