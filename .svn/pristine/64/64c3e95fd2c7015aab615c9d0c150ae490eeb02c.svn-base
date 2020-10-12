package testScripts;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import applicationPages.NewLLRegistrtionPage;
import applicationPages.UploadDocumentsPage;
import applicationPages.UploadPhoto_SignaturePage;
import applicationPages.LLSlotBookingPagee;
import applicationPages.LL_Referencethrough_DLPage;
import applicationPages.LL_Referencethrough_LLPage;
import applicationPages.LL_Services;
import applicationPages.Login_CapturebiometricsPage;
import applicationPages.ScrutinyPage;
import applicationPages.LLFEEPaymentPagee;
import applicationPages.Pg10_Login;
import applicationPages.DL_Backlog;
import applicationPages.DL_Service_AddressinDL;
import applicationPages.DL_Service_Issueof_International_Driving_Permit;
import applicationPages.HoldingForeignDL;
import frameworkLibrary.BaseClass;
import frameworkLibrary.FrameworkVariables;

public class _01_LL_Applicant_Flows_Module extends BaseClass {
	WebDriver driver;
	DL_Backlog homepage;
	NewLLRegistrtionPage NewLLRegistrtionPage;
	UploadDocumentsPage UploadDocumentsPage;
	UploadPhoto_SignaturePage UploadPhoto_SignaturePage;
	LLSlotBookingPagee LLSlotBookingPage;
	LLFEEPaymentPagee LLFEEPaymentPage;
	LL_Referencethrough_DLPage LL_Referencethrough_DL;
	LL_Referencethrough_LLPage LL_Referencethrough_LL;
	LL_Services ChangeofAddress, ChangeofName, LLBacklogwithApproval, DuplicateLL;
	String selectionString;

