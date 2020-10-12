package testScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import applicationPages.LLFEEPaymentPagee;
import applicationPages.LLSlotBookingPagee;
import applicationPages.Login_CapturebiometricsPage;
import applicationPages.New_CLSubmissionPage;
import applicationPages.UploadDocumentsPage;
import applicationPages.UploadPhoto_SignaturePage;
import frameworkLibrary.BaseClass;

public class _08_CL_Applicant_Flows_Module extends BaseClass {

	WebDriver driver;

	New_CLSubmissionPage CLSubmissionPage;
	UploadDocumentsPage UploadDocumentsPage;
	UploadPhoto_SignaturePage UploadPhoto_SignaturePage;
	LLSlotBookingPagee LLSlotBookingPage;
	LLFEEPaymentPagee LLFEEPaymentPage;
	


	@Test
	public void TC900() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
//		System.setProperty("webdriver.gecko.driver", "BrowserServers\\geckodriver.exe");	
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", false);
//		capabilities.setCapability("firefox_binary",
//				new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
//		WebDriver driver = new FirefoxDriver(capabilities);
//		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
//		driver.manage().window().maximize();
		CLSubmissionPage = new New_CLSubmissionPage(driver);
		CLSubmissionPage.Selectstatename(getdata("CLState"));
		CLSubmissionPage.Clickon_Applyonline();
		CLSubmissionPage.Clickon_NewConductorLicence();
		CLSubmissionPage.Clickon_Continue();
		CLSubmissionPage.Clickon_CLState(getdata("CLState"));
		CLSubmissionPage.Clickon_CLRTO(getdata("CLRTO"));
		CLSubmissionPage.Enter_CLFirstname(getdata("CLFirstName"));
		CLSubmissionPage.Enter_CLMiddlename(getdata("CLMiddleName"));
		CLSubmissionPage.Enter_CLLastname(getdata("CLLastName"));
		CLSubmissionPage.Select_CLRelationname(getdata("CLRName"));
		CLSubmissionPage.Enter_CLRFirstname(getdata("CLRFName"));
		CLSubmissionPage.Enter_CLRMiddlename(getdata("CLRMName"));
		CLSubmissionPage.Enter_CLRLastname(getdata("CLRLName"));
		CLSubmissionPage.Select_CLGender();
		CLSubmissionPage.Select_CLAge(getdata("CLAge"));
		CLSubmissionPage.Select_CLEducation(getdata("CLEducation"));
		CLSubmissionPage.Enter_CLMobilenumber(getdata("CLMobile"));
		CLSubmissionPage.Clickon_AddressTab();
		CLSubmissionPage.Select_StateSelectionin_AddressTab(getdata("State"));
		CLSubmissionPage.Select_DistrictSelectionin_AddressTab(getdata("District"));
		CLSubmissionPage.Select_TahsilSelectionin_AddressTab(getdata("Tahsil"));
		CLSubmissionPage.Enter_HouseNumber(getdata("HouseNo"));
		CLSubmissionPage.Enter_StreetAddress(getdata("Street"));
		CLSubmissionPage.Enter_Pincode(getdata("Pincode"));
		CLSubmissionPage.Clickon_Checkbox();
		CLSubmissionPage.Clickon_MedicalDetailsTab();
		CLSubmissionPage.Enter_FAIssuing_InstitutionName_In_First_Aid_Details(getdata("InstituteName"));
		CLSubmissionPage.Enter_Certification_Number_In_First_Aid_Details(getdata("CertificateNo"));
		CLSubmissionPage.Enter_PlaceofIssued_In_First_Aid_Details("testplace");
		CLSubmissionPage.Enter_Issued_Date_In_First_Aid_Details(getdata("IssueDate"));
		CLSubmissionPage.Enter_Fitness_CertificateNo_In_MedicalFitness(getdata("FitnessCertificateNo"));
		CLSubmissionPage.Enter_Doctor_Name_In_MedicalFitness("Kethrin");
		CLSubmissionPage.Enter_RegistrationNo_of_Doctor_In_MedicalFitness("RegNoOfDoct");
		CLSubmissionPage.Enter_ClinicName_and_Place_In_MedicalFitness("ClinicName");
		CLSubmissionPage.Enter_IssueeDate_In_MedicalFitness(getdata("MedicalIssuedate"));
		CLSubmissionPage.Clickon_Question();
		CLSubmissionPage.Clickon_Submitbutton();
		
