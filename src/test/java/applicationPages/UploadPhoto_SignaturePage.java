package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UploadPhoto_SignaturePage extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public UploadPhoto_SignaturePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelements
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "//a[text()='Application Status']")
	WebElement Applicationstatus;
	@FindBy(how = How.XPATH, using = "//input[@name='appnumber']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='dob']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//input[@value='UPLOAD PHOTO AND SIGNATURE']")
	WebElement Clickradio;
	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//*[@class='browse btn btn-primary']//preceding::button")
	WebElement Browsebutton1;
	@FindBy(how = How.XPATH, using = "//*[@type='button']//following::button")
	WebElement Browsebutton2;
	@FindBy(how = How.XPATH, using = "//input[@id='upldFiles']")
	WebElement UploadandViewfiles;
	@FindBy(how = How.XPATH, using = "//input[@id='photoAndSignature']")
	WebElement SavephotoandSignature;
	@FindBy(how = How.XPATH, using = "//input[@value='Next']")
	WebElement Next;

	// Related methods to perform operation on webelements
	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}

	public void Clickon_Applyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	public void Clickon_Application_Status_Link() {
		stepstatus = basepage.clickElement(Applicationstatus);
		reportEvent(stepstatus, "Able to click on Applicationstatus Link", "Unable to cclick on Applicationstatus Link",
				driver, true);
	}

	public void Set_Application_Number(String value) {
		stepstatus = basepage.setText(Application_Number, value);
		reportEvent(stepstatus, "Able to Enter Application Number ", "Unable to Enter Application Number", driver,
				true);
	}

	public void Set_DateofBirth(String value) {
		stepstatus = basepage.setText(DateofBirth, value);
		reportEvent(stepstatus, "Able to Enter Date of Birth ", "Unable to Enter Date of Birth", driver, true);
	}

	public void Clickon_Submit_Button() {
		stepstatus = basepage.clickElement(Submit);
		reportEvent(stepstatus, "Able to click submit button", "Unable to click submit button", driver, true);
	}

	public void Do_ScrollDown() {
		stepstatus = basepage.scrooldown(driver);
		reportEvent(stepstatus, "Able to do Scrolldown", "Unable to do Scrolldown", driver, true);
	}

	public void Clickon_Proceed_Button() {
		if (basepage.clickElement(Clickradio)) {
			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);
		}
	}

	public void Clickon_Browse_Button1() {
		wait(2);
		stepstatus = basepage.clickElement(Browsebutton1);
		reportEvent(stepstatus, "Able to click Browsebutton1 ", "Unable to click Browsebutton1 ", driver, true);
		basepage.Upload("AutoIT\\TestfileImage.exe");
		wait(4);
	}

	public void Clickon_Browse_Button2() {
		wait(2);
		stepstatus = basepage.clickElement(Browsebutton2);
		reportEvent(stepstatus, "Able to click Browsebutton2 ", "Unable to click Browsebutton2 ", driver, true);
		basepage.Upload("AutoIT\\TestFileSignature.exe");
		wait(7);

	}

	public void Clickon_UploadandViewfiles() {

		if (isEnabled(UploadandViewfiles)) {

			stepstatus = basepage.clickElement(UploadandViewfiles);
			reportEvent(stepstatus, "Able to click UploadandViewfiles button ",
					"Unable to click UploadandViewfiles button ", driver, true);
		} else {
			reportEvent(stepstatus, "Able to click UploadandViewfiles button ",
					"Unable to click UploadandViewfiles button ", driver);

		}

	}

	public void Clickon_SavephotoandSignature() {
		wait(4);

		if (isEnabled(SavephotoandSignature)) {

			stepstatus = basepage.clickElement(SavephotoandSignature);
			reportEvent(stepstatus, "Able to click SavephotoandSignature button ",
					"Unable to click SavephotoandSignature button ", driver, true);
		} else {
			stepstatus = basepage.clickElement(SavephotoandSignature);
			reportEvent(stepstatus, "Able to click SavephotoandSignature button ",
					"Unable to click SavephotoandSignature button ", driver);

		}

	}

	public void Clickon_Next() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click Next", "Unable to click Next", driver, true);
	}

	// new
	@FindBy(how = How.XPATH, using = "//a[text() ='Upload Photograph and Signature']")
	WebElement clickonuploadphotoandsignature;

	public void click_on_uploadphotoandsignature() {
		stepstatus = basepage.clickElement(clickonuploadphotoandsignature);
		reportEvent(stepstatus, "Able to click on  upload photo and signature",
				"Unable to click on upload and signature ", driver, true);
	}

	// new
	@FindBy(how = How.XPATH, using = "//input[@value='Get Details']")
	WebElement clickongetdetails;

	public void click_on_Getdetails() {
		stepstatus = basepage.clickElement(clickongetdetails);
		reportEvent(stepstatus, "Able to click on  getdetails", "Unable to click on get details ", driver, true);
	}

}
