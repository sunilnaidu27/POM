package testScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import applicationPages.Pg10_Login;
import applicationPages.Services;
import applicationPages.UploadDocumentsPage;
import applicationPages.UploadPhoto_SignaturePage;
import applicationPages.LLBacklogPage;
import applicationPages.ScrutinyPage;
import applicationPages.DL_Backlog;
import frameworkLibrary.BaseClass;

public class _06_DLBacklog_with_Approval extends BaseClass {

	WebDriver driver;
	DL_Backlog DL_Backlog;
	applicationPages.NewLLRegistrtionPage NewLLRegistrtionPage;

	@Test(invocationCount = 15)
	public void TC501() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// driver = new ChromeDriver(capability); // driver = new ChromeDriver();
		// driver.get("https://sarathicov.nic.in:8443/sarathiservice/biometrics.do");
		// driver.manage().window().maximize();
		//
		// UploadPhoto_SignaturePage UploadPhoto_SignaturePage = new
		// UploadPhoto_SignaturePage(driver);
		// // UploadPhoto_SignaturePage.click_on_uploadphotoandsignature();
		// UploadPhoto_SignaturePage.Set_Application_Number("512520");
		// UploadPhoto_SignaturePage.Set_DateofBirth("01-06-1984");
		// UploadPhoto_SignaturePage.click_on_Getdetails(); //
		// UploadPhoto_SignaturePage.Clickon_Proceed_Button();
		// UploadPhoto_SignaturePage.Clickon_Browse_Button1();
		// UploadPhoto_SignaturePage.Clickon_Browse_Button2();
		// UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
		// UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();

