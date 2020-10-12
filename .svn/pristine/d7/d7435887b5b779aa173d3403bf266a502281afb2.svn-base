package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewDLSubmissionPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;

	boolean stepstatus;

	public NewDLSubmissionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelements
	@FindBy(how = How.XPATH, using = "//span[1][text()='Apply Online']")
	WebElement Applyonline;
	@FindBy(how = How.XPATH, using = "//li[@class='menu-list']/a[text()='New Driving Licence']")
	WebElement NewDrivinglicence;
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	WebElement Contuine;
	@FindBy(how = How.XPATH, using = "//input[@id='learningLicence']")
	WebElement LearnersLicenceNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='DOB']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@id='ok']")
	WebElement Ok;
	@FindBy(how = How.XPATH, using = "//input[@name='selectAll']")
	WebElement Selectall;
	@FindBy(how = How.XPATH, using = "//input[@id='sub']")
	WebElement Submit;
	
	
	

	// Related methods to perform operation on webelements
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;

	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}
	
	@FindBy(how = How.XPATH, using = "//select[@name='licenceFromState']")
	WebElement State;

	public void Set_State(String option) {
		stepstatus = basepage.setOptionInSelectBox(State, option);
		reportEvent(stepstatus, "Able to Selected State", "Unable to Selected State", driver, true);
	}

	public void clickonapplyonline() {
		stepstatus = basepage.clickElement(Applyonline);
		reportEvent(stepstatus, "Able to click Apply online Link", "Unable to click Apply online Link", driver, true);
	}

	public void clickon_NewDrivinglicence() {
		stepstatus = basepage.clickElement(NewDrivinglicence);
		reportEvent(stepstatus, "Able to click NewDrivinglicence Link", "Unable to click NewDrivinglicence Link",
				driver, true);
	}

	public void clickon_Contuinebutton() {
		stepstatus = basepage.clickElement(Contuine);
		reportEvent(stepstatus, "Able to click Contuinebutton", "Unable to click Contuinebutton", driver, true);
	}

	public void Set_LearnersLicenceNumber(String Value) {
		stepstatus = basepage.setText(LearnersLicenceNumber, Value);
		reportEvent(stepstatus, "Able to Enter LearnersLicenceNumber", "Unable to Enter LearnersLicenceNumber", driver,
				true);
	}

	public void Set_DateofBirth(String Value) {
		stepstatus = basepage.setText(DateofBirth, Value);
		reportEvent(stepstatus, "Able to Enter DateofBirth", "Unable to Enter DateofBirth", driver, true);
	}

	public void clickon_Okbutton() {
		stepstatus = basepage.clickElement(Ok);
		reportEvent(stepstatus, "Able to Click Ok button", "Unable to Click Ok button", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {

			basepage.dismissAlert(driver);
		}

		basepage.scrooldown(driver);
	}

	public void clickon_Selectallcheckbox() {
		basepage.scrooldown(driver);
		wait(1);
		stepstatus = basepage.clickElement(Selectall);
		reportEvent(stepstatus, "Able to click Selectallcheckbox", "Unable to click Selectallcheckbox", driver, true);
	}

	public void clickon_Submitbutton() {
		stepstatus = basepage.clickElement(Submit);
		reportEvent(stepstatus, "Able to click Submitbutton", "Unable to click Submitbutton", driver, true);
		if (basepage.alertExist(driver)) {

			basepage.acceptAlert(driver);
		} else {

			basepage.dismissAlert(driver);
		}
		
	}
	public void Set_DL_Application_Number() {
		stepstatus = basepage.clickElement(Selectall);
		reportEvent(stepstatus, "Able to click Selectallcheckbox", "Unable to click Selectallcheckbox", driver, true);
	}

}
