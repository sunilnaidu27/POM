package applicationPages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UploadDocumentsPage extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public UploadDocumentsPage(WebDriver driver) {
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
	@FindBy(how = How.XPATH, using = "//input[@name='applicationNum']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='dateOfBirth']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//input[@id='submitbtn']")
	WebElement Submit1;
	@FindBy(how = How.XPATH, using = "//input[@value='UPLOAD DOCUMENTS']")
	WebElement Clickradio;
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
	@FindBy(how = How.XPATH, using = "//button[@value='next']")
	WebElement Next;

	// Related methods to perform operation on webelements

	public String Getlogotp(String url) throws IOException {

		wait(3);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // switches to new tab
		driver.get(url);
		// driver.navigate().refresh();

		String output = driver.findElement(By.cssSelector("body")).getText();
		File DestFile = new File(".\\logfile.txt");
		PrintWriter writer = new PrintWriter(DestFile);
		writer.print("");
		writer.close();
		FileUtils.writeStringToFile(DestFile, output);

		String FILENAME = ".\\logfile.txt";
		String getotp = null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String strCurrentLine;
			int count = 0;
			while ((strCurrentLine = br.readLine()) != null) {

				if (strCurrentLine.contains("OTP msg -->OTP (One Time Password) for Application Status is")) {
					if (strCurrentLine.contains("OTP msg -->OTP (One Time Password) for Application Status is")) {

						// System.out.println(strCurrentLine.substring(136,142).trim());
						getotp = strCurrentLine.substring(136, 142).trim();
						// System.out.println(getotp);

					}
					count++;
				} else {

				}

			}

			// System.out.println(count);
			System.out.println(getotp);

			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath("//input[@name='mobEnteredOtp']")).sendKeys(getotp);
			driver.findElement(By.xpath("//input[@name='Verify']")).click();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return getotp;
	}

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
		reportEvent(stepstatus, "Able to click submit button", "Unable to click submit button", driver);
	}

	public void Clickon_Submit1_Button() {
		stepstatus = basepage.clickElement(Submit1);
		reportEvent(stepstatus, "Able to click submit1 button", "Unable to click submit1 button", driver);
	}

	public void Do_ScrollDown() {
		stepstatus = basepage.scrooldown(driver);
		reportEvent(stepstatus, "Able to do Scrolldown", "Unable to do Scrolldown", driver, true);
	}

	public void Clickon_Proceed_Button() {

		if (basepage.isSelected(Clickradio)) {

			stepstatus = basepage.clickElement(Proceed);
			reportEvent(stepstatus, "Able to click Proceed button", "Unable to click Proceed button", driver, true);

		} else {

			stepstatus = basepage.clickElement(Clickradio);
			stepstatus = basepage.clickElement(Proceed);

		}

	}

	List<WebElement> options;

	public void Clickon_ok_Button() throws IOException, InterruptedException {
		stepstatus = basepage.clickElement(Ok);
		// reportEvent(stepstatus, "Able to click Ok button", "Unable to click
		// Ok button", driver, true);
		WebElement DocumentType = driver.findElement(By.xpath("//select[@name='documentType']"));
		// WebElement ProofDocument =
		// driver.findElement(By.xpath("//select[@name='relatedDocuments']"));
		Select Doc = new Select(DocumentType);

		List<WebElement> options = Doc.getOptions();

		for (int i = 0; i <= options.size() - 1; i++) {

			try {
				DocumentType = driver.findElement(By.xpath("//select[@name='documentType']"));
				Doc = new Select(DocumentType);
				options = Doc.getOptions();

				if (!options.get(1).getText().contains("Select")) {

					System.out.println(options.get(1).getText());
					Doc.selectByVisibleText(options.get(1).getText());
					Thread.sleep(5000);
					WebElement ProofDocument = driver.findElement(By.xpath("//select[@name='relatedDocuments']"));
					Select Proof = new Select(ProofDocument);
					List<WebElement> Proofoptions = Proof.getOptions();
					System.out.println(Proofoptions.get(1).getText());
					Proofoptions.get(1).getText();
					if (Proof.getOptions().size() > 1
							&& !Proof.getOptions().get(1).getText().toLowerCase().contains("select")) {

						Proof.selectByIndex(1);
						if (alertExist(driver)) {
							acceptAlert(driver);
							Clickon_Choosefile_Button1();
						} else {
							Clickon_Choosefile_Button1();
						}
					}

				} else {

					System.out.println("Else block....: " + options.get(1).getText());
				}

			} catch (StaleElementReferenceException f) {

				f.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
		Clickon_Next_Button();

	}

	public void Clickon_Choosefile_Button1() throws IOException {
		wait(3);

		driver.findElement(By.xpath("//div[@class='col-md-8']/div/input[1]"))
				.sendKeys(System.getProperty("user.dir") + "\\SampleUploadFiles\\image.jpeg");
		driver.findElement(By.xpath("//input[@id='upload']")).click();
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
	}

	public void Clickon_Next_Button() {

		WebElement finalte = driver.findElement(By.xpath("//label[text()='All Documents are Uploaded Successfully']"));

		String ftext = finalte.getText();

		if (ftext.equalsIgnoreCase("All Documents are Uploaded Successfully")) {

			stepstatus = basepage.clickElement(Next);
		}

	}

	// public void Set_FirstDocument(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_First_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// public void Clickon_Choosefile_Button1() throws IOException {
	// wait(3);
	// driver.findElement(By.xpath("//div[@class='col-md-8']/div/input[1]"))
	// .sendKeys("D:\\Selenium_Softwares\\SampleTestfiles\\Rajeshpassport.jpg");
	// driver.findElement(By.xpath("//input[@id='upload']")).click();
	// driver.findElement(By.xpath("//input[@id='confirm']")).click();
	// }
	//
	// public void Set_Second_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Second_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// if (basepage.alertExist(driver)) {
	//
	// basepage.acceptAlert(driver);
	//
	// } else {
	// basepage.dismissAlert(driver);
	// }
	// }
	//
	// public void Clickon_Choosefile_Button2() {
	// stepstatus = basepage.clickElement(Choosefile);
	// reportEvent(stepstatus, "Able to click Choosefile button", "Unable to click
	// Choosefile button", driver, true);
	// basepage.Upload("D:\\Autoitfiles\\Testsig.exe");
	// }
	//
	// public void Set_Third_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Third_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// public void Set_Fourth_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Fourth_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// public void Set_Fifth_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Fifth_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// @FindBy(how = How.XPATH, using = "//button[@id='exit']")
	// WebElement Nextbuttonafterfivedocs;
	//
	// public void Clickon_Nextbuttonafterfivedocs() {
	// stepstatus = basepage.clickElement(Nextbuttonafterfivedocs);
	// reportEvent(stepstatus, "Able to click Nextbuttonafterfivedocs", "Unable to
	// click Nextbuttonafterfivedocs",
	// driver, true);
	// }
	//
	// public void Set_Sixth_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Sixth_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// public void Set_Seventh_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Document, option);
	// reportEvent(stepstatus, "Able to Select First Document ", "Unable to Select
	// First Document", driver, true);
	// }
	//
	// public void Set_Seventh_Proof_Document(String option) {
	// stepstatus = basepage.setOptionInSelectBox(Proof, option);
	// reportEvent(stepstatus, "Able to Select Proof Document", "Unable to Select
	// Proof Document", driver, true);
	// }
	//
	// public void Clickon_Choosefile_Button3() {
	// stepstatus = basepage.clickElement(Choosefile);
	// reportEvent(stepstatus, "Able to click Choosefile button", "Unable to click
	// Choosefile button", driver, true);
	// basepage.Upload("D:\\Autoitfiles\\Testsig.exe");
	// }

}