	@Test(invocationCount = 1)
	public void TC01_NewLLApplication_Submission_AllFields() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		// NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		// NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		// NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {
			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
		} else {
			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC02_NewLLApplication_Submission_AllFields_With_UploadDocuments()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		// NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		// NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		// NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {
			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Getlogotp("https://s4preprod.nic.in:8443/applogs/sarathiservice.log");
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit1_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			System.out.println("****Task Completed****");

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC03_NewLLApplication_Submission_AllFields_With_UD_and_UploadPhotoSignature()
			throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
//		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
//		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			UploadDocumentsPage.Getlogotp("https://s4preprod.nic.in:8443/applogs/sarathiservice.log");
			UploadDocumentsPage.Clickon_ok_Button();
	
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC04_NewLLApplication_Submission_AllFields_With_UD_UPS_LLSlotBooking()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC05_NewLLApplication_Submission_AllFields_With_UD_UPS_LLSB_LLFeePayment()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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

			UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_PrintReceipt();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC06_NewLLApplication_Submission_AllFields_With_Applicantflows_and_Scrutiny()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			LLFEEPaymentPage.Clickon_PrintReceipt();
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			// NewLLRegistrtionPage.Clickon_Login_Button();
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC07_NewLLApplication_Submission_AllFields_With_Applicantflows_and_Scrutiny_CapBio()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.geckodriver.driver", "BrowserServers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", false);
		capabilities.setCapability("firefox_binary",
				new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// System.setProperty("webdriver.chrome.driver",
		// "BrowserServers\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		// driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno(getdata("Landno"));
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
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
			// NewLLRegistrtionPage.Clickon_Login_Button();
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature(
					"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC08_NewLLApplication_Submission_AllFields_With_Applicantflows_and_Scrutiny_CapBio_LLTest()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno("Landno");
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			NewLLRegistrtionPage.Clickon_Login_Button();
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature(
					"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLTestResultsLink();
			NewLLRegistrtionPage.Set_LLApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.ClickonFetchbutton();
			NewLLRegistrtionPage.Set_TestResult("PASS");
			NewLLRegistrtionPage.ClickonbSubmitutton();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC09_NewLLApplication_Submission_AllFields_With_Applicantflows_and_Scrutiny_CapBio_LLTest_LLApproval()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.CheckHomebuttonisEnabled();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.Check_DisabledPincode();
		NewLLRegistrtionPage.SetAadhaarNumber(getdata("AadhaarNumber"));
		NewLLRegistrtionPage.SetAadhaarApplicationNumber(getdata("AadhaarApplicationNumber"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetMiddlename(getdata("Middlename"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationMiddleName(getdata("RelationMiddlename"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetPlaceofBirth(getdata("Placeofbirth"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetPhonenumber_Landno("Landno");
		NewLLRegistrtionPage.SetEmailid(getdata("Emailid"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetEmrgPhoneno(getdata("Emrgno"));
		NewLLRegistrtionPage.SetIdentificationMarks1(getdata("IM1"));
		NewLLRegistrtionPage.SetIdentificationMarks2(getdata("IM2"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetVillage(getdata("Village"));
		NewLLRegistrtionPage.SetHouseno(getdata("Houseno"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetStayyears(getdata("Years"));
		NewLLRegistrtionPage.SetStayMonths(getdata("Months"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		// NewLLRegistrtionPage.ClickLeftarrow();

		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			NewLLRegistrtionPage.Clickon_Login_Button();
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			// ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			// driver.switchTo().window(tabs.get(1));
			// driver.close();
			// driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature(
					"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLTestResultsLink();
			NewLLRegistrtionPage.Set_LLApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.ClickonFetchbutton();
			NewLLRegistrtionPage.Set_TestResult("PASS");
			NewLLRegistrtionPage.ClickonbSubmitutton();
			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLAprovalbatchLink();
			NewLLRegistrtionPage.ClickonLLApprovalRadiobutton();
			NewLLRegistrtionPage.Set_LLApprovalApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_LLApprovalSubmitbutton();
			NewLLRegistrtionPage.Clickon_Selectallcheckbox();
			NewLLRegistrtionPage.Clickon_Issueallbutton();
			s3 = LL_No(driver, "//table/tbody/tr/td[5]/p");
			NewLLRegistrtionPage.setdata("LLNumber", s3.substring(25, 43));

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}

	}

	/*
	 * New LL Submission Applicant Side flows Covered in this Module. To Submit New
	 * LL we have to Run TC001 Test case To Run Single Application we have to give
	 * invocationCount = 1 and for Multiple Application Submission invocationCount =
	 * User defined iteration number.
	 */

	@Test(invocationCount = 1)
	public void TC10_NewLLApplication_Submission_MandatoryFields() throws IOException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC11_NewLLApplication_Submission_MandatoryFields_to_UploadDocuments()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_ok_Button();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 49)
	public void TC12_NewLLApplication_Submission_MandatoryFields_to_UD_UploadPhotoSignature()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		// NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC13_NewLLApplication_Submission_MandatoryFields_to_UD_UPS_LLSlotBooking()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_ok_Button();

			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();

		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 10)
	public void TC14_NewLLApplication_Submission_MandatoryFields_to_UD_UPS_LLSB_LLFeepayment()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://sarathicov.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		wait(1);
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			 * UploadPhoto_SignaturePage.Clickon_Next(); LLSlotBookingPage = new
			 * LLSlotBookingPagee(driver); LLSlotBookingPage.Clickon_Proceed_Button();
			 * LLSlotBookingPage.Create_RandomDate();
			 * LLSlotBookingPage.Clickon_Slotbookingbutton(
			 * "//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label"
			 * ,
			 * "//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input"
			 * ); LLSlotBookingPage.Clickon_Bookslotbutton();
			 * LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			 * LLSlotBookingPage.Clickon_Next();
			 * 
			 */

			/*
			 * LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			 * LLFEEPaymentPage.Clickon_Proceed_Button();
			 * LLFEEPaymentPage.SelectBank("ANDRA BANK"); LLFEEPaymentPage.SetCaptcha();
			 * LLFEEPaymentPage.Clickon_Paynow_Button();
			 * LLFEEPaymentPage.Clickon_Checkbox();
			 * LLFEEPaymentPage.Clickon_Proceedforpayment();
			 * LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			 * LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			 */

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC15_NewLLApplication_Submission_MandatoryFields_with_Applicantflows_Scrutiny()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_ok_Button();

			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			NewLLRegistrtionPage.Clickon_Login_Button();

			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			// ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			// driver.switchTo().window(tabs.get(1));
			// driver.close();
			// driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 4)
	public void TC16_aptocap() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4testing.nic.in/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		wait(1);
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		// NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();

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
			 * UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc")); //
			 * UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc")); //
			 * UploadDocumentsPage.Clickon_Choosefile_Button1(); //
			 * UploadDocumentsPage.Clickon_Next_Button();
			 * 
			 */

			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Applyonline();
			UploadPhoto_SignaturePage.Clickon_Application_Status_Link();
			UploadPhoto_SignaturePage.Set_Application_Number(getdata("ApplicationNo"));
			UploadPhoto_SignaturePage.Set_DateofBirth(getdata("DateofBirth"));
			UploadPhoto_SignaturePage.Clickon_Submit_Button();

			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLSlotBookingPage = new LLSlotBookingPagee(driver);

			driver.findElement(By.xpath("//input[@value='LL SLOT BOOK']")).click();
			LLSlotBookingPage.Clickon_Proceed_Button();
			// driver.findElement(By.xpath("//input[@name='smsCode']")).sendKeys("150847");
			// driver.findElement(By.xpath("//input[@name='method:submitSecurityCode']")).click();

			LLSlotBookingPage.Clickon_ProceedtoBookSlot_Button();
			LLSlotBookingPage.Booking_Slot();
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();

			/*
			 * 
			 * LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			 * LLFEEPaymentPage.Clickon_Proceed_Button();
			 * LLFEEPaymentPage.SelectBank("ANDRA BANK"); LLFEEPaymentPage.SetCaptcha();
			 * LLFEEPaymentPage.Clickon_Paynow_Button();
			 * LLFEEPaymentPage.Clickon_Checkbox();
			 * LLFEEPaymentPage.Clickon_Proceedforpayment();
			 * LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			 * LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			 * 
			 */

			driver.navigate().to(
					"https://s4testing.nic.in/cas/login?service=https%3A%2F%2Fs4testing.nic.in%2Fsarathiservice%2Fsarathilogin.do");

			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			driver.findElement(By.xpath("//input[@name='mode']")).sendKeys("123456");
			NewLLRegistrtionPage.ClickonLogin();

			// NewLLRegistrtionPage.SelectRTOtype();
			// NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			// NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			// NewLLRegistrtionPage.Clickon_prooflinks();
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

			driver.findElement(By.xpath("//a[text()='Logout']")).click();

			// wait(2);
			// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			// capabilities.setCapability("marionette", false);
			// capabilities.setCapability("firefox_binary",
			// new File("C:\\Program Files (x86)\\Mozilla
			// Firefox\\firefox.exe").getAbsolutePath());
			// WebDriver ff = new FirefoxDriver(capabilities);
			//
			// ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			// ff.manage().window().maximize();
			// ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			// NewLLRegistrtionPage = new NewLLRegistrtionPage(ff);
			// NewLLRegistrtionPage.setUserNamee(getdata("UserName"));
			// NewLLRegistrtionPage.setpass(getdata("Password"));
			// NewLLRegistrtionPage.ClickonLogin();
			// NewLLRegistrtionPage.SelectRTOtype();
			// NewLLRegistrtionPage.Clickonloogin();
			// NewLLRegistrtionPage.Clickon_General_button();
			// NewLLRegistrtionPage.Clickon_BiometricsLink();
			// NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			// NewLLRegistrtionPage.Clickon_Getdetails();
			// NewLLRegistrtionPage.Set_CanvasSignature("#thecanvas");
			// NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			// NewLLRegistrtionPage.Set_PhotoCapture();
			// /* NewLLRegistrtionPage.Clickon_CropSelected(); */
			// NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			// NewLLRegistrtionPage.Clickon_Snapokbutton();
			// NewLLRegistrtionPage.Clickon_Savebutton();
			// ff.close();
			// wait(2);

			driver.close();

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC17_NewLLApplication_Submission_MandatoryFields_with_Applicantflows_Scrutiny_CapBio_LLTest()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc"));
			// UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLSlotBookingPage.Clickon_ProceedtoBookSlot_Button();
			LLSlotBookingPage.Booking_Slot();
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();

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

			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			NewLLRegistrtionPage = new NewLLRegistrtionPage(ff);
			NewLLRegistrtionPage.setUserNamee(getdata("UserName"));
			NewLLRegistrtionPage.setpass(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonloogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature("#thecanvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();
			ff.close();
			wait(2);

			/*
			 * NewLLRegistrtionPage.ClickonLL_Link();
			 * NewLLRegistrtionPage.ClickonLLTestResultsLink();
			 * NewLLRegistrtionPage.Set_LLApplication_Number(getdata("ApplicationNo"));
			 * NewLLRegistrtionPage.ClickonFetchbutton();
			 * NewLLRegistrtionPage.Set_TestResult("PASS");
			 * NewLLRegistrtionPage.ClickonbSubmitutton();
			 */

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 10)
	public void TC18_NewLLApplication_Submission_MandatoryFields_with_Applicantflows_Scrutiny_CapBio_LLTest_LLApproval()
			throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
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
			// UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc"));
			// UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();

			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			driver.findElement(By.xpath("//input[@name='smsCode']")).sendKeys("15081947");
			driver.findElement(By.xpath("//input[@id='securityForm__submitSecurityCode']")).click();
			LLSlotBookingPage.Clickon_ProceedtoBookSlot_Button();
			LLSlotBookingPage.Booking_Slot();
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();

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

			// NewLLRegistrtionPage.Clickon_Login_Button();

			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

			wait(2);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver ff = new FirefoxDriver(capabilities);

			ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			NewLLRegistrtionPage = new NewLLRegistrtionPage(ff);
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature("#thecanvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();
			ff.close();
			wait(2);

			NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLTestResultsLink();
			NewLLRegistrtionPage.Set_LLApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.ClickonFetchbutton();
			NewLLRegistrtionPage.Set_TestResult("PASS");
			NewLLRegistrtionPage.ClickonbSubmitutton();

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLAprovalbatchLink();
			NewLLRegistrtionPage.ClickonLLApprovalRadiobutton();
			NewLLRegistrtionPage.Set_LLApprovalApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_LLApprovalSubmitbutton();
			NewLLRegistrtionPage.Clickon_Selectallcheckbox();
			NewLLRegistrtionPage.Clickon_Issueallbutton();
			s3 = LL_No(driver, "//table/tbody/tr/td[5]/p");
			NewLLRegistrtionPage.setdata("LLNumber", s3.substring(25, 43));

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
		wait(1);
		driver.quit();
	}

	// /* To Upload Documents in New LL Module we have to Run TC002 Test case */

	@Test(invocationCount = 1)
	public void TC19_UploadDocuments() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UploadDocumentsPage = new UploadDocumentsPage(driver);
		// UploadDocumentsPage.Selectstatename(getdata("SelectState"));
		UploadDocumentsPage.Clickon_Applyonline();
		UploadDocumentsPage.Clickon_Application_Status_Link();
		// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
		// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
		UploadDocumentsPage.Set_Application_Number("704819");
		// UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
		UploadDocumentsPage.Set_DateofBirth("01-06-1984");
		// UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
		UploadDocumentsPage.Clickon_Submit_Button();
		

//		wait(3);
//
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.open()");
//
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1)); // switches to new tab
//		driver.get("https://s4preprod.nic.in:8443/applogs/sarathiservice.log");
//		//driver.navigate().refresh();
//		  
//		
//
//		String output = driver.findElement(By.cssSelector("body")).getText();
//		File DestFile = new File("\\logfile.txt");
//		PrintWriter writer = new PrintWriter(DestFile);
//		writer.print("");
//		writer.close();
//		FileUtils.writeStringToFile(DestFile, output);
		
		UploadDocumentsPage.Getlogotp("https://s4preprod.nic.in:8443/applogs/sarathiservice.log");
		
		
		
		
		

		// driver.switchTo().window(tabs.get(0)); // switch back to main screen
		// driver.get("https://www.news.google.com");

		//
		// String wh = driver.getWindowHandle();
		//
		// driver.switchTo().window(wh);
		//
		// driver.navigate().to("https://s4preprod.nic.in:8443/applogs/sarathiservice.log");
		//
		// driver.findElement(By.xpath("//input[@name='mobEnteredOtp']")).sendKeys("");
		//
		// UploadDocumentsPage.Clickon_Proceed_Button();
		// UploadDocumentsPage.Clickon_Submit1_Button();
		// UploadDocumentsPage.Clickon_ok_Button();
		//

		// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
		// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
		// UploadDocumentsPage.Clickon_Choosefile_Button1();
		// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
		// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
		// UploadDocumentsPage.Clickon_Choosefile_Button1();
		// UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc"));
		// UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
		// UploadDocumentsPage.Clickon_Choosefile_Button1();
		// wait(1);
		// driver.quit();
	}

	/*
	 * To Upload Photo and Signature in New LL Module we have to Run TC003 Test case
	 */

	@Test(invocationCount = 5)
	public void TC20_UploadPhoto_Signature() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		// System.setProperty("webdriver.gecko.driver",
		// "BrowserServers\\geckodriver.exe");
		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", true);
		// capabilities.setCapability("firefox_binary",
		// new File("C:\\Program Files (x86)\\Mozilla
		// Firefox\\firefox.exe").getAbsolutePath());
		//
		// WebDriver driver = new FirefoxDriver(capabilities);
		// driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
		UploadPhoto_SignaturePage.Selectstatename(getdata("SelectState"));
		UploadPhoto_SignaturePage.Clickon_Applyonline();
		UploadPhoto_SignaturePage.Clickon_Application_Status_Link();
		// UploadPhoto_SignaturePage.Set_Application_Number(s1.substring(3).trim());
		// UploadPhoto_SignaturePage.Set_DateofBirth(s2.substring(3).trim());
		UploadPhoto_SignaturePage.Set_Application_Number(getdata("ApplicationNo"));
		UploadPhoto_SignaturePage.Set_DateofBirth(getdata("DateofBirth"));
		UploadPhoto_SignaturePage.Clickon_Submit_Button();
		UploadPhoto_SignaturePage.Clickon_Proceed_Button();
		UploadPhoto_SignaturePage.Clickon_Browse_Button1();
		UploadPhoto_SignaturePage.Clickon_Browse_Button2();
		UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
		UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
		wait(1);
		// driver.quit();
	}

	/* To Book a slot in New LL Module we have to Run TC004 Test case */

	@Test(invocationCount = 1)
	public void TC21_LLSlotBooking() throws IOException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		LLSlotBookingPage = new LLSlotBookingPagee(driver);
		LLSlotBookingPage.Selectstatename(getdata("SelectState"));
		LLSlotBookingPage.Clickon_Applyonline();
		LLSlotBookingPage.Clickon_Application_Status_Link();
		// LLSlotBookingPage.Set_Application_Number(s1.substring(3).trim());
		// LLSlotBookingPage.Set_DateofBirth(s2.substring(3).trim());
		LLSlotBookingPage.Set_Application_Number(getdata("ApplicationNo"));
		LLSlotBookingPage.Set_DateofBirth(getdata("DateofBirth"));
		LLSlotBookingPage.Clickon_Submit_Button();

		LLSlotBookingPage.Clickon_Proceed_Button();
		LLSlotBookingPage.Clickon_ProceedtoBookSlot_Button();
		LLSlotBookingPage.Booking_Slot();
		LLSlotBookingPage.Clickon_Bookslotbutton();
		LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();

	}

	/* To pay the Fee payment in New LL Module we have to Run TC005 Test case */

	@Test(invocationCount = 5)
	public void TC22_LLFEEPayment() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
		LLFEEPaymentPage.Selectstatename(getdata("SelectState"));
		LLFEEPaymentPage.Clickon_Applyonline();
		LLFEEPaymentPage.Clickon_Application_Status_Link();
		// LLFEEPaymentPage.Set_Application_Number(s1.substring(3).trim());
		// LLFEEPaymentPage.Set_DateofBirth(s2.substring(3).trim());
		LLFEEPaymentPage.Set_Application_Number(getdata("ApplicationNo"));
		LLFEEPaymentPage.Set_DateofBirth(getdata("DateofBirth"));
		LLFEEPaymentPage.Clickon_Submit_Button();
		LLFEEPaymentPage.Clickon_Proceed_Button();
		LLFEEPaymentPage.SelectBank("STATE BANK OF HYDERABAD");
		LLFEEPaymentPage.SetCaptcha();
		LLFEEPaymentPage.Clickon_Paynow_Button();
		LLFEEPaymentPage.Clickon_Checkbox();
		LLFEEPaymentPage.Clickon_Proceedforpayment();
		LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
		LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
		LLFEEPaymentPage.Clickon_PrintReceipt();
		// wait(1);
		// driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC006() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();

		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", false);
		// capabilities.setCapability("firefox_binary",
		// new File("C:\\Program Files (x86)\\Mozilla
		// Firefox\\firefox.exe").getAbsolutePath());
		// WebDriver driver = new FirefoxDriver(capabilities);
		// driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		// driver.manage().window().maximize();

		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));
		NewLLRegistrtionPage.clickonapplyonline();
		NewLLRegistrtionPage.clickonNewLearnersLicence();
		NewLLRegistrtionPage.clickonContinue();
		NewLLRegistrtionPage.clickonSubmitonebutton();
		// NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// NewLLRegistrtionPage.ClickonGenerateOTP();
		// NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		NewLLRegistrtionPage.Set_State(getdata("State"));
		NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		// NewLLRegistrtionPage.SetDistrict(getdata("District"));
		NewLLRegistrtionPage.SetTahsil(getdata("Tahsil"));
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.SetSubmitthree();
		s1 = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		s2 = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			NewLLRegistrtionPage.setdata("ApplicationNo", s1.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", s2.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
			NewLLRegistrtionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_ok_Button();
			// UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
			// UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
			// UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc"));
			// UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
			// UploadDocumentsPage.Clickon_Choosefile_Button1();
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
			LLSlotBookingPage = new LLSlotBookingPagee(driver);
			LLSlotBookingPage.Clickon_Proceed_Button();
			LLSlotBookingPage.Create_RandomDate();
			LLSlotBookingPage.Clickon_Slotbookingbutton(
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
			LLSlotBookingPage.Clickon_Bookslotbutton();
			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			capabilities.setCapability("firefox_binary",
					new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
			WebDriver driver = new FirefoxDriver(capabilities);
			driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
			driver.manage().window().maximize();

			NewLLRegistrtionPage.Clickon_Login_Button();
			NewLLRegistrtionPage.setUserName(getdata("UserName"));
			NewLLRegistrtionPage.setpassword(getdata("Password"));
			NewLLRegistrtionPage.ClickonLogin();
			NewLLRegistrtionPage.SelectRTOtype();
			NewLLRegistrtionPage.Clickonlogin();
			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_Scrutiny_Link();
			NewLLRegistrtionPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_RTOProceed_button();
			NewLLRegistrtionPage.Clickon_VerificationofDocuments_Link();
			NewLLRegistrtionPage.Clickon_prooflinks();
			// ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			// driver.switchTo().window(tabs.get(1));
			// driver.close();
			// driver.switchTo().window(tabs.get(0));
			NewLLRegistrtionPage.Clickon_Scrutinybutton();

			NewLLRegistrtionPage.Clickon_General_button();
			NewLLRegistrtionPage.Clickon_BiometricsLink();
			NewLLRegistrtionPage.Set_Application_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_Getdetails();
			NewLLRegistrtionPage.Set_CanvasSignature(
					"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas");
			NewLLRegistrtionPage.Clickon_Capturesignaturebutton();
			NewLLRegistrtionPage.Set_PhotoCapture();
			NewLLRegistrtionPage.Clickon_CropSelected();
			NewLLRegistrtionPage.Clickon_Phototriggerbutton();
			NewLLRegistrtionPage.Clickon_Snapokbutton();
			NewLLRegistrtionPage.Clickon_Savebutton();

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLTestResultsLink();
			NewLLRegistrtionPage.Set_LLApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.ClickonFetchbutton();
			NewLLRegistrtionPage.Set_TestResult("PASS");
			NewLLRegistrtionPage.ClickonbSubmitutton();

			NewLLRegistrtionPage.ClickonLL_Link();
			NewLLRegistrtionPage.ClickonLLAprovalbatchLink();
			NewLLRegistrtionPage.ClickonLLApprovalRadiobutton();
			NewLLRegistrtionPage.Set_LLApprovalApplication_Number(getdata("ApplicationNo"));
			NewLLRegistrtionPage.Clickon_LLApprovalSubmitbutton();
			NewLLRegistrtionPage.Clickon_Selectallcheckbox();
			NewLLRegistrtionPage.Clickon_Issueallbutton();
			s3 = LL_No(driver, "//table/tbody/tr/td[5]/p");
			NewLLRegistrtionPage.setdata("LLNumber", s3.substring(25, 43));

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
	}

	/* LL_Referencethrough_LL with Approval */

	@Test(invocationCount = 1)
	public void TC23_LL_Referencethrough_LL() throws IOException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		LL_Referencethrough_LL = new LL_Referencethrough_LLPage(driver);
		LL_Referencethrough_LL.Selectstatename(getdata("SelectState"));
		LL_Referencethrough_LL.clickonapplyonline();
		LL_Referencethrough_LL.clickonapplyonNewLearnersLicence();
		LL_Referencethrough_LL.clickonapplyonContinue();
		LL_Referencethrough_LL.Clickon_Applicantholds_LearnerLicence_Enter_LL_Number_Radiobutton();
		LL_Referencethrough_LL.Enter_LearningLicenceNo_Number(getdata("LearnersLicenceNumber"));
		LL_Referencethrough_LL.Enter_Dateofbirth(getdata("DateofBirth"));
		LL_Referencethrough_LL.click_Submitone();
		LL_Referencethrough_LL.click_confirm();
		LL_Referencethrough_LL.SelectCOV(getdata("COV"));
		LL_Referencethrough_LL.Clickon_Rightarrow();
		LL_Referencethrough_LL.Clickon_Submitbutton();
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			s13 = App_NO(driver, "//table/tbody/tr[1]/td[text()='Application No  ']/following-sibling::td[1]");
			LL_Referencethrough_LL.setdata("ApplicationNO", s13.substring(3).trim());

		} else {

			LL_Referencethrough_LL.setdata("ApplicationNO", "Fail");
		}

		/* Upload Documnets for LL_Referencethrough_LL */

		LL_Referencethrough_LL.Clickon_Next_Btn();
		LL_Referencethrough_LL.Clickon_Proceed_Button();
		LL_Referencethrough_LL.Clickon_ok_Button();
		LL_Referencethrough_LL.Set_FirstDocument(getdata("FirstDoc"));
		LL_Referencethrough_LL.Set_First_Proof_Document(getdata("FirstProofDoc"));
		LL_Referencethrough_LL.Set_First_Proof_Document(getdata("FirstProofDoc"));
		LL_Referencethrough_LL.Clickon_Choosefile_Button1();
		LL_Referencethrough_LL.Set_Second_Document(getdata("SecondDoc"));
		LL_Referencethrough_LL.Set_Second_Proof_Document(getdata("SecondProofDoc"));
		LL_Referencethrough_LL.Set_Second_Proof_Document(getdata("SecondProofDoc"));
		LL_Referencethrough_LL.Clickon_Choosefile_Button1();
		LL_Referencethrough_LL.Clickon_Next_Button();

		/* Fee Payment for LL_Referencethrough_LL */

		LL_Referencethrough_LL.Clickon_Proceed_Button();
		LL_Referencethrough_LL.SelectBank("STATE BANK OF HYDERABAD");
		LL_Referencethrough_LL.SetCaptcha();
		LL_Referencethrough_LL.Clickon_Paynow_Button();
		LL_Referencethrough_LL.Clickon_Checkbox();
		LL_Referencethrough_LL.Clickon_Proceedforpayment();
		LL_Referencethrough_LL.Clickon_ContinuetoLogin_Button();
		LL_Referencethrough_LL.Clickon_Pressheretocontinue_Button();
		LL_Referencethrough_LL.Clickon_Home_Button();
		driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");

		/* Logging into RTO Side Flows from Here */

		LL_Referencethrough_LL.Clickon_Login_Button();
		LL_Referencethrough_LL.setUserName(getdata("UserName"));
		LL_Referencethrough_LL.setpassword(getdata("Password"));
		LL_Referencethrough_LL.ClickonLogin();
		// Login_ScrutinyPage.SelectRTOtype();
		LL_Referencethrough_LL.SelectRTOtypo();
		LL_Referencethrough_LL.Clickonlogin();
		LL_Referencethrough_LL.Clickon_General_button();
		LL_Referencethrough_LL.Clickon_Scrutiny_Link();
		LL_Referencethrough_LL.Set_Application_Number(getdata("ApplicationNo"));
		LL_Referencethrough_LL.Clickon_Proceed_button();
		LL_Referencethrough_LL.Clickon_VerificationofDocuments_Link();
		LL_Referencethrough_LL.Clickon_prooflinks();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		LL_Referencethrough_LL.Clickon_Scrutinybutton();
		LL_Referencethrough_LL.ClickonLLLink();
		LL_Referencethrough_LL.ClickonLLAprovalbatchLink();
		LL_Referencethrough_LL.ClickonRadiobutton2();
		LL_Referencethrough_LL.Set_Application_Number(getdata("ApplicationNo"));
		LL_Referencethrough_LL.Clickon_Submitbutton();
		LL_Referencethrough_LL.Clickon_Selectallcheckbox();
		LL_Referencethrough_LL.Clickon_Issueallbutton();
		s14 = LL_No(driver, "//table/tbody/tr/td[5]/p");
		LL_Referencethrough_LL.setdata("LLNumber", s14.substring(25, 43));

	}

	/* LL_Referencethrough_DL */

	@Test(invocationCount = 1)
	public void TC24_LL_Referencethrough_DL() throws IOException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe  ");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		LL_Referencethrough_DL = new LL_Referencethrough_DLPage(driver);
		LL_Referencethrough_DL.Selectstatename(getdata("SelectState"));
		LL_Referencethrough_DL.clickonapplyonline();
		LL_Referencethrough_DL.clickonapplyonNewLearnersLicence();
		LL_Referencethrough_DL.clickonapplyonContinue();
		LL_Referencethrough_DL.Clickon_Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton();
		LL_Referencethrough_DL.Enter_Enter_Driving_Licence_Number(getdata("DrivingLicenceNumber"));
		LL_Referencethrough_DL.Enter_Dateofbirth(getdata("DateofBirth"));
		LL_Referencethrough_DL.click_Submitone();
		LL_Referencethrough_DL.click_confirm();
		LL_Referencethrough_DL.SelectCOV(getdata("COV"));
		LL_Referencethrough_DL.Clickon_Rightarrow();
		LL_Referencethrough_DL.Clickon_Submitbutton();
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {

			s12 = App_NO(driver, "//table/tbody/tr[1]/td[text()='Application No  ']/following-sibling::td[1]");
			LL_Referencethrough_DL.setdata("ApplicationNO", s12.substring(3).trim());

		} else {

			LL_Referencethrough_DL.setdata("ApplicationNO", "Fail");
		}
	}

	@Test(invocationCount = 1)
	public void TC25_LLBacklogWith_Approval() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LLBacklogwithApproval = new LL_Services(driver);
		LLBacklogwithApproval.setUserName(getdata("UserName"));
		LLBacklogwithApproval.setpassword(getdata("Password"));
		// LLBacklogwithApproval.ClickonNext();
		// LLBacklogwithApproval.setotptext("123456");
		LLBacklogwithApproval.ClickonLogin();
		LLBacklogwithApproval.SelectRTOtype();
		LLBacklogwithApproval.Clickonlogin();
		LLBacklogwithApproval.Clickon_LLLink();
		LLBacklogwithApproval.Clickon_LLBacklog();
		LLBacklogwithApproval.Set_Issuedate(getdata("Issuedate"));
		LLBacklogwithApproval.Set_OriginalLLno(getdata("OriginalLLno"));
		LLBacklogwithApproval.Set_NumaricLLNo(getdata("NumaricLLNo"));
		WebElement refno = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[2][normalize-space(text())]"));
		String text = refno.getText();
		System.out.println(text);

		LLBacklogwithApproval.setdata("RefNo", text.substring(24).trim());

		WebElement LLtext = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[3][normalize-space(text())]"));
		String LLno = LLtext.getText();
		System.out.println(text);
		LLBacklogwithApproval.setdata("LLNo", LLno.substring(17).trim());

		LLBacklogwithApproval.Clickon_LLLink();
		LLBacklogwithApproval.Clickon_LLBacklogApprove();
		LLBacklogwithApproval.Clickon_LLBacklogApplicationno();
		LLBacklogwithApproval.Clickon_LLBacklogApplicationnoProceed();
		LLBacklogwithApproval.Clickon_LLBacklogApprovebutton();

	}

	@Test(invocationCount = 1)
	public void TC26_LLBacklogwithApproval_Service_ChangeofAddress() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ChangeofAddress = new LL_Services(driver);
		ChangeofAddress.setUserName(getdata("UserName"));
		ChangeofAddress.setpassword(getdata("Password"));
		// ChangeofAddress.ClickonNext();
		// ChangeofAddress.setotptext("123456");
		ChangeofAddress.ClickonLogin();
		ChangeofAddress.SelectRTOtype();
		ChangeofAddress.Clickonlogin();
		ChangeofAddress.Clickon_LLLink();
		ChangeofAddress.Clickon_LLBacklog();
		ChangeofAddress.Set_Issuedate(getdata("Issuedate"));
		ChangeofAddress.Set_OriginalLLno(getdata("OriginalLLno"));
		ChangeofAddress.Set_NumaricLLNo(getdata("NumaricLLNo"));
		WebElement refno = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[2][normalize-space(text())]"));
		String text = refno.getText();
		System.out.println(text);

		ChangeofAddress.setdata("RefNo", text.substring(24).trim());

		WebElement LLtext = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[3][normalize-space(text())]"));
		String LLno = LLtext.getText();
		System.out.println(text);
		ChangeofAddress.setdata("LLNo", LLno.substring(17).trim());

		ChangeofAddress.Clickon_LLLink();
		ChangeofAddress.Clickon_LLBacklogApprove();
		ChangeofAddress.Clickon_LLBacklogApplicationno();
		ChangeofAddress.Clickon_LLBacklogApplicationnoProceed();
		ChangeofAddress.Clickon_LLBacklogApprovebutton();
		wait(2);
		ChangeofAddress.clickonLogout();
		wait(2);
		ChangeofAddress.clickonapplyonline();
		ChangeofAddress.clickonServicesonLL();
		ChangeofAddress.SetTextinLearnersLicencenumber(getdata("LLNo"));
		ChangeofAddress.SetTextinDateofBirth(getdata("DateofBirth"));
		ChangeofAddress.ClickonProceedbutton();
		ChangeofAddress.ClickonConfirmbtn();
		ChangeofAddress.ClickonGobutton();
		ChangeofAddress.ClickChangeofAddressinLLCheckbox();
		ChangeofAddress.ClickonSubmitbuttoninSelectService();
		ChangeofAddress.ClickonPresentAddress();
		ChangeofAddress.SelectSubDist(getdata("SubDist"));
		ChangeofAddress.SelectVillage(getdata("Village"));
		ChangeofAddress.SetHouseno(getdata("Houseno"));
		ChangeofAddress.SetPincode(getdata("Pincode"));
		ChangeofAddress.SetPhoneNo(getdata("Mobilephone"));
		ChangeofAddress.ClickonConfirmbutton();

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("LL Transactions")) {

			WebElement Appno = driver
					.findElement(By.xpath("//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]"));
			String App = Appno.getText();
			System.out.println(App);
			ChangeofAddress.setdata("ApplicationNo", App.substring(3).trim());
			ChangeofAddress.setdata("Status", "Pass");
			ChangeofAddress.ClickonExitbutton();
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
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ChangeofAddress.setUserName(getdata("UserName"));
			ChangeofAddress.setpassword(getdata("Password"));
			ChangeofAddress.ClickonLogin();
			ChangeofAddress.SelectRTOtype();
			ChangeofAddress.Clickonlogin();
			ChangeofAddress.Clickon_General_button();
			ChangeofAddress.Clickon_Scrutiny_Link();
			ChangeofAddress.Set_RTOApplication_Number(getdata("ApplicationNo"));
			ChangeofAddress.Clickon_RTOProceed_button();
			ChangeofAddress.Clickon_VerificationofDocuments_Link();
			ChangeofAddress.Clickon_prooflinks();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			ChangeofAddress.Clickon_Scrutinybutton();

			ChangeofAddress.Clickon_LLLink();
			ChangeofAddress.Clickon_LLENDORSEMENTAPPROVAL();
			ChangeofAddress.Clickon_LLENDORSEMENTAPPROVALApplicationNo(getdata("ApplicationNo"));
			ChangeofAddress.Clickon_LLEndorsementApprovebutton();
			ChangeofAddress.Clickon_Backbutton();

			// ChangeofAddress.Clickon_LLLink();
			// ChangeofAddress.Clickon_LLPrinting();
			// ChangeofAddress.Clickon_LLPrintingusingApplicationnumber();
			// ChangeofAddress.Set_LLPrintingusingApplicationnumber(getdata("ApplicationNo"));
			// ChangeofAddress.Clickon_Viewapplications();
			// ChangeofAddress.Clickon_LLPrintLink();

		} else {
			ChangeofAddress.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC27_LLBacklogwithApproval_Service_ChangeofName() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ChangeofName = new LL_Services(driver);
		ChangeofName.setUserName(getdata("UserName"));
		ChangeofName.setpassword(getdata("Password"));
		// ChangeofName.ClickonNext();
		// ChangeofName.setotptext("123456");
		ChangeofName.ClickonLogin();
		ChangeofName.SelectRTOtype();
		ChangeofName.Clickonlogin();
		ChangeofName.Clickon_LLLink();
		ChangeofName.Clickon_LLBacklog();
		ChangeofName.Set_Issuedate(getdata("Issuedate"));
		ChangeofName.Set_OriginalLLno(getdata("OriginalLLno"));
		ChangeofName.Set_NumaricLLNo(getdata("NumaricLLNo"));
		WebElement refno = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[2][normalize-space(text())]"));
		String text = refno.getText();
		System.out.println(text);

		ChangeofName.setdata("RefNo", text.substring(24).trim());

		WebElement LLtext = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[3][normalize-space(text())]"));
		String LLno = LLtext.getText();
		System.out.println(text);
		ChangeofName.setdata("LLNo", LLno.substring(17).trim());

		ChangeofName.Clickon_LLLink();
		ChangeofName.Clickon_LLBacklogApprove();
		ChangeofName.Clickon_LLBacklogApplicationno();
		ChangeofName.Clickon_LLBacklogApplicationnoProceed();
		ChangeofName.Clickon_LLBacklogApprovebutton();
		wait(2);
		ChangeofName.clickonLogout();
		wait(2);
		ChangeofName.clickonapplyonline();
		ChangeofName.clickonServicesonLL();
		ChangeofName.SetTextinLearnersLicencenumber(getdata("LLNo"));
		ChangeofName.SetTextinDateofBirth(getdata("DateofBirth"));
		ChangeofName.ClickonProceedbutton();
		ChangeofName.ClickonConfirmbtn();
		ChangeofName.ClickonGobutton();
		ChangeofName.ClickChangeofNameinLLCheckbox();
		ChangeofName.ClickonSubmitbuttoninSelectService();
		ChangeofName.Set_FullNameasPerRecords();
		ChangeofName.Set_Firstname();
		ChangeofName.Set_Lastname();
		ChangeofName.Set_Reason();
		ChangeofName.Set_EffectiveDate();
		ChangeofName.ClickonConfirmButon();

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("LL Transactions")) {

			WebElement Appno = driver
					.findElement(By.xpath("//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]"));
			String App = Appno.getText();
			System.out.println(App);
			ChangeofName.setdata("ApplicationNo", App.substring(3).trim());
			ChangeofName.setdata("Status", "Pass");
			ChangeofName.ClickonExitbutton();
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
			UploadDocumentsPage.Clickon_Proceed_Button();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			// LLFEEPaymentPage.Clickon_PrintReceipt();
			// LLFEEPaymentPage.Clickon_Home_Button();

			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			ChangeofName.setUserName(getdata("UserName"));
			ChangeofName.setpassword(getdata("Password"));
			ChangeofName.ClickonLogin();
			ChangeofName.SelectRTOtype();
			ChangeofName.Clickonlogin();
			ChangeofName.Clickon_General_button();
			ChangeofName.Clickon_Scrutiny_Link();
			ChangeofName.Set_RTOApplication_Number(getdata("ApplicationNo"));
			ChangeofName.Clickon_RTOProceed_button();
			ChangeofName.Clickon_VerificationofDocuments_Link();
			ChangeofName.Clickon_prooflinksinLLChangeofname();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			ChangeofName.Clickon_Scrutinybutton();

			ChangeofName.Clickon_LLLink();
			ChangeofName.Clickon_LLENDORSEMENTAPPROVAL();
			ChangeofName.Clickon_LLENDORSEMENTAPPROVALApplicationNo(getdata("ApplicationNo"));
			ChangeofName.Clickon_LLEndorsementApprovebutton();
			ChangeofName.Clickon_Backbutton();

			// ChangeofName.Clickon_LLLink();
			// ChangeofName.Clickon_LLPrinting();
			// ChangeofName.Clickon_LLPrintingusingApplicationnumber();
			// ChangeofName.Set_LLPrintingusingApplicationnumber(getdata("ApplicationNo"));
			// ChangeofName.Clickon_Viewapplications();
			// ChangeofName.Clickon_LLPrintLink();

		} else {
			ChangeofName.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test(invocationCount = 1)
	public void TC28_LLBacklogwithApproval_Service_DuplicateLL() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DuplicateLL = new LL_Services(driver);
		DuplicateLL.setUserName(getdata("UserName"));
		DuplicateLL.setpassword(getdata("Password"));
		// DuplicateLL.ClickonNext();
		// DuplicateLL.setotptext("123456");
		DuplicateLL.ClickonLogin();
		DuplicateLL.SelectRTOtype();
		DuplicateLL.Clickonlogin();
		DuplicateLL.Clickon_LLLink();
		DuplicateLL.Clickon_LLBacklog();
		DuplicateLL.Set_Issuedate(getdata("Issuedate"));
		DuplicateLL.Set_OriginalLLno(getdata("OriginalLLno"));
		DuplicateLL.Set_NumaricLLNo(getdata("NumaricLLNo"));
		WebElement refno = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[2][normalize-space(text())]"));
		String text = refno.getText();
		System.out.println(text);

		DuplicateLL.setdata("RefNo", text.substring(24).trim());

		WebElement LLtext = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[3][normalize-space(text())]"));
		String LLno = LLtext.getText();
		System.out.println(text);
		DuplicateLL.setdata("LLNo", LLno.substring(17).trim());

		DuplicateLL.Clickon_LLLink();
		DuplicateLL.Clickon_LLBacklogApprove();
		DuplicateLL.Clickon_LLBacklogApplicationno();
		DuplicateLL.Clickon_LLBacklogApplicationnoProceed();
		DuplicateLL.Clickon_LLBacklogApprovebutton();
		wait(2);
		DuplicateLL.clickonLogout();
		wait(2);
		DuplicateLL.clickonapplyonline();
		DuplicateLL.clickonServicesonLL();
		DuplicateLL.SetTextinLearnersLicencenumber(getdata("LLNo"));
		DuplicateLL.SetTextinDateofBirth(getdata("DateofBirth"));
		DuplicateLL.ClickonProceedbutton();
		DuplicateLL.ClickonConfirmbtn();
		DuplicateLL.ClickonGobutton();
		DuplicateLL.ClickonDuplicateLLCheckbox();
		DuplicateLL.ClickonSubmitbuttoninSelectService();
		DuplicateLL.Set_ReasonfotDuplicateLL();
		DuplicateLL.Clickon_ConfirmbtnatduplicateLL();

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("LL Transactions")) {

			WebElement Appno = driver
					.findElement(By.xpath("//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]"));
			String App = Appno.getText();
			System.out.println(App);
			DuplicateLL.setdata("ApplicationNo", App.substring(3).trim());
			DuplicateLL.setdata("Status", "Pass");
			DuplicateLL.Clickon_ExitbuttoninDuplicateLL();
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
			// UploadDocumentsPage.Clickon_Next_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			// LLFEEPaymentPage.Clickon_PrintReceipt();
			// LLFEEPaymentPage.Clickon_Home_Button();
			driver.navigate().to(
					"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
			DuplicateLL.setUserName(getdata("UserName"));
			DuplicateLL.setpassword(getdata("Password"));
			DuplicateLL.ClickonLogin();
			DuplicateLL.SelectRTOtype();
			DuplicateLL.Clickonlogin();
			DuplicateLL.Clickon_General_button();
			DuplicateLL.Clickon_Scrutiny_Link();
			DuplicateLL.Set_RTOApplication_Number(getdata("ApplicationNo"));
			DuplicateLL.Clickon_RTOProceed_button();
			DuplicateLL.Clickon_VerificationofDocuments_Link();
			DuplicateLL.Clickon_prooflinksinDuplicateLL();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			DuplicateLL.Clickon_Scrutinybutton();

			DuplicateLL.Clickon_LLLink();
			DuplicateLL.Clickon_LLENDORSEMENTAPPROVAL();
			DuplicateLL.Clickon_LLENDORSEMENTAPPROVALApplicationNo(getdata("ApplicationNo"));
			DuplicateLL.Clickon_LLEndorsementApprovebutton();
			DuplicateLL.Clickon_Backbutton();

			DuplicateLL.Clickon_LLLink();
			DuplicateLL.Clickon_LLPrinting();
			DuplicateLL.Clickon_LLPrintingusingApplicationnumber();
			DuplicateLL.Set_LLPrintingusingApplicationnumber(getdata("ApplicationNo"));
			DuplicateLL.Clickon_Viewapplications();
			DuplicateLL.Clickon_LLPrintLink();

		} else {
			DuplicateLL.setdata("Status", "Fail");
			driver.close();
		}

	}

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();

		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);

		List<WebElement> ele = driver.findElements(By.xpath("//select[@name='stName']"));

		int size = ele.size();

		System.out.println("Total Selectbox Count :" + size);

		for (WebElement display : ele) {

			String txt = display.getText();
			System.out.println(txt.trim());
			NewLLRegistrtionPage.setdata("re", txt);

		}

		NewLLRegistrtionPage.Selectstatename(getdata("SelectState"));

		// NewLLRegistrtionPage.clickonapplyonline();
		// NewLLRegistrtionPage.clickonNewLearnersLicence();
		// NewLLRegistrtionPage.clickonContinue();
		// NewLLRegistrtionPage.clickonSubmitonebutton();
		// // NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
		// // NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
		// // NewLLRegistrtionPage.ClickonGenerateOTP();
		// // NewLLRegistrtionPage.EnterOTP(otptextineKYCform);
		// // NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
		// NewLLRegistrtionPage.Set_State(getdata("SelectState"));
		//
		// List<WebElement> rto =
		// driver.findElements(By.xpath("//select[@name='licenceFromRTO']"));
		// int lst = rto.size();
		// System.out.println(lst);
		//
		// for (WebElement txt : rto) {
		//
		// String ls = txt.getText();
		// System.out.println(ls);
		//
		// String r = "LUCKNOW (RTO) -- UP32";
		// System.out.println(r.substring(17, 21).trim());
		//
		// if (ls.contains(r.substring(17, 21).trim())) {
		//
		// NewLLRegistrtionPage.Set_RTO_Office(getdata("RTO"));
		// NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		// NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		//
		// driver.navigate().to(
		// "https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		//
		// NewLLRegistrtionPage.setUserName(getdata("UserName"));
		// NewLLRegistrtionPage.setpassword(getdata("Password"));
		// // LLBacklogwithApproval.ClickonNext();
		// // LLBacklogwithApproval.setotptext("123456");
		// NewLLRegistrtionPage.ClickonLogin();
		//
		// WebElement text = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
		// String te = text.getText();
		// System.out.println(te.trim());
		//
		// if (r.substring(17, 21).trim().equalsIgnoreCase(te)) {
		// System.out.println("Pass");
		// NewLLRegistrtionPage.SelectRTOtype();
		// NewLLRegistrtionPage.Clickonlogin();
		//
		// }
		//
		// }
		//
		// }

	}

	public static Boolean CaptureSignaturetest(WebDriver dr, String ObjectXpath) {
		Boolean stepStatus = true;
		try {

			WebElement text = dr.findElement(By.xpath(ObjectXpath));
			Actions actionBuilder = new Actions(dr);
			Action drawAction = actionBuilder.moveToElement(text, 660, 96).click().clickAndHold(text)
					.moveByOffset(120, 120).moveByOffset(60, 70).moveByOffset(-140, -140).release(text).build();
			drawAction.perform();

		} catch (Exception e) {

			stepStatus = false;
		}
		return stepStatus;
	}

	@Test
	public void Retest() throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "BrowserServers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		capabilities.setCapability("firefox_binary",
				new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());

		WebDriver ff = new FirefoxDriver(capabilities);
		ff.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		ff.findElement(By.xpath("//input[@name='username']")).sendKeys("rtoauthup32");
		ff.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		ff.findElement(By.xpath("//input[@name='submit']")).click();
		ff.findElement(By.xpath("//input[@id='crd1'][1]")).click();
		ff.findElement(By.xpath("//input[@id='login']")).click();
		ff.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a")).click();
		ff.findElement(By.xpath("//a[text()='CAPTURE PHOTO & SIGNATURE']")).click();
		ff.findElement(By.xpath("//input[@name='appnumber']")).sendKeys("513919");
		ff.findElement(By.xpath("//button[@id='thumbdetform__populateData']")).click();

		WebElement element = ff.findElement(By.xpath(
				"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas"));

		Actions builder = new Actions(ff);
		Action drawAction = builder.moveToElement(element, 135, 15) // start points x axis and y axis.
				.click().moveByOffset(200, 60) // 2nd points (x1,y1)
				.click().moveByOffset(100, 70)// 3rd points (x2,y2)
				.doubleClick().build();
		drawAction.perform();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//button[@id='capBtn']")).click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//div[@class='dojoTab']/div/span[text()='Photo Capture']")).click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//li[@class='crop']")).click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//li[@class='trigger']")).click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//input[@id='photoCaptre']")).click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//div[@class='col-md-12 top-space text-center']/input[1]")).click();
		wait(2);

	}
}
