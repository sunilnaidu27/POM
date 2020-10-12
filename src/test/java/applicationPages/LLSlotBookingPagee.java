package applicationPages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LLSlotBookingPagee extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;


	public LLSlotBookingPagee(WebDriver driver) {
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
	@FindBy(how = How.XPATH, using = "//input[@id='applNum']")
	WebElement Application_Number;
	@FindBy(how = How.XPATH, using = "//input[@name='dateOfBirth']")
	WebElement DateofBirth;
	@FindBy(how = How.XPATH, using = "//input[@id='submit']")
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//button[@id='applViewStages_0']")
	WebElement Proceed;
	@FindBy(how = How.XPATH, using = "//input[@id='dispappldetform_PROCEEDTOBOOK']")
	WebElement ProceedtoBookSlot;
	@FindBy(how = How.XPATH, using = "//button[@id='slotbtn']")
	WebElement Bookslot;
	@FindBy(how = How.XPATH, using = "//button[@id='slotcnfrmbtn']")
	WebElement Confirm_slotbook;
	@FindBy(how = How.XPATH, using = "//input[@value='NEXT']")
	WebElement Next;
	@FindBy(how = How.XPATH, using = "//input[@value='LL SLOT BOOK']")
	WebElement Clickradio;

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

	public void Clickon_Proceed_Button() throws IOException {
		if (basepage.clickElement(Clickradio)) {
			stepstatus = basepage.clickElement(Proceed);
			// reportEvent(stepstatus, "Able to click Proceed button", "Unable to click
			// Proceed button", driver, true);
			String PageTitle = driver.getTitle();
			System.out.println(PageTitle);
			if (PageTitle.equalsIgnoreCase("Sending SMS")) {
				loaddata();
				GetSecutiryCode(prop.getProperty("SarathiCOVSlotsSecurityCodeLogURL"));
				Clickon_ProceedtoBookSlot_Button();
				
			} else {
				Clickon_ProceedtoBookSlot_Button();
			}

		}
	}

	public void Clickon_ProceedtoBookSlot_Button() {
		stepstatus = basepage.clickElement(ProceedtoBookSlot);
		reportEvent(stepstatus, "Able to click ProceedtoBookSlot button", "Unable to click ProceedtoBookSlot button",
				driver, true);

	}

	public String GetSecutiryCode(String url) throws IOException {
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
				if (strCurrentLine.contains("One Time Password is")) {
					if (strCurrentLine.contains("One Time Password is")) {
						getotp = strCurrentLine.substring(93, 99).trim();
						// System.out.println(getotp);
					}
					count++;
				} else {
					System.out.println("#######################Pleasae Check OTP Section###########################");
				}
			}
			// System.out.println(count);
			System.out.println(getotp);
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath("//input[@id='securityForm_smsCode']")).sendKeys(getotp);
			driver.findElement(By.xpath("//input[@id='securityForm_smsCode']")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//input[@id='securityForm__submitSecurityCode']")).click();
			driver.switchTo().window(tabs.get(1)).close();
			driver.switchTo().window(tabs.get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return getotp;
	}

	public void Booking_Slot() {
		List<WebElement> GreenColorDates = driver.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
		int TotalAvailbleGreenColorDates = GreenColorDates.size();
		System.out.println("Available Dates: " + TotalAvailbleGreenColorDates);
		WebElement TotalGreenColorDates;
		String Datestext;
		List<WebElement> Timeslots;
		int timeslots;
		WebElement eletimeslot;
		String timeslottxt;
		WebElement seatslabel;
		String seatstxt;
		if (TotalAvailbleGreenColorDates == 1) {
			System.out.println("Please Check Date Logic We found only one day.Please click on next button");
		} else {
			outerloop: for (int i = 0; i < TotalAvailbleGreenColorDates; i++) {
				GreenColorDates = driver.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
				TotalGreenColorDates = GreenColorDates.get(i);
				Datestext = TotalGreenColorDates.getText();
				System.out.println(Datestext);
				GreenColorDates.get(i).click();
				Timeslots = driver.findElements(By.xpath(
						"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr/td[1]"));
				timeslots = Timeslots.size();
				System.out.println(timeslots);

				for (int j = 0; j < timeslots; j++) {
					eletimeslot = Timeslots.get(j);
					timeslottxt = eletimeslot.getText();
					seatslabel = driver.findElement(By.xpath(
							"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr["
									+ 1 + "+" + j + "]/td[2]/label"));
					seatstxt = seatslabel.getText();
					if (!seatstxt.equalsIgnoreCase("0")) {
						System.out.println(timeslottxt + " Availble Seats is: " + seatstxt);
						driver.findElement(By.xpath(
								"//table[@class='table table-bordered table-striped table-hover']//following-sibling::tr["
										+ 1 + "+" + j + "]/td[2]/input"))
								.click();

						break outerloop;
					} else {
						System.out.println(timeslottxt + " Availble Seats is: " + seatstxt);
					}

				}

			}

		}
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

	public void Clickon_Next() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click Next", "Unable to  click Next", driver, true);
	}

	public static String GetCurrentDate() throws ParseException {

		Date myDate = new Date();
		String date = new SimpleDateFormat("dd").format(myDate);
		System.out.println(date);
		return date;
	}

	public void BookLLSlot() throws ParseException {

		List<WebElement> GreenColorDates = driver.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
		int TotalAvailbleGreenColorDates = GreenColorDates.size();
		System.out.println("Available Dates: " + TotalAvailbleGreenColorDates);
		for (WebElement TotalGreenColorDates : GreenColorDates) {

			String Datestext = TotalGreenColorDates.getText();
			if (Datestext.contains(GetCurrentDate())) {
				System.out.println("****Todays date is availble in the current list****");
				TotalGreenColorDates.click();

			} else {

				System.out.println("****Todays date is not available in the availble list****");
			}

		}

	}

}
