package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewDLSlotBookingPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public NewDLSlotBookingPage(WebDriver driver) {
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
	@FindBy(how = How.XPATH, using = "//input[@class='chk']")
	WebElement SelectCOVCheckbox; 
	@FindBy(how = How.XPATH, using = "//button[@id='prcdbook']")
	WebElement Proceedbook; 
	@FindBy(how = How.XPATH, using = "//button[@id='slotbtn']")
	WebElement Bookslot;
	@FindBy(how = How.XPATH, using = "//button[@id='slotcnfrmbtn']")
	WebElement Confirm_slotbook;
	
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
		public void Clickon_Selectcov() {
			stepstatus = basepage.clickElement(SelectCOVCheckbox);
			reportEvent(stepstatus, "Able to click SelectCOVCheckbox", "Unable to click SelectCOVCheckbox", driver, true);
		}
		public void Clickon_Proceedbook() {
			stepstatus = basepage.clickElement(Proceedbook);
			reportEvent(stepstatus, "Able to click Proceedbook", "Unable to click Proceedbook", driver, true);
		}
		public void Create_RandomDate() {
			stepstatus = basepage.Random_Datepicker(driver);
			reportEvent(stepstatus, "Able to click Randomdate", "Unable to  click Randomdate", driver, true);
		}

		public void Clickon_Slotbookingbutton(String ObjectXpath, String ObjectXpath1) {
			stepstatus = basepage.Slot_booking(driver, ObjectXpath, ObjectXpath1);
			reportEvent(stepstatus, "Able to do slotbooking", "Unable to do slotbooking", driver, true);
		}

		public void Clickon_Bookslotbutton() {
			stepstatus = basepage.clickElement(Bookslot);
			reportEvent(stepstatus, "Able to click Bookslotbutton", "Unable to  click Bookslotbutton", driver, true);
		}

		public void Clickon_Confirm_slotbookingbutton() {
			stepstatus = basepage.clickElement(Confirm_slotbook);
			reportEvent(stepstatus, "Able to click Confirm_slotbook", "Unable to  click Confirm_slotbook", driver, true);
		}


}