		driver = new ChromeDriver(capability);
		driver.get(
				"https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.ArrangeDataSet();
		DL_Backlog.setUserName(getdata("UserName"));
		DL_Backlog.setpassword(getdata("Password"));
		// DL_Backlog.ClickonNext();
		DL_Backlog.SetCaptcha();
		DL_Backlog.Clickonsubmit();

		/*
		 * DL_Backlog.ClickonRadio(); DL_Backlog.Clickonlogin();
		 */

		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDLBacklog();
		DL_Backlog.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Backlog.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Backlog.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Backlog.SetLasttransdate(getdata("Lasttransdate"));
		DL_Backlog.SetName(getdata("Name"));
		DL_Backlog.SetMiddleName(getdata("Middlename"));
		DL_Backlog.SetLastName(getdata("Lastname"));
		DL_Backlog.SetRelation(getdata("Relation"));
		DL_Backlog.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Backlog.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Backlog.SetRelationLastname(getdata("RelationLastName"));
		DL_Backlog.ClickonGender();
		DL_Backlog.SetAge(getdata("Age"));
		DL_Backlog.SetBloodgroup(getdata("Bloodgroup"));
		DL_Backlog.SetQualification(getdata("Qualification"));
		DL_Backlog.SetMobilenumber(getdata("Mobilenumber"));
		DL_Backlog.SetState(getdata("State"));
		DL_Backlog.SetDistrict(getdata("District"));
		DL_Backlog.SetSubDistrict(getdata("SubDistrict"));
		DL_Backlog.SetPincode(getdata("Pincode"));
		DL_Backlog.ClickonCheckbox();
		DL_Backlog.ClickonLicenseDetails();

		DL_Backlog.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Backlog.ClickonAddbutton1();

		/* Adding Second COV */

		DL_Backlog.SetStateone(getdata("Stateone"));
		DL_Backlog.SetRTOone(getdata("RTOone"));
		DL_Backlog.SetCOVIssueDate1(getdata("COVIssueDate1"));
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		DL_Backlog.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Backlog.SetStatetwo(getdata("Statetwo"));
		// DL_Backlog.SetRTOtwo(getdata("RTOtwo"));
		// DL_Backlog.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Backlog.ClickonAddbutton3();

		/*
		 * DL_Backlog.SetStatethreeo(getdata("Statethreeo"));
		 * DL_Backlog.SetRTOthree(getdata("RTOthree"));
		 * DL_Backlog.SetCOVIssueDate3(getdata("COVIssueDate3"));
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4")); wait(2);
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4"));
		 * DL_Backlog.ClickonAddbutton4();
		 */

		DL_Backlog.ClickonSubmit();

		// driver.findElement(By.xpath("//button[@id='trsaction_ack_nextStatus']")).click();
		// //
		// driver.navigate().to("https://sarathicov.nic.in:8443/sarathiservice/uploadMain.do");
		// UploadDocumentsPage UploadDocumentsPage = new UploadDocumentsPage(driver);
		// // UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
		// // UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
		// // UploadDocumentsPage.Clickon_Submit_Button();
		// UploadDocumentsPage.Clickon_Proceed_Button();
		// UploadDocumentsPage.Clickon_Submit1_Button();
		// UploadDocumentsPage.Clickon_ok_Button();
		// driver.close();

		// UploadDocumentsPage.Clickon_Proceed_Button();

		// System.setProperty("webdriver.chrome.driver","BrowserServers\\chromedriver.exe");
		// ChromeOptions capability = new ChromeOptions();
		// capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		// capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// driver = new ChromeDriver(capability); // driver = new ChromeDriver();
		// driver.get("https://sarathicov.nic.in:8443/sarathiservice/biometrics.do");
		// driver.manage().window().maximize();
		//
		// UploadPhoto_SignaturePage UploadPhoto_SignaturePage = new
		// UploadPhoto_SignaturePage(driver);
		// // UploadPhoto_SignaturePage.click_on_uploadphotoandsignature();
		// UploadPhoto_SignaturePage.Set_Application_Number(getdata("ApplicationNo"));
		// UploadPhoto_SignaturePage.Set_DateofBirth(getdata("DateofBirth"));
		// UploadPhoto_SignaturePage.click_on_Getdetails(); //
		// UploadPhoto_SignaturePage.Clickon_Proceed_Button();
		// UploadPhoto_SignaturePage.Clickon_Browse_Button1();
		// UploadPhoto_SignaturePage.Clickon_Browse_Button2();
		// UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
		// UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();

		/*
		 * DL_Backlog = new DL_Backlog(driver);
		 * DL_Backlog.setUserName(getdata("UserName"));
		 * DL_Backlog.setpassword(getdata("Password")); // // //
		 * DL_Backlog.ClickonNext(); DL_Backlog.SetCaptcha();
		 * 
		 * DL_Backlog.Clickonsubmit(); // // DL_Backlog.ClickonRadio(); // //
		 * DL_Backlog.Clickonlogin(); // // NewLLRegistrtionPage = new
		 * applicationPages.NewLLRegistrtionPage(driver);
		 * NewLLRegistrtionPage.clickon_Misc();
		 * NewLLRegistrtionPage.click_on_applicationstatus();
		 * NewLLRegistrtionPage.setAPPLNO_IN_LOGIN(getdata("ApplicationNo"));
		 * NewLLRegistrtionPage.click_on_viewflows();
		 * NewLLRegistrtionPage.click_on_processflow();
		 * NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
		 * NewLLRegistrtionPage.Clickon_prooflinks();
		 * NewLLRegistrtionPage.Clickon_Scrutinybutton();
		 * 
		 * 
		 * DL_Backlog.ClickonDL(); DL_Backlog.ClickonDlbacklogapproval();
		 * DL_Backlog.SetDLno(getdata("DLApprovedappno")); DL_Backlog.Clickonproceed();
		 * // DL_Backlog.ClickonGenerateOTP(); DL_Backlog.Clickonapprove();
		 * 
		 * // driver.navigate().to( //
		 * "https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do"
		 * // ); DL_Backlog = new DL_Backlog(driver); //
		 * DL_Backlog.setUserName(getdata("UserName")); //
		 * DL_Backlog.setpassword(getdata("Password")); DL_Backlog.SetCaptcha(); //
		 * DL_Backlog.Clickonsubmit(); // // // // DL_Backlog.ClickonDL(); // //
		 * DL_Backlog.ClickonDlbacklogapproval(); DL_Backlog.SetDLno(); //
		 * DL_Backlog.Clickonproceed(); // DL_Backlog.ClickonGenerateOTP(); //
		 * DL_Backlog.Clickonapprove(); // // wait(2); DL_Backlog.Logout(); //
		 * 
		 * // driver.navigate().to(
		 * "https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		 * 
		 * // Services srvc = new Services(driver);
		 * 
		 * /* Applying DL Services after sucessful DL Backlog Submission
		 */

		/**
		 * Service Name Service Code
		 * 
		 * 
		 * IssueofDuplicateDL -- > 513 Renewal of DL -- > 514 Change of Address -- > 515
		 * ReplacementofDL -- > 516 Issue of PSVBadge to Driver -- > 519 IssueofNOC -- >
		 * 522 DL Extract -- > 523 Endorsement to drive in Hill region -- > 524 Issue of
		 * International Driving Permit -- > 525 Change of Name -- > 526 Change of
		 * Biometrics in DL -- > 528 Renewal with ReTest -- > 537
		 * 
		 * 
		 **/

		// srvc.SelcectService(513);

	}

