package testScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import applicationPages.NewDLUploadDocumentsPage;
import applicationPages.UploadDocumentsPage;
import applicationPages.UploadPhoto_SignaturePage;
import applicationPages.HoldingForeignDL;
import applicationPages.LLFEEPaymentPagee;
import applicationPages.NewDLFeePaymentPage;
import applicationPages.NewDLSlotBookingPage;
import applicationPages.NewDLSubmissionPage;
import frameworkLibrary.BaseClass;

public class NewDL extends BaseClass {
	WebDriver driver;
	NewDLSubmissionPage NewDLSubmissionPage;
	NewDLUploadDocumentsPage NewDLUploadDocumentsPage;
	NewDLFeePaymentPage NewDLFeePaymentPage;
	NewDLSlotBookingPage NewDLSlotBookingPage;
	HoldingForeignDL HoldingForeignDLPage;
	UploadDocumentsPage UploadDocumentsPage;
	UploadPhoto_SignaturePage UploadPhoto_SignaturePage;
	LLFEEPaymentPagee LLFEEPaymentPage;

	@Test(invocationCount = 1)
	public void TC201_NewDLSubmissionPage() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		driver.manage().window().maximize();
		NewDLSubmissionPage = new NewDLSubmissionPage(driver);
		// NewDLSubmissionPage.Set_State(getdata("SelectState"));
		// NewDLSubmissionPage.Selectstatename(getdata("SelectState"));
		NewDLSubmissionPage.clickonapplyonline();
		NewDLSubmissionPage.clickon_NewDrivinglicence();
		NewDLSubmissionPage.clickon_Contuinebutton();
		NewDLSubmissionPage.Set_LearnersLicenceNumber(getdata("LLNumber"));
		NewDLSubmissionPage.Set_DateofBirth(getdata("DateofBirth"));
		NewDLSubmissionPage.clickon_Okbutton();
		NewDLSubmissionPage.clickon_Selectallcheckbox();
		NewDLSubmissionPage.clickon_Submitbutton();
		s4 = DL_App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		NewDLSubmissionPage.setdata("NewDLApplicationno", s4.substring(3));

	}

	@Test(invocationCount = 4)
	public void TC202() {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		driver.manage().window().maximize();
		NewDLUploadDocumentsPage = new NewDLUploadDocumentsPage(driver);
		NewDLUploadDocumentsPage.Clickon_Applyonline();
		NewDLUploadDocumentsPage.Clickon_Application_Status_Link();
		NewDLUploadDocumentsPage.Set_Application_Number(getdata("NewDLApplicationno"));
		NewDLUploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
		NewDLUploadDocumentsPage.Clickon_Submit_Button();
		NewDLUploadDocumentsPage.Clickon_Proceed_Button();
		NewDLUploadDocumentsPage.Clickon_ok_Button();
		NewDLUploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
		NewDLUploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
		NewDLUploadDocumentsPage.Clickon_Choosefile_Button1();
		NewDLUploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
		NewDLUploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
		NewDLUploadDocumentsPage.Clickon_Choosefile_Button2();
		wait(1);
		driver.quit();

	}

	@Test(invocationCount = 4)
	public void TC203() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		driver.manage().window().maximize();
		NewDLFeePaymentPage = new NewDLFeePaymentPage(driver);
		NewDLFeePaymentPage.Clickon_Applyonline();
		NewDLFeePaymentPage.Clickon_Application_Status_Link();
		NewDLFeePaymentPage.Set_Application_Number(getdata("NewDLApplicationno"));
		NewDLFeePaymentPage.Set_DateofBirth(getdata("DateofBirth"));
		NewDLFeePaymentPage.Clickon_Submit_Button();
		NewDLFeePaymentPage.Clickon_Proceed_Button();
		NewDLFeePaymentPage.SelectBank("ANDRA BANK");
		NewDLFeePaymentPage.SetCaptcha();
		NewDLFeePaymentPage.Clickon_Paynow_Button();
		NewDLFeePaymentPage.Clickon_Checkbox();
		NewDLFeePaymentPage.Clickon_Proceedforpayment();
		NewDLFeePaymentPage.Clickon_ContinuetoLogin_Button();
		NewDLFeePaymentPage.Clickon_Pressheretocontinue_Button();
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 4)
	public void TC204() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelectBean.do");
		driver.manage().window().maximize();

		NewDLSlotBookingPage = new NewDLSlotBookingPage(driver);
		NewDLSlotBookingPage.Clickon_Applyonline();
		NewDLSlotBookingPage.Clickon_Application_Status_Link();
		NewDLSlotBookingPage.Set_Application_Number(getdata("NewDLApplicationno"));
		NewDLSlotBookingPage.Set_DateofBirth(getdata("DateofBirth"));
		NewDLSlotBookingPage.Clickon_Submit_Button();
		NewDLSlotBookingPage.Clickon_Proceed_Button();
		NewDLSlotBookingPage.Clickon_Selectcov();
		NewDLSlotBookingPage.Clickon_Proceedbook();
		NewDLSlotBookingPage.Create_RandomDate();
		NewDLSlotBookingPage.Clickon_Slotbookingbutton(
				"//table[@class='table table-bordered table-striped table-hover']/tbody/tr/td[2]/span",
				"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[2]/input");
		NewDLSlotBookingPage.Clickon_Bookslotbutton();
		NewDLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 4)
	public void TC_HoldingForeignDL() throws IOException {

		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		HoldingForeignDLPage = new HoldingForeignDL(driver);
		HoldingForeignDLPage.Selectstatename(getdata("SelectState"));
		HoldingForeignDLPage.clickonapplyonline();
		HoldingForeignDLPage.clickon_NewDrivinglicence();
		HoldingForeignDLPage.clickon_Contuinebutton();
		HoldingForeignDLPage.Clickon_HoldingForeignDL();
		HoldingForeignDLPage.Enter_LicenseNo(getdata("LicenseNo"));
		HoldingForeignDLPage.Enter_IssueAuthority(getdata("IssueAuthority"));
		HoldingForeignDLPage.Enter_Dateofissueity(getdata("Dateofissueity"));
		// HoldingForeignDLPage.Enter_ValidFrom(getdata("ValidFrom"));
		HoldingForeignDLPage.Enter_ValidTo(getdata("ValidTo"));
		HoldingForeignDLPage.Enter_ClassofVehicles_Skills(getdata("ClassofVehicles_Skills"));
		HoldingForeignDLPage.Enter_PassportNo(getdata("PassportNo"));
		HoldingForeignDLPage.SelectDLIssueCountry(getdata("IssueAuthority"));
		HoldingForeignDLPage.SetFirstName(getdata("FirstName"));
		HoldingForeignDLPage.SetMiddlename(getdata("Middlename"));
		HoldingForeignDLPage.SetLastName(getdata("LastName"));
		HoldingForeignDLPage.SetRelationType(getdata("RelationType"));
		HoldingForeignDLPage.SetRelationFirstName(getdata("RelationFirstName"));
		HoldingForeignDLPage.SetRelationMiddleName(getdata("RelationMiddleName"));
		HoldingForeignDLPage.SetRelationLastName(getdata("RelationLastName"));
		HoldingForeignDLPage.SetGender();
		HoldingForeignDLPage.SetAge(getdata("Age"));
		HoldingForeignDLPage.SetQualification(getdata("Qualification"));
		HoldingForeignDLPage.SetBloodgroup(getdata("Bloodgroup"));
		HoldingForeignDLPage.Enter_MobileNumber(getdata("MobileNumber"));
		HoldingForeignDLPage.clickon_AddressDetails();
		HoldingForeignDLPage.SetStatee(getdata("SelectState"));
		wait(1);
		HoldingForeignDLPage.SetDistrict(getdata("District"));
		HoldingForeignDLPage.SetTahsil(getdata("Tahsil"));
		HoldingForeignDLPage.SetVillage(getdata("Village"));
		HoldingForeignDLPage.SetHouseno(getdata("Houseno"));
		// HoldingForeignDLPage.SetLandMark(getdata("LandMark"));
		HoldingForeignDLPage.SetPincode(getdata("Pincode"));
		HoldingForeignDLPage.SetLandMarkCopy(getdata("LandMark"));
		HoldingForeignDLPage.SetState(getdata("SelectState"));
		HoldingForeignDLPage.SetRTO(getdata("RTO"));
		HoldingForeignDLPage.SetTahsil(getdata("Tahsil"));
		HoldingForeignDLPage.SetPincode(getdata("Pincode"));
		HoldingForeignDLPage.SetCOV(getdata("COV"));
		HoldingForeignDLPage.ClickRightarrow();
		HoldingForeignDLPage.SetSubmitthree();
//
//		HolidingforeignDLApplicationNo = App_NO(driver,
//				"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
//
//		HolidingforeignDLDateofBirth = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
//
//		String title = driver.getTitle();
//		if (title.equals("Application Number")) {
//
//			HoldingForeignDLPage.setdata("ApplicationNo", HolidingforeignDLApplicationNo.substring(3).trim());
//			HoldingForeignDLPage.setdata("DateofBirth", s2.substring(3).trim());
//			HoldingForeignDLPage.setdata("Status", "Pass");
//			HoldingForeignDLPage.Clickon_Exitbutton();
//			UploadDocumentsPage = new UploadDocumentsPage(driver);
//			UploadDocumentsPage.Clickon_Applyonline();
//			UploadDocumentsPage.Clickon_Application_Status_Link();
//			// UploadDocumentsPage.Set_Application_Number(s1.substring(3).trim());
//			// UploadDocumentsPage.Set_DateofBirth(s2.substring(3).trim());
//			UploadDocumentsPage.Set_Application_Number(getdata("ApplicationNo"));
//			UploadDocumentsPage.Set_DateofBirth(getdata("DateofBirth"));
//			UploadDocumentsPage.Clickon_Submit_Button();
//			UploadDocumentsPage.Clickon_Proceed_Button();
//			UploadDocumentsPage.Clickon_Submit1_Button();
//			UploadDocumentsPage.Clickon_ok_Button();
//			UploadDocumentsPage.Set_FirstDocument(getdata("FirstDoc"));
//			UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
//			UploadDocumentsPage.Set_First_Proof_Document(getdata("FirstProofDoc"));
//			UploadDocumentsPage.Clickon_Choosefile_Button1();
//			UploadDocumentsPage.Set_Second_Document(getdata("SecondDoc"));
//			UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
//			UploadDocumentsPage.Set_Second_Proof_Document(getdata("SecondProofDoc"));
//			UploadDocumentsPage.Clickon_Choosefile_Button1();
////			UploadDocumentsPage.Set_Third_Document(getdata("ThirdDoc"));
////			UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
////			UploadDocumentsPage.Set_Third_Proof_Document(getdata("ThirdProofDoc"));
////			UploadDocumentsPage.Clickon_Choosefile_Button1();
//			UploadDocumentsPage.Set_Fourth_Document(getdata("FourthDoc"));
//			UploadDocumentsPage.Set_Fourth_Proof_Document(getdata("FourthDocProof"));
//			UploadDocumentsPage.Set_Fourth_Proof_Document(getdata("FourthDocProof"));
//			UploadDocumentsPage.Clickon_Choosefile_Button1();
////			UploadDocumentsPage.Set_Fifth_Document(getdata("FifthDoc"));
////			UploadDocumentsPage.Set_Fifth_Proof_Document(getdata("FifthDocProof"));
////			UploadDocumentsPage.Set_Fifth_Proof_Document(getdata("FifthDocProof"));
////			UploadDocumentsPage.Clickon_Choosefile_Button1();
////			UploadDocumentsPage.Clickon_Nextbuttonafterfivedocs();
////			UploadDocumentsPage.Clickon_Proceed_Button();
////			UploadDocumentsPage.Clickon_Submit1_Button();
////			UploadDocumentsPage.Clickon_ok_Button();
////			UploadDocumentsPage.Set_Sixth_Document(getdata("SixthDoc"));
////			UploadDocumentsPage.Set_Sixth_Proof_Document(getdata("SixthDocProof"));
////			UploadDocumentsPage.Set_Sixth_Proof_Document(getdata("SixthDocProof"));
////			UploadDocumentsPage.Clickon_Choosefile_Button1();
////			UploadDocumentsPage.Set_Seventh_Document(getdata("SeventhDoc"));
////			UploadDocumentsPage.Set_Seventh_Proof_Document(getdata("SeventhDocProof"));
////			UploadDocumentsPage.Set_Seventh_Proof_Document(getdata("SeventhDocProof"));
////			UploadDocumentsPage.Clickon_Choosefile_Button1();
//			WebElement txtmesgpath = driver
//					.findElement(By.xpath("//div[@class='col-md-12 text-success text-center']/h3/label"));
//			String text = txtmesgpath.getText();
//			System.out.println(text);
//			UploadDocumentsPage.Clickon_Nextbuttonafterfivedocs();
//			UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
//			UploadPhoto_SignaturePage.Clickon_Proceed_Button();
//			UploadPhoto_SignaturePage.Clickon_Browse_Button1();
//			UploadPhoto_SignaturePage.Clickon_Browse_Button2();
//			UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
//			UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
//			UploadPhoto_SignaturePage.Clickon_Next();
////			LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
////			LLFEEPaymentPage.Clickon_Proceed_Button();
////			LLFEEPaymentPage.SelectBank("ANDRA BANK");
////			LLFEEPaymentPage.SetCaptcha();
////			LLFEEPaymentPage.Clickon_Paynow_Button();
////			LLFEEPaymentPage.Clickon_Checkbox();
////			LLFEEPaymentPage.Clickon_Proceedforpayment();
////			LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
////			wait(3);
////			LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
////
////			// LLFEEPaymentPage.Clickon_Home_Button();
////
////			HoldingForeignDLPage.Clickon_Login_Button();
////			HoldingForeignDLPage.setUserName(getdata("UserName"));
////			HoldingForeignDLPage.setpassword(getdata("Password"));
////			HoldingForeignDLPage.ClickonLogin();
////			HoldingForeignDLPage.SelectRTOtype();
////			HoldingForeignDLPage.Clickonlogin();
////			HoldingForeignDLPage.Clickon_General_button();
////			HoldingForeignDLPage.Clickon_Scrutiny_Link();
////			HoldingForeignDLPage.Set_RTOApplication_Number(getdata("ApplicationNo"));
////			HoldingForeignDLPage.Clickon_RTOProceed_button();
////			HoldingForeignDLPage.Clickon_VerificationofDocuments_Link();
////			// HoldingForeignDLPage.Clickon_prooflinks();
////
////			List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr/td[2]/following-sibling::td[1]/i"));
////
////			for (WebElement links : ele) {
////
////				String txt = links.getText();
////				System.out.println(txt);
////				links.click();
////
////			}
////
////			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
////			driver.switchTo().window(tabs.get(1));
////			driver.close();
////			driver.switchTo().window(tabs.get(0));
////			HoldingForeignDLPage.Clickon_Scrutinybutton();
//
//		} else {
//
//			System.out.println("New LL Acknowledgement is not Generated");
//			HoldingForeignDLPage.setdata("Status", "Fail");
//			driver.close();
//		}

	}

}
