package testScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import applicationPages.DL_Service_ChangeofName;
import applicationPages.DL_Service_DLExtract;
import applicationPages.DL_Service_Endorsement_to_drive_in_Hill_region;
import applicationPages.DL_Service_Issue_Of_PSVBadge_to_Driver;
import applicationPages.DL_Service_AddressinDL;
import applicationPages.DL_Service_Change_of_Biometrics_in_DL;
import applicationPages.DL_Service_IssueofDuplicateDL;
import applicationPages.DL_Service_ReplacementofDL;
import applicationPages.LLFEEPaymentPagee;
import applicationPages.LLSlotBookingPagee;
import applicationPages.Login_CapturebiometricsPage;
import applicationPages.UploadDocumentsPage;
import applicationPages.UploadPhoto_SignaturePage;
import applicationPages.DL_Service_IssueofNOC;
import applicationPages.DL_Service_Issueof_International_Driving_Permit;
import applicationPages.DL_Service_Renewal_with_ReTest;
import applicationPages.DL_Service_RenewalofDL;
import frameworkLibrary.BaseClass;
import frameworkLibrary.FrameworkVariables;

public class _07_DL_Services extends BaseClass {

	WebDriver driver;
	UploadDocumentsPage UploadDocumentsPage;
	UploadPhoto_SignaturePage UploadPhoto_SignaturePage;
	LLFEEPaymentPagee LLFEEPaymentPage;
	DL_Service_ChangeofName DL_Service_ChangeofName;
	DL_Service_AddressinDL DL_Service_AddressinDL;
	DL_Service_IssueofDuplicateDL DL_Service_IssueofDuplicateDL;
	DL_Service_ReplacementofDL DL_Service_ReplacementofDL;
	DL_Service_IssueofNOC DL_Service_IssueofNOC;
	DL_Service_RenewalofDL RenewalofDL;
	DL_Service_DLExtract DL_Extract;
	DL_Service_Issueof_International_Driving_Permit Issueof_International_Driving_Permit;
	DL_Service_Change_of_Biometrics_in_DL Change_of_Biometrics_in_DL;
	DL_Service_Issue_Of_PSVBadge_to_Driver DL_Service_Issue_Of_PSVBadge;
	Login_CapturebiometricsPage Login_CapturebiometricsPage;
	LLSlotBookingPagee LLSlotBookingPage;
	DL_Service_Renewal_with_ReTest Renewal_with_ReTest;
	DL_Service_Endorsement_to_drive_in_Hill_region Endorsement_to_drive_in_Hill_region;

	applicationPages.TC_NT_Premature_Without_Mapping NT_Premature_Without_Mapping;

	// DL Service --> Change of Name
	@Test(invocationCount = 7)
	public void TC_ChangeofName() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();

		DL_Service_ChangeofName = new DL_Service_ChangeofName(driver);

		DL_Service_ChangeofName.setUserName(getdata("UserName"));
		DL_Service_ChangeofName.setpassword(getdata("Password"));
		// DL_Service_ChangeofName.ClickonNext();
		// DL_Service_ChangeofName.SetCaptcha();
		DL_Service_ChangeofName.Clickonsubmit();

		DL_Service_ChangeofName.ClickonRadio();
		DL_Service_ChangeofName.Clickonlogin();
		DL_Service_ChangeofName.ClickonDL();
		DL_Service_ChangeofName.ClickonDLBacklog();
		DL_Service_ChangeofName.SetFirstissuedate(getdata("Firstissuedate"));

		DL_Service_ChangeofName.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_ChangeofName.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_ChangeofName.SetName(getdata("Name"));
		DL_Service_ChangeofName.SetMiddleName(getdata("Middlename"));
		DL_Service_ChangeofName.SetLastName(getdata("Lastname"));
		DL_Service_ChangeofName.SetRelation(getdata("Relationname"));
		DL_Service_ChangeofName.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_ChangeofName.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_ChangeofName.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_ChangeofName.ClickonGender();
		DL_Service_ChangeofName.SetAge(getdata("Age"));
		DL_Service_ChangeofName.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_ChangeofName.SetQualification(getdata("Qualification"));
		DL_Service_ChangeofName.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_ChangeofName.SetState(getdata("State"));
		DL_Service_ChangeofName.SetDistrict(getdata("District"));
		DL_Service_ChangeofName.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_ChangeofName.SetPincode(getdata("Pincode"));
		DL_Service_ChangeofName.ClickonCheckbox();
		DL_Service_ChangeofName.ClickonLicenseDetails();
		DL_Service_ChangeofName.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_ChangeofName.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Service_ChangeofName.SetStateone(getdata("Stateone"));
		// DL_Service_ChangeofName.SetRTOone(getdata("RTOone"));
		// DL_Service_ChangeofName.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Service_ChangeofName.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// DL_Service_ChangeofName.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Service_ChangeofName.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_ChangeofName.SetStatetwo(getdata("Statetwo"));
		// DL_Service_ChangeofName.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_ChangeofName.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_ChangeofName.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_ChangeofName.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_ChangeofName.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Service_ChangeofName.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_ChangeofName.SetRTOthree(getdata("RTOthree"));
		// DL_Service_ChangeofName.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_ChangeofName.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_ChangeofName.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_ChangeofName.ClickonAddbutton4();

		DL_Service_ChangeofName.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_ChangeofName.setdata("DL", s1.substring(16).trim());
		DL_Service_ChangeofName.setdata("Status", "Pass");
		DL_Service_ChangeofName.ClickonDL();
		DL_Service_ChangeofName.ClickonDlbacklogapproval();
		DL_Service_ChangeofName.SetDLno();
		DL_Service_ChangeofName.Clickonproceed();

		/* DL_Service_ChangeofName.ClickonGenerateOTP(); */

		DL_Service_ChangeofName.Clickonapprove();
		// s2 = DL_Approvedappno(driver, "//div[@class='text-success']/h4");
		// DL_Service_ChangeofName.setdata("DLApprovedappno", s2.substring(14,
		// 20).trim());
		DL_Service_ChangeofName.Logout();

		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_ChangeofName.SelcectService(526);