	@Test(invocationCount = 10)
	public void TC502() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(capability);
		driver.get(
				"https://sarathiprod.nic.in/cas/login?service=https%3A%2F%2Fsarathiprod.nic.in%2Fsarathiservicecov%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.ArrangeDataSet();
		DL_Backlog.setUserName(getdata("UserName"));
		DL_Backlog.setpassword(getdata("Password"));
		DL_Backlog.ClickonNext();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Captcha:");
		String txr = sc.next();
		driver.findElement(By.xpath("//input[@id='logmode']")).sendKeys(txr);
		// DL_Backlog.SetCaptcha();
		DL_Backlog.Clickonsubmit();

		/*
		 * DL_Backlog.ClickonRadio(); DL_Backlog.Clickonlogin();
		 */

		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDLBacklog();
		DL_Backlog.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Backlog.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Backlog.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Backlog.SetLasttransdate(getdata("Lasttransdate"));
		DL_Backlog.SetName(getdata("Name"));
		DL_Backlog.SetMiddleName(getdata("Middlename"));
		DL_Backlog.SetLastName(getdata("Lastname"));
		DL_Backlog.SetRelation(getdata("Relation"));
		DL_Backlog.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Backlog.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Backlog.SetRelationLastname(getdata("RelationLastName"));
		DL_Backlog.ClickonGender();
		DL_Backlog.SetAge(getdata("Age"));
		DL_Backlog.SetBloodgroup(getdata("Bloodgroup"));
		DL_Backlog.SetQualification(getdata("Qualification"));
		DL_Backlog.SetMobilenumber(getdata("Mobilenumber"));
		DL_Backlog.SetState(getdata("State"));
		DL_Backlog.SetDistrict(getdata("District"));
		DL_Backlog.SetSubDistrict(getdata("SubDistrict"));
		DL_Backlog.SetPincode(getdata("Pincode"));
		DL_Backlog.ClickonCheckbox();
		DL_Backlog.ClickonLicenseDetails();

		DL_Backlog.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Backlog.ClickonAddbutton1();

		/* Adding Second COV */

		DL_Backlog.SetStateone(getdata("Stateone"));
		DL_Backlog.SetRTOone(getdata("RTOone"));
		DL_Backlog.SetCOVIssueDate1(getdata("COVIssueDate1"));
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		DL_Backlog.ClickonAddbutton2();

		/* Adding Third COV */

		// DL_Backlog.SetStatetwo(getdata("Statetwo"));
		// DL_Backlog.SetRTOtwo(getdata("RTOtwo"));
		// DL_Backlog.SetCOVIssueDate2(getdata("COVIssueDate2"));
		// DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		// wait(1);
		// DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		// DL_Backlog.ClickonAddbutton3();

		/*
		 * DL_Backlog.SetStatethreeo(getdata("Statethreeo"));
		 * DL_Backlog.SetRTOthree(getdata("RTOthree"));
		 * DL_Backlog.SetCOVIssueDate3(getdata("COVIssueDate3"));
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4")); wait(2);
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4"));
		 * DL_Backlog.ClickonAddbutton4();
		 */

		DL_Backlog.ClickonSubmit();

		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDlbacklogapproval();
		DL_Backlog.SetDLno(getdata("DLApprovedappno"));
		DL_Backlog.Clickonproceed();
		// DL_Backlog.ClickonGenerateOTP();
		DL_Backlog.Clickonapprove();

		DL_Backlog.Logout();
	}

