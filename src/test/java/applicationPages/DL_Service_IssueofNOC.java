package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DL_Service_IssueofNOC extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public DL_Service_IssueofNOC(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='frmsubmt']")
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//input[@name='mode']")
	WebElement Captcha;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//input[@id='crd1']")
	WebElement Radio;
	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	WebElement login;
	// @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[4]/a")
	// WebElement DL;
	@FindBy(how = How.XPATH, using = "//a[text()='DL ']")
	WebElement DL;
	@FindBy(how = How.XPATH, using = "//a[text()='DL BACKLOG']")
	WebElement DLBacklog;
	@FindBy(how = How.XPATH, using = "//input[@id='dlIssueDate']")
	WebElement Firstissuedate;
	@FindBy(how = How.XPATH, using = "//input[@id='ndlNo']")
	WebElement NumaricLLno;
	@FindBy(how = How.XPATH, using = "//input[@id='odlNo']")
	WebElement OriginalDLno;
	@FindBy(how = How.XPATH, using = "//input[@id='fname']")
	WebElement Name;
	@FindBy(how = How.XPATH, using = "//input[@id='mname']")
	WebElement MiddleName;
	@FindBy(how = How.XPATH, using = "//input[@id='lname']")
	WebElement LastName;

	@FindBy(how = How.XPATH, using = "//select[@id='relation']")
	WebElement Relation;
	@FindBy(how = How.XPATH, using = "//input[@id='rfname']")
	WebElement Relationfirstname;
	@FindBy(how = How.XPATH, using = "//input[@id='rmname']")
	WebElement RelationMiddlename;
	@FindBy(how = How.XPATH, using = "//input[@id='rlname']")
	WebElement RelationLastname;

	@FindBy(how = How.XPATH, using = "//input[@id='gender1']")
	WebElement Gender;
	@FindBy(how = How.XPATH, using = "//select[@id='blood']")
	WebElement Bloodgroup;
	@FindBy(how = How.XPATH, using = "//input[@id='age']")
	WebElement Age;
	@FindBy(how = How.XPATH, using = "//select[@id='eduqua']")
	WebElement Qualification;
	@FindBy(how = How.XPATH, using = "//input[@id='mobile']")
	WebElement Mobilenumber;
	@FindBy(how = How.XPATH, using = "//select[@id='prState']")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//select[@id='prDistrict']")
	WebElement District;
	@FindBy(how = How.XPATH, using = "//select[@id='prSubDistrict']")
	WebElement SubDistrict;
	@FindBy(how = How.XPATH, using = "//input[@id='prPinCode']")
	WebElement Pincode;
	@FindBy(how = How.XPATH, using = "//input[@id='copy']")
	WebElement Checkbox;
	@FindBy(how = How.XPATH, using = "//li[2][@role='presentation']/a")
	WebElement LicenseDetails;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectCOV1;
	@FindBy(how = How.XPATH, using = "//input[@id='addButton']")
	WebElement Addbutton1;
	@FindBy(how = How.XPATH, using = "//select[@name='state1']")
	WebElement Stateone;
	@FindBy(how = How.XPATH, using = "//select[@name='issuAuthList']")
	WebElement RTOone;
	@FindBy(how = How.XPATH, using = "//input[@id='covIssuDate']")
	WebElement COVIssueDate1;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectCOV2;
	@FindBy(how = How.XPATH, using = "//input[@id='addButton']")
	WebElement Addbutton2;

	@FindBy(how = How.XPATH, using = "//select[@name='state1']")
	WebElement Statetwo;
	@FindBy(how = How.XPATH, using = "//select[@name='issuAuthList']")
	WebElement RTOtwo;
	@FindBy(how = How.XPATH, using = "//input[@id='covIssuDate']")
	WebElement COVIssueDate2;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectCOV3;
	@FindBy(how = How.XPATH, using = "//input[@id='addButton']")
	WebElement Addbutton3;

	@FindBy(how = How.XPATH, using = "//input[@name='badgeNO']")
	WebElement badgeNO;
	@FindBy(how = How.XPATH, using = "//input[@name='badgeDate']")
	WebElement badgeDate;

	@FindBy(how = How.XPATH, using = "//select[@name='state1']")
	WebElement Statethree;
	@FindBy(how = How.XPATH, using = "//select[@name='issuAuthList']")
	WebElement RTOthree;
	@FindBy(how = How.XPATH, using = "//input[@id='covIssuDate']")
	WebElement COVIssueDate3;
	@FindBy(how = How.XPATH, using = "//select[@id='selectCov']")
	WebElement SelectCOV4;
	@FindBy(how = How.XPATH, using = "//input[@id='addButton']")
	WebElement Addbutton4;

	@FindBy(how = How.XPATH, using = "//input[@id='subToDB']")
	WebElement Submit1;

	// Service
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "(//li)[15]/a")
	WebElement ServicesonDL;
	@FindBy(how = How.XPATH, using = "//select[@name='stfNameId']")
	WebElement StateSelection;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(how = How.XPATH, using = "//input[@name='dlno']")
	WebElement DLnumber;
	@FindBy(how = How.XPATH, using = "//input[@name='dob']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@value='GO']")
	WebElement Gobutton;
	@FindBy(how = How.XPATH, using = "//select[@name='dispDLDet']")
	WebElement ConfirmedthattheaboveDrivingLicencedetailsaremine;
	@FindBy(how = How.XPATH, using = "//select[@name='stateCodeDLTr']")
	WebElement SubmitRequestStateSelection;
	@FindBy(how = How.XPATH, using = "//select[@name='rtoCodeDLTr']")
	WebElement SubmitRequestRTOSelection;
	@FindBy(how = How.XPATH, using = "//input[@name='dlconfirm']")
	WebElement Proceedbutton;
	@FindBy(how = How.XPATH, using = "//input[@name='enve.confirm']")
	WebElement Confirmbutton;
	@FindBy(how = How.XPATH, using = "//input[@value='CHANGE OF NAME IN DL']")
	WebElement ChangeofnameinDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement Proceed1;
	@FindBy(how = How.XPATH, using = "//select[@id='conreasoncd']")
	WebElement SelectreasonforChangeofName;
	@FindBy(how = How.XPATH, using = "//input[@id='fname']")
	WebElement Newname;
	@FindBy(how = How.XPATH, using = "//select[@name='swd']")
	WebElement Relation1;
	@FindBy(how = How.XPATH, using = "//input[@name='connaturalname']")
	WebElement FullNameasperRecords;
	@FindBy(how = How.XPATH, using = "//input[@name='effdate']")
	WebElement EffectiveFrom;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement Confirm;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement Disclaimer;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement Captcha1;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptcha;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement Applicationno;

	////////////////// DLBacklogapproval//////////////

	@FindBy(how = How.XPATH, using = "//a[text()='DL BACKLOG APPROVAL']")
	WebElement DLBACKLOGAPPROVAL;
	@FindBy(how = How.XPATH, using = "//input[@id='dlNumber']")
	WebElement DLno;
	@FindBy(how = How.XPATH, using = "//input[@id='proceed']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//input[@id='Approve']")
	WebElement Approve;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	/* Applying Service */

	@FindBy(how = How.XPATH, using = "//input[@value='CHANGE OF ADDRESS IN DL']")
	WebElement ChangeofAddressinDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinDLService;
	@FindBy(how = How.XPATH, using = "//input[@value='Permanent']")
	WebElement Permanent;
	@FindBy(how = How.XPATH, using = "//input[@value='Present']")
	WebElement PresentAddress;
	@FindBy(how = How.XPATH, using = "//input[@value='Both']")
	WebElement BothAddresses;
	@FindBy(how = How.XPATH, using = "//select[@name='prmStateCoa']")
	WebElement StateinDLService;
	@FindBy(how = How.XPATH, using = "//select[@name='prmDistCoa']")
	WebElement DistrictinDLService;
	@FindBy(how = How.XPATH, using = "//select[@name='prmMandalCoa']")
	WebElement Tahsil;
	@FindBy(how = How.XPATH, using = "//input[@name='prmPincodeCoa']")
	WebElement PincodeinDLService;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinDLService;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinDLService;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinDLService;

	/* Applying RenewalService */
	@FindBy(how = How.XPATH, using = "//input[@value='RENEWAL OF DL']")
	WebElement RenewalofDL;

	/* Applying IssueofDuplicateDLService */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE OF DUPLICATE DL']")
	WebElement IssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//select[@name='dupreasoncd']")
	WebElement ReasontoissueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinIssueofduplicateDL;

	/* ReplacementofDL */

	@FindBy(how = How.XPATH, using = "//input[@value='REPLACEMENT OF DL']")
	WebElement ReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinReplacementofDL;

	/* IssueofNOC */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE OF NOC']")
	WebElement IssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionstateCodeDLTr']")
	WebElement StateinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionrtoCodeDLTr']")
	WebElement RTOinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionreasoncd']")
	WebElement ReasonforNOCinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinIssueofNOC;

	// related methods to perform operation on webelements

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

	public void SetCaptcha() {
		stepstatus = basepage.setText(Captcha, "123456");
		reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha", driver, true);
	}

	public void Clickonsubmit() {
		stepstatus = basepage.clickElement(submit);
		reportEvent(stepstatus, "Able to click on submit BUtton", "Unable to click on submit Button", driver, true);
	}

	public void ClickonRadio() {
		stepstatus = basepage.clickElement(Radio);
		reportEvent(stepstatus, "Able to click on Radio BUtton", "Unable to click on Radio Button", driver, true);
	}

	public void Clickonlogin() {
		stepstatus = basepage.clickElement(login);
		reportEvent(stepstatus, "Able to click on Radio BUtton", "Unable to click on Radio Button", driver, true);
	}

	public void ClickonDL() {
		stepstatus = basepage.clickElement(DL);
		reportEvent(stepstatus, "Able to Click on DL", "Unable to Click on DL", driver, true);
	}

	public void ClickonDLBacklog() {
		stepstatus = basepage.clickElement(DLBacklog);
		reportEvent(stepstatus, "Able to Click on DLBacklog", "Unable to Click on DLBacklog", driver, true);
	}

	public void SetFirstissuedate(String value) {
		stepstatus = basepage.setText(Firstissuedate, value);
		reportEvent(stepstatus, "Able to Enter Firstissuedate", "Unable to Enter Firstissuedate", driver, true);
	}

	public void SetNumaricLLno(String value) {
		stepstatus = basepage.setText(NumaricLLno, value);
		reportEvent(stepstatus, "Able to Enter NumaricLLno", "Unable to Enter NumaricLLno", driver, true);
	}

	public void SetOriginalDLno(String value) {
		stepstatus = basepage.setText(OriginalDLno, value);
		reportEvent(stepstatus, "Able to Enter OriginalDLno", "Unable to Enter OriginalDLno", driver, true);
	}

	public void SetName(String value) {
		stepstatus = basepage.setText(Name, value);
		reportEvent(stepstatus, "Able to Enter Name", "Unable to Enter Name", driver, true);
	}

	public void SetMiddleName(String value) {
		stepstatus = basepage.setText(MiddleName, value);
		reportEvent(stepstatus, "Able to Enter MiddleName", "Unable to Enter MiddleName", driver, true);
	}

	public void SetLastName(String value) {
		stepstatus = basepage.setText(LastName, value);
		reportEvent(stepstatus, "Able to Enter LastName", "Unable to Enter LastName", driver, true);
	}

	public void SetRelation(String value) {
		stepstatus = basepage.setOptionInSelectBox(Relation, value);
		reportEvent(stepstatus, "Able to Enter Relation", "Unable to Enter Relation", driver, true);
	}

	public void SetRelationfirstname(String value) {
		stepstatus = basepage.setText(Relationfirstname, value);
		reportEvent(stepstatus, "Able to Enter Relationfirstname", "Unable to Enter Relationfirstname", driver, true);
	}

	public void SetRelationMiddlename(String value) {
		stepstatus = basepage.setText(RelationMiddlename, value);
		reportEvent(stepstatus, "Able to Enter RelationMiddlename", "Unable to Enter RelationMiddlename", driver, true);
	}

	public void SetRelationLastname(String value) {
		stepstatus = basepage.setText(RelationLastname, value);
		reportEvent(stepstatus, "Able to Enter RelationLastname", "Unable to Enter RelationLastname", driver, true);
	}

	public void ClickonGender() {
		stepstatus = basepage.clickElement(Gender);
		reportEvent(stepstatus, "Able to click on Gender", "Unable to click on Gender", driver, true);
	}

	public void SetBloodgroup(String value) {
		stepstatus = basepage.setOptionInSelectBox(Bloodgroup, value);
		reportEvent(stepstatus, "Able to Enter Bloodgroup", "Unable to Enter Bloodgroup", driver, true);
	}

	public void SetAge(String value) {
		stepstatus = basepage.setText(Age, value);
		reportEvent(stepstatus, "Able to Enter Age", "Unable to Enter Age", driver, true);
	}

	public void SetQualification(String value) {
		stepstatus = basepage.setOptionInSelectBox(Qualification, value);
		reportEvent(stepstatus, "Able to Enter Qualification", "Unable to Enter Qualification", driver, true);
	}

	public void SetMobilenumber(String value) {
		stepstatus = basepage.setText(Mobilenumber, value);
		reportEvent(stepstatus, "Able to Enter Mobilenumber", "Unable to Enter Mobilenumber", driver, true);
	}

	public void SetState(String value) {
		stepstatus = basepage.setOptionInSelectBox(State, value);
		reportEvent(stepstatus, "Able to Enter State", "Unable to Enter State", driver, true);
	}

	public void SetDistrict(String value) {
		stepstatus = basepage.setOptionInSelectBox(District, value);
		reportEvent(stepstatus, "Able to Enter District", "Unable to Enter District", driver, true);
	}

	public void SetSubDistrict(String value) {
		stepstatus = basepage.setOptionInSelectBox(SubDistrict, value);
		reportEvent(stepstatus, "Able to Enter SubDistrict", "Unable to Enter SubDistrict", driver, true);
	}

	public void SetPincode(String value) {
		stepstatus = basepage.setText(Pincode, value);
		reportEvent(stepstatus, "Able to Enter Pincode", "Unable to Enter Pincode", driver, true);
	}

	public void ClickonCheckbox() {
		stepstatus = basepage.clickElement(Checkbox);
		reportEvent(stepstatus, "Able to click on Checkbox", "Unable to click on Checkbox", driver, true);
	}

	public void ClickonLicenseDetails() {
		stepstatus = basepage.clickElement(LicenseDetails);
		reportEvent(stepstatus, "Able to click on LicenseDetails", "Unable to click on LicenseDetails", driver, true);
	}

	public void SetSelectCOV1(String value) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV1, value);
		reportEvent(stepstatus, "Able to Enter SelectCOV1", "Unable to Enter SelectCOV1", driver, true);
	}

	public void ClickonAddbutton1() {
		stepstatus = basepage.clickElement(Addbutton1);
		reportEvent(stepstatus, "Able to click on Addbutton1", "Unable to click on Addbutton1", driver, true);
	}

	public void SetStateone(String value) {
		stepstatus = basepage.setOptionInSelectBox(Stateone, value);
		reportEvent(stepstatus, "Able to Enter Stateone", "Unable to Enter Stateone", driver, true);
	}

	public void SetRTOone(String value) {
		stepstatus = basepage.setOptionInSelectBox(RTOone, value);
		reportEvent(stepstatus, "Able to Enter RTOone", "Unable to Enter RTOone", driver, true);
	}

	public void SetCOVIssueDate1(String value) {
		stepstatus = basepage.setText(COVIssueDate1, value);
		reportEvent(stepstatus, "Able to Enter COVIssueDate1", "Unable to Enter COVIssueDate1", driver, true);
	}

	public void SetSelectCOV2(String value) {

		stepstatus = basepage.setOptionInSelectBox(SelectCOV2, value);
		reportEvent(stepstatus, "Able to Enter SelectCOV2", "Unable to Enter SelectCOV2", driver, true);
	}

	public void ClickonAddbutton2() {
		stepstatus = basepage.clickElement(Addbutton2);
		reportEvent(stepstatus, "Able to click on Addbutton2", "Unable to click on Addbutton2", driver, true);
	}

	public void SetStatetwo(String value) {
		stepstatus = basepage.setOptionInSelectBox(Statetwo, value);
		reportEvent(stepstatus, "Able to Enter Statetwo", "Unable to Enter Statetwo", driver, true);
	}

	public void SetRTOtwo(String value) {
		stepstatus = basepage.setOptionInSelectBox(RTOtwo, value);
		reportEvent(stepstatus, "Able to Enter RTOtwo", "Unable to Enter RTOtwo", driver, true);
	}

	public void SetCOVIssueDate2(String value) {
		stepstatus = basepage.setText(COVIssueDate2, value);
		reportEvent(stepstatus, "Able to Enter COVIssueDate2", "Unable to Enter COVIssueDate2", driver, true);
	}

	public void SetSelectCOV3(String value) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV3, value);
		reportEvent(stepstatus, "Able to Enter SelectCOV3", "Unable to Enter SelectCOV3", driver, true);
	}

	public void ClickonAddbutton3() {
		stepstatus = basepage.clickElement(Addbutton3);
		reportEvent(stepstatus, "Able to click on Addbutton3", "Unable to click on Addbutton3", driver, true);
	}

	public void setbadgeno(String value) {
		stepstatus = basepage.setText(badgeNO, value);
		reportEvent(stepstatus, "Able to enter badgeNO", "Unable to enter badgeNO", driver, true);
	}

	public void SetbadgeDate(String value) {
		stepstatus = basepage.setText(badgeDate, value);
		reportEvent(stepstatus, "Able to enter badgeNO", "Unable to enter badgeNO", driver, true);
	}

	public void SetStatethreeo(String value) {
		stepstatus = basepage.setOptionInSelectBox(Statethree, value);
		reportEvent(stepstatus, "Able to Enter Statethree", "Unable to Enter Statethree", driver, true);
	}

	public void SetRTOthree(String value) {
		stepstatus = basepage.setOptionInSelectBox(RTOthree, value);
		reportEvent(stepstatus, "Able to Enter RTOthree", "Unable to Enter RTOthree", driver, true);
	}

	public void SetCOVIssueDate3(String value) {
		stepstatus = basepage.setText(COVIssueDate3, value);
		reportEvent(stepstatus, "Able to Enter COVIssueDate3", "Unable to Enter COVIssueDate3", driver, true);
	}

	public void SetSelectCOV4(String value) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV4, value);
		reportEvent(stepstatus, "Able to Enter SelectCOV4", "Unable to Enter SelectCOV4", driver, true);
	}

	public void ClickonAddbutton4() {
		stepstatus = basepage.clickElement(Addbutton4);
		reportEvent(stepstatus, "Able to click on Addbutton4", "Unable to click on Addbutton4", driver, true);
	}

	public void ClickonSubmit() {
		stepstatus = basepage.clickElement(Submit);
		reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	public void ClickonDlbacklogapproval() {
		stepstatus = basepage.clickElement(DLBACKLOGAPPROVAL);
		reportEvent(stepstatus, "Able to click on DLBACKLOGAPPROVAL", "Unable to click on DLBACKLOGAPPROVAL", driver,
				true);
	}

	public void SetDLno() {
		stepstatus = basepage.setText(DLno, s1.substring(16).trim());
		reportEvent(stepstatus, "Able to Enter DLno", "Unable to DLno", driver, true);
	}

	public void Clickonproceed() {
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='generateotp']")
	WebElement GenerateOTP;
	@FindBy(how = How.XPATH, using = "//input[@name='otpNumberForDlBacklog']")
	WebElement Enterotptext;

	public void ClickonGenerateOTP() {
		stepstatus = basepage.clickElement(GenerateOTP);
		wait(3);
		String text = null;
		if (basepage.alertExist(driver)) {
			text = basepage.alertGetText(driver);
			System.out.println("Otp Text is : " + text.substring(71, 77).trim());

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please Enter Text as shown: ");
		// String cap1 = sc.next();
		// wait(12);
		//
		// String s = JOptionPane.showInputDialog("Please Enter OTP");
		// System.out.println(s);
		// basepage.setText(Enterotptext, s);
		basepage.SetTextAndTAB(Enterotptext, text.substring(71, 77).trim());

		wait(2);
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	public void Clickonapprove() {
		stepstatus = basepage.clickElement(Approve);
		reportEvent(stepstatus, "Able to click on Approve", "Unable to click on Approve", driver, true);
	}

	public void Logout() {

		stepstatus = basepage.clickElement(logout);
		reportEvent(stepstatus, "Able to click On logout", "UnAble to click On logout", driver);
	}

	// service

	public void SelcectService(int ServiceCode) {

		switch (ServiceCode) {
		case 526:

			System.out.println("***********Welcome to ChangeofName in_DL_Service************");
			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ChangeofnameinDL);
			reportEvent(stepstatus, "Able to click on ChangeofnameinDL", "Unable to click on ChangeofnameinDL", driver,
					true);

			stepstatus = basepage.clickElement(Proceed1);
			reportEvent(stepstatus, "Able to click on Proceed1", "Unable to click on Proceed1", driver, true);

			wait(2);

			stepstatus = basepage.setOptionInSelectBox(SelectreasonforChangeofName, getdata("Reason"));
			reportEvent(stepstatus, "Able to Select reason", "Unable to Select reason", driver, true);

			stepstatus = basepage.setText(Newname, getdata("NewName"));
			reportEvent(stepstatus, "Able to Enter Newname", "Unable to Enter Newname", driver, true);

			stepstatus = basepage.SetTextAndTAB(EffectiveFrom, getdata("EffectiveFrom"));
			reportEvent(stepstatus, "Able to Enter EffectiveFrom", "Unable to Enter EffectiveFrom", driver, true);

			wait(1);

			stepstatus = basepage.clickElement(Confirm);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(Disclaimer);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(Submit1);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			break;

		case 515:

			System.out.println("***********Welcome to ChangeofAddress_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ChangeofAddressinDL);
			reportEvent(stepstatus, "Able to click on ChangeofAddressinDL", "Unable to click on ChangeofAddressinDL",
					driver, true);

			stepstatus = basepage.clickElement(ProceedinDLService);
			reportEvent(stepstatus, "Able to click on ProceedinDLService", "Unable to click on ProceedinDLService",
					driver, true);

			stepstatus = basepage.clickElement(Permanent);
			reportEvent(stepstatus, "Able to click on Permanent", "Unable to click on Permanent", driver, true);

			stepstatus = basepage.setOptionInSelectBox(StateinDLService, getdata(""));
			reportEvent(stepstatus, "Able to Select StateinDLService", "Unable to Select StateinDLService", driver,
					true);

			stepstatus = basepage.setOptionInSelectBox(DistrictinDLService, getdata(""));
			reportEvent(stepstatus, "Able to Select DistrictinDLService", "Unable to Select DistrictinDLService",
					driver, true);

			stepstatus = basepage.setOptionInSelectBox(Tahsil, getdata(""));
			reportEvent(stepstatus, "Able to Select Tahsil", "Unable to Select Tahsil", driver, true);

			stepstatus = basepage.setText(PincodeinDLService, getdata(""));
			reportEvent(stepstatus, "Able to Enter PincodeinDLService", "Unable to Enter PincodeinDLService", driver,
					true);

			stepstatus = basepage.clickElement(ConfirminDLService);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinDLService);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref1 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref1.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinDLService);
			reportEvent(stepstatus, "Able to click on SubmitinDLService", "Unable to click on SubmitinDLService",
					driver, true);

			break;
		case 514:

			System.out.println("***********Welcome to RenewalofDL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(RenewalofDL);
			reportEvent(stepstatus, "Able to click on RenewalofDL", "Unable to click on RenewalofDL", driver, true);

			stepstatus = basepage.clickElement(ProceedinDLService);
			reportEvent(stepstatus, "Able to click on ProceedinDLService", "Unable to click on ProceedinDLService",
					driver, true);

			stepstatus = basepage.clickElement(DisclaimerinDLService);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref2 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref2.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinDLService);
			reportEvent(stepstatus, "Able to click on SubmitinDLService", "Unable to click on SubmitinDLService",
					driver, true);

			break;
		case 513:
			System.out.println("***********Welcome to RenewalofDL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on IssueofduplicateDL", "Unable to click on IssueofduplicateDL",
					driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ReasontoissueofduplicateDL, getdata(""));
			reportEvent(stepstatus, "Able to Select ReasontoissueofduplicateDL",
					"Unable to Select ReasontoissueofduplicateDL", driver, true);

			stepstatus = basepage.clickElement(ConfirminIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref3 = driver.findElement(By.xpath("//span[@id='captchaViewer']/text()"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref3.getAttribute("value"));
			// stepstatus = basepage.setText(CaptchainIssueofduplicateDL,
			// Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			break;

		case 516:
			System.out.println("***********Welcome to ReplacementofDL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ReplacementofDL);
			reportEvent(stepstatus, "Able to click on ReplacementofDL", "Unable to click on ReplacementofDL", driver,
					true);

			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.clickElement(Disclaimer);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref4 = driver.findElement(By.xpath("//span[@id='captchaViewer']/text()"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref4.getAttribute("value"));
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(Submit);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);
			break;
		case 522:

			System.out.println("***********Welcome to IssueofNOC_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofNOC);
			reportEvent(stepstatus, "Able to click on IssueofNOC", "Unable to click on IssueofNOC", driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.setOptionInSelectBox(StateinIssueofNOC, getdata("State"));
			reportEvent(stepstatus, "Able to Select State", "Unable to Select State", driver, true);
			

			stepstatus = basepage.setOptionInSelectBox(RTOinIssueofNOC, getdata("serrto"));
			reportEvent(stepstatus, "Able to Select RTO", "Unable to Select RTO", driver, true);
			stepstatus = basepage.setOptionInSelectBox(RTOinIssueofNOC, getdata("serrto"));

			stepstatus = basepage.setOptionInSelectBox(ReasonforNOCinIssueofNOC, getdata("ReasonforNOC"));
			reportEvent(stepstatus, "Able to Select ReasonforNOC", "Unable to Select ReasonforNOC", driver, true);
			wait(1);
			stepstatus = basepage.clickElement(ConfirminIssueofNOC);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref5 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref5.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);
			break;

		case 7:
			System.out.println("ISSUE INTERNATIONAL DRIVING PERMIT Service is Selected");
			break;
		case 8:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 9:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 10:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 11:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 12:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 13:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 14:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 15:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 17:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 18:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 19:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;

		default:
			System.out.println("INVALID SERVICE PLEASE TRY AGAIN");

		}

	}

	@FindBy(how = How.XPATH, using = "//button[@name='dlservices.exit']")
	WebElement Exit;

	public void Clickon_Exitbutton() {
		stepstatus = basepage.clickElement(Exit);
		reportEvent(stepstatus, "Able to Click Exit", "Unable to Click Exit", driver, true);
	}
	@FindBy(how = How.XPATH, using = "//input[@value='Home']")
	WebElement TempHomebutton;

	public void Clickon_TempHomebutton() {

		stepstatus = basepage.clickElement(TempHomebutton);
		reportEvent(stepstatus, "Able to click On TempHomebutton", "UnAble to click On TempHomebutton", driver);
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
		 * Second Document
		 * 
		 * basepage.clickElement(Secondprooflink);
		 * basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver); String
		 * Secondprooftitle = driver.getTitle(); System.out.println(Secondprooftitle);
		 * // basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		 * basepage.closeWindowByTitle(Secondprooftitle, driver);
		 * basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		 * driver);
		 * 
		 */

		basepage.clickElement(windowSubmit);

		basepage.SwitchtoWindowByTitle("Scrutiny", driver);

	}

	@FindBy(how = How.XPATH, using = "//input[@id='approveButton']")
	WebElement Scrutinybutton;

	public void Clickon_Scrutinybutton() {
		stepstatus = basepage.clickElement(Scrutinybutton);
		reportEvent(stepstatus, "Able to click on Scrutinybutton", "Unable to click on Scrutinybutton", driver, true);
	}

	/* Bio Metrics */

	@FindBy(how = How.XPATH, using = "//a[text()='CAPTURE PHOTO & SIGNATURE']")
	WebElement BiometricsinRenualService;
	@FindBy(how = How.XPATH, using = "//input[@name='appnumber']")
	WebElement Application_NumberinRenualService;
	@FindBy(how = How.XPATH, using = "//button[@id='thumbdetform__populateData']")
	WebElement GetdetailsinRenualService;
	@FindBy(how = How.XPATH, using = "html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas")
	WebElement CanvasSignatureinRenualService;
	@FindBy(how = How.XPATH, using = "//button[@id='capBtn']")
	WebElement CaptureSignatureinRenualService;
	@FindBy(how = How.XPATH, using = "//div[@class='dojoTab']/div/span[text()='Photo Capture']")
	WebElement PhotoCaptureinRenualService;
	@FindBy(how = How.XPATH, using = "//li[@class='crop']")
	WebElement CropSelectedinRenualService;
	@FindBy(how = How.XPATH, using = "//li[@class='trigger']")
	WebElement PhototriggerinRenualService;
	@FindBy(how = How.XPATH, using = "//input[@id='photoCaptre']")
	WebElement SnapokinRenualService;
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 top-space text-center']/input[1]")
	WebElement SaveinRenualService;

	public void Clickon_BiometricsLink() {
		stepstatus = basepage.clickElement(BiometricsinRenualService);
		reportEvent(stepstatus, "Able to click on Biometrics Link", "Unable to click on Biometrics Link", driver, true);
	}

	public void Set_Application_NumbeinRenualServicer(String Value) {
		stepstatus = basepage.setText(Application_NumberinRenualService, Value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	public void Clickon_Getdetails() {
		stepstatus = basepage.clickElement(GetdetailsinRenualService);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	public void Set_CanvasSignature(String ObjectXpath) {
		wait(2);
		stepstatus = basepage.CaptureSignature(driver, CanvasSignatureinRenualService, ObjectXpath);
		reportEvent(stepstatus, "Able to do CanvasSignature ", "Unable to do CanvasSignature", driver, true);
		wait(2);
		basepage.scrooldown(driver);
	}

	public void Clickon_Capturesignaturebutton() {
		stepstatus = basepage.clickElement(CaptureSignatureinRenualService);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	public void Set_PhotoCapture() {
		stepstatus = basepage.clickElement(PhotoCaptureinRenualService);
		reportEvent(stepstatus, "Able to do PhotoCapture ", "Unable to do PhotoCapture", driver, true);
	}

	public void Clickon_CropSelected() {
		wait(1);
		stepstatus = basepage.clickElement(CropSelectedinRenualService);
		reportEvent(stepstatus, "Able to click on CropSelected ", "Unable to click on CropSelected", driver, true);
	}

	public void Clickon_Phototriggerbutton() {
		stepstatus = basepage.clickElement(PhototriggerinRenualService);
		reportEvent(stepstatus, "Able to click on Phototrigger button ", "Unable to click on Phototrigger button",
				driver, true);
	}

	public void Clickon_Snapokbutton() {
		stepstatus = basepage.clickElement(SnapokinRenualService);
		reportEvent(stepstatus, "Able to click on Snapok button ", "Unable to click on Phototrigger button", driver,
				true);
	}

	public void Clickon_Savebutton() {
		stepstatus = basepage.clickElement(SaveinRenualService);
		reportEvent(stepstatus, "Able to click on Save button ", "Unable to click on Save button", driver, true);
	}

	/* Approval of DLEndorsment */

	@FindBy(how = How.XPATH, using = "//a[text()='DL ENDORSEMENT APPROVAL']")
	WebElement DL_Endorsement_Approval;

	public void Clickon_DL_Endorsement_Approval() {
		stepstatus = basepage.clickElement(DL_Endorsement_Approval);
		reportEvent(stepstatus, "Able to click onDL_Endorsement_Approval ",
				"Unable to click on DL_Endorsement_Approval", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applNo']")
	WebElement Enter_Application_Number_for_DL_Endorsement_Approval;

	public void Enter_Application_Number_for_DL_Endorsement_Approval(String Appno) {
		stepstatus = basepage.setText(Enter_Application_Number_for_DL_Endorsement_Approval, Appno);
		reportEvent(stepstatus, "Able to click on Save button ", "Unable to click on Save button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit_in__DL_Endorsement_Approval;

	public void Clickon_Submit_in__DL_Endorsement_Approval() {
		stepstatus = basepage.clickElement(Submit_in__DL_Endorsement_Approval);
		reportEvent(stepstatus, "Able to click on Submit_in__DL_Endorsement_Approval button ",
				"Unable to click on Submit_in__DL_Endorsement_Approval button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='approveBtnid']")
	WebElement DL_Endorsement_final_Approve;

	public void Clickon_DL_Endorsement_final_Approve() {
		stepstatus = basepage.clickElement(DL_Endorsement_final_Approve);
		reportEvent(stepstatus, "Able to click on DL_Endorsement_final_Approve button ",
				"Unable to click on DL_Endorsement_final_Approve button", driver, true);
	}
	
	

}