		ChangeofnameinDLAppliationno = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		System.out.println(ChangeofnameinDLAppliationno.substring(3).trim());

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("DL Services Acknowledgement")) {

			DL_Service_ChangeofName.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Service_ChangeofName.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_ChangeofName.Clickon_Exitbutton();
			DL_Service_ChangeofName.Clickon_TempHomebutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();

			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

			DL_Service_ChangeofName.setUserNamee(getdata("UserName"));
			DL_Service_ChangeofName.setpass(getdata("Password"));
			DL_Service_ChangeofName.ClickonLogin();
			DL_Service_ChangeofName.SelectRTOtype();
			DL_Service_ChangeofName.Clickonloogin();
			DL_Service_ChangeofName.Clickon_General_button();
			DL_Service_ChangeofName.Clickon_Scrutiny_Link();
			DL_Service_ChangeofName.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DL_Service_ChangeofName.Clickon_RTOProceed_button();
			DL_Service_ChangeofName.Clickon_VerificationofDocuments_Link();
			DL_Service_ChangeofName.Clickon_prooflinks();
			DL_Service_ChangeofName.Clickon_Scrutinybutton();
			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			DL_Service_ChangeofName = new DL_Service_ChangeofName(ff);
			DL_Service_ChangeofName.setUserNamee(getdata("UserName"));
			DL_Service_ChangeofName.setpass(getdata("Password"));
			DL_Service_ChangeofName.ClickonLogin();
			DL_Service_ChangeofName.SelectRTOtype();
			DL_Service_ChangeofName.Clickonloogin();
			DL_Service_ChangeofName.Clickon_General_button();
			DL_Service_ChangeofName.Clickon_BiometricsLink();
			DL_Service_ChangeofName.Set_Application_Number(getdata("ApplicationNo"));
			DL_Service_ChangeofName.Clickon_Getdetails();
			DL_Service_ChangeofName.Set_CanvasSignature("#thecanvas");
			DL_Service_ChangeofName.Clickon_Capturesignaturebutton();
			DL_Service_ChangeofName.Set_PhotoCapture();
			DL_Service_ChangeofName.Clickon_CropSelected();
			DL_Service_ChangeofName.Clickon_Phototriggerbutton();
			DL_Service_ChangeofName.Clickon_Snapokbutton();
			DL_Service_ChangeofName.Clickon_Savebutton();
			ff.close();
			wait(2);
			DL_Service_ChangeofName = new DL_Service_ChangeofName(driver);
			DL_Service_ChangeofName.ClickonDL();
			DL_Service_ChangeofName.Clickon_DL_Endorsement_Approval();
			DL_Service_ChangeofName.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			DL_Service_ChangeofName.Clickon_Submit_in__DL_Endorsement_Approval();
			DL_Service_ChangeofName.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_ChangeofName.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	// DL Service --> Change of Address
	@Test(invocationCount = 1)
	public void TC_ChangeofAddress() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Service_AddressinDL = new DL_Service_AddressinDL(driver);

		DL_Service_AddressinDL.setUserName(getdata("UserName"));
		DL_Service_AddressinDL.setpassword(getdata("Password"));
		// DL_Service_AddressinDL.ClickonNext();
		// DL_Service_AddressinDL.SetCaptcha();
		DL_Service_AddressinDL.Clickonsubmit();
		DL_Service_AddressinDL.ClickonRadio();
		DL_Service_AddressinDL.Clickonlogin();
		DL_Service_AddressinDL.ClickonDL();
		DL_Service_AddressinDL.ClickonDLBacklog();
		DL_Service_AddressinDL.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Service_AddressinDL.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_AddressinDL.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_AddressinDL.SetName(getdata("Name"));
		DL_Service_AddressinDL.SetMiddleName(getdata("Middlename"));
		DL_Service_AddressinDL.SetLastName(getdata("Lastname"));
		DL_Service_AddressinDL.SetRelation(getdata("Relationname"));
		DL_Service_AddressinDL.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_AddressinDL.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_AddressinDL.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_AddressinDL.ClickonGender();
		DL_Service_AddressinDL.SetAge(getdata("Age"));
		DL_Service_AddressinDL.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_AddressinDL.SetQualification(getdata("Qualification"));
		DL_Service_AddressinDL.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_AddressinDL.SetState(getdata("State"));
		DL_Service_AddressinDL.SetDistrict(getdata("District"));
		DL_Service_AddressinDL.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_AddressinDL.SetPincode(getdata("Pincode"));
		DL_Service_AddressinDL.ClickonCheckbox();
		DL_Service_AddressinDL.ClickonLicenseDetails();
		DL_Service_AddressinDL.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_AddressinDL.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Service_AddressinDL.SetStateone(getdata("Stateone"));
		// DL_Service_AddressinDL.SetRTOone(getdata("RTOone"));
		// DL_Service_AddressinDL.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Service_AddressinDL.SetSelectCOV1(getdata("SelectCOV2"));

		// wait(1);
		// DL_Service_AddressinDL.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Service_AddressinDL.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_AddressinDL.SetStatetwo(getdata("Statetwo"));
		// DL_Service_AddressinDL.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_AddressinDL.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_AddressinDL.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_AddressinDL.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_AddressinDL.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_ServDL_Service_AddressinDLice_ChangeofName.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_AddressinDL.SetRTOthree(getdata("RTOthree"));
		// DL_Service_AddressinDL.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_AddressinDL.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_AddressinDL.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_AddressinDL.ClickonAddbutton4();

		DL_Service_AddressinDL.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_AddressinDL.setdata("DL", s1.substring(16).trim());
		DL_Service_AddressinDL.setdata("Status", "Pass");
		DL_Service_AddressinDL.ClickonDL();
		DL_Service_AddressinDL.ClickonDlbacklogapproval();
		DL_Service_AddressinDL.SetDLno();
		DL_Service_AddressinDL.Clickonproceed();
		/* DL_Service_AddressinDL.ClickonGenerateOTP(); */
		DL_Service_AddressinDL.Clickonapprove();
		DL_Service_AddressinDL.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_AddressinDL.SelcectService(515);

		ChangeofAddressApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("DL Services Acknowledgement")) {

			DL_Service_AddressinDL.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Service_AddressinDL.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_AddressinDL.Clickon_Exitbutton();
			DL_Service_AddressinDL.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			wait(2);
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DL_Service_AddressinDL.setUserNamee(getdata("UserName"));
			DL_Service_AddressinDL.setpass(getdata("Password"));
			DL_Service_AddressinDL.ClickonLogin();
			DL_Service_AddressinDL.SelectRTOtype();
			DL_Service_AddressinDL.Clickonloogin();
			DL_Service_AddressinDL.Clickon_General_button();
			DL_Service_AddressinDL.Clickon_Scrutiny_Link();
			DL_Service_AddressinDL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DL_Service_AddressinDL.Clickon_RTOProceed_button();
			DL_Service_AddressinDL.Clickon_VerificationofDocuments_Link();
			DL_Service_AddressinDL.Clickon_prooflinks();
			DL_Service_AddressinDL.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			DL_Service_AddressinDL = new DL_Service_AddressinDL(ff);
			DL_Service_AddressinDL.setUserNamee(getdata("UserName"));
			DL_Service_AddressinDL.setpass(getdata("Password"));
			DL_Service_AddressinDL.ClickonLogin();
			DL_Service_AddressinDL.SelectRTOtype();
			DL_Service_AddressinDL.Clickonloogin();
			DL_Service_AddressinDL.Clickon_General_button();
			DL_Service_AddressinDL.Clickon_BiometricsLink();
			DL_Service_AddressinDL.Set_Application_Number(getdata("ApplicationNo"));
			DL_Service_AddressinDL.Clickon_Getdetails();
			DL_Service_AddressinDL.Set_CanvasSignature("#thecanvas");
			DL_Service_AddressinDL.Clickon_Capturesignaturebutton();
			DL_Service_AddressinDL.Set_PhotoCapture();
			DL_Service_AddressinDL.Clickon_CropSelected();
			DL_Service_AddressinDL.Clickon_Phototriggerbutton();
			DL_Service_AddressinDL.Clickon_Snapokbutton();
			DL_Service_AddressinDL.Clickon_Savebutton();
			ff.close();
			wait(2);
			DL_Service_AddressinDL = new DL_Service_AddressinDL(driver);
			DL_Service_AddressinDL.ClickonDL();
			DL_Service_AddressinDL.Clickon_DL_Endorsement_Approval();
			DL_Service_AddressinDL.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			DL_Service_AddressinDL.Clickon_Submit_in__DL_Endorsement_Approval();
			DL_Service_AddressinDL.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_ChangeofName.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC_RenewalofDL() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		RenewalofDL = new DL_Service_RenewalofDL(driver);
		RenewalofDL.setUserName(getdata("UserName"));
		RenewalofDL.setpassword(getdata("Password"));
		RenewalofDL.Clickonsubmit();
		RenewalofDL.ClickonRadio();
		RenewalofDL.Clickonlogin();
		RenewalofDL.ClickonDL();
		RenewalofDL.ClickonDLBacklog();
		RenewalofDL.SetFirstissuedate(getdata("Firstissuedate"));
		RenewalofDL.SetNumaricLLno(getdata("NumaricLLno"));
		RenewalofDL.SetOriginalDLno(getdata("OriginalDLno"));
		RenewalofDL.SetName(getdata("Name"));
		RenewalofDL.SetMiddleName(getdata("Middlename"));
		RenewalofDL.SetLastName(getdata("Lastname"));
		RenewalofDL.SetRelation(getdata("Relationname"));
		RenewalofDL.SetRelationfirstname(getdata("Relationfirstname"));
		RenewalofDL.SetRelationMiddlename(getdata("RelationMiddleName"));
		RenewalofDL.SetRelationLastname(getdata("RelationLastName"));
		RenewalofDL.ClickonGender();
		RenewalofDL.SetAge(getdata("Age"));
		RenewalofDL.SetBloodgroup(getdata("Bloodgroup"));
		RenewalofDL.SetQualification(getdata("Qualification"));
		RenewalofDL.SetMobilenumber(getdata("Mobilenumber"));
		RenewalofDL.SetState(getdata("State"));
		RenewalofDL.SetDistrict(getdata("District"));
		RenewalofDL.SetSubDistrict(getdata("SubDistrict"));
		RenewalofDL.SetPincode(getdata("Pincode"));
		RenewalofDL.ClickonCheckbox();
		RenewalofDL.ClickonLicenseDetails();
		RenewalofDL.SetSelectCOV1(getdata("SelectCOV1"));
		RenewalofDL.ClickonAddbutton1();

		/* Adding Second COV */

		// RenewalofDL.SetStateone(getdata("Stateone"));
		// RenewalofDL.SetRTOone(getdata("RTOone"));
		// RenewalofDL.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// RenewalofDL.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// RenewalofDL.SetSelectCOV1(getdata("SelectCOV2"));
		// RenewalofDL.ClickonAddbutton2();

		/* Adding Third COV */

		// RenewalofDL.SetStatetwo(getdata("Statetwo"));
		// RenewalofDL.SetRTOtwo(getdata("RTOtwo"));
		// RenewalofDL.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// RenewalofDL.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// RenewalofDL.SetSelectCOV3(getdata("SelectCOV3"));
		// RenewalofDL.ClickonAddbutton3();

		/* Adding Fourth COV */

		// RenewalofDL.SetStatethreeo(getdata("Statethreeo"));
		// RenewalofDL.SetRTOthree(getdata("RTOthree"));
		// RenewalofDL.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// RenewalofDL.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// RenewalofDL.SetSelectCOV4(getdata("SelectCOV4"));
		// RenewalofDL.ClickonAddbutton4();

		RenewalofDL.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		RenewalofDL.setdata("DL", s1.substring(16).trim());
		RenewalofDL.setdata("Status", "Pass");
		RenewalofDL.ClickonDL();
		RenewalofDL.ClickonDlbacklogapproval();
		RenewalofDL.SetDLno();
		RenewalofDL.Clickonproceed();
		/* RenewalofDL.ClickonGenerateOTP(); */
		RenewalofDL.Clickonapprove();
		RenewalofDL.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		RenewalofDL.SelcectService(514);

		RenewalofDLApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			RenewalofDL.setdata("ApplicationNo", s1.substring(3).trim());

			RenewalofDL.setdata("RequestStatus", "Pass");
			wait(1);
			RenewalofDL.Clickon_Exitbutton();
			RenewalofDL.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			RenewalofDL.Clickon_Proceed_Button();
			RenewalofDL.Clickon_ProceedtoBookSlot_Button();
			RenewalofDL.Booking_Slot();
			RenewalofDL.Clickon_Bookslotbutton();
			RenewalofDL.Clickon_Confirm_slotbookingbutton();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			RenewalofDL.setUserName(getdata("UserName"));
			RenewalofDL.setpassword(getdata("Password"));
			RenewalofDL.Clickonsubmit();
			RenewalofDL.ClickonRadio();
			RenewalofDL.Clickonlogin();

			RenewalofDL.Clickon_General_button();
			RenewalofDL.Clickon_Scrutiny_Link();
			RenewalofDL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			RenewalofDL.Clickon_RTOProceed_button();
			RenewalofDL.Clickon_VerificationofDocuments_Link();
			RenewalofDL.Clickon_prooflinks();
			RenewalofDL.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			RenewalofDL = new DL_Service_RenewalofDL(ff);
			RenewalofDL.setUserName(getdata("UserName"));
			RenewalofDL.setpassword(getdata("Password"));
			RenewalofDL.Clickonsubmit();
			RenewalofDL.ClickonRadio();
			RenewalofDL.Clickonlogin();
			RenewalofDL.Clickon_General_button();
			RenewalofDL.Clickon_BiometricsLink();
			RenewalofDL.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			RenewalofDL.Clickon_Getdetails();
			RenewalofDL.Set_CanvasSignature("#thecanvas");
			RenewalofDL.Clickon_Capturesignaturebutton();
			RenewalofDL.Set_PhotoCapture();
			RenewalofDL.Clickon_CropSelected();
			RenewalofDL.Clickon_Phototriggerbutton();
			RenewalofDL.Clickon_Snapokbutton();
			RenewalofDL.Clickon_Savebutton();
			ff.close();
			wait(2);
			RenewalofDL = new DL_Service_RenewalofDL(driver);
			RenewalofDL.ClickonDL();
			RenewalofDL.Clickon_DL_Endorsement_Approval();
			RenewalofDL.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			RenewalofDL.Clickon_Submit_in__DL_Endorsement_Approval();
			RenewalofDL.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_ChangeofName.setdata("RequestStatus", "Fail");
			driver.close();
		}
	}

	/* DL_Service_IssueofDuplicateDL */
	@Test(invocationCount = 1)
	public void TC_DL_Service_IssueofDuplicateDL() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();

		DL_Service_IssueofDuplicateDL = new DL_Service_IssueofDuplicateDL(driver);

		DL_Service_IssueofDuplicateDL.setUserName(getdata("UserName"));
		DL_Service_IssueofDuplicateDL.setpassword(getdata("Password"));
		// DL_Service_IssueofDuplicateDL.ClickonNext();
		// DL_Service_IssueofDuplicateDL.SetCaptcha();
		DL_Service_IssueofDuplicateDL.Clickonsubmit();
		DL_Service_IssueofDuplicateDL.ClickonRadio();
		DL_Service_IssueofDuplicateDL.Clickonlogin();
		DL_Service_IssueofDuplicateDL.ClickonDL();
		DL_Service_IssueofDuplicateDL.ClickonDLBacklog();
		DL_Service_IssueofDuplicateDL.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Service_IssueofDuplicateDL.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_IssueofDuplicateDL.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_IssueofDuplicateDL.SetName(getdata("Name"));
		DL_Service_IssueofDuplicateDL.SetMiddleName(getdata("Middlename"));
		DL_Service_IssueofDuplicateDL.SetLastName(getdata("Lastname"));
		DL_Service_IssueofDuplicateDL.SetRelation(getdata("Relationname"));
		DL_Service_IssueofDuplicateDL.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_IssueofDuplicateDL.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_IssueofDuplicateDL.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_IssueofDuplicateDL.ClickonGender();
		DL_Service_IssueofDuplicateDL.SetAge(getdata("Age"));
		DL_Service_IssueofDuplicateDL.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_IssueofDuplicateDL.SetQualification(getdata("Qualification"));
		DL_Service_IssueofDuplicateDL.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_IssueofDuplicateDL.SetState(getdata("State"));
		DL_Service_IssueofDuplicateDL.SetDistrict(getdata("District"));
		DL_Service_IssueofDuplicateDL.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_IssueofDuplicateDL.SetPincode(getdata("Pincode"));
		DL_Service_IssueofDuplicateDL.ClickonCheckbox();
		DL_Service_IssueofDuplicateDL.ClickonLicenseDetails();
		DL_Service_IssueofDuplicateDL.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_IssueofDuplicateDL.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Service_IssueofDuplicateDL.SetStateone(getdata("Stateone"));
		// DL_Service_IssueofDuplicateDL.SetRTOone(getdata("RTOone"));
		// DL_Service_IssueofDuplicateDL.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Service_IssueofDuplicateDL.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// DL_Service_IssueofDuplicateDL.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Service_IssueofDuplicateDL.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_IssueofDuplicateDL.SetStatetwo(getdata("Statetwo"));
		// DL_Service_IssueofDuplicateDL.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_IssueofDuplicateDL.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_IssueofDuplicateDL.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_IssueofDuplicateDL.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_IssueofDuplicateDL.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Service_IssueofDuplicateDL.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_IssueofDuplicateDL.SetRTOthree(getdata("RTOthree"));
		// DL_Service_IssueofDuplicateDL.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_IssueofDuplicateDL.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_IssueofDuplicateDL.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_IssueofDuplicateDL.ClickonAddbutton4();

		DL_Service_IssueofDuplicateDL.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_IssueofDuplicateDL.setdata("DL", s1.substring(16).trim());
		DL_Service_IssueofDuplicateDL.setdata("Status", "Pass");
		DL_Service_IssueofDuplicateDL.ClickonDL();
		DL_Service_IssueofDuplicateDL.ClickonDlbacklogapproval();
		DL_Service_IssueofDuplicateDL.SetDLno();
		DL_Service_IssueofDuplicateDL.Clickonproceed();
		/* DL_Service_IssueofDuplicateDL.ClickonGenerateOTP(); */
		DL_Service_IssueofDuplicateDL.Clickonapprove();
		DL_Service_IssueofDuplicateDL.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_IssueofDuplicateDL.SelcectService(513);

		DL_Service_IssueofDuplicateDLApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			DL_Service_IssueofDuplicateDL.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Service_IssueofDuplicateDL.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_IssueofDuplicateDL.Clickon_Exitbutton();
			DL_Service_IssueofDuplicateDL.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			DL_Service_IssueofDuplicateDL.Clickon_Proceed_Button();
			DL_Service_IssueofDuplicateDL.Clickon_ProceedtoBookSlot_Button();
			DL_Service_IssueofDuplicateDL.Booking_Slot();
			DL_Service_IssueofDuplicateDL.Clickon_Bookslotbutton();
			DL_Service_IssueofDuplicateDL.Clickon_Confirm_slotbookingbutton();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DL_Service_IssueofDuplicateDL.setUserName(getdata("UserName"));
			DL_Service_IssueofDuplicateDL.setpassword(getdata("Password"));
			DL_Service_IssueofDuplicateDL.Clickonsubmit();
			DL_Service_IssueofDuplicateDL.ClickonRadio();
			DL_Service_IssueofDuplicateDL.Clickonlogin();
			DL_Service_IssueofDuplicateDL.Clickon_General_button();
			DL_Service_IssueofDuplicateDL.Clickon_Scrutiny_Link();
			DL_Service_IssueofDuplicateDL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DL_Service_IssueofDuplicateDL.Clickon_RTOProceed_button();
			DL_Service_IssueofDuplicateDL.Clickon_VerificationofDocuments_Link();
			DL_Service_IssueofDuplicateDL.Clickon_prooflinks();
			DL_Service_IssueofDuplicateDL.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			DL_Service_IssueofDuplicateDL = new DL_Service_IssueofDuplicateDL(ff);
			DL_Service_IssueofDuplicateDL.setUserName(getdata("UserName"));
			DL_Service_IssueofDuplicateDL.setpassword(getdata("Password"));
			DL_Service_IssueofDuplicateDL.Clickonsubmit();
			DL_Service_IssueofDuplicateDL.ClickonRadio();
			DL_Service_IssueofDuplicateDL.Clickonlogin();
			DL_Service_IssueofDuplicateDL.Clickon_General_button();
			DL_Service_IssueofDuplicateDL.Clickon_BiometricsLink();
			DL_Service_IssueofDuplicateDL.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			DL_Service_IssueofDuplicateDL.Clickon_Getdetails();
			DL_Service_IssueofDuplicateDL.Set_CanvasSignature("#thecanvas");
			DL_Service_IssueofDuplicateDL.Clickon_Capturesignaturebutton();
			DL_Service_IssueofDuplicateDL.Set_PhotoCapture();
			DL_Service_IssueofDuplicateDL.Clickon_CropSelected();
			DL_Service_IssueofDuplicateDL.Clickon_Phototriggerbutton();
			DL_Service_IssueofDuplicateDL.Clickon_Snapokbutton();
			DL_Service_IssueofDuplicateDL.Clickon_Savebutton();
			ff.close();
			wait(2);
			DL_Service_IssueofDuplicateDL = new DL_Service_IssueofDuplicateDL(driver);
			DL_Service_IssueofDuplicateDL.ClickonDL();
			DL_Service_IssueofDuplicateDL.Clickon_DL_Endorsement_Approval();
			DL_Service_IssueofDuplicateDL
					.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			DL_Service_IssueofDuplicateDL.Clickon_Submit_in__DL_Endorsement_Approval();
			DL_Service_IssueofDuplicateDL.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_IssueofDuplicateDL.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	/* TC_DL_Service_ReplacementofDL */
	@Test(invocationCount = 1)
	public void TC_DL_Service_ReplacementofDL() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Service_ReplacementofDL = new DL_Service_ReplacementofDL(driver);

		DL_Service_ReplacementofDL.setUserName(getdata("UserName"));
		DL_Service_ReplacementofDL.setpassword(getdata("Password"));
		// DL_Service_ReplacementofDL.ClickonNext();
		// DL_Service_ReplacementofDL.SetCaptcha();
		DL_Service_ReplacementofDL.Clickonsubmit();
		DL_Service_ReplacementofDL.ClickonRadio();
		DL_Service_ReplacementofDL.Clickonlogin();
		DL_Service_ReplacementofDL.ClickonDL();
		DL_Service_ReplacementofDL.ClickonDLBacklog();
		DL_Service_ReplacementofDL.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Service_ReplacementofDL.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_ReplacementofDL.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_ReplacementofDL.SetName(getdata("Name"));
		DL_Service_ReplacementofDL.SetMiddleName(getdata("Middlename"));
		DL_Service_ReplacementofDL.SetLastName(getdata("Lastname"));
		DL_Service_ReplacementofDL.SetRelation(getdata("Relationname"));
		DL_Service_ReplacementofDL.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_ReplacementofDL.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_ReplacementofDL.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_ReplacementofDL.ClickonGender();
		DL_Service_ReplacementofDL.SetAge(getdata("Age"));
		DL_Service_ReplacementofDL.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_ReplacementofDL.SetQualification(getdata("Qualification"));
		DL_Service_ReplacementofDL.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_ReplacementofDL.SetState(getdata("State"));
		DL_Service_ReplacementofDL.SetDistrict(getdata("District"));
		DL_Service_ReplacementofDL.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_ReplacementofDL.SetPincode(getdata("Pincode"));
		DL_Service_ReplacementofDL.ClickonCheckbox();
		DL_Service_ReplacementofDL.ClickonLicenseDetails();
		DL_Service_ReplacementofDL.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_ReplacementofDL.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Service_ReplacementofDL.SetStateone(getdata("Stateone"));
		// DL_Service_ReplacementofDL.SetRTOone(getdata("RTOone"));
		// DL_Service_ReplacementofDL.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Service_ReplacementofDL.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// DL_Service_ReplacementofDL.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Service_ReplacementofDL.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_ReplacementofDL.SetStatetwo(getdata("Statetwo"));
		// DL_Service_ReplacementofDL.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_ReplacementofDL.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_ReplacementofDL.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_ReplacementofDL.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_ReplacementofDL.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Service_ReplacementofDL.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_ReplacementofDL.SetRTOthree(getdata("RTOthree"));
		// DL_Service_ReplacementofDL.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_ReplacementofDL.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_ReplacementofDL.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_ReplacementofDL.ClickonAddbutton4();

		DL_Service_ReplacementofDL.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_ReplacementofDL.setdata("DL", s1.substring(16).trim());
		DL_Service_ReplacementofDL.setdata("Status", "Pass");
		DL_Service_ReplacementofDL.ClickonDL();
		DL_Service_ReplacementofDL.ClickonDlbacklogapproval();
		DL_Service_ReplacementofDL.SetDLno();
		DL_Service_ReplacementofDL.Clickonproceed();
		/* DL_Service_ReplacementofDL.ClickonGenerateOTP(); */
		DL_Service_ReplacementofDL.Clickonapprove();
		DL_Service_ReplacementofDL.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_ReplacementofDL.SelcectService(516);

		DL_Service_ReplacementofDLApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			DL_Service_ReplacementofDL.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Service_ReplacementofDL.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_ReplacementofDL.Clickon_Exitbutton();
			DL_Service_ReplacementofDL.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			DL_Service_ReplacementofDL.Clickon_Proceed_Button();
			DL_Service_ReplacementofDL.Clickon_ProceedtoBookSlot_Button();
			DL_Service_ReplacementofDL.Booking_Slot();
			DL_Service_ReplacementofDL.Clickon_Bookslotbutton();
			DL_Service_ReplacementofDL.Clickon_Confirm_slotbookingbutton();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DL_Service_ReplacementofDL.setUserName(getdata("UserName"));
			DL_Service_ReplacementofDL.setpassword(getdata("Password"));
			DL_Service_ReplacementofDL.Clickonsubmit();
			DL_Service_ReplacementofDL.ClickonRadio();
			DL_Service_ReplacementofDL.Clickonlogin();
			DL_Service_ReplacementofDL.Clickon_General_button();
			DL_Service_ReplacementofDL.Clickon_Scrutiny_Link();
			DL_Service_ReplacementofDL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DL_Service_ReplacementofDL.Clickon_RTOProceed_button();
			DL_Service_ReplacementofDL.Clickon_VerificationofDocuments_Link();
			DL_Service_ReplacementofDL.Clickon_prooflinks();
			DL_Service_ReplacementofDL.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			DL_Service_ReplacementofDL = new DL_Service_ReplacementofDL(ff);
			DL_Service_ReplacementofDL.setUserName(getdata("UserName"));
			DL_Service_ReplacementofDL.setpassword(getdata("Password"));
			DL_Service_ReplacementofDL.Clickonsubmit();
			DL_Service_ReplacementofDL.ClickonRadio();
			DL_Service_ReplacementofDL.Clickonlogin();
			DL_Service_ReplacementofDL.Clickon_General_button();
			DL_Service_ReplacementofDL.Clickon_BiometricsLink();
			DL_Service_ReplacementofDL.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			DL_Service_ReplacementofDL.Clickon_Getdetails();
			DL_Service_ReplacementofDL.Set_CanvasSignature("#thecanvas");
			DL_Service_ReplacementofDL.Clickon_Capturesignaturebutton();
			DL_Service_ReplacementofDL.Set_PhotoCapture();
			DL_Service_ReplacementofDL.Clickon_CropSelected();
			DL_Service_ReplacementofDL.Clickon_Phototriggerbutton();
			DL_Service_ReplacementofDL.Clickon_Snapokbutton();
			DL_Service_ReplacementofDL.Clickon_Savebutton();
			ff.close();
			wait(2);
			DL_Service_ReplacementofDL = new DL_Service_ReplacementofDL(driver);
			DL_Service_ReplacementofDL.ClickonDL();
			DL_Service_ReplacementofDL.Clickon_DL_Endorsement_Approval();
			DL_Service_ReplacementofDL.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			DL_Service_ReplacementofDL.Clickon_Submit_in__DL_Endorsement_Approval();
			DL_Service_ReplacementofDL.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_ReplacementofDL.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	/* TC_IssueofNOC */

	@Test(invocationCount = 1)
	public void TC_IssueofNOC() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Service_IssueofNOC = new DL_Service_IssueofNOC(driver);

		DL_Service_IssueofNOC.setUserName(getdata("UserName"));
		DL_Service_IssueofNOC.setpassword(getdata("Password"));
		// DL_Service_IssueofNOC.ClickonNext();
		// DL_Service_IssueofNOC.SetCaptcha();
		DL_Service_IssueofNOC.Clickonsubmit();
		DL_Service_IssueofNOC.ClickonRadio();
		DL_Service_IssueofNOC.Clickonlogin();
		DL_Service_IssueofNOC.ClickonDL();
		DL_Service_IssueofNOC.ClickonDLBacklog();
		DL_Service_IssueofNOC.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Service_IssueofNOC.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_IssueofNOC.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_IssueofNOC.SetName(getdata("Name"));
		DL_Service_IssueofNOC.SetMiddleName(getdata("Middlename"));
		DL_Service_IssueofNOC.SetLastName(getdata("Lastname"));
		DL_Service_IssueofNOC.SetRelation(getdata("Relationname"));
		DL_Service_IssueofNOC.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_IssueofNOC.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_IssueofNOC.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_IssueofNOC.ClickonGender();
		DL_Service_IssueofNOC.SetAge(getdata("Age"));
		DL_Service_IssueofNOC.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_IssueofNOC.SetQualification(getdata("Qualification"));
		DL_Service_IssueofNOC.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_IssueofNOC.SetState(getdata("State"));
		DL_Service_IssueofNOC.SetDistrict(getdata("District"));
		DL_Service_IssueofNOC.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_IssueofNOC.SetPincode(getdata("Pincode"));
		DL_Service_IssueofNOC.ClickonCheckbox();
		DL_Service_IssueofNOC.ClickonLicenseDetails();
		DL_Service_IssueofNOC.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_IssueofNOC.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Service_IssueofNOC.SetStateone(getdata("Stateone"));
		// DL_Service_IssueofNOC.SetRTOone(getdata("RTOone"));
		// DL_Service_IssueofNOC.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Service_IssueofNOC.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// DL_Service_IssueofNOC.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Service_IssueofNOC.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_IssueofNOC.SetStatetwo(getdata("Statetwo"));
		// DL_Service_IssueofNOC.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_IssueofNOC.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_IssueofNOC.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_IssueofNOC.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_IssueofNOC.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Service_IssueofNOC.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_IssueofNOC.SetRTOthree(getdata("RTOthree"));
		// DL_Service_IssueofNOC.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_IssueofNOC.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_IssueofNOC.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_IssueofNOC.ClickonAddbutton4();

		DL_Service_IssueofNOC.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_IssueofNOC.setdata("DL", s1.substring(16).trim());
		DL_Service_IssueofNOC.setdata("Status", "Pass");
		DL_Service_IssueofNOC.ClickonDL();
		DL_Service_IssueofNOC.ClickonDlbacklogapproval();
		DL_Service_IssueofNOC.SetDLno();
		DL_Service_IssueofNOC.Clickonproceed();
		/* DL_Service_IssueofNOC.ClickonGenerateOTP(); */
		DL_Service_IssueofNOC.Clickonapprove();
		DL_Service_IssueofNOC.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_IssueofNOC.SelcectService(522);

		DL_Service_IssueofNOCApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			DL_Service_IssueofNOC.setdata("ApplicationNo", s1.substring(3).trim());
			DL_Service_IssueofNOC.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_IssueofNOC.Clickon_Exitbutton();
			DL_Service_IssueofNOC.Clickon_TempHomebutton();

			/*
			 * UploadDocumentsPage = new UploadDocumentsPage(driver);
			 * UploadDocumentsPage.Clickon_Applyonline();
			 * UploadDocumentsPage.Clickon_Application_Status_Link(); //
			 * UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim()); //
			 * UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			 * UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			 * UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			 * UploadDocumentsPage.Clickon_Submit_Button();
			 * UploadDocumentsPage.Clickon_Proceed_Button();
			 * UploadDocumentsPage.Clickon_Submit1_Button();
			 * UploadDocumentsPage.Clickon_ok_Button(); //
			 * UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc")); //
			 * UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc")); //
			 * UploadDocumentsPage.Clickon_Choosefile_Button1(); //
			 * UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc")); //
			 * UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc")); //
			 * UploadDocumentsPage.Clickon_Choosefile_Button1(); //
			 * UploadDocumentsPage.Clickon_Next_Button();
			 * 
			 * 
			 */

			/*
			 * UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			 * UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			 * UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			 * UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			 * UploadPhoto_SignaturePage.Clickon_Next();
			 */

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Applyonline();
			LLFEEPaymentPage.Clickon_Application_Status_Link();
			LLFEEPaymentPage.Set_Application_Number(getdata("ApplicationNo"));
			LLFEEPaymentPage.Set_DateofBirth(getdata("DateofBirth"));
			LLFEEPaymentPage.Clickon_Submit_Button();
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			DL_Service_IssueofNOC = new DL_Service_IssueofNOC(ff);
			DL_Service_IssueofNOC.setUserName(getdata("UserName"));
			DL_Service_IssueofNOC.setpassword(getdata("Password"));
			DL_Service_IssueofNOC.Clickonsubmit();
			DL_Service_IssueofNOC.ClickonRadio();
			DL_Service_IssueofNOC.Clickonlogin();
			DL_Service_IssueofNOC.Clickon_General_button();
			DL_Service_IssueofNOC.Clickon_BiometricsLink();
			DL_Service_IssueofNOC.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			DL_Service_IssueofNOC.Clickon_Getdetails();
			DL_Service_IssueofNOC.Set_CanvasSignature("#thecanvas");
			DL_Service_IssueofNOC.Clickon_Capturesignaturebutton();
			DL_Service_IssueofNOC.Set_PhotoCapture();
			DL_Service_IssueofNOC.Clickon_CropSelected();
			DL_Service_IssueofNOC.Clickon_Phototriggerbutton();
			DL_Service_IssueofNOC.Clickon_Snapokbutton();
			DL_Service_IssueofNOC.Clickon_Savebutton();
			ff.close();
			wait(2);

			DL_Service_IssueofNOC = new DL_Service_IssueofNOC(driver);
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DL_Service_IssueofNOC.setUserName(getdata("UserName"));
			DL_Service_IssueofNOC.setpassword(getdata("Password"));
			DL_Service_IssueofNOC.Clickonsubmit();
			DL_Service_IssueofNOC.ClickonRadio();
			DL_Service_IssueofNOC.Clickonlogin();
			DL_Service_IssueofNOC.Clickon_General_button();
			DL_Service_IssueofNOC.Clickon_Scrutiny_Link();
			DL_Service_IssueofNOC.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DL_Service_IssueofNOC.Clickon_RTOProceed_button();
			// DL_Service_IssueofNOC.Clickon_VerificationofDocuments_Link();
			// DL_Service_IssueofNOC.Clickon_prooflinks();
			DL_Service_IssueofNOC.Clickon_Scrutinybutton();

			DL_Service_IssueofNOC.ClickonDL();
			DL_Service_IssueofNOC.Clickon_DL_Endorsement_Approval();
			DL_Service_IssueofNOC.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			DL_Service_IssueofNOC.Clickon_Submit_in__DL_Endorsement_Approval();
			DL_Service_IssueofNOC.Clickon_DL_Endorsement_final_Approve();
		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_IssueofNOC.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	/* TC_DL_Extract */

	@Test(invocationCount = 1)
	public void TC_DL_Extract() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Extract = new DL_Service_DLExtract(driver);
		DL_Extract.setUserName(getdata("UserName"));
		DL_Extract.setpassword(getdata("Password"));
		// DL_Extract.ClickonNext();
		// DL_Extract.SetCaptcha();
		DL_Extract.Clickonsubmit();
		DL_Extract.ClickonRadio();
		DL_Extract.Clickonlogin();
		DL_Extract.ClickonDL();
		DL_Extract.ClickonDLBacklog();
		DL_Extract.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Extract.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Extract.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Extract.SetName(getdata("Name"));
		DL_Extract.SetMiddleName(getdata("Middlename"));
		DL_Extract.SetLastName(getdata("Lastname"));
		DL_Extract.SetRelation(getdata("Relationname"));
		DL_Extract.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Extract.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Extract.SetRelationLastname(getdata("RelationLastName"));
		DL_Extract.ClickonGender();
		DL_Extract.SetAge(getdata("Age"));
		DL_Extract.SetBloodgroup(getdata("Bloodgroup"));
		DL_Extract.SetQualification(getdata("Qualification"));
		DL_Extract.SetMobilenumber(getdata("Mobilenumber"));
		DL_Extract.SetState(getdata("State"));
		DL_Extract.SetDistrict(getdata("District"));
		DL_Extract.SetSubDistrict(getdata("SubDistrict"));
		DL_Extract.SetPincode(getdata("Pincode"));
		DL_Extract.ClickonCheckbox();
		DL_Extract.ClickonLicenseDetails();
		DL_Extract.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Extract.ClickonAddbutton1();

		/* Adding Second COV */

		// DL_Extract.SetStateone(getdata("Stateone"));
		// DL_Extract.SetRTOone(getdata("RTOone"));
		// DL_Extract.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// DL_Extract.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// DL_Extract.SetSelectCOV1(getdata("SelectCOV2"));
		// DL_Extract.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Extract.SetStatetwo(getdata("Statetwo"));
		// DL_Extract.SetRTOtwo(getdata("RTOtwo"));
		// DL_Extract.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Extract.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Extract.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Extract.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Extract.SetStatethreeo(getdata("Statethreeo"));
		// DL_Extract.SetRTOthree(getdata("RTOthree"));
		// DL_Extract.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Extract.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Extract.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Extract.ClickonAddbutton4();

		DL_Extract.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Extract.setdata("DL", s1.substring(16).trim());
		DL_Extract.setdata("Status", "Pass");
		DL_Extract.ClickonDL();
		DL_Extract.ClickonDlbacklogapproval();
		DL_Extract.SetDLno();
		DL_Extract.Clickonproceed();
		/* DL_Extract.ClickonGenerateOTP(); */
		DL_Extract.Clickonapprove();
		DL_Extract.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Extract.SelcectService(523);

		DL_ExtractApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			DL_Extract.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Extract.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Extract.Clickon_Exitbutton();
			DL_Extract.Clickon_TempHomebutton();

			/*
			 * UploadDocumentsPage = new UploadDocumentsPage(driver);
			 * UploadDocumentsPage.Clickon_Applyonline();
			 * UploadDocumentsPage.Clickon_Application_Status_Link(); //
			 * UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim()); //
			 * UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			 * UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			 * UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			 * UploadDocumentsPage.Clickon_Submit_Button();
			 * UploadDocumentsPage.Clickon_Proceed_Button();
			 * UploadDocumentsPage.Clickon_Submit1_Button();
			 * UploadDocumentsPage.Clickon_ok_Button(); //
			 * UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc")); //
			 * UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc")); //
			 * UploadDocumentsPage.Clickon_Choosefile_Button1(); //
			 * UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc")); //
			 * UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc")); //
			 * UploadDocumentsPage.Clickon_Choosefile_Button1(); //
			 * UploadDocumentsPage.Clickon_Next_Button();
			 * 
			 * 
			 */

			/*
			 * UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			 * UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			 * UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			 * UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			 * UploadPhoto_SignaturePage.Clickon_Next();
			 */

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Applyonline();
			LLFEEPaymentPage.Clickon_Application_Status_Link();
			LLFEEPaymentPage.Set_Application_Number(getdata("ApplicationNo"));
			LLFEEPaymentPage.Set_DateofBirth(getdata("DateofBirth"));
			LLFEEPaymentPage.Clickon_Submit_Button();
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DL_Extract = new DL_Service_DLExtract(driver);
			DL_Extract.setUserName(getdata("UserName"));
			DL_Extract.setpassword(getdata("Password"));
			// DL_Extract.ClickonNext();
			// DL_Extract.SetCaptcha();
			DL_Extract.Clickonsubmit();
			DL_Extract.ClickonRadio();
			DL_Extract.Clickonlogin();
			DL_Extract.ClickonDL();
			DL_Extract.Clickon_DL_ExtactReport();
			DL_Extract.Clickon_Direct();
			DL_Extract.Enter_DrivingLicNo();
			DL_Extract.Clickon_Submitin_DLExtact();
			DL_Extract.Clickon_submitin_DLExtact();
			DL_Extract.Clickon_Approve_DLExtact();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Extract.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC_Issueof_International_Driving_Permit() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		Issueof_International_Driving_Permit = new DL_Service_Issueof_International_Driving_Permit(driver);
		Issueof_International_Driving_Permit.setUserName(getdata("UserName"));
		Issueof_International_Driving_Permit.setpassword(getdata("Password"));
		// Issueof_International_Driving_Permit.ClickonNext();
		// Issueof_International_Driving_Permit.SetCaptcha();
		Issueof_International_Driving_Permit.Clickonsubmit();
		Issueof_International_Driving_Permit.ClickonRadio();
		Issueof_International_Driving_Permit.Clickonlogin();
		Issueof_International_Driving_Permit.ClickonDL();
		Issueof_International_Driving_Permit.ClickonDLBacklog();
		Issueof_International_Driving_Permit.SetFirstissuedate(getdata("Firstissuedate"));
		Issueof_International_Driving_Permit.SetNumaricLLno(getdata("NumaricLLno"));
		Issueof_International_Driving_Permit.SetOriginalDLno(getdata("OriginalDLno"));
		Issueof_International_Driving_Permit.SetName(getdata("Name"));
		Issueof_International_Driving_Permit.SetMiddleName(getdata("Middlename"));
		Issueof_International_Driving_Permit.SetLastName(getdata("Lastname"));
		Issueof_International_Driving_Permit.SetRelation(getdata("Relationname"));
		Issueof_International_Driving_Permit.SetRelationfirstname(getdata("Relationfirstname"));
		Issueof_International_Driving_Permit.SetRelationMiddlename(getdata("RelationMiddleName"));
		Issueof_International_Driving_Permit.SetRelationLastname(getdata("RelationLastName"));
		Issueof_International_Driving_Permit.ClickonGender();
		Issueof_International_Driving_Permit.SetAge(getdata("Age"));
		Issueof_International_Driving_Permit.SetBloodgroup(getdata("Bloodgroup"));
		Issueof_International_Driving_Permit.SetQualification(getdata("Qualification"));
		Issueof_International_Driving_Permit.SetMobilenumber(getdata("Mobilenumber"));
		Issueof_International_Driving_Permit.SetState(getdata("State"));
		Issueof_International_Driving_Permit.SetDistrict(getdata("District"));
		Issueof_International_Driving_Permit.SetSubDistrict(getdata("SubDistrict"));
		Issueof_International_Driving_Permit.SetPincode(getdata("Pincode"));
		Issueof_International_Driving_Permit.ClickonCheckbox();
		Issueof_International_Driving_Permit.ClickonLicenseDetails();
		Issueof_International_Driving_Permit.SetSelectCOV1(getdata("SelectCOV1"));
		Issueof_International_Driving_Permit.ClickonAddbutton1();

		/* Adding Second COV */

		// Issueof_International_Driving_Permit.SetStateone(getdata("Stateone"));
		// Issueof_International_Driving_Permit.SetRTOone(getdata("RTOone"));
		// Issueof_International_Driving_Permit.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// Issueof_International_Driving_Permit.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// Issueof_International_Driving_Permit.SetSelectCOV1(getdata("SelectCOV2"));
		// Issueof_International_Driving_Permit.ClickonAddbutton2();

		/* Adding Third COV */

		// Issueof_International_Driving_Permit.SetStatetwo(getdata("Statetwo"));
		// Issueof_International_Driving_Permit.SetRTOtwo(getdata("RTOtwo"));
		// Issueof_International_Driving_Permit.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// Issueof_International_Driving_Permit.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// Issueof_International_Driving_Permit.SetSelectCOV3(getdata("SelectCOV3"));
		// Issueof_International_Driving_Permit.ClickonAddbutton3();

		/* Adding Fourth COV */

		// Issueof_International_Driving_Permit.SetStatethreeo(getdata("Statethreeo"));
		// Issueof_International_Driving_Permit.SetRTOthree(getdata("RTOthree"));
		// Issueof_International_Driving_Permit.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// Issueof_International_Driving_Permit.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// Issueof_International_Driving_Permit.SetSelectCOV4(getdata("SelectCOV4"));
		// Issueof_International_Driving_Permit.ClickonAddbutton4();

		Issueof_International_Driving_Permit.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		Issueof_International_Driving_Permit.setdata("DL", s1.substring(16).trim());
		Issueof_International_Driving_Permit.setdata("Status", "Pass");
		Issueof_International_Driving_Permit.ClickonDL();
		Issueof_International_Driving_Permit.ClickonDlbacklogapproval();
		Issueof_International_Driving_Permit.SetDLno();
		Issueof_International_Driving_Permit.Clickonproceed();
		/* Issueof_International_Driving_Permit.ClickonGenerateOTP(); */
		Issueof_International_Driving_Permit.Clickonapprove();
		Issueof_International_Driving_Permit.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		Issueof_International_Driving_Permit.SelcectService(525);

		Issueof_International_Driving_PermitApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			Issueof_International_Driving_Permit.setdata("ApplicationNo", s1.substring(3).trim());

			Issueof_International_Driving_Permit.setdata("RequestStatus", "Pass");
			wait(1);
			Issueof_International_Driving_Permit.Clickon_Exitbutton();
			Issueof_International_Driving_Permit.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();

			/*
			 * UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			 * UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			 * UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			 * UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			 * UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			 * UploadPhoto_SignaturePage.Clickon_Next();
			 * 
			 */

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

			Issueof_International_Driving_Permit.setUserName(getdata("UserName"));
			Issueof_International_Driving_Permit.setpassword(getdata("Password"));
			Issueof_International_Driving_Permit.Clickonsubmit();
			Issueof_International_Driving_Permit.ClickonRadio();
			Issueof_International_Driving_Permit.Clickonlogin();
			Issueof_International_Driving_Permit.Clickon_General_button();
			Issueof_International_Driving_Permit.Clickon_Scrutiny_Link();
			Issueof_International_Driving_Permit.Set_RTOApplication_Number(getdata("ApplicationNo"));
			Issueof_International_Driving_Permit.Clickon_RTOProceed_button();
			Issueof_International_Driving_Permit.Clickon_VerificationofDocuments_Link();
			Issueof_International_Driving_Permit.Clickon_prooflinks();
			Issueof_International_Driving_Permit.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Issueof_International_Driving_Permit = new DL_Service_Issueof_International_Driving_Permit(ff);
			Issueof_International_Driving_Permit.setUserName(getdata("UserName"));
			Issueof_International_Driving_Permit.setpassword(getdata("Password"));
			Issueof_International_Driving_Permit.Clickonsubmit();
			Issueof_International_Driving_Permit.ClickonRadio();
			Issueof_International_Driving_Permit.Clickonlogin();
			Issueof_International_Driving_Permit.Clickon_General_button();
			Issueof_International_Driving_Permit.Clickon_BiometricsLink();
			Issueof_International_Driving_Permit.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			Issueof_International_Driving_Permit.Clickon_Getdetails();
			Issueof_International_Driving_Permit.Set_CanvasSignature("#thecanvas");
			Issueof_International_Driving_Permit.Clickon_Capturesignaturebutton();
			Issueof_International_Driving_Permit.Set_PhotoCapture();
			Issueof_International_Driving_Permit.Clickon_CropSelected();
			Issueof_International_Driving_Permit.Clickon_Phototriggerbutton();
			Issueof_International_Driving_Permit.Clickon_Snapokbutton();
			Issueof_International_Driving_Permit.Clickon_Savebutton();
			ff.close();
			wait(2);
			Issueof_International_Driving_Permit = new DL_Service_Issueof_International_Driving_Permit(driver);
			Issueof_International_Driving_Permit.ClickonDL();
			Issueof_International_Driving_Permit.Clickon_DL_Endorsement_Approval();
			Issueof_International_Driving_Permit
					.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			Issueof_International_Driving_Permit.Clickon_Submit_in__DL_Endorsement_Approval();
			Issueof_International_Driving_Permit.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			Issueof_International_Driving_Permit.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC_DL_Service_Change_of_Biometrics_in_DL() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		Change_of_Biometrics_in_DL = new DL_Service_Change_of_Biometrics_in_DL(driver);
		Change_of_Biometrics_in_DL.setUserName(getdata("UserName"));
		Change_of_Biometrics_in_DL.setpassword(getdata("Password"));
		// Change_of_Biometrics_in_DL.ClickonNext();
		// Change_of_Biometrics_in_DL.SetCaptcha();
		Change_of_Biometrics_in_DL.Clickonsubmit();
		Change_of_Biometrics_in_DL.ClickonRadio();
		Change_of_Biometrics_in_DL.Clickonlogin();
		Change_of_Biometrics_in_DL.ClickonDL();
		Change_of_Biometrics_in_DL.ClickonDLBacklog();
		Change_of_Biometrics_in_DL.SetFirstissuedate(getdata("Firstissuedate"));
		Change_of_Biometrics_in_DL.SetNumaricLLno(getdata("NumaricLLno"));
		Change_of_Biometrics_in_DL.SetOriginalDLno(getdata("OriginalDLno"));
		Change_of_Biometrics_in_DL.SetName(getdata("Name"));
		Change_of_Biometrics_in_DL.SetMiddleName(getdata("Middlename"));
		Change_of_Biometrics_in_DL.SetLastName(getdata("Lastname"));
		Change_of_Biometrics_in_DL.SetRelation(getdata("Relationname"));
		Change_of_Biometrics_in_DL.SetRelationfirstname(getdata("Relationfirstname"));
		Change_of_Biometrics_in_DL.SetRelationMiddlename(getdata("RelationMiddleName"));
		Change_of_Biometrics_in_DL.SetRelationLastname(getdata("RelationLastName"));
		Change_of_Biometrics_in_DL.ClickonGender();
		Change_of_Biometrics_in_DL.SetAge(getdata("Age"));
		Change_of_Biometrics_in_DL.SetBloodgroup(getdata("Bloodgroup"));
		Change_of_Biometrics_in_DL.SetQualification(getdata("Qualification"));
		Change_of_Biometrics_in_DL.SetMobilenumber(getdata("Mobilenumber"));
		Change_of_Biometrics_in_DL.SetState(getdata("State"));
		Change_of_Biometrics_in_DL.SetDistrict(getdata("District"));
		Change_of_Biometrics_in_DL.SetSubDistrict(getdata("SubDistrict"));
		Change_of_Biometrics_in_DL.SetPincode(getdata("Pincode"));
		Change_of_Biometrics_in_DL.ClickonCheckbox();
		Change_of_Biometrics_in_DL.ClickonLicenseDetails();
		Change_of_Biometrics_in_DL.SetSelectCOV1(getdata("SelectCOV1"));
		Change_of_Biometrics_in_DL.ClickonAddbutton1();

		/* Adding Second COV */

		// Change_of_Biometrics_in_DL.SetStateone(getdata("Stateone"));
		// Change_of_Biometrics_in_DL.SetRTOone(getdata("RTOone"));
		// Change_of_Biometrics_in_DL.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// Change_of_Biometrics_in_DL.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// Change_of_Biometrics_in_DL.SetSelectCOV1(getdata("SelectCOV2"));
		// Change_of_Biometrics_in_DL.ClickonAddbutton2();

		/* Adding Third COV */

		// Change_of_Biometrics_in_DL.SetStatetwo(getdata("Statetwo"));
		// Change_of_Biometrics_in_DL.SetRTOtwo(getdata("RTOtwo"));
		// Change_of_Biometrics_in_DL.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// Change_of_Biometrics_in_DL.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// Change_of_Biometrics_in_DL.SetSelectCOV3(getdata("SelectCOV3"));
		// Change_of_Biometrics_in_DL.ClickonAddbutton3();

		/* Adding Fourth COV */

		// Change_of_Biometrics_in_DL.SetStatethreeo(getdata("Statethreeo"));
		// Change_of_Biometrics_in_DL.SetRTOthree(getdata("RTOthree"));
		// Change_of_Biometrics_in_DL.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// Change_of_Biometrics_in_DL.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// Change_of_Biometrics_in_DL.SetSelectCOV4(getdata("SelectCOV4"));
		// Change_of_Biometrics_in_DL.ClickonAddbutton4();

		Change_of_Biometrics_in_DL.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		Change_of_Biometrics_in_DL.setdata("DL", s1.substring(16).trim());
		Change_of_Biometrics_in_DL.setdata("Status", "Pass");
		Change_of_Biometrics_in_DL.ClickonDL();
		Change_of_Biometrics_in_DL.ClickonDlbacklogapproval();
		Change_of_Biometrics_in_DL.SetDLno();
		Change_of_Biometrics_in_DL.Clickonproceed();
		/* Change_of_Biometrics_in_DL.ClickonGenerateOTP(); */
		Change_of_Biometrics_in_DL.Clickonapprove();
		Change_of_Biometrics_in_DL.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		Change_of_Biometrics_in_DL.SelcectService(528);

		Change_of_Biometrics_in_DLApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			Change_of_Biometrics_in_DL.setdata("ApplicationNo", s1.substring(3).trim());

			Change_of_Biometrics_in_DL.setdata("RequestStatus", "Pass");
			wait(1);
			Change_of_Biometrics_in_DL.Clickon_Exitbutton();
			Change_of_Biometrics_in_DL.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			Change_of_Biometrics_in_DL.setUserName(getdata("UserName"));
			Change_of_Biometrics_in_DL.setpassword(getdata("Password"));
			Change_of_Biometrics_in_DL.Clickonsubmit();
			Change_of_Biometrics_in_DL.ClickonRadio();
			Change_of_Biometrics_in_DL.Clickonlogin();
			Change_of_Biometrics_in_DL.Clickon_General_button();
			Change_of_Biometrics_in_DL.Clickon_Scrutiny_Link();
			Change_of_Biometrics_in_DL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			Change_of_Biometrics_in_DL.Clickon_RTOProceed_button();
			Change_of_Biometrics_in_DL.Clickon_VerificationofDocuments_Link();
			Change_of_Biometrics_in_DL.Clickon_prooflinks();
			Change_of_Biometrics_in_DL.Clickon_Scrutinybutton();

			/*
			 * wait(2); DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 * capabilities.setCapability("marionette", false);
			 * capabilities.setCapability("firefox_binary", new
			 * File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath
			 * ()); WebDriver ff = new FirefoxDriver(capabilities);
			 * 
			 * ff.get(
			 * "https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do"
			 * ); ff.manage().window().maximize(); ff.manage().timeouts().implicitlyWait(15,
			 * TimeUnit.SECONDS); Change_of_Biometrics_in_DL = new
			 * DL_Service_Change_of_Biometrics_in_DL(ff);
			 * Change_of_Biometrics_in_DL.setUserName(getdata("UserName"));
			 * Change_of_Biometrics_in_DL.setpassword(getdata("Password"));
			 * Change_of_Biometrics_in_DL.Clickonsubmit();
			 * Change_of_Biometrics_in_DL.ClickonRadio();
			 * Change_of_Biometrics_in_DL.Clickonlogin();
			 * Change_of_Biometrics_in_DL.Clickon_General_button();
			 * Change_of_Biometrics_in_DL.Clickon_BiometricsLink();
			 * Change_of_Biometrics_in_DL.Set_Application_NumbeinRenualServicer(getdata(
			 * "ApplicationNo")); Change_of_Biometrics_in_DL.Clickon_Getdetails();
			 * Change_of_Biometrics_in_DL.Set_CanvasSignature("#thecanvas");
			 * Change_of_Biometrics_in_DL.Clickon_Capturesignaturebutton();
			 * Change_of_Biometrics_in_DL.Set_PhotoCapture();
			 * Change_of_Biometrics_in_DL.Clickon_CropSelected();
			 * Change_of_Biometrics_in_DL.Clickon_Phototriggerbutton();
			 * Change_of_Biometrics_in_DL.Clickon_Snapokbutton();
			 * Change_of_Biometrics_in_DL.Clickon_Savebutton(); ff.close(); wait(2);
			 * Change_of_Biometrics_in_DL = new
			 * DL_Service_Change_of_Biometrics_in_DL(driver);
			 */
			Change_of_Biometrics_in_DL.ClickonDL();
			Change_of_Biometrics_in_DL.Clickon_DL_Endorsement_Approval();
			Change_of_Biometrics_in_DL.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			Change_of_Biometrics_in_DL.Clickon_Submit_in__DL_Endorsement_Approval();
			Change_of_Biometrics_in_DL.Clickon_DL_Endorsement_final_Approve();

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			Change_of_Biometrics_in_DL.setdata("RequestStatus", "Fail");
			driver.close();
		}
	}

	@Test(invocationCount = 1)
	public void TC_DL_Service_Issue_Of_PSVBadge_to_Driver() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Service_Issue_Of_PSVBadge = new DL_Service_Issue_Of_PSVBadge_to_Driver(driver);
		DL_Service_Issue_Of_PSVBadge.setUserName(getdata("UserName"));
		DL_Service_Issue_Of_PSVBadge.setpassword(getdata("Password"));
		// DL_Service_Issue_Of_PSVBadge.ClickonNext();
		// DL_Service_Issue_Of_PSVBadge.SetCaptcha();
		DL_Service_Issue_Of_PSVBadge.Clickonsubmit();
		DL_Service_Issue_Of_PSVBadge.ClickonRadio();
		DL_Service_Issue_Of_PSVBadge.Clickonlogin();
		DL_Service_Issue_Of_PSVBadge.ClickonDL();
		DL_Service_Issue_Of_PSVBadge.ClickonDLBacklog();
		DL_Service_Issue_Of_PSVBadge.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Service_Issue_Of_PSVBadge.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Service_Issue_Of_PSVBadge.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Service_Issue_Of_PSVBadge.SetName(getdata("Name"));
		DL_Service_Issue_Of_PSVBadge.SetMiddleName(getdata("Middlename"));
		DL_Service_Issue_Of_PSVBadge.SetLastName(getdata("Lastname"));
		DL_Service_Issue_Of_PSVBadge.SetRelation(getdata("Relationname"));
		DL_Service_Issue_Of_PSVBadge.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Service_Issue_Of_PSVBadge.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Service_Issue_Of_PSVBadge.SetRelationLastname(getdata("RelationLastName"));
		DL_Service_Issue_Of_PSVBadge.ClickonGender();
		DL_Service_Issue_Of_PSVBadge.SetAge(getdata("Age"));
		DL_Service_Issue_Of_PSVBadge.SetBloodgroup(getdata("Bloodgroup"));
		DL_Service_Issue_Of_PSVBadge.SetQualification(getdata("Qualification"));
		DL_Service_Issue_Of_PSVBadge.SetMobilenumber(getdata("Mobilenumber"));
		DL_Service_Issue_Of_PSVBadge.SetState(getdata("State"));
		DL_Service_Issue_Of_PSVBadge.SetDistrict(getdata("District"));
		DL_Service_Issue_Of_PSVBadge.SetSubDistrict(getdata("SubDistrict"));
		DL_Service_Issue_Of_PSVBadge.SetPincode(getdata("Pincode"));
		DL_Service_Issue_Of_PSVBadge.ClickonCheckbox();
		DL_Service_Issue_Of_PSVBadge.ClickonLicenseDetails();
		DL_Service_Issue_Of_PSVBadge.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Service_Issue_Of_PSVBadge.ClickonAddbutton1();

		/* Adding Second COV */

		DL_Service_Issue_Of_PSVBadge.SetStateone(getdata("Stateone"));
		DL_Service_Issue_Of_PSVBadge.SetRTOone(getdata("RTOone"));
		DL_Service_Issue_Of_PSVBadge.SetCOVIssueDate1(getdata("COVIssueDate1"));
		DL_Service_Issue_Of_PSVBadge.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		DL_Service_Issue_Of_PSVBadge.SetSelectCOV1(getdata("SelectCOV2"));
		DL_Service_Issue_Of_PSVBadge.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Service_Issue_Of_PSVBadge.SetStatetwo(getdata("Statetwo"));
		// DL_Service_Issue_Of_PSVBadge.SetRTOtwo(getdata("RTOtwo"));
		// DL_Service_Issue_Of_PSVBadge.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Service_Issue_Of_PSVBadge.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Service_Issue_Of_PSVBadge.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Service_Issue_Of_PSVBadge.ClickonAddbutton3();

		/* Adding Fourth COV */

		// DL_Service_Issue_Of_PSVBadge.SetStatethreeo(getdata("Statethreeo"));
		// DL_Service_Issue_Of_PSVBadge.SetRTOthree(getdata("RTOthree"));
		// DL_Service_Issue_Of_PSVBadge.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// DL_Service_Issue_Of_PSVBadge.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// DL_Service_Issue_Of_PSVBadge.SetSelectCOV4(getdata("SelectCOV4"));
		// DL_Service_Issue_Of_PSVBadge.ClickonAddbutton4();

		DL_Service_Issue_Of_PSVBadge.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		DL_Service_Issue_Of_PSVBadge.setdata("DL", s1.substring(16).trim());
		DL_Service_Issue_Of_PSVBadge.setdata("Status", "Pass");
		DL_Service_Issue_Of_PSVBadge.ClickonDL();
		DL_Service_Issue_Of_PSVBadge.ClickonDlbacklogapproval();
		DL_Service_Issue_Of_PSVBadge.SetDLno();
		DL_Service_Issue_Of_PSVBadge.Clickonproceed();
		/* DL_Service_Issue_Of_PSVBadge.ClickonGenerateOTP(); */
		DL_Service_Issue_Of_PSVBadge.Clickonapprove();
		DL_Service_Issue_Of_PSVBadge.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		DL_Service_Issue_Of_PSVBadge.SelcectService(519);

		DL_Service_Issue_Of_PSVBadge_to_DriverApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("")) {

			DL_Service_Issue_Of_PSVBadge.setdata("ApplicationNo", s1.substring(3).trim());

			DL_Service_Issue_Of_PSVBadge.setdata("RequestStatus", "Pass");
			wait(1);
			DL_Service_Issue_Of_PSVBadge.Clickon_Exitbutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

		} else {

			System.out.println("DL Services Acknowledgementt is not Generated");
			DL_Service_Issue_Of_PSVBadge.setdata("RequestStatus", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC_Renewal_with_Re_Test() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Renewal_with_ReTest = new DL_Service_Renewal_with_ReTest(driver);

		Renewal_with_ReTest.setUserName(getdata("UserName"));
		Renewal_with_ReTest.setpassword(getdata("Password"));
		// Renewal_with_ReTest.ClickonNext();
		// Renewal_with_ReTest.SetCaptcha();
		Renewal_with_ReTest.Clickonsubmit();
		Renewal_with_ReTest.ClickonRadio();
		Renewal_with_ReTest.Clickonlogin();
		Renewal_with_ReTest.ClickonDL();
		Renewal_with_ReTest.ClickonDLBacklog();
		Renewal_with_ReTest.SetFirstissuedate(getdata("Firstissuedate"));
		Renewal_with_ReTest.SetNumaricLLno(getdata("NumaricLLno"));
		Renewal_with_ReTest.SetOriginalDLno(getdata("OriginalDLno"));
		Renewal_with_ReTest.SetName(getdata("Name"));
		Renewal_with_ReTest.SetMiddleName(getdata("Middlename"));
		Renewal_with_ReTest.SetLastName(getdata("Lastname"));
		Renewal_with_ReTest.SetRelation(getdata("Relationname"));
		Renewal_with_ReTest.SetRelationfirstname(getdata("Relationfirstname"));
		Renewal_with_ReTest.SetRelationMiddlename(getdata("RelationMiddleName"));
		Renewal_with_ReTest.SetRelationLastname(getdata("RelationLastName"));
		Renewal_with_ReTest.ClickonGender();
		Renewal_with_ReTest.SetAge(getdata("Age"));
		Renewal_with_ReTest.SetBloodgroup(getdata("Bloodgroup"));
		Renewal_with_ReTest.SetQualification(getdata("Qualification"));
		Renewal_with_ReTest.SetMobilenumber(getdata("Mobilenumber"));
		Renewal_with_ReTest.SetState(getdata("State"));
		Renewal_with_ReTest.SetDistrict(getdata("District"));
		Renewal_with_ReTest.SetSubDistrict(getdata("SubDistrict"));
		Renewal_with_ReTest.SetPincode(getdata("Pincode"));
		Renewal_with_ReTest.ClickonCheckbox();
		Renewal_with_ReTest.ClickonLicenseDetails();
		Renewal_with_ReTest.SetSelectCOV1(getdata("SelectCOV1"));
		Renewal_with_ReTest.ClickonAddbutton1();

		/* Adding Second COV */

		Renewal_with_ReTest.SetStateone(getdata("Stateone"));
		Renewal_with_ReTest.SetRTOone(getdata("RTOone"));
		Renewal_with_ReTest.SetCOVIssueDate1(getdata("COVIssueDate1"));
		Renewal_with_ReTest.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		Renewal_with_ReTest.SetSelectCOV1(getdata("SelectCOV2"));
		Renewal_with_ReTest.ClickonAddbutton2();

		/* Adding Third COV */

		// Renewal_with_ReTest.SetStatetwo(getdata("Statetwo"));
		// Renewal_with_ReTest.SetRTOtwo(getdata("RTOtwo"));
		// Renewal_with_ReTest.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// Renewal_with_ReTest.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// Renewal_with_ReTest.SetSelectCOV3(getdata("SelectCOV3"));
		// Renewal_with_ReTest.ClickonAddbutton3();

		/* Adding Fourth COV */

		// Renewal_with_ReTest.SetStatethreeo(getdata("Statethreeo"));
		// Renewal_with_ReTest.SetRTOthree(getdata("RTOthree"));
		// Renewal_with_ReTest.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// Renewal_with_ReTest.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// Renewal_with_ReTest.SetSelectCOV4(getdata("SelectCOV4"));
		// Renewal_with_ReTest.ClickonAddbutton4();

		Renewal_with_ReTest.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		Renewal_with_ReTest.setdata("DL", s1.substring(16).trim());
		Renewal_with_ReTest.setdata("Status", "Pass");
		Renewal_with_ReTest.ClickonDL();
		Renewal_with_ReTest.ClickonDlbacklogapproval();
		Renewal_with_ReTest.SetDLno();
		Renewal_with_ReTest.Clickonproceed();
		/* Renewal_with_ReTest.ClickonGenerateOTP(); */
		Renewal_with_ReTest.Clickonapprove();
		Renewal_with_ReTest.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		Renewal_with_ReTest.SelcectService(537);

		Renewal_with_ReTestApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			Renewal_with_ReTest.setdata("ApplicationNo", s1.substring(3).trim());

			Renewal_with_ReTest.setdata("RequestStatus", "Pass");
			wait(1);
			Renewal_with_ReTest.Clickon_Exitbutton();
			Renewal_with_ReTest.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			Renewal_with_ReTest.Clickon_Proceed_Button();
			Renewal_with_ReTest.Clickon_ProceedtoBookSlot_Button();
			Renewal_with_ReTest.Booking_Slot();
			Renewal_with_ReTest.Clickon_Bookslotbutton();
			Renewal_with_ReTest.Clickon_Confirm_slotbookingbutton();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			Renewal_with_ReTest.setUserName(getdata("UserName"));
			Renewal_with_ReTest.setpassword(getdata("Password"));
			Renewal_with_ReTest.Clickonsubmit();
			Renewal_with_ReTest.ClickonRadio();
			Renewal_with_ReTest.Clickonlogin();
			Renewal_with_ReTest.Clickon_General_button();
			Renewal_with_ReTest.Clickon_Scrutiny_Link();
			Renewal_with_ReTest.Set_RTOApplication_Number(getdata("ApplicationNo"));
			Renewal_with_ReTest.Clickon_RTOProceed_button();
			Renewal_with_ReTest.Clickon_VerificationofDocuments_Link();
			Renewal_with_ReTest.Clickon_prooflinks();
			Renewal_with_ReTest.Clickon_Scrutinybutton();
			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);
			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Renewal_with_ReTest = new DL_Service_Renewal_with_ReTest(ff);
			Renewal_with_ReTest.setUserName(getdata("UserName"));
			Renewal_with_ReTest.setpassword(getdata("Password"));
			Renewal_with_ReTest.Clickonsubmit();
			Renewal_with_ReTest.ClickonRadio();
			Renewal_with_ReTest.Clickonlogin();
			Renewal_with_ReTest.Clickon_General_button();
			Renewal_with_ReTest.Clickon_BiometricsLink();
			Renewal_with_ReTest.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			Renewal_with_ReTest.Clickon_Getdetails();
			Renewal_with_ReTest.Set_CanvasSignature("#thecanvas");
			Renewal_with_ReTest.Clickon_Capturesignaturebutton();
			Renewal_with_ReTest.Set_PhotoCapture();
			Renewal_with_ReTest.Clickon_CropSelected();
			Renewal_with_ReTest.Clickon_Phototriggerbutton();
			Renewal_with_ReTest.Clickon_Snapokbutton();
			Renewal_with_ReTest.Clickon_Savebutton();

			Renewal_with_ReTest.ClickonDL();
			Renewal_with_ReTest.ClickonDLTest();
			Renewal_with_ReTest.Set_Applicationnumber(getdata("ApplicationNo"));
			Renewal_with_ReTest.ClickonGetdetails();
			Renewal_with_ReTest.SetResult();
			Renewal_with_ReTest.Set_Vehno("ap05nm8888");
			Renewal_with_ReTest.Set_testdate("11-10-2019");
			Renewal_with_ReTest.ClickonConfirm();
			Renewal_with_ReTest.ClickonConfirmcheck();
			Renewal_with_ReTest.ClickonSubmitindl();

			Renewal_with_ReTest.ClickonDL();
			Renewal_with_ReTest.Clickon_DL_Endorsement_Approval();
			Renewal_with_ReTest.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			Renewal_with_ReTest.Clickon_Submit_in__DL_Endorsement_Approval();
			Renewal_with_ReTest.Clickon_DL_Endorsement_final_Approve();

			ff.close();

		}

	}

	@Test(invocationCount = 1)
	public void TC_Endorsement_to_drive_in_Hill_region() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Endorsement_to_drive_in_Hill_region = new DL_Service_Endorsement_to_drive_in_Hill_region(driver);

		Endorsement_to_drive_in_Hill_region.setUserName(getdata("UserName"));
		Endorsement_to_drive_in_Hill_region.setpassword(getdata("Password"));
		// Endorsement_to_drive_in_Hill_region.ClickonNext();
		// Endorsement_to_drive_in_Hill_region.SetCaptcha();
		Endorsement_to_drive_in_Hill_region.Clickonsubmit();
		Endorsement_to_drive_in_Hill_region.ClickonRadio();
		Endorsement_to_drive_in_Hill_region.Clickonlogin();
		Endorsement_to_drive_in_Hill_region.ClickonDL();
		Endorsement_to_drive_in_Hill_region.ClickonDLBacklog();
		Endorsement_to_drive_in_Hill_region.SetFirstissuedate(getdata("Firstissuedate"));
		Endorsement_to_drive_in_Hill_region.SetNumaricLLno(getdata("NumaricLLno"));
		Endorsement_to_drive_in_Hill_region.SetOriginalDLno(getdata("OriginalDLno"));
		Endorsement_to_drive_in_Hill_region.SetName(getdata("Name"));
		Endorsement_to_drive_in_Hill_region.SetMiddleName(getdata("Middlename"));
		Endorsement_to_drive_in_Hill_region.SetLastName(getdata("Lastname"));
		Endorsement_to_drive_in_Hill_region.SetRelation(getdata("Relationname"));
		Endorsement_to_drive_in_Hill_region.SetRelationfirstname(getdata("Relationfirstname"));
		Endorsement_to_drive_in_Hill_region.SetRelationMiddlename(getdata("RelationMiddleName"));
		Endorsement_to_drive_in_Hill_region.SetRelationLastname(getdata("RelationLastName"));
		Endorsement_to_drive_in_Hill_region.ClickonGender();
		Endorsement_to_drive_in_Hill_region.SetAge(getdata("Age"));
		Endorsement_to_drive_in_Hill_region.SetBloodgroup(getdata("Bloodgroup"));
		Endorsement_to_drive_in_Hill_region.SetQualification(getdata("Qualification"));
		Endorsement_to_drive_in_Hill_region.SetMobilenumber(getdata("Mobilenumber"));
		Endorsement_to_drive_in_Hill_region.SetState(getdata("State"));
		Endorsement_to_drive_in_Hill_region.SetDistrict(getdata("District"));
		Endorsement_to_drive_in_Hill_region.SetSubDistrict(getdata("SubDistrict"));
		Endorsement_to_drive_in_Hill_region.SetPincode(getdata("Pincode"));
		Endorsement_to_drive_in_Hill_region.ClickonCheckbox();
		Endorsement_to_drive_in_Hill_region.ClickonLicenseDetails();
		Endorsement_to_drive_in_Hill_region.SetSelectCOV1(getdata("SelectCOV1"));
		Endorsement_to_drive_in_Hill_region.ClickonAddbutton1();

		/* Adding Second COV */

		Endorsement_to_drive_in_Hill_region.SetStateone(getdata("Stateone"));
		Endorsement_to_drive_in_Hill_region.SetRTOone(getdata("RTOone"));
		Endorsement_to_drive_in_Hill_region.SetCOVIssueDate1(getdata("COVIssueDate1"));
		Endorsement_to_drive_in_Hill_region.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		Endorsement_to_drive_in_Hill_region.SetSelectCOV1(getdata("SelectCOV2"));
		Endorsement_to_drive_in_Hill_region.ClickonAddbutton2();

		/* Adding Third COV */

		// Endorsement_to_drive_in_Hill_region.SetStatetwo(getdata("Statetwo"));
		// Endorsement_to_drive_in_Hill_region.SetRTOtwo(getdata("RTOtwo"));
		// Endorsement_to_drive_in_Hill_region.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// Endorsement_to_drive_in_Hill_region.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// Endorsement_to_drive_in_Hill_region.SetSelectCOV3(getdata("SelectCOV3"));
		// Endorsement_to_drive_in_Hill_region.ClickonAddbutton3();

		/* Adding Fourth COV */

		// Endorsement_to_drive_in_Hill_region.SetStatethreeo(getdata("Statethreeo"));
		// Endorsement_to_drive_in_Hill_region.SetRTOthree(getdata("RTOthree"));
		// Endorsement_to_drive_in_Hill_region.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// Endorsement_to_drive_in_Hill_region.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// Endorsement_to_drive_in_Hill_region.SetSelectCOV4(getdata("SelectCOV4"));
		// Endorsement_to_drive_in_Hill_region.ClickonAddbutton4();

		Endorsement_to_drive_in_Hill_region.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		Endorsement_to_drive_in_Hill_region.setdata("DL", s1.substring(16).trim());
		Endorsement_to_drive_in_Hill_region.setdata("Status", "Pass");
		Endorsement_to_drive_in_Hill_region.ClickonDL();
		Endorsement_to_drive_in_Hill_region.ClickonDlbacklogapproval();
		Endorsement_to_drive_in_Hill_region.SetDLno();
		Endorsement_to_drive_in_Hill_region.Clickonproceed();
		/* Endorsement_to_drive_in_Hill_region.ClickonGenerateOTP(); */
		Endorsement_to_drive_in_Hill_region.Clickonapprove();
		Endorsement_to_drive_in_Hill_region.Logout();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		Endorsement_to_drive_in_Hill_region.SelcectService(524);

		Endorsement_to_drive_in_Hill_regionApplicationNo = App_NO(driver,
				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

		String title = driver.getTitle();
		if (title.equals("DL Services Acknowledgement")) {

			Endorsement_to_drive_in_Hill_region.setdata("ApplicationNo", s1.substring(3).trim());

			Endorsement_to_drive_in_Hill_region.setdata("RequestStatus", "Pass");
			wait(1);
			Endorsement_to_drive_in_Hill_region.Clickon_Exitbutton();
			Endorsement_to_drive_in_Hill_region.Clickon_TempHomebutton();

			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			Endorsement_to_drive_in_Hill_region.Clickon_Proceed_Button();
			Endorsement_to_drive_in_Hill_region.Clickon_ProceedtoBookSlot_Button();
			Endorsement_to_drive_in_Hill_region.Booking_Slot();
			Endorsement_to_drive_in_Hill_region.Clickon_Bookslotbutton();
			Endorsement_to_drive_in_Hill_region.Clickon_Confirm_slotbookingbutton();
			Endorsement_to_drive_in_Hill_region.Clickon_Next();

			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_Home_Button();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

			Endorsement_to_drive_in_Hill_region.setUserName(getdata("UserName"));
			Endorsement_to_drive_in_Hill_region.setpassword(getdata("Password"));
			Endorsement_to_drive_in_Hill_region.Clickonsubmit();
			Endorsement_to_drive_in_Hill_region.ClickonRadio();
			Endorsement_to_drive_in_Hill_region.Clickonlogin();
			Endorsement_to_drive_in_Hill_region.Clickon_General_button();
			Endorsement_to_drive_in_Hill_region.Clickon_Scrutiny_Link();
			Endorsement_to_drive_in_Hill_region.Set_RTOApplication_Number(getdata("ApplicationNo"));
			Endorsement_to_drive_in_Hill_region.Clickon_RTOProceed_button();
			Endorsement_to_drive_in_Hill_region.Clickon_VerificationofDocuments_Link();
			Endorsement_to_drive_in_Hill_region.Clickon_prooflinks();
			Endorsement_to_drive_in_Hill_region.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Endorsement_to_drive_in_Hill_region = new DL_Service_Endorsement_to_drive_in_Hill_region(ff);
			Endorsement_to_drive_in_Hill_region.setUserName(getdata("UserName"));
			Endorsement_to_drive_in_Hill_region.setpassword(getdata("Password"));
			Endorsement_to_drive_in_Hill_region.Clickonsubmit();
			Endorsement_to_drive_in_Hill_region.ClickonRadio();
			Endorsement_to_drive_in_Hill_region.Clickonlogin();
			Endorsement_to_drive_in_Hill_region.Clickon_General_button();
			Endorsement_to_drive_in_Hill_region.Clickon_BiometricsLink();
			Endorsement_to_drive_in_Hill_region.Set_Application_NumbeinRenualServicer(getdata("ApplicationNo"));
			Endorsement_to_drive_in_Hill_region.Clickon_Getdetails();
			Endorsement_to_drive_in_Hill_region.Set_CanvasSignature("#thecanvas");
			Endorsement_to_drive_in_Hill_region.Clickon_Capturesignaturebutton();
			Endorsement_to_drive_in_Hill_region.Set_PhotoCapture();
			Endorsement_to_drive_in_Hill_region.Clickon_CropSelected();
			Endorsement_to_drive_in_Hill_region.Clickon_Phototriggerbutton();
			Endorsement_to_drive_in_Hill_region.Clickon_Snapokbutton();
			Endorsement_to_drive_in_Hill_region.Clickon_Savebutton();

			Endorsement_to_drive_in_Hill_region.ClickonDL();
			Endorsement_to_drive_in_Hill_region.Clickon_DL_Endorsement_Approval();
			Endorsement_to_drive_in_Hill_region
					.Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
			Endorsement_to_drive_in_Hill_region.Clickon_Submit_in__DL_Endorsement_Approval();
			Endorsement_to_drive_in_Hill_region.Clickon_DL_Endorsement_final_Approve();

			ff.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC_NT_Premature_Without_Mapping() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		NT_Premature_Without_Mapping = new applicationPages.TC_NT_Premature_Without_Mapping(driver);
		NT_Premature_Without_Mapping.setUserName(getdata("UserName"));
		NT_Premature_Without_Mapping.setpassword(getdata("Password"));
		// NT_Premature_Without_Mapping.ClickonNext();
		// NT_Premature_Without_Mapping.SetCaptcha();
		NT_Premature_Without_Mapping.Clickonsubmit();

		NT_Premature_Without_Mapping.ClickonRadio();
		NT_Premature_Without_Mapping.Clickonlogin();
		NT_Premature_Without_Mapping.ClickonDL();
		NT_Premature_Without_Mapping.ClickonDLBacklog();
		NT_Premature_Without_Mapping.SetFirstissuedate(getdata("Firstissuedate"));
		NT_Premature_Without_Mapping.SetNumaricLLno(getdata("NumaricLLno"));
		NT_Premature_Without_Mapping.SetOriginalDLno(getdata("OriginalDLno"));
		NT_Premature_Without_Mapping.SetName(getdata("Name"));
		NT_Premature_Without_Mapping.SetMiddleName(getdata("Middlename"));
		NT_Premature_Without_Mapping.SetLastName(getdata("Lastname"));
		NT_Premature_Without_Mapping.SetRelation(getdata("Relationname"));
		NT_Premature_Without_Mapping.SetRelationfirstname(getdata("Relationfirstname"));
		NT_Premature_Without_Mapping.SetRelationMiddlename(getdata("RelationMiddleName"));
		NT_Premature_Without_Mapping.SetRelationLastname(getdata("RelationLastName"));
		NT_Premature_Without_Mapping.ClickonGender();
		NT_Premature_Without_Mapping.SetAge(getdata("Age"));
		NT_Premature_Without_Mapping.SetBloodgroup(getdata("Bloodgroup"));
		NT_Premature_Without_Mapping.SetQualification(getdata("Qualification"));
		NT_Premature_Without_Mapping.SetMobilenumber(getdata("Mobilenumber"));
		NT_Premature_Without_Mapping.SetState(getdata("State"));
		NT_Premature_Without_Mapping.SetDistrict(getdata("District"));
		NT_Premature_Without_Mapping.SetSubDistrict(getdata("SubDistrict"));
		NT_Premature_Without_Mapping.SetPincode(getdata("Pincode"));
		NT_Premature_Without_Mapping.ClickonCheckbox();
		NT_Premature_Without_Mapping.ClickonLicenseDetails();
		NT_Premature_Without_Mapping.SetSelectCOV1(getdata("SelectCOV1"));
		NT_Premature_Without_Mapping.ClickonAddbutton1();
		// NT_Premature_Without_Mapping.SetStateone(getdata("Stateone"));
		// NT_Premature_Without_Mapping.SetRTOone(getdata("RTOone"));
		// NT_Premature_Without_Mapping.SetCOVIssueDate1(getdata("COVIssueDate1"));
		// NT_Premature_Without_Mapping.SetSelectCOV1(getdata("SelectCOV2"));
		// wait(1);
		// NT_Premature_Without_Mapping.SetSelectCOV1(getdata("SelectCOV2"));
		// NT_Premature_Without_Mapping.ClickonAddbutton2();
		// NT_Premature_Without_Mapping.SetStatetwo(getdata("Statetwo"));
		// NT_Premature_Without_Mapping.SetRTOtwo(getdata("RTOtwo"));
		// NT_Premature_Without_Mapping.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// NT_Premature_Without_Mapping.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// NT_Premature_Without_Mapping.SetSelectCOV3(getdata("SelectCOV3"));
		// NT_Premature_Without_Mapping.ClickonAddbutton3();
		// NT_Premature_Without_Mapping.SetStatethreeo(getdata("Statethreeo"));
		// NT_Premature_Without_Mapping.SetRTOthree(getdata("RTOthree"));
		// NT_Premature_Without_Mapping.SetCOVIssueDate3(getdata("COVIssueDate3"));
		// NT_Premature_Without_Mapping.SetSelectCOV4(getdata("SelectCOV4"));
		// wait(2);
		// NT_Premature_Without_Mapping.SetSelectCOV4(getdata("SelectCOV4"));
		// NT_Premature_Without_Mapping.ClickonAddbutton4();
		NT_Premature_Without_Mapping.ClickonSubmit();
		s1 = DL_Backlog(driver, "//div[@class='panel-body']/h4");
		NT_Premature_Without_Mapping.setdata("DL", s1.substring(16).trim());
		NT_Premature_Without_Mapping.setdata("Status", "Pass");
		NT_Premature_Without_Mapping.ClickonDL();
		NT_Premature_Without_Mapping.ClickonDlbacklogapproval();
		NT_Premature_Without_Mapping.SetDLno();
		NT_Premature_Without_Mapping.Clickonproceed();
		NT_Premature_Without_Mapping.ClickonGenerateOTP();
		NT_Premature_Without_Mapping.Clickonapprove();
		// s2 = DL_Approvedappno(driver, "//div[@class='text-success']/h4");
		// DL_Service_ChangeofName.setdata("DLApprovedappno", s2.substring(14,
		// 20).trim());
		NT_Premature_Without_Mapping.Logout();

		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		NT_Premature_Without_Mapping.SelcectService(12345);

	}

}