	@Test(invocationCount = 35)
	public void TC503() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		driver = new ChromeDriver(capability);
		/*
		 * driver.get(
		 * "https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do"
		 * ); driver.manage().window().maximize(); DL_Backlog = new DL_Backlog(driver);
		 * DL_Backlog.ArrangeDataSet(); DL_Backlog.setUserName(getdata("UserName"));
		 * DL_Backlog.setpassword(getdata("Password")); // DL_Backlog.ClickonNext();
		 * DL_Backlog.SetCaptcha(); DL_Backlog.Clickonsubmit();
		 * 
		 * 
		 * DL_Backlog.ClickonRadio(); DL_Backlog.Clickonlogin();
		 * 
		 * 
		 * DL_Backlog.ClickonDL(); DL_Backlog.ClickonDLBacklog();
		 * DL_Backlog.SetFirstissuedate(getdata("Firstissuedate"));
		 * DL_Backlog.SetNumaricLLno(getdata("NumaricLLno"));
		 * DL_Backlog.SetOriginalDLno(getdata("OriginalDLno"));
		 * DL_Backlog.SetLasttransdate(getdata("Lasttransdate"));
		 * DL_Backlog.SetName(getdata("Name"));
		 * DL_Backlog.SetMiddleName(getdata("Middlename"));
		 * DL_Backlog.SetLastName(getdata("Lastname"));
		 * DL_Backlog.SetRelation(getdata("Relation"));
		 * DL_Backlog.SetRelationfirstname(getdata("Relationfirstname"));
		 * DL_Backlog.SetRelationMiddlename(getdata("RelationMiddleName"));
		 * DL_Backlog.SetRelationLastname(getdata("RelationLastName"));
		 * DL_Backlog.ClickonGender(); DL_Backlog.SetAge(getdata("Age"));
		 * DL_Backlog.SetBloodgroup(getdata("Bloodgroup"));
		 * DL_Backlog.SetQualification(getdata("Qualification"));
		 * DL_Backlog.SetMobilenumber(getdata("Mobilenumber"));
		 * DL_Backlog.SetState(getdata("State"));
		 * DL_Backlog.SetDistrict(getdata("District"));
		 * DL_Backlog.SetSubDistrict(getdata("SubDistrict"));
		 * DL_Backlog.SetPincode(getdata("Pincode")); DL_Backlog.ClickonCheckbox();
		 * DL_Backlog.ClickonLicenseDetails();
		 * 
		 * DL_Backlog.SetSelectCOV1(getdata("SelectCOV1"));
		 * DL_Backlog.ClickonAddbutton1();
		 * 
		 * Adding Second COV
		 * 
		 * DL_Backlog.SetStateone(getdata("Stateone"));
		 * DL_Backlog.SetRTOone(getdata("RTOone"));
		 * DL_Backlog.SetCOVIssueDate1(getdata("COVIssueDate1"));
		 * DL_Backlog.SetSelectCOV1(getdata("SelectCOV2")); wait(1);
		 * DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		 * DL_Backlog.ClickonAddbutton2();
		 * 
		 * Adding Third COV
		 * 
		 * DL_Backlog.SetStatetwo(getdata("Statetwo"));
		 * DL_Backlog.SetRTOtwo(getdata("RTOtwo"));
		 * DL_Backlog.SetCOVIssueDate2(getdata("COVIssueDate2"));
		 * DL_Backlog.SetSelectCOV3(getdata("SelectCOV3")); wait(1);
		 * DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		 * DL_Backlog.ClickonAddbutton3();
		 * 
		 * DL_Backlog.SetStatethreeo(getdata("Statethreeo"));
		 * DL_Backlog.SetRTOthree(getdata("RTOthree"));
		 * DL_Backlog.SetCOVIssueDate3(getdata("COVIssueDate3"));
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4")); wait(2);
		 * DL_Backlog.SetSelectCOV4(getdata("SelectCOV4"));
		 * DL_Backlog.ClickonAddbutton4();
		 * 
		 * DL_Backlog.ClickonSubmit();
		 */

		// DL_Backlog.Logout();

		driver.get("https://sarathicov.nic.in:8443/sarathiservice/uploadMain.do");
		driver.manage().window().maximize();

		UploadDocumentsPage UploadDocumentsPage = new UploadDocumentsPage(driver);
		UploadDocumentsPage.Set_Application_Number(getdata("DLApprovedappno"));
		UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
		UploadDocumentsPage.Clickon_Submit1_Button();
		UploadDocumentsPage.Clickon_ok_Button();

		UploadPhoto_SignaturePage UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
		UploadPhoto_SignaturePage.Clickon_Proceed_Button();
		UploadPhoto_SignaturePage.Clickon_Browse_Button1();
		UploadPhoto_SignaturePage.Clickon_Browse_Button2();
		UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
		UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
		UploadPhoto_SignaturePage.Clickon_Next();

