package applicationPages;

import java.util.Locale;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class DL_Backlog extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public DL_Backlog(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelementss
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='frmsubmt']")
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//input[@name='logmode']")
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
	@FindBy(how = How.XPATH, using = "//input[@name='lastEndDate']")
	WebElement Lasttransdate;

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

	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;

	// related methods to perform operation on webelements

	public void setUserName(String Strusername) {
		stepstatus = basepage.setText(Username, Strusername);
		Highlight(driver, "//input[@name='username']");
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username", driver, true);
	}

	public void setpassword(String Strpassword) {
		stepstatus = basepage.setText(Password, Strpassword);
		Highlight(driver, "//input[@name='password']");
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password", driver, true);
	}

	public void ClickonNext() {
		stepstatus = basepage.clickElement(Next);
		Highlight(driver, "//input[@id='frmsubmt']");
		reportEvent(stepstatus, "Able to click on Next BUtton", "Unable to click on Next Button", driver, true);
	}

	public void SetCaptcha() {
		stepstatus = basepage.setText(Captcha, "123456");
		Highlight(driver, "//input[@name='logmode']");
		reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha", driver, true);
	}

	public void Clickonsubmit() {
		stepstatus = basepage.clickElement(submit);
		Highlight(driver, "//input[@name='submit']");
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

	////////////////// DLBacklogapproval//////////////

	@FindBy(how = How.XPATH, using = "//a[text()='DL BACKLOG APPROVAL']")
	WebElement DLBACKLOGAPPROVAL;
	@FindBy(how = How.XPATH, using = "//input[@id='dlNumber']")
	WebElement DLno;
	@FindBy(how = How.XPATH, using = "//input[@id='proceed']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//button[@id='generateotp']")
	WebElement GenerateOTP;
	@FindBy(how = How.XPATH, using = "//input[@name='otpNumberForDlBacklog']")
	WebElement Enterotptext;

	@FindBy(how = How.XPATH, using = "//input[@id='Approve']")
	WebElement Approve;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logout;

	public void ClickonDL() {
		stepstatus = basepage.clickElement(DL);
		reportEvent(stepstatus, "Able to Click on DL", "Unable to Click on DL", driver, true);
	}

	public void ClickonDLBacklog() {
		stepstatus = basepage.clickElement(DLBacklog);
		reportEvent(stepstatus, "Able to Click on DLBacklog", "Unable to Click on DLBacklog", driver, true);
	}

	public void SetFirstissuedate(String value) {
		stepstatus = basepage.SetTextAndEscape(Firstissuedate, value);
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

	public void SetLasttransdate(String value) {
		stepstatus = basepage.SetTextAndEscape(Lasttransdate, value);
		reportEvent(stepstatus, "Able to Enter Lasttransdate", "Unable to Enter Lasttransdate", driver, true);
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
		stepstatus = basepage.SetTextAndTAB(COVIssueDate1, value);
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
		stepstatus = basepage.SetTextAndTAB(COVIssueDate2, value);
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
		stepstatus = basepage.SetTextAndTAB(COVIssueDate3, value);
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
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
			wait(3);
			capturedetails();
			// capturedetailsType2();
			reportEvent(stepstatus, "Able to click on Addbutton4", "Unable to Capture Details", driver, true);

		} else {
			wait(3);
			capturedetails();
			// capturedetailsType2();
			reportEvent(stepstatus, "Details Captured", "Unable to Capture Details", driver, true);

		}

	}

	public void capturedetailsType2() {

		s10 = DL_Backlog(driver, "//table/tbody/tr[4]/td[3]/following-sibling::td");
		setdata("DL", s10.substring(5).trim());

		s11 = DL_Approvedappno(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		setdata("DLApprovedappno", s11.substring(3).trim());

		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		setdata("DateofBirth", s2.substring(3).trim());

		setdata("Status", "Pass");
		// setdata("Iteration", "NA");
	}

	public void capturedetails() {
		s10 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		setdata("DL", s10.substring(16).trim());

		/*
		 * s10 = DL_Backlog(driver, "//table/tbody/tr[4]/td[3]/following-sibling::td");
		 * setdata("DL", s10.substring(5).trim());
		 */

		s11 = DL_Approvedappno(driver, "//h3[2]");
		setdata("DLApprovedappno", s11.substring(23).trim());

		/*
		 * s11 = DL_Approvedappno(driver,
		 * "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		 * setdata("DLApprovedappno", s11.substring(3).trim());
		 */

		/*
		 * s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		 * setdata("DateofBirth", s2.substring(3).trim());
		 */
		setdata("Status", "Pass");
		setdata("Iteration", "NA");
	}

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

	public void ClickonDlbacklogapproval() {
		stepstatus = basepage.clickElement(DLBACKLOGAPPROVAL);
		reportEvent(stepstatus, "Able to click on DLBACKLOGAPPROVAL", "Unable to click on DLBACKLOGAPPROVAL", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applicationNumber']")
	WebElement DLnoa;

	public void SetDLno(String vlaue) {
		stepstatus = basepage.setText(DLnoa, vlaue);
		reportEvent(stepstatus, "Able to Enter DLno", "Unable to DLno", driver, true);
	}

	public void SetDLno() {
		stepstatus = basepage.setText(DLno, s1.substring(16).trim());
		reportEvent(stepstatus, "Able to Enter DLno", "Unable to DLno", driver, true);
	}

	public void Clickonproceed() {
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);
	}

	public void Clickonapprove() {
		stepstatus = basepage.clickElement(Approve);
		reportEvent(stepstatus, "Able to click on Approve", "Unable to click on Approve", driver, true);
	}

	public void Logout() {

		stepstatus = basepage.clickElement(logout);
		reportEvent(stepstatus, "Able to click On logout", "UnAble to click On logout", driver,true);
		wait(3);
	}

	public void ArrangeDataSet() {

		Faker faker = new Faker(new Locale("en-IND"));
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String relationfirstname = faker.name().firstName();
		String relationlastname = faker.name().lastName();

		setdata("Name", firstname);
		setdata("Lastname", lastname);
		setdata("Relationfirstname", relationfirstname);
		setdata("RelationLastName", relationlastname);

	}
}