package applicationPages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Services extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public Services(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/* Applying Service 526 */
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "(//li)[15]/a")
	WebElement ServicesonDL;
	@FindBy(how = How.XPATH, using = "//select[@name='stfNameId']")
	WebElement StateSelection;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(how = How.XPATH, using = "//input[@name='dlno']")
	WebElement DLnumber;
	@FindBy(how = How.XPATH, using = "//input[@name='dob']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@value='GO']")
	WebElement Gobutton;
	@FindBy(how = How.XPATH, using = "//select[@name='dispDLDet']")
	WebElement ConfirmedthattheaboveDrivingLicencedetailsaremine;
	@FindBy(how = How.XPATH, using = "//select[@name='stateCodeDLTr']")
	WebElement SubmitRequestStateSelection;
	@FindBy(how = How.XPATH, using = "//select[@name='rtoCodeDLTr']")
	WebElement SubmitRequestRTOSelection;
	@FindBy(how = How.XPATH, using = "//input[@name='dlconfirm']")
	WebElement Proceedbutton;
	@FindBy(how = How.XPATH, using = "//input[@name='enve.confirm']")
	WebElement Confirmbutton;
	@FindBy(how = How.XPATH, using = "//input[@value='CHANGE OF NAME IN DL']")
	WebElement ChangeofnameinDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement Proceed1;
	@FindBy(how = How.XPATH, using = "//select[@id='conreasoncd']")
	WebElement SelectreasonforChangeofName;
	@FindBy(how = How.XPATH, using = "//input[@id='fname']")
	WebElement Newname;
	@FindBy(how = How.XPATH, using = "//select[@name='swd']")
	WebElement Relation1;
	@FindBy(how = How.XPATH, using = "//input[@name='connaturalname']")
	WebElement FullNameasperRecords;
	@FindBy(how = How.XPATH, using = "//input[@name='effdate']")
	WebElement EffectiveFrom;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement Confirm;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement Disclaimer;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement Captcha1;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptcha;
	@FindBy(how = How.XPATH, using = "//input[@id='subToDB']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement Applicationno;

	/* Applying Service - 515 */

	@FindBy(how = How.XPATH, using = "//input[@value='CHANGE OF ADDRESS IN DL']")
	WebElement ChangeofAddressinDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinDLService;
	@FindBy(how = How.XPATH, using = "//input[@value='Permanent']")
	WebElement Permanent;
	@FindBy(how = How.XPATH, using = "//input[@value='Present']")
	WebElement PresentAddress;
	@FindBy(how = How.XPATH, using = "//input[@value='Both']")
	WebElement BothAddresses;
	@FindBy(how = How.XPATH, using = "//select[@name='prmStateCoa']")
	WebElement StateinDLService;
	@FindBy(how = How.XPATH, using = "//select[@name='prmDistCoa']")
	WebElement DistrictinDLService;
	@FindBy(how = How.XPATH, using = "//select[@name='prmMandalCoa']")
	WebElement Tahsil;
	@FindBy(how = How.XPATH, using = "//input[@name='prmPincodeCoa']")
	WebElement PincodeinDLService;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinDLService;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainDLService;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinDLService;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinDLService;

	/* Applying RenewalService -- 514 */
	@FindBy(how = How.XPATH, using = "//input[@value='RENEWAL OF DL']")
	WebElement RenewalofDL;

	/* Applying IssueofDuplicateDLService -- 513 */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE OF DUPLICATE DL']")
	WebElement IssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//select[@name='dupreasoncd']")
	WebElement ReasontoissueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofduplicateDL;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinIssueofduplicateDL;

	/* ReplacementofDL -- 516 */

	@FindBy(how = How.XPATH, using = "//input[@value='REPLACEMENT OF DL']")
	WebElement ReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainReplacementofDL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinReplacementofDL;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinReplacementofDL;

	/* IssueofNOC -- 522 */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE OF NOC']")
	WebElement IssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionstateCodeDLTr']")
	WebElement StateinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionrtoCodeDLTr']")
	WebElement RTOinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//select[@name='ionreasoncd']")
	WebElement ReasonforNOCinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofNOC;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofNOC;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinIssueofNOC;

	/* DL Extract -- 523 */
	@FindBy(how = How.XPATH, using = "//input[@value='DL EXTRACT']")
	WebElement DLExtract;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinDLExtract;
	@FindBy(how = How.XPATH, using = "//select[@name='dlextractreasoncd']")
	WebElement ReasonforDLExtract;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminDLExtract;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinDLExtract;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainDLExtract;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainDLExtract;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinDLExtract;

	/* Issue of International Driving Permit -- 525 */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE INTERNATIONAL DRIVING PERMIT']")
	WebElement IssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//input[@name='pofbirth']")
	WebElement BirthPlace;
	@FindBy(how = How.XPATH, using = "//select[@name='country']")
	WebElement BirthCountry;
	@FindBy(how = How.XPATH, using = "//input[@name='passno']")
	WebElement PassportNumber;
	@FindBy(how = How.XPATH, using = "//input[@name='passvaltill']")
	WebElement PassportValidtill;
	@FindBy(how = How.XPATH, using = "//select[@name='tovisit']")
	WebElement CountryforwhichVISAisgranted;
	@FindBy(how = How.XPATH, using = "//input[@name='visano']")
	WebElement VisaNumber;
	@FindBy(how = How.XPATH, using = "//input[@name='visavaltill']")
	WebElement VisaValidtill;
	@FindBy(how = How.XPATH, using = "//select[@name='cov_req']")
	WebElement COVgradesforwhichIDPisrequested;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofInterNationalDrivingPermit;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofInterNationalDrivingPermit;

	/* Change of BioMetrics in DL -- 528 */

	@FindBy(how = How.XPATH, using = "//input[@value='CHANGE OF BIOMETRICS IN DL']")
	WebElement CHANGE_OF_BIOMETRICS_IN_DL;
	@FindBy(how = How.XPATH, using = "//select[@id='cobreasoncd']")
	WebElement SelectChangeofBiometricsinDL;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminCHANGE_OF_BIOMETRICS_IN_DL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinCHANGE_OF_BIOMETRICS_IN_DL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainCHANGE_OF_BIOMETRICS_IN_DL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainCHANGE_OF_BIOMETRICS_IN_DL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinCHANGE_OF_BIOMETRICS_IN_DL;

	/* Issue of PSVBadge to Driver -- 519 */

	@FindBy(how = How.XPATH, using = "//input[@value='ISSUE OF PSV BADGE TO A DRIVER']")
	WebElement IssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinIssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//input[@name='issPsvDet']")
	WebElement SelectClassofVehile;
	@FindBy(how = How.XPATH, using = "//select[@name='firstTrngInstt']")
	WebElement First_Aid_Training_Institute;
	@FindBy(how = How.XPATH, using = "//input[@name='enrollno']")
	WebElement Enrollment_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='enrollDt']")
	WebElement Enrollment_Date;
	@FindBy(how = How.XPATH, using = "//input[@name='certno']")
	WebElement Certificate_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='certDt']")
	WebElement Certificate_Date;
	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminIssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinIssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainIssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainIssueofPSVBadge_to_a_Driver;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinIssueofPSVBadge_to_a_Driver;

	/* RE-VALIDATION OF EXPIRED DL -- 537 */

	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinRevalidationofExpiredDL;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinRevalidationofExpiredDL;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainRevalidationofExpiredDL;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainRevalidationofExpiredDL;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinRevalidationofExpiredDL;
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]")
	WebElement ApplicationnoinRevalidationofExpiredDL;

	/* ENDORSEMENT TO DRIVE IN HILL REGION -- 524 */

	@FindBy(how = How.XPATH, using = "//input[@value='ENDORSEMENT TO DRIVE IN HILL REGION']")
	WebElement ENDORSEMENTTODRIVEINHILLREGION;

	@FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
	WebElement ProceedinENDORSEMENTTODRIVEINHILLREGION;

	@FindBy(how = How.XPATH, using = "//input[@id='hillcertificate']")
	WebElement Certificateno;
	@FindBy(how = How.XPATH, using = "//select[@name='hilldrivingschool']")
	WebElement Issuedby;

	@FindBy(how = How.XPATH, using = "//input[@value='Confirm']")
	WebElement ConfirminENDORSEMENTTODRIVEINHILLREGION;
	@FindBy(how = How.XPATH, using = "//input[@name='disclaimer']")
	WebElement DisclaimerinENDORSEMENTTODRIVEINHILLREGION;
	@FindBy(how = How.XPATH, using = "//span[@id='captchaViewer']/text()")
	WebElement CaptchainENDORSEMENTTODRIVEINHILLREGION;
	@FindBy(how = How.XPATH, using = "//input[@name='captchaByApplicant']")
	WebElement EnterCaptchainENDORSEMENTTODRIVEINHILLREGION;
	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement SubmitinENDORSEMENTTODRIVEINHILLREGION;

	public void selectgradeidp() {
		WebElement ele = driver.findElement(By.xpath("//select[@name='cov_req']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i <= options.size() - 1; i++) {

			try {
				ele = driver.findElement(By.xpath("//select[@name='cov_req']"));
				s = new Select(ele);
				options = s.getOptions();
				if (!options.get(1).getText().contains("Select")) {

					System.out.println(options.get(1).getText());
					s.selectByVisibleText(options.get(1).getText());
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@FindBy(how = How.XPATH, using = "//button[@name='dlservices.exit']")
	WebElement Exit;

	public void Clickon_Exitbutton() {
		stepstatus = basepage.clickElement(Exit);
		reportEvent(stepstatus, "Able to Click Exit", "Unable to Click Exit", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Home']")
	WebElement TempHomebutton;

	public void Clickon_TempHomebutton() {

		stepstatus = basepage.clickElement(TempHomebutton);
		reportEvent(stepstatus, "Able to click On TempHomebutton", "UnAble to click On TempHomebutton", driver);
	}

	public void Upload_Documents() throws IOException, InterruptedException {

		UploadDocumentsPage UploadDocumentsPage = new UploadDocumentsPage(driver);
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

	}

	public void Uploadphoto_Signature() {
		UploadPhoto_SignaturePage UploadPhoto_SignaturePage = new UploadPhoto_SignaturePage(driver);
		UploadPhoto_SignaturePage.Clickon_Proceed_Button();
		UploadPhoto_SignaturePage.Clickon_Browse_Button1();
		UploadPhoto_SignaturePage.Clickon_Browse_Button2();
		UploadPhoto_SignaturePage.Clickon_UploadandViewfiles();
		UploadPhoto_SignaturePage.Clickon_SavephotoandSignature();
		UploadPhoto_SignaturePage.Clickon_Next();
	}

	public void Feepayment() {
		LLFEEPaymentPagee LLFEEPaymentPage = new LLFEEPaymentPagee(driver);
		LLFEEPaymentPage.Clickon_Proceed_Button();
		LLFEEPaymentPage.SelectBank("ANDRA BANK");
		LLFEEPaymentPage.SetCaptcha();
		LLFEEPaymentPage.Clickon_Paynow_Button();
		LLFEEPaymentPage.Clickon_Checkbox();
		LLFEEPaymentPage.Clickon_Proceedforpayment();
		LLFEEPaymentPage.Clickon_ContinuetoLogin_Button();
		LLFEEPaymentPage.Clickon_Pressheretocontinue_Button();
		LLFEEPaymentPage.Clickon_Home_Button();

	}

	/* Slots */
	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement ProceedforRenualService;
	@FindBy(how = How.XPATH, using = "//input[@id='dispappldetformDTApp_PROCEEDTOBOOK']")
	WebElement ProceedtoBookSlot;
	@FindBy(how = How.XPATH, using = "//input[@id='slotcnfrmbtn']")
	WebElement Confirm_slotbook;

	public void SlotBooking() {

		stepstatus = basepage.clickElement(ProceedforRenualService);
		reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);

		stepstatus = basepage.clickElement(ProceedtoBookSlot);
		reportEvent(stepstatus, "Able to click ProceedtoBookSlot button", "Unable to click ProceedtoBookSlot button",
				driver, true);

		DateFormat dateFormat = new SimpleDateFormat("d");
		Date date = new Date();
		String strDate = dateFormat.format(date);
		System.out.println("Today Date is\t" + strDate);
		Random r = new Random();
		int low = 29;
		int high = 31;
		int result = r.nextInt(high - low) + low;
		System.out.println("Random Number is\t" + Integer.toString(result));

		if (strDate.equals(Integer.toString(result))) {

			System.out.println("Today Date & Generated Random Number is Same");

		} else {

			try {

				List<WebElement> GreenColordates = driver
						.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
				int totalgreencolordates = GreenColordates.size();
				System.out.println("Total Green Color Dates Available in Calender is:\t" + totalgreencolordates);
				for (WebElement GreenColordatesText : GreenColordates) {
					String text = GreenColordatesText.getText();
					System.out.println(text);
					if (text.contains(Integer.toString(result))) {
						GreenColordatesText.click();
						System.out.println(Integer.toString(result) + "\tis Selected");
						List<WebElement> Totaltimingslotsavailable = driver.findElements(By.xpath(
								"//table[@class='table table-bordered table-striped']//following-sibling::tr/td[1]"));
						int availableslots = Totaltimingslotsavailable.size();
						System.out.println("Total Available Timing Slots in a day is :: " + availableslots);

						List<WebElement> s = driver.findElements(By.xpath(
								"//table[@class='table table-bordered table-striped']//following-sibling::tr/td[2]/label"));
						// System.out.println(s.size());
						for (int i = 0; i < availableslots; i++) {

							WebElement slots = Totaltimingslotsavailable.get(i);
							String Timeslottext = slots.getText();
							System.out.println(Timeslottext);
							String totalavailableseatsineach_timimgslot = s.get(i).getText();
							System.out.println("Time Slots is : " + Timeslottext + " & Available Seats is :: "
									+ totalavailableseatsineach_timimgslot);
							if (!totalavailableseatsineach_timimgslot.equals("0")) {

								System.out.println("******");

								List<WebElement> radio = driver.findElements(By.xpath(
										"//table[@class='table table-bordered table-striped']//following-sibling::tr/td/input"));
								System.out.println(radio.size());

								for (int j = 0; j < radio.size(); j++) {

									WebElement wbradio = radio.get(j);
									if (isEnabled(wbradio)) {
										wbradio.click();
										break;

									}
								}
								break;
							}

						}
						break;
					}
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		stepstatus = basepage.clickElement(Confirm_slotbook);
		reportEvent(stepstatus, "Able to click Confirm_slotbook", "Unable to  click Confirm_slotbook", driver, true);

	}

	/* Scrutiny */
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement Username;

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

	@FindBy(how = How.XPATH, using = "//input[@id='crd2']")
	WebElement Radiobutton1;

	public void SelectRTOtypo() {
		stepstatus = basepage.clickElement(Radiobutton1);
		reportEvent(stepstatus, "Able to click on Radiobutton", "Unable to click on Radiobutton", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	WebElement loogin;

	public void Clickonloogin() {
		stepstatus = basepage.clickElement(loogin);
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
		// reportEvent(stepstatus, "Able to click on VerificationofDocuments_Link",
		// "Unable to click on VerificationofDocuments_Link", driver);
		// wait(2);
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

	public void Clickon_prooflinksforthreedocs() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String firstprooftitle = driver.getTitle();
		System.out.println(firstprooftitle);
		// basepage.SwitchtoWindowByTitle(firstprooftitle, driver);
		basepage.closeWindowByTitle(firstprooftitle, driver);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		basepage.clickElement(Secondprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String Secondprooftitle = driver.getTitle();
		System.out.println(Secondprooftitle);
		// basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		basepage.closeWindowByTitle(Secondprooftitle, driver);

		// basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		// basepage.clickElement(Thirdprooflink);
		// basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		// basepage.closeWindowByTitle(":::Image Displaying:::", driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		basepage.clickElement(Thirdprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String Thirdprooftitle = driver.getTitle();
		System.out.println(Thirdprooftitle);
		// basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		basepage.closeWindowByTitle(Thirdprooftitle, driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		// basepage.closeWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		basepage.SwitchtoWindowByTitle("Scrutiny", driver);

	}

	public void Clickon_prooflinksfortwodocs() {
		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String firstprooftitle = driver.getTitle();
		System.out.println(firstprooftitle);
		// basepage.SwitchtoWindowByTitle(firstprooftitle, driver);
		basepage.closeWindowByTitle(firstprooftitle, driver);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		basepage.clickElement(Secondprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String Secondprooftitle = driver.getTitle();
		System.out.println(Secondprooftitle);
		// basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		basepage.closeWindowByTitle(Secondprooftitle, driver);

		// basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		// basepage.clickElement(Thirdprooflink);
		// basepage.SwitchtoWindowByTitle(":::Image Displaying:::", driver);
		// basepage.closeWindowByTitle(":::Image Displaying:::", driver);

		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		basepage.clickElement(windowSubmit);
		// basepage.closeWindowByTitle("Documents Approved by Approval Authority",
		// driver);
		basepage.SwitchtoWindowByTitle("Scrutiny", driver);

	}

	public void Clickon_prooflinksforsingledocs() {

		wait(2);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);
		wait(1);
		basepage.clickElement(Firstprooflink);
		basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver);
		String firstprooftitle = driver.getTitle();
		System.out.println(firstprooftitle);
		// basepage.SwitchtoWindowByTitle(firstprooftitle, driver);
		basepage.closeWindowByTitle(firstprooftitle, driver);
		basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority", driver);

		/*
		 * Second Document
		 * 
		 * basepage.clickElement(Secondprooflink);
		 * basepage.SwitchtoWindowByTitle("search-dms (196*246)", driver); String
		 * Secondprooftitle = driver.getTitle(); System.out.println(Secondprooftitle);
		 * // basepage.SwitchtoWindowByTitle(Secondprooftitle, driver);
		 * basepage.closeWindowByTitle(Secondprooftitle, driver);
		 * basepage.SwitchtoWindowByTitle("Documents Approved by Approval Authority",
		 * driver);
		 * 
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

	/* Capture Bio-Metrics */

	public void CaptureBioMetrics() {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", false);
		capabilities.setCapability("firefox_binary",
				new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		WebDriver driver = new FirefoxDriver(capabilities);

		driver.get(
				"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Login_CapturebiometricsPage Login_CapturebiometricsPage = new Login_CapturebiometricsPage(driver);
		// Login_CapturebiometricsPage.Clickon_Login_Button();
		Login_CapturebiometricsPage.setUserName(getdata("UserName"));
		Login_CapturebiometricsPage.setpassword(getdata("Password"));
		Login_CapturebiometricsPage.ClickonLogin();
		Login_CapturebiometricsPage.SelectRTOtype();
		Login_CapturebiometricsPage.Clickonlogin();
		Login_CapturebiometricsPage.Clickon_General_button();
		Login_CapturebiometricsPage.Clickon_BiometricsLink();
		Login_CapturebiometricsPage.Set_Application_Number(getdata("ApplicationNo"));
		// Login_CapturebiometricsPage.Set_Application_Number("510419");
		Login_CapturebiometricsPage.Clickon_Getdetails();
		Login_CapturebiometricsPage.Set_CanvasSignature("#thecanvas");
		Login_CapturebiometricsPage.Clickon_Capturesignaturebutton();
		Login_CapturebiometricsPage.Set_PhotoCapture();
		// Login_CapturebiometricsPage.Clickon_CropSelected();
		Login_CapturebiometricsPage.Clickon_Phototriggerbutton();
		Login_CapturebiometricsPage.Clickon_Snapokbutton();
		Login_CapturebiometricsPage.Clickon_Savebutton();
		wait(1);
		driver.quit();
	}

	@FindBy(how = How.XPATH, using = "//a[text()='CAPTURE PHOTO & SIGNATURE']")
	WebElement Biometrics;
	@FindBy(how = How.XPATH, using = "//input[@name='appnumber']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//button[@id='thumbdetform__populateData']")
	WebElement Getdetails;
	@FindBy(how = How.XPATH, using = "html/body/div/div/div[3]/div/div[1]/div[2]/div/div/form/div[4]/div/div/div[2]/div[1]/div/fieldset/div/div[1]/div/canvas")
	WebElement CanvasSignature;
	@FindBy(how = How.XPATH, using = "//button[@id='capBtn']")
	WebElement CaptureSignature;
	@FindBy(how = How.XPATH, using = "//div[@class='dojoTab']/div/span[text()='Photo Capture']")
	WebElement PhotoCapture;
	@FindBy(how = How.XPATH, using = "//li[@class='crop']")
	WebElement CropSelected;
	@FindBy(how = How.XPATH, using = "//li[@class='trigger']")
	WebElement Phototrigger;
	@FindBy(how = How.XPATH, using = "//input[@id='photoCaptre']")
	WebElement Snapok;
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 top-space text-center']/input[1]")
	WebElement Save;

	public void Clickon_BiometricsLink() {
		stepstatus = basepage.clickElement(Biometrics);
		reportEvent(stepstatus, "Able to click on Biometrics Link", "Unable to click on Biometrics Link", driver, true);
	}

	public void Set_Application_Number(String Value) {
		stepstatus = basepage.setText(Application_Number, Value);
		reportEvent(stepstatus, "Able to Enter Application_Number", "Unable to Enter Application_Number", driver, true);
	}

	public void Clickon_Getdetails() {
		stepstatus = basepage.clickElement(Getdetails);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	public void Set_CanvasSignature(String ObjectXpath) {
		wait(2);
		stepstatus = basepage.CaptureSignature(driver, CanvasSignature, ObjectXpath);
		reportEvent(stepstatus, "Able to do CanvasSignature ", "Unable to do CanvasSignature", driver, true);
		wait(2);
		basepage.scrooldown(driver);
	}

	public void Clickon_Capturesignaturebutton() {
		stepstatus = basepage.clickElement(CaptureSignature);
		reportEvent(stepstatus, "Able to Click Getdetails button ", "Unable to Click Getdetails button", driver, true);
	}

	public void Set_PhotoCapture() {
		stepstatus = basepage.clickElement(PhotoCapture);
		reportEvent(stepstatus, "Able to do PhotoCapture ", "Unable to do PhotoCapture", driver, true);
	}

	public void Clickon_CropSelected() {
		wait(1);
		stepstatus = basepage.clickElement(CropSelected);
		reportEvent(stepstatus, "Able to click on CropSelected ", "Unable to click on CropSelected", driver, true);
	}

	public void Clickon_Phototriggerbutton() {
		stepstatus = basepage.clickElement(Phototrigger);
		reportEvent(stepstatus, "Able to click on Phototrigger button ", "Unable to click on Phototrigger button",
				driver, true);
	}

	public void Clickon_Snapokbutton() {
		stepstatus = basepage.clickElement(Snapok);
		reportEvent(stepstatus, "Able to click on Snapok button ", "Unable to click on Phototrigger button", driver,
				true);
	}

	public void Clickon_Savebutton() {
		stepstatus = basepage.clickElement(Save);
		reportEvent(stepstatus, "Able to click on Save button ", "Unable to click on Save button", driver, true);
	}

	/* DL-Test */

	@FindBy(how = How.XPATH, using = "//a[text()='DL_TEST']")
	WebElement DLTest;
	@FindBy(how = How.XPATH, using = "//input[@id='dtApplno']")
	WebElement Applicationnumber;
	@FindBy(how = How.XPATH, using = "//input[@id='dltestpreform_0']")
	WebElement GetdetailsRERT;
	@FindBy(how = How.XPATH, using = "//select[@name='model[0].testResult']")
	WebElement TestResult;
	@FindBy(how = How.XPATH, using = "//input[@name='model[0].testDate']")
	WebElement TestDate;

	@FindBy(how = How.XPATH, using = "//input[@id='vehno0']")
	WebElement Vehno;
	@FindBy(how = How.XPATH, using = "//input[@id='confirmbox0']")
	WebElement Confirmindltest;
	@FindBy(how = How.XPATH, using = "//input[@id='verify']")
	WebElement Confirmcheck;
	@FindBy(how = How.XPATH, using = "//input[@id='dltestform_0']")
	WebElement Submitindltest;

	public void ClickonDLTest() {
		stepstatus = basepage.clickElement(DLTest);
		reportEvent(stepstatus, "Able to click on DLTest LINK", "Unable to click on DLTest LINK", driver, true);
	}

	public void Set_Applicationnumber(String value) {
		stepstatus = basepage.setText(Applicationnumber, value);
		reportEvent(stepstatus, "Able to Enter Application Number", "Unable to Enter Application Number", driver, true);
	}

	public void ClickonGetdetails() {
		stepstatus = basepage.clickElement(GetdetailsRERT);
		reportEvent(stepstatus, "Able to click on Getdetails", "Unable to click on Getdetails", driver, true);
	}

	public void SetResult() {
		stepstatus = basepage.setOptionInSelectBox(TestResult, "PASS");
		reportEvent(stepstatus, "Able to click on Result", "Unable to click on Result", driver, true);
	}

	public void Set_Vehno(String value) {
		stepstatus = basepage.setText(Vehno, value);
		reportEvent(stepstatus, "Able to Enter Vehno", "Unable to Enter Vehno", driver, true);
	}

	public void Set_testdate(String value) {
		stepstatus = basepage.setText(TestDate, value);
		reportEvent(stepstatus, "Able to Enter TestDate", "Unable to Enter TestDate", driver, true);
	}

	public void ClickonConfirm() {
		stepstatus = basepage.clickElement(Confirmindltest);
		reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);
	}

	public void ClickonConfirmcheck() {
		stepstatus = basepage.clickElement(Confirmcheck);
		reportEvent(stepstatus, "Able to click on Confirmcheck", "Unable to click on Confirmcheck", driver, true);
	}

	public void ClickonSubmitindl() {
		stepstatus = basepage.clickElement(Submitindltest);
		// reportEvent(stepstatus, "Able to click on Submit", "Unable to click on
		// Submit", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

	}

	/* Approval of DLEndorsment */
	@FindBy(how = How.XPATH, using = "//a[text()='DL ']")
	WebElement DL;

	public void ClickonDL() {
		stepstatus = basepage.clickElement(DL);
		reportEvent(stepstatus, "Able to Click on DL", "Unable to Click on DL", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='DL ENDORSEMENT APPROVAL']")
	WebElement DL_Endorsement_Approval;

	public void Clickon_DL_Endorsement_Approval() {
		stepstatus = basepage.clickElement(DL_Endorsement_Approval);
		reportEvent(stepstatus, "Able to click onDL_Endorsement_Approval ",
				"Unable to click on DL_Endorsement_Approval", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='applNo']")
	WebElement Enter_Application_Number_for_DL_Endorsement_Approval;

	public void Enter_Application_Number_for_DL_Endorsement_Approval(String Appno) {
		stepstatus = basepage.setText(Enter_Application_Number_for_DL_Endorsement_Approval, Appno);
		reportEvent(stepstatus, "Able to click on Save button ", "Unable to click on Save button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit_in__DL_Endorsement_Approval;

	public void Clickon_Submit_in__DL_Endorsement_Approval() {
		stepstatus = basepage.clickElement(Submit_in__DL_Endorsement_Approval);
		reportEvent(stepstatus, "Able to click on Submit_in__DL_Endorsement_Approval button ",
				"Unable to click on Submit_in__DL_Endorsement_Approval button", driver, true);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='approveBtnid']")
	WebElement DL_Endorsement_final_Approve;

	public void Clickon_DL_Endorsement_final_Approve() {
		stepstatus = basepage.clickElement(DL_Endorsement_final_Approve);
		reportEvent(stepstatus, "Able to click on DL_Endorsement_final_Approve button ",
				"Unable to click on DL_Endorsement_final_Approve button", driver, true);
	}

	public void SelcectService(int ServiceCode) throws IOException, InterruptedException {

		switch (ServiceCode) {
		case 526:

			System.out.println("***********Welcome to ChangeofNamein_DL_Service************");
			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ChangeofnameinDL);
			reportEvent(stepstatus, "Able to click on ChangeofnameinDL", "Unable to click on ChangeofnameinDL", driver,
					true);

			stepstatus = basepage.clickElement(Proceed1);
			reportEvent(stepstatus, "Able to click on Proceed1", "Unable to click on Proceed1", driver, true);

			wait(2);

			stepstatus = basepage.setOptionInSelectBox(SelectreasonforChangeofName, getdata("Reason"));
			reportEvent(stepstatus, "Able to Select reason", "Unable to Select reason", driver, true);

			stepstatus = basepage.setText(Newname, getdata("NewName"));
			reportEvent(stepstatus, "Able to Enter Newname", "Unable to Enter Newname", driver, true);

			stepstatus = basepage.SetTextAndTAB(EffectiveFrom, getdata("EffectiveFromdate"));
			reportEvent(stepstatus, "Able to Enter EffectiveFrom", "Unable to Enter EffectiveFrom", driver, true);

			wait(1);

			stepstatus = basepage.clickElement(Confirm);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(Disclaimer);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(Submit);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			ChangeofnameinDLAppliationno = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
			System.out.println(ChangeofnameinDLAppliationno.substring(3).trim());

			String title = driver.getTitle();
			System.out.println(title);

			if (title.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				Clickon_Exitbutton();
				Clickon_TempHomebutton();
				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();

				/* Scrutiny */

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksfortwodocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 515:

			System.out.println("***********Welcome to ChangeofAddress_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ChangeofAddressinDL);
			reportEvent(stepstatus, "Able to click on ChangeofAddressinDL", "Unable to click on ChangeofAddressinDL",
					driver, true);

			stepstatus = basepage.clickElement(ProceedinDLService);
			reportEvent(stepstatus, "Able to click on ProceedinDLService", "Unable to click on ProceedinDLService",
					driver, true);

			stepstatus = basepage.clickElement(Permanent);
			reportEvent(stepstatus, "Able to click on Permanent", "Unable to click on Permanent", driver, true);

			stepstatus = basepage.setOptionInSelectBox(StateinDLService, getdata("State"));
			reportEvent(stepstatus, "Able to Select StateinDLService", "Unable to Select StateinDLService", driver,
					true);

			stepstatus = basepage.setOptionInSelectBox(DistrictinDLService, getdata("DLServiceDistrict"));
			reportEvent(stepstatus, "Able to Select DistrictinDLService", "Unable to Select DistrictinDLService",
					driver, true);

			stepstatus = basepage.setOptionInSelectBox(Tahsil, getdata("DLServiceTahsil"));
			reportEvent(stepstatus, "Able to Select Tahsil", "Unable to Select Tahsil", driver, true);

			stepstatus = basepage.SetTextAndTAB(PincodeinDLService, getdata("DLServicePincode"));
			reportEvent(stepstatus, "Able to Enter PincodeinDLService", "Unable to Enter PincodeinDLService", driver,
					true);

			stepstatus = basepage.clickElement(ConfirminDLService);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinDLService);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref1 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref1.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinDLService);
			reportEvent(stepstatus, "Able to click on SubmitinDLService", "Unable to click on SubmitinDLService",
					driver, true);

			ChangeofAddressApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String addtitle = driver.getTitle();
			System.out.println(addtitle);
			if (addtitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				/* Flows */

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksfortwodocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 514:

			System.out.println("***********Welcome to RenewalofDL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(RenewalofDL);
			reportEvent(stepstatus, "Able to click on RenewalofDL", "Unable to click on RenewalofDL", driver, true);

			stepstatus = basepage.clickElement(ProceedinDLService);
			reportEvent(stepstatus, "Able to click on ProceedinDLService", "Unable to click on ProceedinDLService",
					driver, true);

			stepstatus = basepage.clickElement(DisclaimerinDLService);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref2 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref2.getText());
			// stepstatus = basepage.setText(Captcha1, Captcha1.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinDLService);
			reportEvent(stepstatus, "Able to click on SubmitinDLService", "Unable to click on SubmitinDLService",
					driver, true);

			RenewalofDLApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String Rentitle = driver.getTitle();
			if (Rentitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				/* Flows */

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();
				SlotBooking();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksfortwodocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}
			break;

		case 513:
			System.out.println("***********Welcome to DL_Service_IssueofDuplicateDL************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on IssueofduplicateDL", "Unable to click on IssueofduplicateDL",
					driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ReasontoissueofduplicateDL,
					getdata("SelectreasonforDuplicateDL"));
			reportEvent(stepstatus, "Able to Select ReasontoissueofduplicateDL",
					"Unable to Select ReasontoissueofduplicateDL", driver, true);

			stepstatus = basepage.clickElement(ConfirminIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref3 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref3.getText());
			// stepstatus = basepage.setText(CaptchainIssueofduplicateDL,
			// Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofduplicateDL);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			DL_Service_IssueofDuplicateDLApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String Duptitle = driver.getTitle();
			if (Duptitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				/* Flows */

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();
				SlotBooking();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksforsingledocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 516:
			System.out.println("***********Welcome to ReplacementofDL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(ReplacementofDL);
			reportEvent(stepstatus, "Able to click on ReplacementofDL", "Unable to click on ReplacementofDL", driver,
					true);

			stepstatus = basepage.clickElement(ProceedinReplacementofDL);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.clickElement(Disclaimer);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref4 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref4.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinReplacementofDL);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			DL_Service_ReplacementofDLApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String Replacetitle = driver.getTitle();
			if (Replacetitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				/* Flows */

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();
				SlotBooking();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksforsingledocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 522:

			System.out.println("***********Welcome to IssueofNOC_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofNOC);
			reportEvent(stepstatus, "Able to click on IssueofNOC", "Unable to click on IssueofNOC", driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Proceed", "Unable to click on Proceed", driver, true);

			stepstatus = basepage.setOptionInSelectBox(StateinIssueofNOC, getdata("State"));
			reportEvent(stepstatus, "Able to Select State", "Unable to Select State", driver, true);

			stepstatus = basepage.setOptionInSelectBox(RTOinIssueofNOC, getdata("serrto"));
			reportEvent(stepstatus, "Able to Select RTO", "Unable to Select RTO", driver, true);
			stepstatus = basepage.setOptionInSelectBox(RTOinIssueofNOC, getdata("serrto"));

			stepstatus = basepage.setOptionInSelectBox(ReasonforNOCinIssueofNOC, getdata("ReasonforNOC"));
			reportEvent(stepstatus, "Able to Select ReasonforNOC", "Unable to Select ReasonforNOC", driver, true);
			wait(1);
			stepstatus = basepage.clickElement(ConfirminIssueofNOC);
			reportEvent(stepstatus, "Able to click on Confirm", "Unable to click on Confirm", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref5 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref5.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofNOC);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			DL_Service_IssueofNOCApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String NOCtitle = driver.getTitle();
			if (NOCtitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());
				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();
				Feepayment();

				/* Capture Bio-Metrics in Firefox Browser */

				CaptureBioMetrics();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");
				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				// Clickon_VerificationofDocuments_Link();
				// Clickon_prooflinksforsingledocs();
				Clickon_Scrutinybutton();
				wait(2);

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;

		case 523:
			System.out.println("***********Welcome to DLExtract_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(DLExtract);
			reportEvent(stepstatus, "Able to click on DLExtract", "Unable to click on DLExtract", driver, true);

			stepstatus = basepage.clickElement(ProceedinDLExtract);
			reportEvent(stepstatus, "Able to click on ProceedinDLExtract", "Unable to click on ProceedinDLExtract",
					driver, true);

			stepstatus = basepage.setOptionInSelectBox(ReasonforDLExtract, getdata("Reason"));
			reportEvent(stepstatus, "Able to Select ReasonforDLExtract", "Unable to Select ReasonforDLExtract", driver,
					true);

			stepstatus = basepage.clickElement(ConfirminDLExtract);
			reportEvent(stepstatus, "Able to click on DLExtract", "Unable to click on DLExtract", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinDLExtract);
			reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

			WebElement ref6 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref6.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinDLExtract);
			reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

			DL_ExtractApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String DLEtitle = driver.getTitle();
			if (DLEtitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

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

				Feepayment();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				DL_Service_DLExtract DL_Extract = new DL_Service_DLExtract(driver);
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
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 525:
			System.out.println("***********Welcome to Issueof International Driving Permit_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on IssueofInterNationalDrivingPermit",
					"Unable to click on IssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on ProceedinIssueofInterNationalDrivingPermit",
					"Unable to click on ProceedinIssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.setText(BirthPlace, getdata("BP"));
			reportEvent(stepstatus, "Able to Enter BirthPlace", "Unable to Unable to Enter BirthPlace", driver, true);

			stepstatus = basepage.setOptionInSelectBox(BirthCountry, getdata("BC"));
			reportEvent(stepstatus, "Able to Select BirthCountry", "Unable to Select BirthCountry ", driver, true);

			stepstatus = basepage.setText(PassportNumber, getdata("PN"));
			reportEvent(stepstatus, "Able to Enter PassportNumber", "Unable to Unable to Enter PassportNumber", driver,
					true);

			stepstatus = basepage.setText(PassportValidtill, getdata("ValidTill"));
			reportEvent(stepstatus, "Able to Enter PassportValidtill", "Unable to Unable to Enter PassportValidtill",
					driver, true);

			stepstatus = basepage.setOptionInSelectBox(CountryforwhichVISAisgranted, getdata("CVA"));
			reportEvent(stepstatus, "Able to Select CountryforwhichVISAisgranted",
					"Unable to Select CountryforwhichVISAisgranted ", driver, true);

			stepstatus = basepage.setText(VisaNumber, getdata("VN"));
			reportEvent(stepstatus, "Able to Enter PassportValidtill", "Unable to Unable to Enter PassportValidtill",
					driver, true);

			stepstatus = basepage.setText(VisaValidtill, getdata("VT"));
			reportEvent(stepstatus, "Able to Enter PassportValidtill", "Unable to Unable to Enter PassportValidtill",
					driver, true);

			selectgradeidp();

			// stepstatus = basepage.setOptionInSelectBox(COVgradesforwhichIDPisrequested,
			// getdata(""));
			// reportEvent(stepstatus, "Able to Select COVgradesforwhichIDPisrequested",
			// "Unable to Select COVgradesforwhichIDPisrequested ", driver, true);

			stepstatus = basepage.clickElement(ConfirminIssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on ConfirminIssueofInterNationalDrivingPermit",
					"Unable to click on ConfirminIssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on DisclaimerinIssueofInterNationalDrivingPermit",
					"Unable to click on DisclaimerinIssueofInterNationalDrivingPermit", driver, true);

			WebElement ref7 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref7.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on SubmitinIssueofInterNationalDrivingPermit",
					"Unable to click on SubmitinIssueofInterNationalDrivingPermit", driver, true);

			Issueof_International_Driving_PermitApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String istitle = driver.getTitle();
			if (istitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				Upload_Documents();

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

				Feepayment();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksforthreedocs();
				Clickon_Scrutinybutton();
				wait(2);

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 528:

			System.out.println("***********Welcome to Change of Bio_Metrics in DL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(CHANGE_OF_BIOMETRICS_IN_DL);
			reportEvent(stepstatus, "Able to click on IssueofInterNationalDrivingPermit",
					"Unable to click on IssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofInterNationalDrivingPermit);
			reportEvent(stepstatus, "Able to click on ProceedinIssueofInterNationalDrivingPermit",
					"Unable to click on ProceedinIssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SelectChangeofBiometricsinDL, getdata("Reason"));
			reportEvent(stepstatus, "Able to Select SelectChangeofBiometricsinDL",
					"Unable to Select SelectChangeofBiometricsinDL", driver, true);

			stepstatus = basepage.clickElement(ConfirminCHANGE_OF_BIOMETRICS_IN_DL);
			reportEvent(stepstatus, "Able to click on ConfirminIssueofInterNationalDrivingPermit",
					"Unable to click on ConfirminIssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinCHANGE_OF_BIOMETRICS_IN_DL);
			reportEvent(stepstatus, "Able to click on DisclaimerinIssueofInterNationalDrivingPermit",
					"Unable to click on DisclaimerinIssueofInterNationalDrivingPermit", driver, true);

			WebElement ref8 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref8.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinCHANGE_OF_BIOMETRICS_IN_DL);
			reportEvent(stepstatus, "Able to click on SubmitinIssueofInterNationalDrivingPermit",
					"Unable to click on SubmitinIssueofInterNationalDrivingPermit", driver, true);

			Change_of_Biometrics_in_DLApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String CBtitle = driver.getTitle();
			if (CBtitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksforsingledocs();
				Clickon_Scrutinybutton();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 519:

			System.out.println("***********Welcome to Issue_Of_PSVBadge_to_Driver_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);
			reportEvent(stepstatus, "Able to click on Confirmbutton", "Unable to click on Confirmbutton", driver, true);

			stepstatus = basepage.clickElement(IssueofPSVBadge_to_a_Driver);
			reportEvent(stepstatus, "Able to click on IssueofPSVBadge_to_a_Driver",
					"Unable to click on IssueofPSVBadge_to_a_Driver", driver, true);

			stepstatus = basepage.clickElement(ProceedinIssueofPSVBadge_to_a_Driver);
			reportEvent(stepstatus, "Able to click on ProceedinIssueofPSVBadge_to_a_Driver",
					"Unable to click on ProceedinIssueofPSVBadge_to_a_Driver", driver, true);

			stepstatus = basepage.clickElement(SelectClassofVehile);
			reportEvent(stepstatus, "Able to click on SelectClassofVehile", "Unable to click on SelectClassofVehile",
					driver, true);

			stepstatus = basepage.setOptionInSelectBox(First_Aid_Training_Institute, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select First_Aid_Training_Institute",
					"Unable to Select First_Aid_Training_Institute", driver, true);

			stepstatus = basepage.setText(Enrollment_Number, getdata(""));
			reportEvent(stepstatus, "Able to Enter Enrollment_Number", "Unable to Enter Enrollment_Number", driver,
					true);

			stepstatus = basepage.setText(Enrollment_Date, getdata(""));
			reportEvent(stepstatus, "Able to Enter Enrollment_Date", "Unable to Enter Enrollment_Date", driver, true);

			stepstatus = basepage.setText(Certificate_Number, getdata(""));
			reportEvent(stepstatus, "Able to Enter Certificate_Number", "Unable to Enter Certificate_Number", driver,
					true);

			stepstatus = basepage.setText(Certificate_Date, getdata(""));
			reportEvent(stepstatus, "Able to Enter Certificate_Date", "Unable to Enter Certificate_Date", driver, true);

			stepstatus = basepage.clickElement(ConfirminIssueofPSVBadge_to_a_Driver);
			reportEvent(stepstatus, "Able to click on ConfirminIssueofPSVBadge_to_a_Driver",
					"Unable to click on ConfirminIssueofPSVBadge_to_a_Driver", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinIssueofPSVBadge_to_a_Driver);
			reportEvent(stepstatus, "Able to click on DisclaimerinIssueofPSVBadge_to_a_Driver",
					"Unable to click on DisclaimerinIssueofPSVBadge_to_a_Driver", driver, true);

			WebElement ref9 = driver.findElement(By.xpath("//span[@id='captchaViewer']/text()"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref9.getAttribute("value"));
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinIssueofPSVBadge_to_a_Driver);
			reportEvent(stepstatus, "Able to click on SubmitinIssueofPSVBadge_to_a_Driver",
					"Unable to click on SubmitinIssueofPSVBadge_to_a_Driver", driver, true);

			String PSVtitle = driver.getTitle();
			if (PSVtitle.equals("")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();

				Upload_Documents();
				Uploadphoto_Signature();
				Feepayment();
				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

			} else {

				System.out.println("DL Services Acknowledgementt is not Generated");
				setdata("RequestStatus", "Fail");
				driver.close();
			}

			break;
		case 537:
			System.out.println("***********Welcome to RE-VALIDATION OF EXPIRED DL_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			basepage.clickElement(Confirmbutton);
			if (basepage.alertExist(driver)) {

				System.out.println(basepage.alertGetText(driver));
				basepage.acceptAlert(driver);

				stepstatus = basepage.clickElement(ProceedinRevalidationofExpiredDL);
				reportEvent(stepstatus, "Able to click on ProceedinIssueofPSVBadge_to_a_Driver",
						"Unable to click on ProceedinIssueofPSVBadge_to_a_Driver", driver, true);

				stepstatus = basepage.clickElement(DisclaimerinRevalidationofExpiredDL);
				reportEvent(stepstatus, "Able to click on Disclaimer", "Unable to click on Disclaimer", driver, true);

				WebElement ref10 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
				driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref10.getText());
				// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
				// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
				// driver, true);

				stepstatus = basepage.clickElement(SubmitinRevalidationofExpiredDL);
				reportEvent(stepstatus, "Able to click on Submit", "Unable to click on Submit", driver, true);

				Renewal_with_ReTestApplicationNo = App_NO(driver,
						"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

				String REtitle = driver.getTitle();
				if (REtitle.equals("DL Services Acknowledgement")) {

					setdata("ApplicationNo", s1.substring(3).trim());

					setdata("RequestStatus", "Pass");
					wait(1);
					Clickon_Exitbutton();
					Clickon_TempHomebutton();

					Upload_Documents();
					Uploadphoto_Signature();
					Feepayment();
					SlotBooking();

					driver.navigate().to(
							"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

					setUserNamee(getdata("UserName"));
					setpass(getdata("Password"));
					ClickonLogin();
					SelectRTOtype();
					Clickonloogin();
					Clickon_General_button();
					Clickon_Scrutiny_Link();
					Set_RTOApplication_Number(getdata("ApplicationNo"));
					Clickon_RTOProceed_button();
					Clickon_VerificationofDocuments_Link();
					Clickon_prooflinksfortwodocs();
					Clickon_Scrutinybutton();
					wait(2);
					CaptureBioMetrics();

					ClickonDL();
					ClickonDLTest();
					Set_Applicationnumber(getdata("ApplicationNo"));
					ClickonGetdetails();
					SetResult();
					Set_Vehno("ap05nm8888");
					Set_testdate("11-10-2019");
					ClickonConfirm();
					ClickonConfirmcheck();
					ClickonSubmitindl();

					/* Endorsement Approval */

					ClickonDL();
					Clickon_DL_Endorsement_Approval();
					Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
					Clickon_Submit_in__DL_Endorsement_Approval();
					Clickon_DL_Endorsement_final_Approve();

				}

			} else {

				basepage.dismissAlert(driver);

			}

			break;
		case 524:
			System.out.println("***********Welcome to ENDORSEMENTTODRIVEINHILLREGION_in_DL_Service************");

			stepstatus = basepage.clickElement(Applyonline);
			reportEvent(stepstatus, "Able to click on Applyonline", "Unable to click on Applyonline", driver, true);

			stepstatus = basepage.clickElement(ServicesonDL);
			reportEvent(stepstatus, "Able to click on ServicesonDL", "Unable to click on ServicesonDL", driver, true);

			// stepstatus = basepage.setOptionInSelectBox(StateSelection, getdata(""));
			// reportEvent(stepstatus, "Able to do StateSelection", "Unable to do
			// StateSelection", driver, true);

			stepstatus = basepage.clickElement(Continue);
			reportEvent(stepstatus, "Able to click on Continue", "Unable to click on Continue", driver, true);

			stepstatus = basepage.setText(DLnumber, getdata("DL"));
			reportEvent(stepstatus, "Able to Enter DLNumber", "Unable to Enter DLNumber", driver, true);

			stepstatus = basepage.setText(DateofBirth, getdata("DateofBirth"));
			reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);

			stepstatus = basepage.clickElement(Gobutton);
			reportEvent(stepstatus, "Able to click on Gobutton", "Unable to click on Gobutton", driver, true);

			stepstatus = basepage.setOptionInSelectBox(ConfirmedthattheaboveDrivingLicencedetailsaremine, "YES");
			reportEvent(stepstatus, "Able to Select ConfirmedthattheaboveDrivingLicencedetailsaremine",
					"Unable to Select ConfirmedthattheaboveDrivingLicencedetailsaremine", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestStateSelection, getdata("State"));
			reportEvent(stepstatus, "Able to Select SubmitRequestStateSelection",
					"Unable to Select SubmitRequestStateSelection", driver, true);

			stepstatus = basepage.setOptionInSelectBox(SubmitRequestRTOSelection, getdata("RTO"));
			reportEvent(stepstatus, "Able to Select SubmitRequestRTOSelection",
					"Unable to Select SubmitRequestRTOSelection", driver, true);

			stepstatus = basepage.clickElement(Proceedbutton);
			reportEvent(stepstatus, "Able to click on Proceedbutton", "Unable to click on Proceedbutton", driver, true);

			stepstatus = basepage.clickElement(Confirmbutton);

			stepstatus = basepage.clickElement(ENDORSEMENTTODRIVEINHILLREGION);
			reportEvent(stepstatus, "Able to click on ENDORSEMENTTODRIVEINHILLREGION",
					"Unable to click on ENDORSEMENTTODRIVEINHILLREGION", driver, true);

			stepstatus = basepage.clickElement(ProceedinENDORSEMENTTODRIVEINHILLREGION);
			reportEvent(stepstatus, "Able to click on ENDORSEMENTTODRIVEINHILLREGION",
					"Unable to click on ENDORSEMENTTODRIVEINHILLREGION", driver, true);

			stepstatus = basepage.SetTextAndTAB(Certificateno, getdata("CNO"));
			reportEvent(stepstatus, "Able to Enter Certificateno", "Unable to Enter Certificateno", driver, true);

			List<WebElement> mm = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
			List<WebElement> dd = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']"));

			String Expect = "Jan";
			String ExYr = "2019";
			String Date = "17";

			for (int i = 0; i < mm.size(); i++) {

				String mmtext = mm.get(i).getText();
				System.out.println(mmtext);

				for (int j = 0; j < dd.size(); j++) {

					String ddtext = dd.get(j).getText();
					System.out.println(ddtext);

					if (mmtext.contains(Expect)) {

						Select s = new Select(mm.get(i));
						s.selectByVisibleText(Expect);
					}

					dd = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']"));
					ddtext = dd.get(j).getText();

					if (ddtext.contains(ExYr)) {

						Select st = new Select(dd.get(j));

						st.selectByVisibleText(ExYr);

						List<WebElement> dates = driver
								.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

						for (int k = 0; k < dates.size(); k++) {

							String f = dates.get(k).getText();
							System.out.println(f);
							if (f.contains(Date)) {
								dates.get(k).click();

							}
						}

					}

				}

			}

			stepstatus = basepage.setOptionInSelectBox(Issuedby, getdata("IBY"));
			reportEvent(stepstatus, "Able to Enter Certificateno", "Unable to Enter Certificateno", driver, true);

			stepstatus = basepage.clickElement(ConfirminENDORSEMENTTODRIVEINHILLREGION);
			reportEvent(stepstatus, "Able to click on ConfirminIssueofInterNationalDrivingPermit",
					"Unable to click on ConfirminIssueofInterNationalDrivingPermit", driver, true);

			stepstatus = basepage.clickElement(DisclaimerinENDORSEMENTTODRIVEINHILLREGION);
			reportEvent(stepstatus, "Able to click on DisclaimerinIssueofInterNationalDrivingPermit",
					"Unable to click on DisclaimerinIssueofInterNationalDrivingPermit", driver, true);

			WebElement ref11 = driver.findElement(By.xpath("//span[@id='captchaViewer']"));
			driver.findElement(By.xpath("//input[@name='captchaByApplicant']")).sendKeys(ref11.getText());
			// stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
			// reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha",
			// driver, true);

			stepstatus = basepage.clickElement(SubmitinENDORSEMENTTODRIVEINHILLREGION);
			reportEvent(stepstatus, "Able to click on SubmitinIssueofInterNationalDrivingPermit",
					"Unable to click on SubmitinIssueofInterNationalDrivingPermit", driver, true);

			Endorsement_to_drive_in_Hill_regionApplicationNo = App_NO(driver,
					"//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");

			String hilltitle = driver.getTitle();
			if (hilltitle.equals("DL Services Acknowledgement")) {

				setdata("ApplicationNo", s1.substring(3).trim());

				setdata("RequestStatus", "Pass");
				wait(1);
				Clickon_Exitbutton();
				Clickon_TempHomebutton();
				Upload_Documents();
				Uploadphoto_Signature();
				SlotBooking();
				driver.findElement(By.xpath("//input[@value='NEXT']")).click();
				Feepayment();

				driver.navigate().to(
						"https://s4preprod.nic.in:8443/cas/login?service=https%3A%2F%2Fs4preprod.nic.in%3A8443%2Fsarathiservice%2Fsarathilogin.do");

				setUserNamee(getdata("UserName"));
				setpass(getdata("Password"));
				ClickonLogin();
				SelectRTOtype();
				Clickonloogin();
				Clickon_General_button();
				Clickon_Scrutiny_Link();
				Set_RTOApplication_Number(getdata("ApplicationNo"));
				Clickon_RTOProceed_button();
				Clickon_VerificationofDocuments_Link();
				Clickon_prooflinksfortwodocs();
				Clickon_Scrutinybutton();
				wait(2);

				CaptureBioMetrics();

				/* Endorsement Approval */

				ClickonDL();
				Clickon_DL_Endorsement_Approval();
				Enter_Application_Number_for_DL_Endorsement_Approval(getdata("ApplicationNo"));
				Clickon_Submit_in__DL_Endorsement_Approval();
				Clickon_DL_Endorsement_final_Approve();

			}

			break;
		case 13:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 14:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 15:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 17:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 18:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;
		case 19:
			System.out.println("RENEWAL OF DL Servcie Selected");
			break;

		default:
			System.out.println("INVALID SERVICE PLEASE TRY AGAIN");

		}

	}

}
