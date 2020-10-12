package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewDLFeePaymentPage extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public NewDLFeePaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelements
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "//a[text()='Application Status']")
	WebElement Applicationstatus;
	@FindBy(how = How.XPATH, using = "//input[@name='applNum']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='dateOfBirth']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//select[@name='bankslist']")
	WebElement Bank;
	@FindBy(how = How.XPATH, using = "//input[1][@id='abc']")
	WebElement Captcha;
	@FindBy(how = How.XPATH, using = "//input[@id='first']")
	WebElement Paynow;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement Checkbox;
	@FindBy(how = How.XPATH, using = "//input[@name='button1']")
	WebElement Proceedforpayment;
	@FindBy(how = How.XPATH, using = "//img[@alt='Continue to Login']")
	WebElement ContinuetoLogin;
	@FindBy(how = How.XPATH, using = "//input[@class='btn'][1]")
	WebElement Pressheretocontinue;

	// Related methods to perform operation on webelements
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
		stepstatus = basepage.clickElement(Proceed);
		reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);
	}

	public void SelectBank(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Bank, Option);
		reportEvent(stepstatus, "Able to Select Bank", "Unable to Select Bank", driver, true);
	}

	public void SetCaptcha() {
//		stepstatus = basepage.setText(Captcha, Captcha.getAttribute("value"));
//		reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha", driver, true);
		WebElement ref = driver.findElement(By.xpath("//input[1][@id='abc']"));
		driver.findElement(By.xpath("//input[@id='captchatext']"))
				.sendKeys(ref.getAttribute("value"));
	}

	public void Clickon_Paynow_Button() {
		stepstatus = basepage.clickElement(Paynow);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
	}

	public void Clickon_Checkbox() {
		stepstatus = basepage.clickElement(Checkbox);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
	}

	public void Clickon_Proceedforpayment() {
		stepstatus = basepage.clickElement(Proceedforpayment);
		reportEvent(stepstatus, "Able to click Paynow button", "Unable to click Paynow button", driver, true);
		wait(5);
	}

	public void Clickon_ContinuetoLogin_Button() {
		stepstatus = basepage.clickElement(ContinuetoLogin);
		reportEvent(stepstatus, "Able to click ContinuetoLogin button", "Unable to click ContinuetoLogin button",
				driver, true);
	}

	public void Clickon_Pressheretocontinue_Button() {
		stepstatus = basepage.clickElement(Pressheretocontinue);
		reportEvent(stepstatus, "Able to click Pressheretocontinue button",
				"Unable to click Pressheretocontinue button", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
			System.out.println("Payment Recived Sucessfully");
		} else {
			basepage.dismissAlert(driver);
		}
	}
}