		CLApplicationnumber =App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		CLDateofBirth = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("NewCLHome")) {

			CLSubmissionPage.setdata("ApplicationNo", CLApplicationnumber.substring(3).trim());
			CLSubmissionPage.setdata("DateofBirth", CLDateofBirth.substring(3).trim());
			CLSubmissionPage.setdata("Status", "Pass");
			CLSubmissionPage.Clickon_Exitbutton();
			UploadDocumentsPage = new UploadDocumentsPage(driver);
			UploadDocumentsPage.Clickon_Applyonline();
			UploadDocumentsPage.Clickon_Application_Status_Link();
			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
			UploadDocumentsPage.Clickon_Submit_Button();
			UploadDocumentsPage.Clickon_Proceed_Button();
			UploadDocumentsPage.Clickon_ok_Button();
//			UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
//			UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
//			UploadDocumentsPage.Clickon_Choosefile_Button1();
//			UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
//			UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
//			UploadDocumentsPage.Clickon_Choosefile_Button1();
//			UploadDocumentsPage.Clickon_Next_Button();
			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
			UploadPhoto_SignaturePage.Clickon_Next();
//			LLSlotBookingPage = new LLSlotBookingPagee(driver);
//			LLSlotBookingPage.Clickon_Proceed_Button();
//			LLSlotBookingPage.Create_RandomDate();
//			LLSlotBookingPage.Clickon_Slotbookingbutton(
//					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/label",
//					"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
//			LLSlotBookingPage.Clickon_Bookslotbutton();
//			LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
//			LLSlotBookingPage.Clickon_Next();
			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
			LLFEEPaymentPage.Clickon_Proceed_Button();
			LLFEEPaymentPage.SelectBank("ANDRA BANK");
			LLFEEPaymentPage.SetCaptcha();
			LLFEEPaymentPage.Clickon_Paynow_Button();
			LLFEEPaymentPage.Clickon_Checkbox();
			LLFEEPaymentPage.Clickon_Proceedforpayment();
			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
			wait(1);
			driver.navigate().to("https://s4preprod.nic.in:8443/sarathiservice/cancelViewStatus.do");
			CLSubmissionPage.Clickon_Login_Button();
			CLSubmissionPage.setUserName(getdata("UserName"));
			CLSubmissionPage.setpassword(getdata("Password"));
			CLSubmissionPage.ClickonLogin();
			CLSubmissionPage.SelectRTOtype();
			//CLSubmissionPage.SelectRTOtypo();
			CLSubmissionPage.Clickonlogin();
			CLSubmissionPage.Clickon_General_button();
			CLSubmissionPage.Clickon_Scrutiny_Link();
			CLSubmissionPage.Set_Application_Number(getdata("ApplicationNo"));
			CLSubmissionPage.Clickon_Proceed_button();
			CLSubmissionPage.Clickon_VerificationofDocuments_Link();
			CLSubmissionPage.Clickon_prooflinks();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			CLSubmissionPage.Clickon_Scrutinybutton();
		
			CaptureBioMetrics();
			
			CLSubmissionPage.Clickon_CLLink();
			CLSubmissionPage.Clickon_CLTest();
			CLSubmissionPage.Enter_CLApplicationno(getdata("ApplicationNo"));
			CLSubmissionPage.Clickon_fetchdetails();
			CLSubmissionPage.Select_TestResult(getdata("PASS"));
			CLSubmissionPage.Clickon_Subbutton();
			CLSubmissionPage.Clickon_ApproveofNewCL();
			CLSubmissionPage.Enter_CLAppno(getdata("ApplicationNo"));
			CLSubmissionPage.Clickon_proceedCLAppno();
			CLSubmissionPage.Clickon_ApproveNewCL();
			
			
			WebElement text =driver.findElement(By.xpath("//form[@id='newCLApproval_execute']/div[1]/div[2]/h3[1]"));
			System.out.println(text.getText());
			if(isDisplayed(text)) {
			
			CLLicencenumber = App_NO(driver, "//form[@id='newCLApproval_execute']/div[1]/div[2]/h4[1]");
			CLSubmissionPage.setdata("", CLLicencenumber.substring(18).trim());
			CLBadgenumber=App_NO(driver, "//form[@id='newCLApproval_execute']/div[1]/div[2]/h4[2]");
			CLSubmissionPage.setdata("", CLBadgenumber.substring(16).trim());
			
			}else {
				
				System.out.println("Please Check Once");
			}
			/* if we want do pending for want of , Reject We can use below code */
			
//			CLSubmissionPage.Select_Selectoptionsforpendingforwantof(getdata("pendingforwantof"));
//			CLSubmissionPage.Clickon_Rightarrow();
//			CLSubmissionPage.Clickon_Pendingforwantof();
//			CLSubmissionPage.Clickon_Reject();
//			CLSubmissionPage.Clickon_Exit();
//			CLSubmissionPage.Clickon_home();
			

		} else {

			System.out.println("New LL Acknowledgement is not Generated");
			CLSubmissionPage.setdata("Status", "Fail");
			driver.close();
		}
		
	}
	
	@Test
	public void CaptureBioMetrics() {
		
		System.setProperty("webdriver.gecko.driver", "BrowserServers\\geckodriver.exe");	
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", false);
		capabilities.setCapability("firefox_binary",
				new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		wait(2);
		CLSubmissionPage.setUserName(getdata("UserName"));
		CLSubmissionPage.setpassword(getdata("Password"));
		CLSubmissionPage.ClickonLogin();
		CLSubmissionPage.SelectRTOtype();
		//CLSubmissionPage.SelectRTOtypo();
		CLSubmissionPage.Clickonlogin();
		CLSubmissionPage.Clickon_General_button();
		CLSubmissionPage.Clickon_BiometricsLink();
		CLSubmissionPage.Set_Application_Num(getdata("ApplicationNo"));
		CLSubmissionPage.Clickon_Getdetails();
		CLSubmissionPage.Set_CanvasSignature(
				"html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas");
		CLSubmissionPage.Clickon_Capturesignaturebutton();
		CLSubmissionPage.Set_PhotoCapture();
		CLSubmissionPage.Clickon_CropSelected();
		CLSubmissionPage.Clickon_Phototriggerbutton();
		CLSubmissionPage.Clickon_Snapokbutton();
		CLSubmissionPage.Clickon_Savebutton();
		
		
		
	}
	
	
	
	@Test(invocationCount=1)
	public void ServicesonCL() {
	
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		
		
		
		
		
		
	}

}