		driver.navigate().to(
				"https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.setUserName(getdata("UserName"));
		DL_Backlog.setpassword(getdata("Password"));
		DL_Backlog.SetCaptcha();
		DL_Backlog.Clickonsubmit();

		NewLLRegistrtionPage = new applicationPages.NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.clickon_Misc();
		NewLLRegistrtionPage.click_on_applicationstatus();
		NewLLRegistrtionPage.setAPPLNO_IN_LOGIN(getdata("DLApprovedappno"));
		NewLLRegistrtionPage.click_on_viewflows();
		NewLLRegistrtionPage.click_on_processflow();
		NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
		NewLLRegistrtionPage.Clickon_prooflinks();
		NewLLRegistrtionPage.Clickon_Scrutinybutton();

		NewLLRegistrtionPage.clickon_Misc();
		NewLLRegistrtionPage.click_on_applicationstatus();
		NewLLRegistrtionPage.setAPPLNO_IN_LOGIN(getdata("DLApprovedappno"));
		NewLLRegistrtionPage.click_on_viewflows();
		Thread.sleep(2000);
		NewLLRegistrtionPage.click_on_processflow();

		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.Clickonapprove();

	}

	@Test(invocationCount = 5)
	public void TC504() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(capability);
		driver.get(
				"https://sarathiprod.nic.in/cas/login?service=https%3A%2F%2Fsarathiprod.nic.in%2Fsarathiservicecov%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.ArrangeDataSet();
		DL_Backlog.setUserName(getdata("UserName"));
		DL_Backlog.setpassword(getdata("Password"));
		DL_Backlog.ClickonNext();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Captcha:");
		String txr = sc.next();
		driver.findElement(By.xpath("//input[@id='logmode']")).sendKeys(txr);
		// DL_Backlog.SetCaptcha();
		DL_Backlog.Clickonsubmit();

		/*
		 * DL_Backlog.ClickonRadio(); DL_Backlog.Clickonlogin();
		 */

		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDLBacklog();
		DL_Backlog.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Backlog.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Backlog.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Backlog.SetLasttransdate(getdata("Lasttransdate"));
		DL_Backlog.SetName(getdata("Name"));
		DL_Backlog.SetMiddleName(getdata("Middlename"));
		DL_Backlog.SetLastName(getdata("Lastname"));
		DL_Backlog.SetRelation(getdata("Relation"));
		DL_Backlog.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Backlog.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Backlog.SetRelationLastname(getdata("RelationLastName"));
		DL_Backlog.ClickonGender();
		DL_Backlog.SetAge(getdata("Age"));
		DL_Backlog.SetBloodgroup(getdata("Bloodgroup"));
		DL_Backlog.SetQualification(getdata("Qualification"));
		DL_Backlog.SetMobilenumber(getdata("Mobilenumber"));
		DL_Backlog.SetState(getdata("State"));
		DL_Backlog.SetDistrict(getdata("District"));
		DL_Backlog.SetSubDistrict(getdata("SubDistrict"));
		DL_Backlog.SetPincode(getdata("Pincode"));
		DL_Backlog.ClickonCheckbox();
		DL_Backlog.ClickonLicenseDetails();

		DL_Backlog.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Backlog.ClickonAddbutton1();

		/* Adding Second COV */

		DL_Backlog.SetStateone(getdata("Stateone"));
		DL_Backlog.SetRTOone(getdata("RTOone"));
		DL_Backlog.SetCOVIssueDate1(getdata("COVIssueDate1"));
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		DL_Backlog.ClickonAddbutton2();

		/* Adding Third COV */

		DL_Backlog.SetStatetwo(getdata("Statetwo"));
		DL_Backlog.SetRTOtwo(getdata("RTOtwo"));
		DL_Backlog.SetCOVIssueDate2(getdata("COVIssueDate2"));
		DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		wait(1);
		DL_Backlog.SetSelectCOV3(getdata("SelectCOV3"));
		DL_Backlog.ClickonAddbutton3();
		/* Adding Fourth COV */
		DL_Backlog.SetStatethreeo(getdata("Statethreeo"));
		DL_Backlog.SetRTOthree(getdata("RTOthree"));
		DL_Backlog.SetCOVIssueDate3(getdata("COVIssueDate3"));
		DL_Backlog.SetSelectCOV4(getdata("SelectCOV4"));
		wait(2);
		DL_Backlog.SetSelectCOV4(getdata("SelectCOV4"));
		DL_Backlog.ClickonAddbutton4();

		DL_Backlog.ClickonSubmit();

		// DL_Backlog.ClickonDL();
		// DL_Backlog.ClickonDlbacklogapproval();
		// DL_Backlog.SetDLno(getdata("DLApprovedappno"));
		// DL_Backlog.Clickonproceed();
		// // DL_Backlog.ClickonGenerateOTP();
		// DL_Backlog.Clickonapprove();

		driver.findElement(By.xpath("//button[@id='trsaction_ack_nextStatus']")).click();

		UploadDocumentsPage UploadDocumentsPage = new UploadDocumentsPage(driver);
		UploadDocumentsPage.Clickon_Proceed_Button();
		UploadDocumentsPage.Clickon_Submit1_Button();
		UploadDocumentsPage.Clickon_ok_Button();

		NewLLRegistrtionPage = new applicationPages.NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.clickon_Misc();
		NewLLRegistrtionPage.click_on_applicationstatus();
		NewLLRegistrtionPage.setAPPLNO_IN_LOGIN(getdata("DLApprovedappno"));
		NewLLRegistrtionPage.click_on_viewflows();
		NewLLRegistrtionPage.click_on_processflow();
		NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
		NewLLRegistrtionPage.Clickon_prooflinks();
		NewLLRegistrtionPage.Clickon_Scrutinybutton();

		NewLLRegistrtionPage.clickon_Misc();
		NewLLRegistrtionPage.click_on_applicationstatus();
		NewLLRegistrtionPage.setAPPLNO_IN_LOGIN(getdata("DLApprovedappno"));
		NewLLRegistrtionPage.click_on_viewflows();
		Thread.sleep(2000);
		NewLLRegistrtionPage.click_on_processflow();

		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.Clickonapprove();

		DL_Backlog.Logout();

	}

