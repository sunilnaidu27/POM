package applicationPages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class Flows extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;
	UploadDocumentsPage UploadDocumentsPage;
	UploadPhoto_SignaturePage UploadPhoto_SignaturePage;
	LLSlotBookingPagee LLSlotBookingPage;
	LLFEEPaymentPagee LLFEEPaymentPage;
	UniversalState universalstate;
	Commom_RTO_Menu menuitem;
	LoginRTO RTO;
	ScrutinyPage Scrutiny;

	public Flows(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void VerifyFlows() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//button[@id='trsaction_ack_nextStatus']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("(//table)[4]/tbody/tr/td[@id='statusId']"));
		int count = ele.size();

		for (int i = 0; i < count; i++) {
			ele = driver.findElements(By.xpath("(//table)[4]/tbody/tr/td[@id='statusId']"));
			WebElement webele = ele.get(i);
			String text = webele.getText();
			if (!text.contains("Completed")) {

				WebElement Flowtext = driver.findElement(By
						.xpath("(//table)[4]/tbody/tr[" + 1 + "+" + i + "]/td[@id='statusId']/preceding-sibling::td"));
				String flowtext = Flowtext.getText();

				if (flowtext.contains("UPLOAD DOCUMENTS")) {
					UploadDocumentsPage = new UploadDocumentsPage(driver);
					UploadDocumentsPage.Clickon_Proceed_Button();
					UploadDocumentsPage.Clickon_Submit1_Button();
					UploadDocumentsPage.Clickon_ok_Button();

				} else if (flowtext.contains("UPLOAD PHOTO AND SIGNATURE")) {

					UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
					UploadPhoto_SignaturePage.Clickon_Proceed_Button();
					UploadPhoto_SignaturePage.Clickon_Browse_Button1();
					UploadPhoto_SignaturePage.Clickon_Browse_Button2();
					UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
					UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
					UploadPhoto_SignaturePage.Clickon_Next();

				} else if (flowtext.contains("FEE PAYMENT")) {

					LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
					LLFEEPaymentPage.Clickon_Proceed_Button();
					LLFEEPaymentPage.SelectBank("STATE BANK OF HYDERABAD");
					LLFEEPaymentPage.SetCaptcha();
					LLFEEPaymentPage.Clickon_Paynow_Button();
					LLFEEPaymentPage.Clickon_Checkbox();
					LLFEEPaymentPage.Clickon_Proceedforpayment();
					LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
					LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
					LLFEEPaymentPage.Clickon_Home_Button();

				} else if (flowtext.contains("LL SLOT BOOK")) {

					LLSlotBookingPage = new LLSlotBookingPagee(driver);
					LLSlotBookingPage.Clickon_Proceed_Button();
					LLSlotBookingPage.Booking_Slot();
					LLSlotBookingPage.Clickon_Bookslotbutton();
					LLSlotBookingPage.Clickon_Confirm_slotbookingbutton();
					LLSlotBookingPage.Clickon_Next();

				} else {

					System.out.println(flowtext + "Applicant Flow is Not Availble");
				}

			} else {
				System.out.println("Flow Completed");
			}

		}
		Verify_ApplicationCurrentStatus();
		RTOLevel_Status();
	}

	public void Verify_ApplicationCurrentStatus() {
		boolean status = driver.findElement(By.xpath("//h3[text()='Application is under processing at RTO Level.']"))
				.isDisplayed();
		if (status == true) {
			System.out.println("Applicatioin is under processing at RTO Level.Please wait starting RTO process");
			Login();
		} else {
			System.out.println("Please Check Application Status");
		}

	}

	public void Login() {
		RTO = new LoginRTO(driver);
		driver.navigate().to(
				"https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		RTO.setUserName(getdata("UserName"));
		RTO.setpassword(getdata("Password"));
		RTO.ClickonLogin();
	}

	public void RTOLevel_Status() {
		menuitem = new Commom_RTO_Menu(driver);
		menuitem.Clickon_Misc();
		menuitem.Click_on_applicationstatus();
		menuitem.EnterApplicationNumber(getdata("ApplicationNo"));
		menuitem.Click_on_viewflows();
		Initiate_RTO_Flows();

	}

	public void Initiate_RTO_Flows() {

		boolean status = driver.findElement(By.xpath("//h3[text()='Application is under processing at RTO Level.']"))
				.isDisplayed();
		if (status == true) {
			WebElement rtoflowstatus = driver.findElement(By.xpath(
					"//h3[text()='Application is under processing at RTO Level.']/following::table[1]/tbody/tr/td[2]"));
			String rtoflowtext = rtoflowstatus.getText();
			System.out.println(rtoflowtext);
			if (rtoflowtext.contains("SCRUTINY - (Document Verification)")) {
				menuitem.Click_on_processflow();
				Scrutiny = new ScrutinyPage(driver);
				Scrutiny.Clickon_VerificationofDocuments_Link();
				Scrutiny.Clickon_prooflinks();
				Scrutiny.Clickon_Scrutinybutton();
				RTOLevel_Status();
			} else if (rtoflowtext.contains("CAPTURE PHOTO & SIGNATURE OFAPPLICANT")) {
				wait(2);
				menuitem.Click_on_processflow();
				System.out.println("Starting Capture Photo & Signature Flow");
				CapturePhotoandSignature();

			} else if (rtoflowtext.contains("")) {

			} else if (rtoflowtext.contains("")) {

			} else {
				System.out.println("There is no RTO Flow found");
			}

		}

	}
	
	
	public void CapturePhotoandSignature() {
		System.setProperty("webdriver.gecko.driver", "BrowserServers\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.camera", 1);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get(
				"https://sarathicov.nic.in:8443/cas/login?service=https%3A%2F%2Fsarathicov.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_CapturebiometricsPage Login_CapturebiometricsPage = new Login_CapturebiometricsPage(driver);
		Login_CapturebiometricsPage.setUserName(getdata("UserName"));
		Login_CapturebiometricsPage.setpassword(getdata("Password"));
		Login_CapturebiometricsPage.SetCaptcha();
		Login_CapturebiometricsPage.Clickonsubmit();
		Login_CapturebiometricsPage.Clickon_General_button();
		Login_CapturebiometricsPage.Clickon_BiometricsLink();
		Login_CapturebiometricsPage.Set_Application_Number(getdata("ApplicationNo"));
		Login_CapturebiometricsPage.Clickon_Getdetails();
		Login_CapturebiometricsPage.Set_CanvasSignature("#thecanvas");
		Login_CapturebiometricsPage.Clickon_Capturesignaturebutton();
		Login_CapturebiometricsPage.Set_PhotoCapture();
		Login_CapturebiometricsPage.Clickon_CropSelected();
		Login_CapturebiometricsPage.Clickon_Phototriggerbutton();
		Login_CapturebiometricsPage.Clickon_Snapokbutton();
		Login_CapturebiometricsPage.Clickon_Savebutton();
	}

}
