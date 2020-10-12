package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LL_Services extends BasePage {
	BasePage basepage = new BasePage();

	// Initilization
	WebDriver driver;
	boolean stepstatus;

	public LL_Services(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelementss

	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;

	public void clickonapplyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='Services on Learners Licence']")
	WebElement ServicesonLearnersLicence;

	public void clickonServicesonLL() {
		stepstatus = basepage.clickElement(ServicesonLearnersLicence);
		reportEvent(stepstatus, "Able to click ServicesonLearnersLicence Link",
				"Unable to click ServicesonLearnersLicence Link", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='llNumber']")
	WebElement LearnersLicencenumber;

	public void SetTextinLearnersLicencenumber(String Value) {
		stepstatus = basepage.setText(LearnersLicencenumber, Value);
		reportEvent(stepstatus, "Able to Enter LearnersLicencenumber", "Unable to Enter LearnersLicencenumber", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='dateOfBirth']")
	WebElement DateofBirth;

	public void SetTextinDateofBirth(String Value) {
		stepstatus = basepage.setText(DateofBirth, Value);
		reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@value='Proceed']")
	WebElement Proceed;

	public void ClickonProceedbutton() {
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@value='Refresh']")
	WebElement Refresh;

	public void ClickonRefreshbutton(String Value) {
		stepstatus = basepage.clickElement(Refresh);
		reportEvent(stepstatus, "Able to click on Refresh", "Unable to click on Refresh", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_cancel']")
	WebElement Cancel;

	public void ClickonCancelbutton(String Value) {
		stepstatus = basepage.clickElement(Cancel);
		reportEvent(stepstatus, "Able to click on Cancel", "Unable to click on Cancel", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_confirm']")
	WebElement Confirm;

	public void ClickonConfirmbtn() {
		stepstatus = basepage.clickElement(Confirm);
		reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_cancel1']")
	WebElement CancelbuttoninConfirmPage;

	public void ClickonCancelbuttoninConfirmPage() {
		stepstatus = basepage.clickElement(CancelbuttoninConfirmPage);
		reportEvent(stepstatus, "Able to click on CancelbuttoninConfirmPage",
				"Unable to click on CancelbuttoninConfirmPage", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_go']")
	WebElement Go;

	public void ClickonGobutton() {
		stepstatus = basepage.clickElement(Go);
		reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='CHANGE OF ADDRESS IN LL']/preceding::input[2]")
	WebElement ChangeofAddressinLL;

	public void ClickChangeofAddressinLLCheckbox() {

		stepstatus = basepage.clickElement(ChangeofAddressinLL);
		reportEvent(stepstatus, "Able to click on ChangeofAddressinLL", "Unable to click on ChangeofAddressinLL",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='CHANGE OF NAME IN LL']/preceding::input[2]")
	WebElement ChangeofNameinLL;

	public void ClickChangeofNameinLLCheckbox() {

		stepstatus = basepage.clickElement(ChangeofNameinLL);
		reportEvent(stepstatus, "Able to click on ChangeofNameinLL", "Unable to click on ChangeofNameinLL", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='DUPLICATE LL']/preceding::input[2]")
	WebElement DuplicateLL;

	public void ClickonDuplicateLLCheckbox() {

		stepstatus = basepage.clickElement(DuplicateLL);
		reportEvent(stepstatus, "Able to click on DuplicateLL", "Unable to click on DuplicateLL", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_submit']")
	WebElement SubmitbuttoninSelectService;

	public void ClickonSubmitbuttoninSelectService() {
		stepstatus = basepage.clickElement(SubmitbuttoninSelectService);
		reportEvent(stepstatus, "Able to click on SubmitbuttoninSelectService",
				"Unable to click on SubmitbuttoninSelectService", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_cancel2']")
	WebElement CancelbuttoninSelectService;

	public void ClickonCancelbuttoninSelectService() {
		stepstatus = basepage.clickElement(CancelbuttoninSelectService);
		reportEvent(stepstatus, "Able to click on CancelbuttoninSelectService",
				"Unable to click on CancelbuttoninSelectService", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='addressType1']")
	WebElement PresentAddress;

	public void ClickonPresentAddress() {
		stepstatus = basepage.clickElement(PresentAddress);
		reportEvent(stepstatus, "Able to click on PresentAddress", "Unable to click on PresentAddress", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='addressType2']")
	WebElement PermenentAddress;

	public void ClickonPermenentAddress() {
		stepstatus = basepage.clickElement(PermenentAddress);
		reportEvent(stepstatus, "Able to click on PermenentAddress", "Unable to click on PermenentAddress", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='presSubDistrict']")
	WebElement SubDist;

	public void SelectSubDist(String value) {
		stepstatus = basepage.setOptionInSelectBox(SubDist, value);
		reportEvent(stepstatus, "Able to select subdist", "Unable to select subdist", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='presCity']")
	WebElement Village;

	public void SelectVillage(String value) {
		stepstatus = basepage.setOptionInSelectBox(Village, value);
		reportEvent(stepstatus, "Able to select Village", "Unable to select Village", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='presHouseNo']")
	WebElement Houseno;

	public void SetHouseno(String value) {
		stepstatus = basepage.setText(Houseno, value);
		reportEvent(stepstatus, "Able to Enter Houseno", "Unable to Enter Houseno", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='presPinCode']")
	WebElement Pincode;

	public void SetPincode(String value) {
		stepstatus = basepage.setText(Pincode, value);
		reportEvent(stepstatus, "Able to Enter Pincode", "Unable to Enter Pincode", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
	WebElement PhoneNo;

	public void SetPhoneNo(String value) {
		stepstatus = basepage.setText(PhoneNo, value);
		reportEvent(stepstatus, "Able to Enter PhoneNo", "Unable to Enter PhoneNo", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_confirm_coa']")
	WebElement Confirmbutton;
	@FindBy(how = How.XPATH, using = "//*[@id='btn_save']")
	WebElement Submitincaptchpage;

	public void ClickonConfirmbutton() {
		stepstatus = basepage.clickElement(Confirmbutton);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
		wait(3);
		WebElement ref = driver.findElement(
				By.xpath("//div[@class='col-md-1 col-sm-1 control-label labeled text-center']/preceding::div[1]/span"));
		wait(3);
		driver.findElement(By.xpath("//*[@name='captcha']")).sendKeys(ref.getAttribute("textContent"));

		wait(2);

		stepstatus = basepage.clickElement(Submitincaptchpage);

		reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_refresh_coa']")
	WebElement Refreshbutton;

	public void ClickonRefreshbutton() {
		stepstatus = basepage.clickElement(Refreshbutton);
		reportEvent(stepstatus, "Able to click on Refreshbutton", "Unable to click on Refreshbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn_cancel_coa']")
	WebElement Cancelbutton;

	public void ClickonCancelbutton() {
		stepstatus = basepage.clickElement(Cancelbutton);
		reportEvent(stepstatus, "Able to click on Cancelbutton", "Unable to click on Cancelbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@value='Exit']")
	WebElement Exitbutton;

	public void ClickonExitbutton() {
		stepstatus = basepage.clickElement(Exitbutton);
		reportEvent(stepstatus, "Able to click on Exitbutton", "Unable to click on Exitbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='trsaction_ack_nextStatus']")
	WebElement Nextbutton;

	public void ClickonNextbutton() {
		stepstatus = basepage.clickElement(Nextbutton);
		reportEvent(stepstatus, "Able to click on Nextbutton", "Unable to click on Nextbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username;

	public void setUserName(String Strusername) {
		stepstatus = basepage.setText(Username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;

	public void setpassword(String Strpassword) {
		stepstatus = basepage.setText(Password, Strpassword);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;

	public void ClickonLogin() {
		stepstatus = basepage.clickElement(Singin);
		reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='crd1'][1]")
	WebElement Radiobutton;

	public void SelectRTOtype() {
		stepstatus = basepage.clickElement(Radiobutton);
		reportEvent(stepstatus, "Able to click on Radiobutton", "Unable to click on Radiobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='crd2']")
	WebElement Radiobutton1;

	public void SelectRTOtypo() {
		stepstatus = basepage.clickElement(Radiobutton1);
		reportEvent(stepstatus, "Able to click on Radiobutton", "Unable to click on Radiobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement login;

	public void Clickonlogin() {
		stepstatus = basepage.clickElement(login);
		reportEvent(stepstatus, "Able to click on login-In BUtton", "Unable to click on login Button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[6]/a")
	WebElement General;

	public void Clickon_General_button() {
		stepstatus = basepage.clickElement(General);
		reportEvent(stepstatus, "Able to click on General BUtton", "Unable to click on General Button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='SCRUTINY']")
	WebElement Scrutiny;

	public void Clickon_Scrutiny_Link() {
		stepstatus = basepage.clickElement(Scrutiny);
		reportEvent(stepstatus, "Able to click on Scrutiny BUtton", "Unable to click on Scrutiny Button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applicationNumber']")
	WebElement RTOApplication_Number;

	public void Set_RTOApplication_Number(String value) {
		stepstatus = basepage.setText(RTOApplication_Number, value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='_scrutiny_proceed']")
	WebElement RTOProceed;

	public void Clickon_RTOProceed_button() {
		stepstatus = basepage.clickElement(RTOProceed);
		reportEvent(stepstatus, "Able to click on Proceed BUtton", "Unable to click on Proceed Button", driver, true);
		basepage.scrooldown(driver);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Verification of Documents']")
	WebElement VerificationofDocuments;

	public void Clickon_VerificationofDocuments_Link() {
		stepstatus = basepage.clickElement(VerificationofDocuments);
		reportEvent(stepstatus, "Able to click on VerificationofDocuments_Link",
				"Unable to click on VerificationofDocuments_Link", driver);
		wait(2);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	@FindBy(how = How.XPATH, using = "//i[text()='Learner Licence']")
	WebElement Firstprooflink;
	@FindBy(how = How.XPATH, using = "//i[text()='Passport']")
	WebElement Secondprooflink;
	@FindBy(how = How.XPATH, using = "//td[@title='Click on to view Proof of Name change (to be specified) proof']/i[text()='Proof of Name change (to be specified)']")
	WebElement Thirdprooflink;
	@FindBy(how = How.XPATH, using = "//input[@id='documentsapproval_0']")
	WebElement windowSubmit;

	public void Clickon_prooflinks() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByURL(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=307419_2216008_504_3-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);
		String title = driver.getTitle();
		System.out.println(title);
		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=307419_2216008_504_3-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(Secondprooflink);
		basepage.SwitchtoWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=307419_2216007_504_2-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);
		String title1 = driver.getTitle();
		System.out.println(title1);
		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=307419_2216007_504_2-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(Thirdprooflink);
		basepage.SwitchtoWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216081_574_17-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216081_574_17-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		basepage.closeWindowByTitle("Documents Approved by Approval Authority", driver);

	}

	@FindBy(how = How.XPATH, using = "//input[@id='approveButton']")
	WebElement Scrutinybutton;

	public void Clickon_Scrutinybutton() {
		stepstatus = basepage.clickElement(Scrutinybutton);
		reportEvent(stepstatus, "Able to click on Scrutinybutton", "Unable to click on Scrutinybutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement LL;

	public void Clickon_LLLink() {
		stepstatus = basepage.clickElement(LL);
		reportEvent(stepstatus, "Able to click on LL", "Unable to click on LL", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='LL ENDORSEMENT APPROVAL']")
	WebElement LLENDORSEMENTAPPROVAL;

	public void Clickon_LLENDORSEMENTAPPROVAL() {
		stepstatus = basepage.clickElement(LLENDORSEMENTAPPROVAL);
		reportEvent(stepstatus, "Able to click on LLENDORSEMENTAPPROVAL", "Unable to click on LLENDORSEMENTAPPROVAL",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applno']")
	WebElement LLEndorsementApplicationNo;

	public void Clickon_LLENDORSEMENTAPPROVALApplicationNo(String value) {
		stepstatus = basepage.SetTextAndTAB(LLEndorsementApplicationNo, value);
		reportEvent(stepstatus, "Able to click on LLEndorsementApplicationNo",
				"Unable to click on LLEndorsementApplicationNo", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='approveButton']")
	WebElement Approvebutton;

	public void Clickon_LLEndorsementApprovebutton() {
		stepstatus = basepage.clickElement(Approvebutton);
		reportEvent(stepstatus, "Able to click on Approvebutton", "Unable to click on Approvebutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='BACK']")
	WebElement Backbutton;

	public void Clickon_Backbutton() {
		stepstatus = basepage.clickElement(Backbutton);
		reportEvent(stepstatus, "Able to click on Backbutton", "Unable to click on Backbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu sub-menu']/li[6]/a[text()='LL PRINTING']")
	WebElement LLPrinting;

	public void Clickon_LLPrinting() {
		stepstatus = basepage.clickElement(LLPrinting);
		reportEvent(stepstatus, "Able to click on LLPrinting", "Unable to click on LLPrinting", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='searchprocess_llsearchopt1']")
	WebElement LLPrintingusingApplicationnumber;

	public void Clickon_LLPrintingusingApplicationnumber() {
		stepstatus = basepage.clickElement(LLPrintingusingApplicationnumber);
		reportEvent(stepstatus, "Able to click on LLPrintingusingApplicationnumber",
				"Unable to click on LLPrintingusingApplicationnumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='Webrefnum']")
	WebElement LLPrintingusingApplicationnumbertextbox;

	public void Set_LLPrintingusingApplicationnumber(String value) {
		stepstatus = basepage.setText(LLPrintingusingApplicationnumbertextbox, value);
		reportEvent(stepstatus, "Able to click on LLPrintingusingApplicationnumbertextbox",
				"Unable to click on LLPrintingusingApplicationnumbertextbox", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='searchprocess_llsearchopt2']")
	WebElement LLPrintingusingLearnerLicenceNumber;

	public void Clickon_LLPrintingusingLearnerLicenceNumber() {
		stepstatus = basepage.clickElement(LLPrintingusingLearnerLicenceNumber);
		reportEvent(stepstatus, "Able to click on LLPrintingApplicationnumber",
				"Unable to click on LLPrintingApplicationnumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='searchprocess_0']")
	WebElement Viewapplications;

	public void Clickon_Viewapplications() {
		stepstatus = basepage.clickElement(Viewapplications);
		reportEvent(stepstatus, "Able to click on Viewapplications", "Unable to click on Viewapplications", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='check']")
	WebElement Checkbox;

	public void Clickon_Checkbox() {
		stepstatus = basepage.clickElement(Checkbox);
		reportEvent(stepstatus, "Able to click on Checkbox", "Unable to click on Checkbox", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//table[@id='licDetTable']/tbody/tr/td[7]/a")
	WebElement LLPrintLink;

	public void Clickon_LLPrintLink() {
		stepstatus = basepage.clickElement(LLPrintLink);
		reportEvent(stepstatus, "Able to click on LLPrintLink", "Unable to click on LLPrintLink", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//textarea[@name='reasonForDuplicate']")
	WebElement Textarea;

	public void Set_ReasonfotDuplicateLL() {
		stepstatus = basepage.setText(Textarea, getdata("Textarea"));
		reportEvent(stepstatus, "Able to Enter reason in textarea", "Unable to Enter reason in textarea", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='btn_confirm_dupll']")
	WebElement ConfirmbtnatduplicateLL;

	public void Clickon_ConfirmbtnatduplicateLL() {
		stepstatus = basepage.clickElement(ConfirmbtnatduplicateLL);
		reportEvent(stepstatus, "Able to clickon ConfirmbtnatduplicateLL", "Unable to clickon ConfirmbtnatduplicateLL",
				driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
		wait(3);
		WebElement ref1 = driver.findElement(
				By.xpath("//div[@class='col-md-1 col-sm-1 control-label labeled text-center']/preceding::div[1]/span"));
		wait(3);
		driver.findElement(By.xpath("//*[@name='captcha']")).sendKeys(ref1.getAttribute("textContent"));

		wait(2);

		stepstatus = basepage.clickElement(Submitincaptchpage);

	}

	@FindBy(how = How.XPATH, using = "//button[@name='dlservices.exit']")
	WebElement ExitbuttoninDuplicateLL;

	public void Clickon_ExitbuttoninDuplicateLL() {
		stepstatus = basepage.clickElement(ExitbuttoninDuplicateLL);
		reportEvent(stepstatus, "Able to click on ExitbuttoninDuplicateLL",
				"Unable to click on ExitbuttoninDuplicateLL", driver, true);
	}

	/* LL Backlog with Approval */
	// // define webelementss
	// @FindBy(how = How.XPATH, using = "//a[text()='Login']")
	// WebElement Login;
	//// @FindBy(how = How.XPATH, using = "//input[@id='username']")
	//// WebElement Username;
	//// @FindBy(how = How.XPATH, using = "//input[@id='password']")
	//// WebElement Password;
	// @FindBy(how = How.XPATH, using = "//input[@name='submit']")
	// WebElement Next;
	// @FindBy(how = How.XPATH, using = "//input[@id='logmode']")
	// WebElement otptext;
	// @FindBy(how = How.XPATH, using = "//input[@name='submit']")
	//// WebElement Singin;
	//// @FindBy(how = How.XPATH, using = "//input[@id='rtos'][2]")
	//// WebElement Radiobutton;
	//// @FindBy(how = How.XPATH, using = "//input[@id='login']")
	//// WebElement login;
	//
	// @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	// WebElement LL;
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
	WebElement PincodeinLLBacklog;
	@FindBy(how = How.XPATH, using = "//input[@id='copy']")
	WebElement CopytoPermanentAddressCheckbox;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectClassofVechile;
	@FindBy(how = How.XPATH, using = "//button[text()='=>']")
	WebElement RightarrowClick;
	@FindBy(how = How.XPATH, using = "//button[@id='LLbacklogForm_2']")
	WebElement Submit;

	@FindBy(how = How.XPATH, using = "//a[text()='LL BACKLOG APPROV']")
	WebElement LLBacklogApprove;
	@FindBy(how = How.XPATH, using = "//input[@id='applicationNumber']")
	WebElement LLBacklogApplicationno;
	@FindBy(how = How.XPATH, using = "//input[@id='proceed']")
	WebElement LLBacklogApplicationnoProceed;
	@FindBy(how = How.XPATH, using = "//input[@id='approve']")
	WebElement LLBacklogApprovebutton;

	// related methods to perform operation on webelements
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement Logout;

	public void clickonLogout() {
		stepstatus = basepage.clickElement(Logout);
		reportEvent(stepstatus, "Able to click Logout Link", "Unable to click Logout Link", driver, true);
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

			stepstatus = basepage.setOptionInSelectBox(SelectClassofVechile, getdata("COV"));
			reportEvent(stepstatus, "Able to Select ClassofVechile", "Unable to Select ClassofVechile", driver, true);

			stepstatus = basepage.clickElement(RightarrowClick);
			reportEvent(stepstatus, "Able to Click RightarrowClick", "Unable to Click RightarrowClick", driver, true);

			stepstatus = basepage.clickElement(Submit);
			reportEvent(stepstatus, "Able to Click Submit", "Unable to Click Submit", driver, true);

			if (basepage.alertExist(driver)) {

				basepage.acceptAlert(driver);
			} else {
				basepage.dismissAlert(driver);
			}

		}

	}

	@FindBy(how = How.XPATH, using = "//*[@name='fullNameEntry']")
	WebElement FullNameasPerRecords;

	public void Set_FullNameasPerRecords() {
		stepstatus = basepage.setText(FullNameasPerRecords, getdata("FullName"));
		reportEvent(stepstatus, "Able to Enter FullNameasPerRecords", "Unable to Enter FullNameasPerRecords", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='fname']")
	WebElement Firstname;

	public void Set_Firstname() {
		stepstatus = basepage.setText(Firstname, getdata("Fname"));
		reportEvent(stepstatus, "Able to Enter Firstname", "Unable to Enter Firstname", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='lname']")
	WebElement Lastname;

	public void Set_Lastname() {
		stepstatus = basepage.setText(Lastname, getdata("Lname"));
		reportEvent(stepstatus, "Able to Enter Lastname", "Unable to Enter Lastname", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='reason']")
	WebElement Reason;

	public void Set_Reason() {
		stepstatus = basepage.setOptionInSelectBox(Reason, getdata("Reason"));
		reportEvent(stepstatus, "Able to Select Reason", "Unable to Select Reason", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='effectDate']")
	WebElement EffectiveDate;

	public void Set_EffectiveDate() {
		stepstatus = basepage.setText(EffectiveDate, getdata("Date"));
		reportEvent(stepstatus, "Able to Enter Lastname", "Unable to Enter Lastname", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[1][@id='btn_confirm_con']")
	WebElement ConfirmButon;

	public void ClickonConfirmButon() {
		stepstatus = basepage.clickElement(ConfirmButon);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

		wait(3);
		WebElement ref1 = driver.findElement(
				By.xpath("//div[@class='col-md-1 col-sm-1 control-label labeled text-center']/preceding::div[1]/span"));
		wait(3);
		driver.findElement(By.xpath("//*[@name='captcha']")).sendKeys(ref1.getAttribute("textContent"));

		wait(2);

		stepstatus = basepage.clickElement(Submitincaptchpage);

		reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

	}

	@FindBy(how = How.XPATH, using = "//i[text()='Learner Licence']")
	WebElement SecondProof;

	@FindBy(how = How.XPATH, using = "//td[@title='Click on to view Proof of Name change (to be specified) proof']/i[text()='Proof of Name change (to be specified)']")
	WebElement FirstProof;

	public void Clickon_prooflinksinLLChangeofname() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(FirstProof);
		basepage.SwitchtoWindowByURL(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216081_574_17-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);
		String title = driver.getTitle();
		System.out.println(title);
		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216081_574_17-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(SecondProof);
		basepage.SwitchtoWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216082_574_3-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);
		String title1 = driver.getTitle();
		System.out.println(title1);
		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=317819_2216082_574_3-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		basepage.closeWindowByTitle("Documents Approved by Approval Authority", driver);

	}

	@FindBy(how = How.XPATH, using = "//td[@title='Click on to view FIR (First Information Report) proof']/i[text()='FIR (First Information Report)']")
	WebElement FirstProofDuplicateDL;

	public void Clickon_prooflinksinDuplicateLL() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(FirstProofDuplicateDL);
		basepage.SwitchtoWindowByURL(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=321719_2216102_502_9-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);
		String title = driver.getTitle();
		System.out.println(title);
		basepage.closeWindowByTitle(
				"http://10.248.93.17/dms-sarthi/search-dms?applno=321719_2216102_502_9-passpic&stateCode=UP&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=6D6C069D681B40DBF95CAD7B3ED71BE1A46F0A7036BC711860B00BAAE50FE8A4%21TZFIMZbTiUtqXMfARJ1DGgyNicWFwYkwTA0ip%2FQ8Wns%3D",
				driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		basepage.closeWindowByTitle("Documents Approved by Approval Authority", driver);

	}
}