	@Test(invocationCount = 1)
	public void TC505() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(capability);
		driver.get(
				"https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		DL_Backlog = new DL_Backlog(driver);
		DL_Backlog.ArrangeDataSet();
		DL_Backlog.setUserName(getdata("UserName"));
		DL_Backlog.setpassword(getdata("Password"));
		DL_Backlog.SetCaptcha();
		DL_Backlog.Clickonsubmit();
		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDLBacklog();
		DL_Backlog.SetFirstissuedate(getdata("Firstissuedate"));
		DL_Backlog.SetNumaricLLno(getdata("NumaricLLno"));
		DL_Backlog.SetOriginalDLno(getdata("OriginalDLno"));
		DL_Backlog.SetLasttransdate(getdata("Lasttransdate"));
		DL_Backlog.SetName(getdata("Name"));
		DL_Backlog.SetMiddleName(getdata("Middlename"));
		DL_Backlog.SetLastName(getdata("Lastname"));
		DL_Backlog.SetRelation(getdata("Relation"));
		DL_Backlog.SetRelationfirstname(getdata("Relationfirstname"));
		DL_Backlog.SetRelationMiddlename(getdata("RelationMiddleName"));
		DL_Backlog.SetRelationLastname(getdata("RelationLastName"));
		DL_Backlog.ClickonGender();
		DL_Backlog.SetAge(getdata("Age"));
		DL_Backlog.SetBloodgroup(getdata("Bloodgroup"));
		DL_Backlog.SetQualification(getdata("Qualification"));
		DL_Backlog.SetMobilenumber(getdata("Mobilenumber"));
		DL_Backlog.SetState(getdata("State"));
		DL_Backlog.SetDistrict(getdata("District"));
		DL_Backlog.SetSubDistrict(getdata("SubDistrict"));
		DL_Backlog.SetPincode(getdata("Pincode"));
		DL_Backlog.ClickonCheckbox();
		DL_Backlog.ClickonLicenseDetails();

		DL_Backlog.SetSelectCOV1(getdata("SelectCOV1"));
		DL_Backlog.ClickonAddbutton1();

		/* Adding Second COV */

		DL_Backlog.SetStateone(getdata("Stateone"));
		DL_Backlog.SetRTOone(getdata("RTOone"));
		DL_Backlog.SetCOVIssueDate1(getdata("COVIssueDate1"));
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		wait(1);
		DL_Backlog.SetSelectCOV1(getdata("SelectCOV2"));
		DL_Backlog.ClickonAddbutton2();

		DL_Backlog.ClickonSubmit();

	

		DL_Backlog.ClickonDL();
		DL_Backlog.ClickonDlbacklogapproval();
		DL_Backlog.SetDLno(getdata("DLApprovedappno"));
		DL_Backlog.Clickonproceed();
		DL_Backlog.Clickonapprove();

		DL_Backlog.Logout();

	}
}