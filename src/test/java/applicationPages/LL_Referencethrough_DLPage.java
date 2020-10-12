package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LL_Referencethrough_DLPage extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public LL_Referencethrough_DLPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// define webelementss

	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "//li[@class='meu-list']/a[text()='New Learners Licence']")
	WebElement NewLearnersLicence;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(how = How.XPATH, using = "//input[@id='licenceType2']")
	WebElement Applicantholds_DrivingLicence_Enter_DL_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='drivingLicenceNo']")
	WebElement Enter_Driving_Licence_Number;
	@FindBy(how = How.XPATH, using = "//input[@id='dlDateOfBirth']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//*[@id='submitOfNewLL']")
	WebElement Submitone;
	@FindBy(how = How.XPATH, using = "//input[@id='newLL_execute_newll_confirm']")
	WebElement Confirm;
	@FindBy(how = How.XPATH, using = "//select[@id='fullCovsList']")
	WebElement SelectCOV;
	@FindBy(how = How.XPATH, using = "//input[@id='addToRightLabel']")
	WebElement Rightarrow;
	@FindBy(how = How.XPATH, using = "//input[@name='newll.submit']")
	WebElement Submittwo;

	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}

	public void clickonapplyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	public void clickonapplyonNewLearnersLicence() {
		stepstatus = basepage.clickElement(NewLearnersLicence);
		reportEvent(stepstatus, "Able to click NewLL LINK ", "Unable to click NewLL LINK", driver, true);
	}

	public void clickonapplyonContinue() {
		stepstatus = basepage.clickElement(Continue);
		reportEvent(stepstatus, "Able to click Continue Button ", "Unable to click Continue Button", driver, true);
	}

	public void Clickon_Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton() {

		stepstatus = basepage.clickElement(Applicantholds_DrivingLicence_Enter_DL_Number);
		reportEvent(stepstatus, "Able to click Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton",
				"Unable to click Applicantholds_DrivingLicence_Enter_DL_Number_Radiobutton", driver, true);
	}

	public void Enter_Enter_Driving_Licence_Number(String value) {
		stepstatus = basepage.setText(Enter_Driving_Licence_Number, value);
		reportEvent(stepstatus, "Able to Enter_Driving_Licence_Number ", "Unable to Enter_Driving_Licence_Number ",
				driver, true);
	}

	public void Enter_Dateofbirth(String value) {
		stepstatus = basepage.setText(DateofBirth, value);
		reportEvent(stepstatus, "Able to Enter_DateofBirth ", "Unable to Enter_DateofBirth ", driver, true);
	}

	public void click_Submitone() {
		stepstatus = basepage.clickElement(Submitone);
		reportEvent(stepstatus, "Able to click Submitone button ", "Unable to click Submitone button ", driver, true);
	}

	public void click_confirm() {
		stepstatus = basepage.clickElement(Confirm);
		reportEvent(stepstatus, "Able to click Confirm button ", "Unable to click Confirm button ", driver, true);
	}

	public void SelectCOV(String option) {
		stepstatus = basepage.setOptionInSelectBox(SelectCOV, option);
		reportEvent(stepstatus, "Able to Select COV  ", "Unable to Select COV", driver, true);
	}

	public void Clickon_Rightarrow() {
		stepstatus = basepage.clickElement(Rightarrow);
		reportEvent(stepstatus, "Able to Click Rightarrow ", "Unable to click Rightarrow", driver, true);
	}

	public void Clickon_Submitbutton() {
		stepstatus = basepage.clickElement(Submittwo);
		reportEvent(stepstatus, "Able to Click Submittwo ", "Unable to click Submittwo", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}

		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {
			basepage.dismissAlert(driver);
		}
	}

}
