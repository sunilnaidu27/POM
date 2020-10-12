package applicationPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LL_Referencethrough_LLPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public LL_Referencethrough_LLPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// define webelementss

	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "//li[@class='meu-list']/a[text()='New Learners Licence']")
	WebElement NewLearnersLicence;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(how = How.XPATH, using = "//input[@id='licenceType3']")
	WebElement Applicantholds_LearnerLicence_Enter_LL_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='learningLicenceNo']")
	WebElement Enter_LearningLicenceNo_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='llDateOfBirth']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//*[@id='submitOfNewLL']")
	WebElement Submitone;
	@FindBy(how = How.XPATH, using = "//input[@id='newLL_execute_newll_confirm']")
	WebElement Confirm;
	@FindBy(how = How.XPATH, using = "//select[@id='fullCovsList']")
	WebElement SelectCOV;
	@FindBy(how = How.XPATH, using = "//input[@id='addToRightLabel']")
	WebElement Rightarrow;
	@FindBy(how = How.XPATH, using = "//input[@name='newll.submit']")
	WebElement Submittwo;
	@FindBy(how = How.XPATH, using = "//button[@value='Next  ']")
	WebElement Nextbutton;
	@FindBy(how = How.XPATH, using = "//input[@value='UPLOAD DOCUMENTS']")
	WebElement Clickradio;
	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//input[@name='method:displayDocuments']")
	WebElement Ok;
	@FindBy(how = How.XPATH, using = "//select[@name='documentType']")
	WebElement Document;
	@FindBy(how = How.XPATH, using = "//select[@name='relatedDocuments']")
	WebElement Proof;
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-8']/div/input[1]")
	WebElement Choosefile;
	@FindBy(how = How.XPATH, using = "//input[@id='upload']")
	WebElement Upload;
	@FindBy(how = How.XPATH, using = "//input[@name='method:confirm']")
	WebElement confirm;
	@FindBy(how = How.XPATH, using = "//button[@value='next']")
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//select[@name='bankslist']")
	WebElement Bank;
	@FindBy(how = How.XPATH, using = "//input[1][@id='abc']")
	WebElement Captcha;
	@FindBy(how = How.XPATH, using = "//input[@id='first']")
	WebElement Paynow;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement Checkbox;
	@FindBy(how = How.XPATH, using = "//input[@name='button1']")
	WebElement Proceedforpayment;
	@FindBy(how = How.XPATH, using = "//img[@alt='Continue to Login']")
	WebElement ContinuetoLogin;
	@FindBy(how = How.XPATH, using = "//input[@class='btn'][1]")
	WebElement Pressheretocontinue;
	@FindBy(how = How.XPATH, using = "//input[@name='success']")
	WebElement PrintReceipt;
	@FindBy(how = How.XPATH, using = "//input[@name='button2']")
	WebElement Home;
	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	WebElement Login;
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;
	@FindBy(how = How.XPATH, using = "//input[@id='crd1'][1]")
	WebElement Radiobutton;
	@FindBy(how = How.XPATH, using = "//input[@id='crd2']")
	WebElement Radiobutton1;
	@FindBy(how = How.XPATH, using = "//input[@id='radio33']")
	WebElement Radiobutton2;
	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement login;
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[6]/a")
	WebElement General;
	@FindBy(how = How.XPATH, using = "//a[text()='SCRUTINY']")
	WebElement Scrutiny;
	@FindBy(how = How.XPATH, using = "//input[@name='applicationNumber']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//a[text()='Verification of Documents']")
	WebElement VerificationofDocuments;
	@FindBy(how = How.XPATH, using = "//i[text()='Medical Certificate-Form1 (Self Decleration)']")
	WebElement Firstprooflink;
	@FindBy(how = How.XPATH, using = "//i[text()='Learner Licence']")
	WebElement Secondprooflink;
	// @FindBy(how = How.XPATH, using = "//i[text()='Passport']")
	// WebElement Thirdprooflink;
	@FindBy(how = How.XPATH, using = "//input[@id='documentsapproval_0']")
	WebElement windowSubmit;
	@FindBy(how = How.XPATH, using = "//input[@id='approveButton']")
	WebElement Scrutinybutton;
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement LL;
	@FindBy(how = How.XPATH, using = "//a[text()='LL APPROVAL BATCH']")
	WebElement LLAprovalbatch;
	@FindBy(how = How.XPATH, using = "//input[@id='radio33']")
	WebElement Radiobuton;
	@FindBy(how = How.XPATH, using = "//input[@name='applno']")
	WebElement Application_Num;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submitbutton;
	@FindBy(how = How.XPATH, using = "//table[@id='llApprovalPendApplications']/thead/tr/th[5]/input[1]")
	WebElement Selectall;
	@FindBy(how = How.XPATH, using = "//input[@id='Approve']")
	WebElement Issueallbutton;

	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}

	public void clickonapplyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	public void clickonapplyonNewLearnersLicence() {
		stepstatus = basepage.clickElement(NewLearnersLicence);
		reportEvent(stepstatus, "Able to click NewLL LINK ", "Unable to click NewLL LINK", driver, true);
	}

	public void clickonapplyonContinue() {
		stepstatus = basepage.clickElement(Continue);
		reportEvent(stepstatus, "Able to click Continue Button ", "Unable to click Continue Button", driver, true);
	}

	public void Clickon_Applicantholds_LearnerLicence_Enter_LL_Number_Radiobutton() {

		stepstatus = basepage.clickElement(Applicantholds_LearnerLicence_Enter_LL_Number);
		reportEvent(stepstatus, "Able to click Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton",
				"Unable to click Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton", driver, true);
	}

	public void Enter_LearningLicenceNo_Number(String value) {
		stepstatus = basepage.setText(Enter_LearningLicenceNo_Number, value);
		reportEvent(stepstatus, "Able to Enter_Driving_Licence_Number ", "Unable to Enter_Driving_Licence_Number ",
				driver, true);
	}

	public void Enter_Dateofbirth(String value) {
		stepstatus = basepage.setText(DateofBirth, value);
		reportEvent(stepstatus, "Able to Enter_DateofBirth ", "Unable to Enter_DateofBirth ", driver, true);
	}

	public void click_Submitone() {
		stepstatus = basepage.clickElement(Submitone);
		reportEvent(stepstatus, "Able to click Submitone button ", "Unable to click Submitone button ", driver, true);
	}

	public void click_confirm() {
		stepstatus = basepage.clickElement(Confirm);
		reportEvent(stepstatus, "Able to click Confirm button ", "Unable to click Confirm button ", driver, true);
	}

	public void SelectCOV(String option) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV, option);
		reportEvent(stepstatus, "Able to Select COV  ", "Unable to Select COV", driver, true);
	}

	public void Clickon_Rightarrow() {
		stepstatus = basepage.clickElement(Rightarrow);
		reportEvent(stepstatus, "Able to Click Rightarrow ", "Unable to click Rightarrow", driver, true);
	}

	public void Clickon_Submitbutton() {
		stepstatus = basepage.clickElement(Submittwo);
		reportEvent(stepstatus, "Able to Click Submittwo ", "Unable to click Submittwo", driver, true);
		wait(2);
		if (basepage.alertExist(driver)) {

			String Mesg = "It seems, Your Similar Data Found";
			if (Mesg.equals("It seems, Your Similar Data Found")) {

				basepage.acceptAlert(driver);
				basepage.alertExist(driver);
				basepage.acceptAlert(driver);
				basepage.alertExist(driver);
				basepage.acceptAlert(driver);

			} else {
				basepage.alertExist(driver);
				basepage.acceptAlert(driver);
				basepage.alertExist(driver);
				basepage.acceptAlert(driver);
			}
		}

	}
	
	public void Clickon_Next_Btn() {
		if (basepage.clickElement(Nextbutton)) {

			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click Nextbutton button", "Unable to click Nextbutton button", driver, true);
		}
	}

	public void Clickon_Proceed_Button() {
		if (basepage.clickElement(Clickradio)) {

			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);
		}
	}

	public void Clickon_ok_Button() {
		stepstatus = basepage.clickElement(Ok);
		reportEvent(stepstatus, "Able to click Ok button", "Unable to click Ok button", driver, true);
	}

	public void Set_FirstDocument(String option) {
		stepstatus = basepage.setOptionInSelectBox(Document, option);
		reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
	}

	public void Set_First_Proof_Document(String option) {

		stepstatus = basepage.setOptionInSelectBox(Proof, option);
		reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
	}

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

	public void Clickon_Next_Button() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click Next button", "Unable to click Next button", driver, true);
	}

	public void SelectBank(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Bank, Option);
		reportEvent(stepstatus, "Able to Select Bank", "Unable to Select Bank", driver, true);
	}

	public void SetCaptcha() {

		WebElement ref = driver.findElement(By.xpath("//input[1][@id='abc']"));
		driver.findElement(By.xpath("//input[@id='captchatext']")).sendKeys(ref.getAttribute("value"));
		// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
		// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
		// driver, true);

	}

	public void Clickon_Paynow_Button() {
		stepstatus = basepage.clickElement(Paynow);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
	}

	public void Clickon_Checkbox() {
		stepstatus = basepage.clickElement(Checkbox);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
	}

	public void Clickon_Proceedforpayment() {
		stepstatus = basepage.clickElement(Proceedforpayment);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
		wait(7);
		if (basepage.alertExist(driver)) {
			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	public void Clickon_ContinuetoLogin_Button() {
		stepstatus = basepage.clickElement(ContinuetoLogin);
		reportEvent(stepstatus, "Able to click ContinuetoLogin button", "Unable to click ContinuetoLogin button",
				driver, true);
	}

	public void Clickon_Pressheretocontinue_Button() {
		stepstatus = basepage.clickElement(Pressheretocontinue);
		reportEvent(stepstatus, "Able to click Pressheretocontinue button",
				"Unable to click Pressheretocontinue button", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
			System.out.println("Payment Recived Sucessfully");
		} else {
			basepage.dismissAlert(driver);
		}
	}

	public void Clickon_Home_Button() {
		stepstatus = basepage.clickElement(Home);
		reportEvent(stepstatus, "Able to click Home button", "Unable to click Home button", driver, true);
	}

	public void Clickon_PrintReceipt() {
		stepstatus = basepage.clickElement(PrintReceipt);
		reportEvent(stepstatus, "Able to click PrintReceipt button", "Unable to click PrintReceipt button", driver,
				true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
			System.out.println("Payment Recived Sucessfully");
		} else {
			basepage.dismissAlert(driver);
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

	public void ClickonLogin() {
		stepstatus = basepage.clickElement(Singin);
		reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button", driver, true);
	}

	public void SelectRTOtype() {
		stepstatus = basepage.clickElement(Radiobutton);
		reportEvent(stepstatus, "Able to click on Radiobutton", "Unable to click on Radiobutton", driver, true);
	}

	public void SelectRTOtypo() {
		stepstatus = basepage.clickElement(Radiobutton1);
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

	public void Clickon_Proceed_button() {
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click on Proceed BUtton", "Unable to click on Proceed Button", driver, true);
		basepage.scrooldown(driver);
	}

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

	public void Clickon_prooflinks() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		basepage.closeWindowByTitle(":::Image Displaying:::", driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(Secondprooflink);
		basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		basepage.closeWindowByTitle(":::Image Displaying:::", driver);

		// basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		// basepage.clickElement(Thirdprooflink);
		// basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		// basepage.closeWindowByTitle(":::Image Displaying:::", driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		basepage.closeWindowByTitle("Documents Approved by Approval Authority", driver);

	}

	public void Clickon_Scrutinybutton() {
		stepstatus = basepage.clickElement(Scrutinybutton);
		reportEvent(stepstatus, "Able to click on Scrutinybutton", "Unable to click on Scrutinybutton", driver, true);
	}

	public void ClickonLLLink() {
		stepstatus = basepage.clickElement(LL);
		reportEvent(stepstatus, "Able to click LL_LINK", "Unable to click on LL_LINK", driver, true);
	}

	public void ClickonLLAprovalbatchLink() {
		stepstatus = basepage.clickElement(LLAprovalbatch);
		reportEvent(stepstatus, "Able to click LLAprovalbatch Link", "Unable to click LLAprovalbatch Link", driver,
				true);
	}

	public void ClickonRadiobutton() {
		stepstatus = basepage.clickElement(Radiobutton);
		reportEvent(stepstatus, "Able to click Radiobutton", "Unable to click Radiobutton", driver, true);
	}

	public void ClickonRadiobutton2() {
		stepstatus = basepage.clickElement(Radiobutton2);
		reportEvent(stepstatus, "Able to click Radiobutton2", "Unable to click Radiobutton2", driver, true);
	}

	public void Set_Application_Number(String value) {
		stepstatus = basepage.setText(Application_Number, value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	public void Clickon_Submitbuttonn() {
		stepstatus = basepage.clickElement(Submitbutton);
		reportEvent(stepstatus, "Able to click on Submitbutton", "Unable to click Submitbutton", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

	public void Clickon_Selectallcheckbox() {
		stepstatus = basepage.clickElement(Selectall);
		reportEvent(stepstatus, "Able to click Selectall checkboc", "Unable to click Selectall checkbox", driver, true);
	}

	public void Clickon_Issueallbutton() {
		stepstatus = basepage.clickElement(Issueallbutton);
		reportEvent(stepstatus, "Able to click Issueallbutton ", "Unable to click Issueallbutton", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

}
