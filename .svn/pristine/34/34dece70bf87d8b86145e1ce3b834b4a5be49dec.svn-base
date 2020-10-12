package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewDLUploadDocumentsPage extends BasePage{
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public NewDLUploadDocumentsPage(WebDriver driver) {
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
	@FindBy(how = How.XPATH, using = "//input[@name='method:displayDocuments']")
	WebElement Ok;
	@FindBy(how = How.XPATH, using = "//select[@name='documentType']")
	WebElement Document;
	@FindBy(how = How.XPATH, using = "//select[@name='relatedDocuments']")
	WebElement Proof;
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-8']/div/input[1]")
	WebElement Choosefile;
	@FindBy(how = How.XPATH, using = "//input[@id='upload']")
	WebElement Upload;
	@FindBy(how = How.XPATH, using = "//input[@name='method:confirm']")
	WebElement Confirm;
	
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

		public void Clickon_ok_Button() {
			stepstatus = basepage.clickElement(Ok);
			reportEvent(stepstatus, "Able to click Ok button", "Unable to click Ok button", driver, true);
		}
		
		public void Set_FirstDocument(String option) {
			stepstatus = basepage.setOptionInSelectBox(Document, option);
			reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
		}

		public void Set_First_Proof_Document(String option) {
			stepstatus = basepage.setOptionInSelectBox(Proof, option);
			reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
		}

		public void Clickon_Choosefile_Button1() {
			wait(3);
			driver.findElement(By.xpath("//div[@class='col-md-8']/div/input[1]")).sendKeys("D:\\Selenium_Softwares\\SampleTestfiles\\passpic.jpg");
			driver.findElement(By.xpath("//input[@id='upload']")).click();
			driver.findElement(By.xpath("//input[@id='confirm']")).click();
		}


		public void Set_Second_Document(String option) {
			stepstatus = basepage.setOptionInSelectBox(Document, option);
			reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select First Document", driver, true);
		}

		public void Set_Second_Proof_Document(String option) {
			stepstatus = basepage.setOptionInSelectBox(Proof, option);
			reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select Proof Document", driver, true);
		}

		public void Clickon_Choosefile_Button2() {
			wait(3);
			driver.findElement(By.xpath("//div[@class='col-md-8']/div/input[1]")).sendKeys("D:\\Selenium_Softwares\\SampleTestfiles\\passpic.jpg");
			driver.findElement(By.xpath("//input[@id='upload']")).click();
			driver.findElement(By.xpath("//input[@id='confirm']")).click();
		}
}
