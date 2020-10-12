package testScripts;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import applicationPages.Login_CapturebiometricsPage;
import applicationPages.DL_Login_ScrutinyPage;
import applicationPages.DL_Login_CapturebiometricsPage;
import applicationPages.Login_DLTestResultsPage;
import applicationPages.Login_DLApprovalPage;
import frameworkLibrary.BaseClass;

public class _04_DL_RTO_Flows_Module extends BaseClass {
	WebDriver driver;

	DL_Login_ScrutinyPage Login_ScrutinyPage;
	DL_Login_CapturebiometricsPage Login_CapturebiometricsPage;
	Login_DLTestResultsPage Login_DLTestResultsPage;
	Login_DLApprovalPage Login_DLApprovalPage;

	@Test(invocationCount = 5)
	public void TC301() throws ClassNotFoundException, SQLException {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		driver.manage().window().maximize();
		Login_ScrutinyPage = new DL_Login_ScrutinyPage(driver);
		Login_ScrutinyPage.Clickon_Login_Button();
		Login_ScrutinyPage.setUserName(getdata("UserName"));
		Login_ScrutinyPage.setpassword(getdata("Password"));
		Login_ScrutinyPage.ClickonLogin();
		Login_ScrutinyPage.SelectRTOtype();
		Login_ScrutinyPage.Clickonlogin();
		Login_ScrutinyPage.Clickon_General_button();
		Login_ScrutinyPage.Clickon_Scrutiny_Link();
		Login_ScrutinyPage.Set_Application_Number(getdata("ApplicationNo"));
		Login_ScrutinyPage.Clickon_Proceed_button();
		Login_ScrutinyPage.Clickon_VerificationofDocuments_Link();
		Login_ScrutinyPage.Clickon_prooflinks();
		Login_ScrutinyPage.Clickon_Scrutinybutton();
	
	}

	@Test(invocationCount = 5)
	public void TC302() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", false);
		capabilities.setCapability("firefox_binary",
				new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		driver.manage().window().maximize();
		Login_CapturebiometricsPage = new DL_Login_CapturebiometricsPage(driver);
		Login_CapturebiometricsPage.Clickon_Login_Button();
		Login_CapturebiometricsPage.setUserName(getdata("UserName"));
		Login_CapturebiometricsPage.setpassword(getdata("Password"));
		Login_CapturebiometricsPage.ClickonLogin();
		Login_CapturebiometricsPage.SelectRTOtype();
		Login_CapturebiometricsPage.Clickonlogin();
		Login_CapturebiometricsPage.Clickon_General_button();
		Login_CapturebiometricsPage.Clickon_BiometricsLink();
		Login_CapturebiometricsPage.Set_Application_Number(getdata("ApplicationNo"));
		Login_CapturebiometricsPage.Clickon_Getdetails();
		Login_CapturebiometricsPage.Set_CanvasSignature("thecanvas");
		Login_CapturebiometricsPage.Clickon_Capturesignaturebutton();
		Login_CapturebiometricsPage.Set_PhotoCapture();
		Login_CapturebiometricsPage.Clickon_CropSelected();
		Login_CapturebiometricsPage.Clickon_Phototriggerbutton();
		Login_CapturebiometricsPage.Clickon_Snapokbutton();
		Login_CapturebiometricsPage.Clickon_Savebutton();
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 2)
	public void TC303() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		driver.manage().window().maximize();
		Login_DLTestResultsPage = new Login_DLTestResultsPage(driver);
		Login_DLTestResultsPage.Clickon_Login_Button();
		Login_DLTestResultsPage.setUserName(getdata("UserName"));
		Login_DLTestResultsPage.setpassword(getdata("Password"));
		Login_DLTestResultsPage.ClickonLogin();
		Login_DLTestResultsPage.SelectRTOtype();
		Login_DLTestResultsPage.Clickonlogin();
		Login_DLTestResultsPage.ClickonDLLINK();
		Login_DLTestResultsPage.ClickonDLTest();
		Login_DLTestResultsPage.Set_Applicationnumber(getdata("ApplicationNo"));
		Login_DLTestResultsPage.ClickonGetdetails();
		Login_DLTestResultsPage.ClickonResult();
		Login_DLTestResultsPage.Set_Vehno("ap05nm8888");
		Login_DLTestResultsPage.ClickonConfirm();
		Login_DLTestResultsPage.ClickonConfirmcheck();
		Login_DLTestResultsPage.ClickonSubmit();
		wait(1);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void TC304() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		driver.manage().window().maximize();
		Login_DLApprovalPage = new Login_DLApprovalPage(driver);
		Login_DLApprovalPage.Clickon_Login_Button();
		Login_DLApprovalPage.setUserName(getdata("UserName"));
		Login_DLApprovalPage.setpassword(getdata("Password"));
		Login_DLApprovalPage.ClickonLogin();
		Login_DLApprovalPage.SelectRTOtype();
		Login_DLApprovalPage.Clickonlogin();

		Login_DLApprovalPage.ClickonDL();
		Login_DLApprovalPage.ClickonApprovalDL();
		Login_DLApprovalPage.Set_Applicationnumber(getdata("ApplicationNo"));
		Login_DLApprovalPage.ClickonProceed();
		Login_DLApprovalPage.ClickonApprove();
		s5=DL_No(driver, "//div[@class='col-md-12 text-center']/h4");
		Login_DLApprovalPage.setdata("DLNumber", s5.substring(74).trim());

	}

}