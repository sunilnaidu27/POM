package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DL_Login_CapturebiometricsPage extends BasePage {
	BasePage basepage = new BasePage();

	// Initilization
	
	WebDriver driver;

	public DL_Login_CapturebiometricsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelementss
		@FindBy(how = How.XPATH, using = "//a[text()='Login']")
		WebElement Login;
		@FindBy(how = How.XPATH, using = "//input[@id='username']")
		WebElement Username;
		@FindBy(how = How.XPATH, using = "//input[@id='password']")
		WebElement Password;
		@FindBy(how = How.XPATH, using = "//input[@name='submit']")
		WebElement Singin;
		@FindBy(how = How.XPATH, using = "//*[@id='crd3']")
		WebElement Radiobutton;
		@FindBy(how = How.XPATH, using = "//input[@id='login']")
		WebElement login;
		@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']/li[6]/a")
		WebElement General;
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

		// related methods to perform operation on Webelements
		boolean stepstatus;

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
		public void Clickonlogin() {
			stepstatus = basepage.clickElement(login);
			reportEvent(stepstatus, "Able to click on login-In BUtton", "Unable to click on login Button", driver, true);
		}
		public void Clickon_General_button() {
			stepstatus = basepage.clickElement(General);
			reportEvent(stepstatus, "Able to click on General BUtton", "Unable to click on General Button", driver, true);
		}
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
			stepstatus = basepage.CaptureSignature(driver, CanvasSignature,ObjectXpath);
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
}
