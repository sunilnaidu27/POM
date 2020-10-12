package applicationPages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewLLRegistrtionPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;

	boolean stepstatus;

	public NewLLRegistrtionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelements
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;

	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;

	public void clickonapplyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//li[@class='meu-list']/a[text()='New Learners Licence']")
	WebElement NewLearnersLicence;

	public void clickonNewLearnersLicence() {
		stepstatus = basepage.clickElement(NewLearnersLicence);
		reportEvent(stepstatus, "Able to click NewLL LINK ", "Unable to click NewLL LINK", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Continue;

	public void clickonContinue() {
		stepstatus = basepage.clickElement(Continue);
		reportEvent(stepstatus, "Able to click Continue Button ", "Unable to click Continue Button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Home']")
	WebElement Homebutton;

	public void CheckHomebuttonisEnabled() {
		stepstatus = basepage.isEnabled(Homebutton);
		reportEvent(stepstatus, "Able to click Homebutton and it is Enabled ",
				"Unable to click Homebutton and it is not Enabled", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='submitOfNewLL']")
	WebElement Submitone;

	public void clickonSubmitonebutton() {
		stepstatus = basepage.clickElement(Submitone);
		reportEvent(stepstatus, "Able to click Submitonebutton ", "Unable to click Submitonebutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='rtCode']")
	WebElement selectcamp;

	public void SelectRTOofficetodisplayCamp(String value) {
		stepstatus = basepage.setValueInSelectBox(selectcamp, value);
		reportEvent(stepstatus, "Able to select RTO office ", "Unable to select RTO office", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='aadhaarHoldingType0']")
	WebElement ApplicantdoesnotholdAadhaarnumber;

	public void clickonapplyonApplicantdoesnotholdAadhaarnumber() {
		stepstatus = basepage.clickElement(ApplicantdoesnotholdAadhaarnumber);
		reportEvent(stepstatus, "Able to click ApplicantdoesnotholdAadhaarnumber",
				"Unable to click ApplicantdoesnotholdAadhaarnumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='aadhaarHoldingType0']")
	WebElement ApplicantholdsDrivingLicenceEnterDLNumber;

	public void clickonApplicantholdsDrivingLicenceEnterDLNumber() {
		stepstatus = basepage.clickElement(ApplicantholdsDrivingLicenceEnterDLNumber);
		reportEvent(stepstatus, "Able to click ApplicantholdsDrivingLicenceEnterDLNumber",
				"Unable to click ApplicantholdsDrivingLicenceEnterDLNumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='licenceType3']")
	WebElement ApplicantholdsLearnerLicenceEnterLLNumber;

	public void clickonApplicantholdsLearnerLicenceEnterLLNumber() {
		stepstatus = basepage.clickElement(ApplicantholdsLearnerLicenceEnterLLNumber);
		reportEvent(stepstatus, "Able to click ApplicantholdsLearnerLicenceEnterLLNumber",
				"Unable to click ApplicantholdsLearnerLicenceEnterLLNumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Refresh']")
	WebElement Refresh;

	public void clickonRefreshbutton() {
		stepstatus = basepage.isEnabled(Refresh);
		reportEvent(stepstatus, "Able to click Refreshbutton and it is Enabled ",
				"Unable to click Refreshbutton and it is not Enabled", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
	WebElement Cancel;

	public void clickonCancelbutton() {
		stepstatus = basepage.isEnabled(Cancel);
		reportEvent(stepstatus, "Able to click Cancelbutton and it is Enabled ",
				"Unable to click Cancelbutton and it is not Enabled", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='submt']")
	WebElement Submittwo;

	public void clickonapplyonSubmittwobutton() {
		stepstatus = basepage.clickElement(Submittwo);
		reportEvent(stepstatus, "Able to click Submittwobutton", "Unable to click Submittwobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='mobileNumber']")
	WebElement Mobilenumber;

	public void SetMobilenumber(String value) {
		if (isEnabled(Mobilenumber)) {
			stepstatus = basepage.setText(Mobilenumber, value);
			reportEvent(stepstatus, "Able to Enter Mobile Number", "Unable to Enter Mobile Number", driver, true);
		} else {
			System.out.println("Mobile Number Already Taken");
		}

	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[2]/div/form/div/div/div[4]/fieldset/div[1]/div[4]/div/button")
	WebElement GenerateOTP;

	public void ClickonGenerateOTP() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", GenerateOTP);
		// reportEvent(stepstatus, "Able to click GenerateOTP Button", "Unable to click
		// GenerateOTP Button", driver, true);
		basepage.alertGetText(driver);
		if (basepage.alertExist(driver)) {
			String tct = alertGetText(driver);
			System.out.println(tct);
			basepage.acceptAlert(driver);

		} else {
			basepage.dismissAlert(driver);
		}
	}

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[3]/div/div/form/div/div/div[3]/fieldset/div[4]/div[2]/following-sibling::div/div/input")
	WebElement EnterOTP;

	public void EnterOTP(String value) {
		stepstatus = basepage.setText(EnterOTP, value);
		reportEvent(stepstatus, "Able to Enter OTP in textbox", "Unable to Enter OTP in textbox", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='verifySarathi']")
	WebElement AuthenticateWithSarathi;

	public void ClickonAuthenticateWithSarathibutton() {
		wait(2);
		if (isEnabled(AuthenticateWithSarathi)) {
			System.out.println("Button Enabled");
			stepstatus = basepage.clickElement(AuthenticateWithSarathi);
			reportEvent(stepstatus, "Able to click AuthenticateWithSarathi Button",
					"Unable to click AuthenticateWithSarathi Button", driver, true);

		}

		@SuppressWarnings("unused")
		String gettext = basepage.alertGetText(driver);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	@FindBy(how = How.XPATH, using = "//select[@name='licenceFromState']")
	WebElement State;

	public void Set_State(String option) {
		stepstatus = basepage.setOptionInSelectBox(State, option);
		reportEvent(stepstatus, "Able to Selected State", "Unable to Selected State", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='licenceFromRTO']")
	WebElement RTO_Office;

	public void Set_RTO_Office(String option) {

		stepstatus = basepage.setValueInSelectBox(RTO_Office, option);
		reportEvent(stepstatus, "Able to Selected RTO_Office", "Unable to Selected RTO_Office", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='jurisdiction']")
	WebElement PincodeMapping;

	public void EnterPinCode(String Input) {
		stepstatus = basepage.SetTextAndTAB(PincodeMapping, Input);
		reportEvent(stepstatus, "Able to Enter PinCode", " Unable to Enter PinCode", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='aadharNumber']")
	WebElement AadhaarNumber;

	public void SetAadhaarNumber(String Value) {
		stepstatus = basepage.setText(AadhaarNumber, Value);
		reportEvent(stepstatus, "Able to Enter AadhaarNumber", "Unable to Enter AadhaarNumber", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='aadharEnrollNumber']")
	WebElement AadhaarApplicationNumber;

	public void SetAadhaarApplicationNumber(String Value) {
		stepstatus = basepage.setText(AadhaarApplicationNumber, Value);
		reportEvent(stepstatus, "Able to Enter AadhaarApplicationNumber", "Unable to Enter AadhaarApplicationNumber",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='fname']")
	WebElement FirstName;

	public void SetFirstName(String Value) {
		stepstatus = basepage.setText(FirstName, Value);
		reportEvent(stepstatus, "Able to Enter Firstname", "Unable to Enter Firstname", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='mname']")
	WebElement Middlename;

	public void SetMiddlename(String Value) {
		stepstatus = basepage.setText(Middlename, Value);
		reportEvent(stepstatus, "Able to Enter Middlename", "Unable to Enter Middlename", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='lname']")
	WebElement LastName;

	public void SetLastName(String Value) {
		stepstatus = basepage.setText(LastName, Value);
		reportEvent(stepstatus, "Able to Enter Lastname", "Unable to Enter Lastname", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='relationType']")
	WebElement RelationType;

	public void SetRelationType(String option) {
		stepstatus = basepage.setOptionInSelectBox(RelationType, option);
		reportEvent(stepstatus, "Able to Select RelationType", "Unable to Select RelationType", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='swdfName']")
	WebElement RelationFirstName;

	public void SetRelationFirstName(String Value) {
		stepstatus = basepage.setText(RelationFirstName, Value);
		reportEvent(stepstatus, "Able to Enter RelationFirstName", "Unable to Enter RelationFirstName", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='swdmName']")
	WebElement RelationMiddleName;

	public void SetRelationMiddleName(String Value) {
		stepstatus = basepage.setText(RelationMiddleName, Value);
		reportEvent(stepstatus, "Able to Enter RelationMiddleName", "Unable to Enter RelationMiddleName", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='swdlName']")
	WebElement RelationLastName;

	public void SetRelationLastName(String Value) {
		stepstatus = basepage.setText(RelationLastName, Value);
		reportEvent(stepstatus, "Able to Enter RelationLastName", "Unable to Enter RelationLastName", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='gender1']")
	WebElement Gender;

	public void SetGender() {
		stepstatus = basepage.clickElement(Gender);
		reportEvent(stepstatus, "Able to Select Gender", "Unable to Select Gender", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='placeOfBirth']")
	WebElement PlaceofBirth;

	public void SetPlaceofBirth(String value) {
		stepstatus = basepage.setText(PlaceofBirth, value);
		reportEvent(stepstatus, "Able to Enter PlaceofBirth", "Unable to Enter PlaceofBirth", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='age']")
	WebElement Age;

	public void SetAge(String age) {
		stepstatus = basepage.setText(Age, age);
		reportEvent(stepstatus, "Able to Enter Age", "Unable to Enter Age", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='eduQual']")
	WebElement Qualification;

	public void SetQualification(String option) {
		stepstatus = basepage.setOptionInSelectBox(Qualification, option);
		reportEvent(stepstatus, "Able to Select Qualification", "Unable to Select Qualification", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='bloodGroup']")
	WebElement Bloodgroup;

	public void SetBloodgroup(String option) {
		stepstatus = basepage.setOptionInSelectBox(Bloodgroup, option);
		reportEvent(stepstatus, "Able to Select Bloodgroup", "Unable to Select Bloodgroup", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
	WebElement Phonenumber_Landno;

	public void SetPhonenumber_Landno(String Phonenumber) {
		stepstatus = basepage.setText(Phonenumber_Landno, Phonenumber);
		reportEvent(stepstatus, "Able to Enter Phonenumber_Landno", "Unable to Enter Phonenumber_Landno", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	WebElement Emailid;

	public void SetEmailid(String email) {
		stepstatus = basepage.setText(Emailid, email);
		reportEvent(stepstatus, "Able to Enter Emailid", "Unable to Enter Emailid", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='altMobileNumber']")
	WebElement EmrgPhoneno;

	public void SetEmrgPhoneno(String op) {
		stepstatus = basepage.setText(EmrgPhoneno, op);
		reportEvent(stepstatus, "Able to Enter EmrgPhoneno", "Unable to Enter EmrgPhoneno", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='idMarks1']")
	WebElement IdentificationMarks1;

	public void SetIdentificationMarks1(String op) {
		stepstatus = basepage.setText(IdentificationMarks1, op);
		reportEvent(stepstatus, "Able to Enter IdentificationMarks1", "Unable to Enter IdentificationMarks1", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='idMarks2']")
	WebElement IdentificationMarks2;

	public void SetIdentificationMarks2(String op) {
		stepstatus = basepage.setText(IdentificationMarks2, op);
		reportEvent(stepstatus, "Able to Enter IdentificationMarks2", "Unable to Enter IdentificationMarks2", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='presState']")
	WebElement CheckState;

	public void SetState() {
		WebElement stoption = driver.findElement(By.xpath("//select[@name='presState']"));
		Select st = new Select(stoption);
		List<WebElement> options = st.getOptions();
		WebElement ele = st.getFirstSelectedOption();
		System.out.println(ele.getText());
		if (ele.getText().contains("Select")) {
			for (int i = 0; i <= options.size() - 1; i++) {
				try {
					stoption = driver.findElement(By.xpath("//select[@name='presState']"));
					st = new Select(stoption);
					options = st.getOptions();
					if (!options.get(1).getText().contains("Select")) {
						System.out.println(options.get(1).getText());
						st.selectByVisibleText(options.get(1).getText());
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} else {

			System.out.println("State is already selected.");
		}
	}

	@FindBy(how = How.XPATH, using = "//select[@name='presDistrict']")
	WebElement District;

	public void SetDistrict(String option) {
		stepstatus = basepage.setOptionInSelectBox(District, option);
		reportEvent(stepstatus, "Able to Select District", "Unable to Select District", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='presSubDistrict']")
	WebElement Tahsil;

	public void SetTahsil(String option) {
		stepstatus = basepage.setOptionInSelectBox(Tahsil, option);
		reportEvent(stepstatus, "Able to Select Tahsil", "Unable to Select Tahsil", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='presCity']")
	WebElement Village;

	public void SetVillage(String option) {
		stepstatus = basepage.setOptionInSelectBox(Village, option);
		reportEvent(stepstatus, "Able to Select Village", "Unable to Select Village", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='presHouseNo']")
	WebElement Houseno;

	public void SetHouseno(String value) {
		stepstatus = basepage.setText(Houseno, value);
		reportEvent(stepstatus, "Able to Enter Houseno", "Unable to Enter Houseno", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='stayPeriodYears']")
	WebElement Stayyears;

	public void SetStayyears(String value) {
		stepstatus = basepage.setText(Stayyears, value);
		reportEvent(stepstatus, "Able to Select Stayyears", "Unable to Select Stayyears", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='stayPeriodMonths']")
	WebElement StayMonths;

	public void SetStayMonths(String value) {
		stepstatus = basepage.setText(StayMonths, value);
		reportEvent(stepstatus, "Able to Select StayMonths", "Unable to Select StayMonths", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='presPinCode']")
	WebElement Pincode;

	public void SetPincode(String Pin) {
		if (isEnabled(Pincode)) {
			stepstatus = basepage.setText(Pincode, Pin);
			reportEvent(stepstatus, "Able to Select Pincode", "Unable to Select Pincode", driver, true);
		} else {
			System.out.println("Pincode Already Taken");
		}
	}

	@FindBy(how = How.XPATH, using = "//input[@id='presSameAsPerm']")
	WebElement Copytopermenentaddress;

	public void SetCopytopermenentaddress() {
		stepstatus = basepage.clickElement(Copytopermenentaddress);
		reportEvent(stepstatus, "Able to Click Copytopermenentaddress", "Unable to Click Copytopermenentaddress",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='<=']")
	WebElement Leftarrow;

	public void ClickLeftarrow() {
		stepstatus = basepage.clickElement(Leftarrow);
		reportEvent(stepstatus, "Able to Click Leftarrow", "Unable to Click Leftarrow", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='covsList']")
	WebElement SelectCOV;

	public void SetCOV(String option) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV, option);
		reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='covsList']")
	WebElement SelectCOV1;

	public void SetCOV1(String option) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV1, option);
		reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='covsList']")
	WebElement SelectCOV2;

	public void SetCOV2(String option) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV2, option);
		reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='newLLApplForm_0']")
	WebElement Rightarrow;

	public void SetRightarrow() {
		stepstatus = basepage.clickElement(Rightarrow);
		reportEvent(stepstatus, "Able to Click Rightarrow", "Unable to Click Rightarrow", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='willingToDonate']")
	WebElement WillingToDonate;

	public void ClickonWillingToDonate() {
		stepstatus = basepage.clickElement(WillingToDonate);
		reportEvent(stepstatus, "Able to Click WillingToDonate", "Unable to Click WillingToDonate", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	WebElement Submitthree;

	public void SetSubmitthree() {
		basepage.clickElement(Submitthree);
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	public void Alert() {

		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
			basepage.alertGetText(driver);
		} else {
			basepage.dismissAlert(driver);
			basepage.alertGetText(driver);
		}
	}

	@FindBy(how = How.XPATH, using = "//button[@name='dlservices.exit']")
	WebElement Exit;

	public void Clickon_Exitbutton() {
		stepstatus = basepage.clickElement(Exit);
		reportEvent(stepstatus, "Able to Click Exit", "Unable to Click Exit", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Application Status']")
	WebElement Applicationstatus;

	public void Clickon_Application_Status_Link() {
		stepstatus = basepage.clickElement(Applicationstatus);
		reportEvent(stepstatus, "Able to click on Applicationstatus Link", "Unable to cclick on Applicationstatus Link",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applNum']")
	WebElement Application_Number;

	public void Set_capApplication_Number(String value) {
		stepstatus = basepage.setText(Application_Number, value);
		reportEvent(stepstatus, "Able to Enter Application Number ", "Unable to Enter Application Number", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='dateOfBirth']")
	WebElement DateofBirth;

	public void Set_DateofBirth(String value) {
		stepstatus = basepage.setText(DateofBirth, value);
		reportEvent(stepstatus, "Able to Enter Date of Birth ", "Unable to Enter Date of Birth", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;

	public void Clickon_Submit_Button() {
		stepstatus = basepage.clickElement(Submit);
		reportEvent(stepstatus, "Able to click submit button", "Unable to click submit button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='UPLOAD DOCUMENTS']")
	WebElement Clickradio;

	public void Do_ScrollDown() {
		stepstatus = basepage.scrooldown(driver);
		reportEvent(stepstatus, "Able to do Scrolldown", "Unable to do Scrolldown", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement Proceed;

	public void Clickon_Proceed_Button() {
		if (basepage.clickElement(Clickradio)) {

			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);
		}
	}

	@FindBy(how = How.XPATH, using = "//input[@name='method:displayDocuments']")
	WebElement Ok;

	public void Clickon_ok_Button() {
		stepstatus = basepage.clickElement(Ok);
		reportEvent(stepstatus, "Able to click Ok button", "Unable to click Ok button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='documentType']")
	WebElement Document;

	public void Set_FirstDocument(String option) {
		stepstatus = basepage.setOptionInSelectBox(Document, option);
		reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='relatedDocuments']")
	WebElement Proof;

	public void Set_First_Proof_Document(String option) {
		stepstatus = basepage.setOptionInSelectBox(Proof, option);
		reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='col-md-8']/div/input[1]")
	WebElement Choosefile;

	public void Clickon_Choosefile_Button1() throws IOException {
		wait(3);
		driver.findElement(By.xpath("//div[@class='col-md-8']/div/input[1]"))
				.sendKeys("D:\\Selenium_Softwares\\SampleTestfiles\\passpic.jpg");
		driver.findElement(By.xpath("//input[@id='upload']")).click();
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
	}

	public void Set_Second_Document(String option) {
		stepstatus = basepage.setOptionInSelectBox(Document, option);
		reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
	}

	public void Set_Second_Proof_Document(String option) {
		stepstatus = basepage.setOptionInSelectBox(Proof, option);
		reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);

		} else {
			basepage.dismissAlert(driver);
		}
	}

	public void Clickon_Choosefile_Button2() {
		stepstatus = basepage.clickElement(Choosefile);
		reportEvent(stepstatus, "Able to click Choosefile button", "Unable to click Choosefile button", driver, true);
		basepage.Upload("D:\\Autoitfiles\\Testsig.exe");
	}

	public void Set_Third_Document(String option) {
		stepstatus = basepage.setOptionInSelectBox(Document, option);
		reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
	}

	public void Set_Third_Proof_Document(String option) {
		stepstatus = basepage.setOptionInSelectBox(Proof, option);
		reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
	}

	public void Clickon_Choosefile_Button3() {
		stepstatus = basepage.clickElement(Choosefile);
		reportEvent(stepstatus, "Able to click Choosefile button", "Unable to click Choosefile button", driver, true);
		basepage.Upload("D:\\Autoitfiles\\Testsig.exe");
	}

	@FindBy(how = How.XPATH, using = "//input[@id='upload']")
	WebElement Upload;
	@FindBy(how = How.XPATH, using = "//input[@name='method:confirm']")
	WebElement Confirm;
	@FindBy(how = How.XPATH, using = "//button[@value='next']")
	WebElement Next;

	public void Clickon_Next_Button() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click Next button", "Unable to click Next button", driver, true);
	}

	// RTO
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	WebElement Login;

	public void Clickon_Login_Button() {
		stepstatus = basepage.clickElement(Login);
		reportEvent(stepstatus, "Able to click on Login button", "Unable to click on Login button", driver, true);
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

	public void setUserNamee(String Strusername) {
		stepstatus = basepage.setText(Username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Pass;

	public void setpass(String Strpassword) {
		stepstatus = basepage.setText(Pass, Strpassword);
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

	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement loogin;

	public void Clickonloogin() {
		stepstatus = basepage.clickElement(loogin);
		reportEvent(stepstatus, "Able to click on login-In BUtton", "Unable to click on login Button", driver, true);
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
//		reportEvent(stepstatus, "Able to click on VerificationofDocuments_Link",
//				"Unable to click on VerificationofDocuments_Link", driver);
		wait(2);
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
	@FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/th[3]/following::tr[3]/td[3]/i")
	WebElement Thirdprooflink;
	@FindBy(how = How.XPATH, using = "//input[@id='documentsapproval_0']")
	WebElement windowSubmit;

	public void Clickon_prooflinks() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (225×225)", driver);
		String firstprooftitle = driver.getTitle();
		System.out.println(firstprooftitle);
		// basepage.SwitchtoWindowByTitle(firstprooftitle, driver);
		basepage.closeWindowByTitle(firstprooftitle, driver);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		/*
		 * Second Document
		 */
		/*
		 * basepage.clickElement(Secondprooflink);
		 * basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver); String
		 * Secondprooftitle = driver.getTitle(); System.out.println(Secondprooftitle);
		 * // basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		 * basepage.closeWindowByTitle(Secondprooftitle, driver);
		 * basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		 * driver);
		 * 
		 * Third Proof Link
		 * 
		 * basepage.clickElement(Thirdprooflink);
		 * basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver); String
		 * Thirdprooflink = driver.getTitle(); System.out.println(Thirdprooflink); //
		 * basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		 * basepage.closeWindowByTitle(Thirdprooflink, driver);
		 * basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		 * driver);
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

	// cap bio

	@FindBy(how = How.XPATH, using = "//a[text()='CAPTURE PHOTO & SIGNATURE']")
	WebElement Biometrics;

	public void Clickon_BiometricsLink() {
		stepstatus = basepage.clickElement(Biometrics);
		reportEvent(stepstatus, "Able to click on Biometrics Link", "Unable to click on Biometrics Link", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='appnumber']")
	WebElement CapApplication_Number;

	public void Set_Application_Number(String Value) {
		stepstatus = basepage.setText(CapApplication_Number, Value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='thumbdetform__populateData']")
	WebElement Getdetails;

	public void Clickon_Getdetails() {
		stepstatus = basepage.clickElement(Getdetails);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas")
	WebElement CanvasSignature;

	public void Set_CanvasSignature(String ObjectXpath) {
		wait(2);
		stepstatus = basepage.CaptureSignature(driver, CanvasSignature, ObjectXpath);
		reportEvent(stepstatus, "Able to do CanvasSignature ", "Unable to do CanvasSignature", driver, true);
		wait(2);
		basepage.scrooldown(driver);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='capBtn']")
	WebElement CaptureSignature;

	public void Clickon_Capturesignaturebutton() {
		stepstatus = basepage.clickElement(CaptureSignature);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='dojoTab']/div/span[text()='Photo Capture']")
	WebElement PhotoCapture;

	public void Set_PhotoCapture() {
		stepstatus = basepage.clickElement(PhotoCapture);
		reportEvent(stepstatus, "Able to do PhotoCapture ", "Unable to do PhotoCapture", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//li[@class='crop']")
	WebElement CropSelected;

	public void Clickon_CropSelected() {
		wait(1);
		stepstatus = basepage.clickElement(CropSelected);
		reportEvent(stepstatus, "Able to click on CropSelected ", "Unable to click on CropSelected", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//li[@class='trigger']")
	WebElement Phototrigger;

	public void Clickon_Phototriggerbutton() {
		stepstatus = basepage.clickElement(Phototrigger);
		reportEvent(stepstatus, "Able to click on Phototrigger button ", "Unable to click on Phototrigger button",
				driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='photoCaptre']")
	WebElement Snapok;

	public void Clickon_Snapokbutton() {
		stepstatus = basepage.clickElement(Snapok);
		reportEvent(stepstatus, "Able to click on Snapok button ", "Unable to click on Phototrigger button", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 top-space text-center']/input[1]")
	WebElement Save;

	public void Clickon_Savebutton() {
		stepstatus = basepage.clickElement(Save);
		reportEvent(stepstatus, "Able to click on Save button ", "Unable to click on Save button", driver, true);
	}

	// LLTest

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement LL;

	public void ClickonLL_Link() {
		stepstatus = basepage.clickElement(LL);
		reportEvent(stepstatus, "Able to click on LL Link", "Unable to click on LL Link", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='LL TEST RESULTS']")
	WebElement LLTestResultsLink;

	public void ClickonLLTestResultsLink() {
		stepstatus = basepage.clickElement(LLTestResultsLink);
		reportEvent(stepstatus, "Able to click on LLTestResults Link", "Unable to click on LLTestResults Link", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='app_no']")
	WebElement LLApplication_Number;

	public void Set_LLApplication_Number(String value) {
		stepstatus = basepage.setText(LLApplication_Number, value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='fetch']")
	WebElement Fetchbutton;

	public void ClickonFetchbutton() {
		stepstatus = basepage.clickElement(Fetchbutton);
		reportEvent(stepstatus, "Able to click on Fetchbutton", "Unable to click on Fetchbutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='app_result']")
	WebElement TestResult;

	public void Set_TestResult(String option) {
		stepstatus = basepage.setOptionInSelectBox(TestResult, option);
		reportEvent(stepstatus, "Able to Select TestResult", "Unable to Select TestResult", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='submitllOffLine']")
	WebElement Submitbutton;

	public void ClickonbSubmitutton() {
		stepstatus = basepage.clickElement(Submitbutton);
		reportEvent(stepstatus, "Able to click on Submitbutton", "Unable to click on Submitbutton", driver, true);
	}

	// LL Approval
	@FindBy(how = How.XPATH, using = "//a[text()='LL APPROVAL BATCH']")
	WebElement LLAprovalbatch;

	public void ClickonLLAprovalbatchLink() {
		stepstatus = basepage.clickElement(LLAprovalbatch);
		reportEvent(stepstatus, "Able to click LLAprovalbatch Link", "Unable to click LLAprovalbatch Link", driver,
				true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='radio33']")
	WebElement LLApprovalRadiobutton;

	public void ClickonLLApprovalRadiobutton() {
		stepstatus = basepage.clickElement(LLApprovalRadiobutton);
		reportEvent(stepstatus, "Able to click Radiobutton", "Unable to click Radiobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applno']")
	WebElement LLApprovalApplication_Number;

	public void Set_LLApprovalApplication_Number(String value) {
		stepstatus = basepage.setText(LLApprovalApplication_Number, value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement LLAPPROVALSubmitbutton;

	public void Clickon_LLApprovalSubmitbutton() {
		stepstatus = basepage.clickElement(LLAPPROVALSubmitbutton);
		reportEvent(stepstatus, "Able to click on Submitbutton", "Unable to click Submitbutton", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	@FindBy(how = How.XPATH, using = "//table[@id='llApprovalPendApplications']/thead/tr/th[5]/input[1]")
	WebElement Selectall;

	public void Clickon_Selectallcheckbox() {
		stepstatus = basepage.clickElement(Selectall);
		reportEvent(stepstatus, "Able to click Selectall checkboc", "Unable to click Selectall checkbox", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='Approve']")
	WebElement Issueallbutton;

	public void Clickon_Issueallbutton() {
		stepstatus = basepage.clickElement(Issueallbutton);
		reportEvent(stepstatus, "Able to click Issueallbutton ", "Unable to click Issueallbutton", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	// public void ApplicationSubmission() {
	//
	// stepstatus = basepage.setOptionInSelectBox(Selectstatename,
	// getdata("SelectState"));
	// reportEvent(stepstatus, "Able to Select Statename", "Unable to Select
	// Statename", driver, true);
	//
	// stepstatus = basepage.clickElement(Applyonline);
	// reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click
	// Apply online Link", driver, true);
	//
	// stepstatus = basepage.clickElement(NewLearnersLicence);
	// reportEvent(stepstatus, "Able to click NewLL LINK ", "Unable to click NewLL
	// LINK", driver, true);
	//
	// stepstatus = basepage.clickElement(Continue);
	// reportEvent(stepstatus, "Able to click Continue Button ", "Unable to click
	// Continue Button", driver, true);
	//
	// stepstatus = basepage.clickElement(Submitone);
	// reportEvent(stepstatus, "Able to click Submitonebutton ", "Unable to click
	// Submitonebutton", driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(State, getdata("SelectState"));
	// reportEvent(stepstatus, "Able to Selected State", "Unable to Selected State",
	// driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(RTO_Office, getdata("RTO"));
	// reportEvent(stepstatus, "Able to Selected RTO_Office", "Unable to Selected
	// RTO_Office", driver, true);
	//
	// stepstatus = basepage.setText(FirstName, getdata("Firstname"));
	// reportEvent(stepstatus, "Able to Enter Firstname", "Unable to Enter
	// Firstname", driver, true);
	//
	// stepstatus = basepage.setText(Middlename, getdata("Middlename"));
	// reportEvent(stepstatus, "Able to Enter Middlename", "Unable to Enter
	// Middlename", driver, true);
	//
	// stepstatus = basepage.setText(LastName, getdata("Lastname"));
	// reportEvent(stepstatus, "Able to Enter Lastname", "Unable to Enter Lastname",
	// driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(RelationType,
	// getdata("RelationType"));
	// reportEvent(stepstatus, "Able to Select RelationType", "Unable to Select
	// RelationType", driver, true);
	//
	// stepstatus = basepage.setText(RelationFirstName,
	// getdata("RelationFirstname"));
	// reportEvent(stepstatus, "Able to Enter RelationFirstName", "Unable to Enter
	// RelationFirstName", driver, true);
	//
	// stepstatus = basepage.setText(RelationMiddleName,
	// getdata("RelationMiddlename"));
	// reportEvent(stepstatus, "Able to Enter RelationMiddleName", "Unable to Enter
	// RelationMiddleName", driver, true);
	//
	// stepstatus = basepage.setText(RelationLastName, getdata("Relationlastname"));
	// reportEvent(stepstatus, "Able to Enter RelationLastName", "Unable to Enter
	// RelationLastName", driver, true);
	//
	// stepstatus = basepage.clickElement(Gender);
	// reportEvent(stepstatus, "Able to Select Gender", "Unable to Select Gender",
	// driver, true);
	//
	// stepstatus = basepage.setText(Age, getdata("Age"));
	// reportEvent(stepstatus, "Able to Enter Age", "Unable to Enter Age", driver,
	// true);
	//
	// stepstatus = basepage.setText(PlaceofBirth, getdata("Placeofbirth"));
	// reportEvent(stepstatus, "Able to Enter PlaceofBirth", "Unable to Enter
	// PlaceofBirth", driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(Qualification,
	// getdata("Qualification"));
	// reportEvent(stepstatus, "Able to Select Qualification", "Unable to Select
	// Qualification", driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(Bloodgroup, getdata("Bloodgrp"));
	// reportEvent(stepstatus, "Able to Select Bloodgroup", "Unable to Select
	// Bloodgroup", driver, true);
	//
	// stepstatus = basepage.setText(Phonenumber_Landno, getdata("Landno"));
	// reportEvent(stepstatus, "Able to Enter Phonenumber_Landno", "Unable to Enter
	// Phonenumber_Landno", driver, true);
	//
	// stepstatus = basepage.setText(Emailid, getdata("Emailid"));
	// reportEvent(stepstatus, "Able to Enter Emailid", "Unable to Enter Emailid",
	// driver, true);
	//
	// stepstatus = basepage.setText(Mobilenumber, getdata("Phone"));
	// reportEvent(stepstatus, "Able to Enter Mobile Number", "Unable to Enter
	// Mobile Number", driver, true);
	//
	// stepstatus = basepage.setText(EmrgPhoneno, getdata("Emrgno"));
	// reportEvent(stepstatus, "Able to Enter EmrgPhoneno", "Unable to Enter
	// EmrgPhoneno", driver, true);
	//
	// stepstatus = basepage.setText(IdentificationMarks1, getdata("IM1"));
	// reportEvent(stepstatus, "Able to Enter IdentificationMarks1", "Unable to
	// Enter IdentificationMarks1", driver,
	// true);
	// stepstatus = basepage.setText(IdentificationMarks2, getdata("IM2"));
	// reportEvent(stepstatus, "Able to Enter IdentificationMarks2", "Unable to
	// Enter IdentificationMarks2", driver,
	// true);
	//
	// stepstatus = basepage.setOptionInSelectBox(District, getdata("District"));
	// reportEvent(stepstatus, "Able to Select District", "Unable to Select
	// District", driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(Tahsil, getdata("Tahsil"));
	// reportEvent(stepstatus, "Able to Select Tahsil", "Unable to Select Tahsil",
	// driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(Village, getdata("Village"));
	// reportEvent(stepstatus, "Able to Select Village", "Unable to Select Village",
	// driver, true);
	//
	// stepstatus = basepage.setText(Houseno, getdata("Houseno"));
	// reportEvent(stepstatus, "Able to Enter Houseno", "Unable to Enter Houseno",
	// driver, true);
	//
	// stepstatus = basepage.setText(Pincode, getdata("Pincode"));
	// reportEvent(stepstatus, "Able to Select Pincode", "Unable to Select Pincode",
	// driver, true);
	//
	// stepstatus = basepage.setText(Stayyears, getdata("Years"));
	// reportEvent(stepstatus, "Able to Select Stayyears", "Unable to Select
	// Stayyears", driver, true);
	//
	// stepstatus = basepage.setText(StayMonths, getdata("Months"));
	// reportEvent(stepstatus, "Able to Select StayMonths", "Unable to Select
	// StayMonths", driver, true);
	//
	// stepstatus = basepage.clickElement(Copytopermenentaddress);
	// reportEvent(stepstatus, "Able to Click Copytopermenentaddress", "Unable to
	// Click Copytopermenentaddress",
	// driver, true);
	//
	// stepstatus = basepage.setOptionInSelectBox(SelectCOV, getdata("COV"));
	// reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver,
	// true);
	//
	// stepstatus = basepage.setOptionInSelectBox(SelectCOV1, getdata("COV1"));
	// reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver,
	// true);
	//
	// stepstatus = basepage.setOptionInSelectBox(SelectCOV2, getdata("COV2"));
	// reportEvent(stepstatus, "Able to SelectCOV", "Unable to SelectCOV", driver,
	// true);
	//
	// stepstatus = basepage.clickElement(Rightarrow);
	// reportEvent(stepstatus, "Able to Click Rightarrow", "Unable to Click
	// Rightarrow", driver, true);
	//
	// stepstatus = basepage.clickElement(Submitthree);
	// reportEvent(stepstatus, "Able to Click Submit Button", "Unable to Click
	// Submit Button", driver);
	// if (basepage.alertExist(driver)) {
	// basepage.acceptAlert(driver);
	// basepage.alertGetText(driver);
	// } else {
	// basepage.dismissAlert(driver);
	// basepage.alertGetText(driver);
	// }
	//
	// if (basepage.alertExist(driver)) {
	// basepage.acceptAlert(driver);
	// basepage.alertGetText(driver);
	// } else {
	// basepage.dismissAlert(driver);
	// basepage.alertGetText(driver);
	// }
	//
	// s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No
	// ']/following-sibling::td[1]");
	// s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
	// String title = driver.getTitle();
	// if (title.equals("New LL Acknowledgement")) {
	// setdata("ApplicationNo", s1.substring(3).trim());
	// setdata("DateofBirth", s2.substring(3).trim());
	// setdata("Status", "Pass");
	// } else {
	//
	// System.out.println("New LL Acknowledgement is not Generated");
	// setdata("Status", "Fail");
	// driver.close();
	// }
	//
	// }
	//
	// public String selected(String op) throws IOException {
	//
	// switch (op) {
	// case "S4Preprod":
	//
	// Properties p = new Properties();
	// FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")
	// + "\\ApplicationURLS");
	// p.load(objfile);
	//
	// System.out.println("Welcome to S4Preprod Testing Enviournment");
	// System.setProperty("webdriver.chrome.driver",
	// "BrowserServers\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
	// driver.get(p.getProperty("S4Preprod"));
	// driver.manage().window().maximize();
	// ApplicationSubmission();
	//
	// break;
	//
	// case "S4testing":
	// System.out.println("Welcome to S4testing Enviournment");
	//
	// break;
	//
	// case "SarathiCOV":
	//
	// System.out.println("Welcome to SarathiCOV Testing Enviournment");
	//
	// break;
	//
	// default:
	// break;
	// }
	//
	// return null;

	// define webelements

	// new
	@FindBy(how = How.XPATH, using = "//a[text()='Misc ']")
	WebElement clickonmisc;

	public void clickon_Misc() {
		stepstatus = basepage.clickElement(clickonmisc);
		reportEvent(stepstatus, "Able to clickonmisc", "Unable to click on misc", driver, true);
	}

	// new
	@FindBy(how = How.XPATH, using = "//a[text()='APPLICATION STATUS']")
	WebElement clickonapplicationstatus;

	public void click_on_applicationstatus() {
		stepstatus = basepage.clickElement(clickonapplicationstatus);
		reportEvent(stepstatus, "Able to clickonapplicationstatus", "Unable to click on applicationstatus", driver,
				true);
	}

	// new
	@FindBy(how = How.XPATH, using = "(//input[@name='papplno'])[1]")
	WebElement setapplno;

	public void setAPPLNO_IN_LOGIN(String value) {
		stepstatus = basepage.setText(setapplno, value);
		reportEvent(stepstatus, "Able to set text", "Unable to set text", driver, true);
	}

	// new
	@FindBy(how = How.XPATH, using = "(//input[@name='View Flows'])")
	WebElement clickonviewflows;

	public void click_on_viewflows() {
		stepstatus = basepage.clickElement(clickonviewflows);
		reportEvent(stepstatus, "Able to click on view flows ", "Unable to click on view flows", driver, true);
	}

	// new
	@FindBy(how = How.XPATH, using = "//input[@value='Process Flow']")
	WebElement clickonprocessflows;

	public void click_on_processflow() {
		stepstatus = basepage.clickElement(clickonprocessflows);
		reportEvent(stepstatus, "Able to click on process flows ", "Unable to click on process flows", driver, true);
	}

	/* COV New Properties */

	@FindBy(how = How.XPATH, using = "//select[@name='rtCode']")
	WebElement RTOCheckafterStateselection;

	public void SelectRTO_Office_AfterStateSelection(String Option) {
		stepstatus = basepage.setValueInSelectBox(RTOCheckafterStateselection, Option);
		reportEvent(stepstatus, "Able to Select RTO office immidiate after State Selection",
				"Unable to Select RTO office immidiate after State Selection", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='rtCode']")
	WebElement RTOCheckafterApplyonline;

	public void SelectRTO_Office_AfterApplyNewLL(String Option) {
		stepstatus = basepage.setValueInSelectBox(RTOCheckafterApplyonline, Option);
		reportEvent(stepstatus, "Able to Select RTO office immidiate after Apply NewLL",
				"Unable to Select RTO office immidiate after Apply NewLL", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()=' Learner Licence ']")
	WebElement LearnerLicence;

	public void Mouserhoveron_LearnerLicence() {
		stepstatus = basepage.mouseHover(LearnerLicence, driver);
		reportEvent(stepstatus, "Able to do Mousehover action on Learner Licence",
				"Unable to do Mousehover action on Leaner Licence", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()=' Learner Licence ']/following::a[text()='Application for New Learner Licence']")
	WebElement ApplicationforNewLearnerLicence;

	public void Clickon_Application_for_New_LearnerLicence() {
		stepstatus = basepage.clickElement(ApplicationforNewLearnerLicence);
		reportEvent(stepstatus, "Able to click on ApplicationforNewLearnerLicence",
				"Unable to click on ApplicationforNewLearnerLicence", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='rtCode']")
	WebElement SelectRTOOffice;

	public void SelectRTO_Office(String Option) {

		stepstatus = basepage.setOptionInSelectBox(SelectRTOOffice, Option);
		reportEvent(stepstatus, "Able to Select RTO Office", "Unable to Select RTO Office", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='rtCode']")
	WebElement RTOSELECTION;

	public void Selectrtoselection(String option) {

		stepstatus = basepage.setOptionInSelectBox(RTOSELECTION, option);
		reportEvent(stepstatus, "Able to select rto", "unable to select rto", driver, true);
	}

	public String Getlogotp(String url) throws IOException {
		wait(3);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // switches to new tab
		driver.get(url);
		// driver.navigate().refresh();
		String output = driver.findElement(By.cssSelector("body")).getText();
		File DestFile = new File(".\\logfile.txt");
		PrintWriter writer = new PrintWriter(DestFile);
		writer.print("");
		writer.close();
		FileUtils.writeStringToFile(DestFile, output);
		String FILENAME = ".\\logfile.txt";
		String getotp = null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String strCurrentLine;
			int count = 0;
			while ((strCurrentLine = br.readLine()) != null) {
				if (strCurrentLine.contains("Generated OTP random code:")) {
					if (strCurrentLine.contains("Generated OTP random code:")) {
						// System.out.println(strCurrentLine.substring(177,184).trim());
						getotp = strCurrentLine.substring(88, 94).trim();
						// System.out.println(getotp);
					}
					count++;
				} else {
					System.out.println("#######################Pleasae Check OTP Section###########################");
				}
			}
			// System.out.println(count);
			System.out.println(getotp);
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath("//input[@name='otpNumberSarathi']")).sendKeys(getotp);
			driver.findElement(By.xpath("//input[@name='otpNumberSarathi']")).sendKeys(Keys.TAB);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return getotp;
	}

	@FindBy(how = How.XPATH, using = "//input[@value='FORM1']")
	WebElement Form_one;

	public void ClickonForm1_buttton() {
		stepstatus = basepage.clickElement(Form_one);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='declaringcheck']")
	WebElement DeclareForm1;

	public void ClickonDeclareCheckbox() {
		stepstatus = basepage.clickElement(DeclareForm1);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='getFormOneDetails_Submit']")
	WebElement SubmitbuttonatForm1;

	public void ClickonSubmitbuttonatForm1() {
		stepstatus = basepage.clickElement(SubmitbuttonatForm1);
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	@FindBy(how = How.XPATH, using = "//input[@value='close']")
	WebElement ClosebuttonatForm1;

	public void ClickonClosebuttonatForm1() {
		stepstatus = basepage.clickElement(ClosebuttonatForm1);
	}

	public void TypeDist() {

		WebElement Dist = driver.findElement(By.xpath("//select[@name='presDistrict']"));
		Select District = new Select(Dist);
		List<WebElement> options = District.getOptions();
		for (int i = 0; i <= options.size() - 1; i++) {
			try {
				Dist = driver.findElement(By.xpath("//select[@name='presDistrict']"));
				District = new Select(Dist);
				options = District.getOptions();
				if (!options.get(1).getText().contains("Select")) {
					System.out.println(options.get(1).getText());
					District.selectByVisibleText(options.get(1).getText());
					Thread.sleep(3000);
					WebElement SubDist = driver.findElement(By.xpath("//select[@id='presSubDistrict']"));
					Select subdist = new Select(SubDist);
					List<WebElement> Subdistoptions = subdist.getOptions();
					System.out.println(Subdistoptions.get(1).getText());
					Subdistoptions.get(1).getText();
					if (subdist.getOptions().size() > 1
							&& !subdist.getOptions().get(1).getText().toLowerCase().contains("Select")) {
						subdist.selectByIndex(1);
						break;
					}
				} else {
					System.out.println("Else block....: " + options.get(1).getText());
				}
			} catch (StaleElementReferenceException f) {
				f.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
