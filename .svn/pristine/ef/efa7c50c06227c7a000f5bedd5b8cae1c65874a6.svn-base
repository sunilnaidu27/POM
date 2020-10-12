package applicationPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.google.common.io.Files;

import frameworkLibrary.FrameworkVariables;

public class UniversalState extends BasePage {

	NewLLRegistrtionPage NewLLRegistrtionPage;
	static XSSFWorkbook wb1;
	static XSSFSheet ws1;
	static FileInputStream fis;
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public UniversalState(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void StartAPP() throws IOException {
		loaddata();
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(capability);
		String env = getdata("ApplicationEnvironment");
		if (env.equalsIgnoreCase("SarathiCOV")) {
			driver.get(prop.getProperty("SarathiCOV"));
			driver.manage().window().maximize();
			System.out.println("Welcome to SarathiCOV");
		} else if (env.equalsIgnoreCase("SarathiProd")) {
			driver.get(prop.getProperty("SarathiProd"));
			driver.manage().window().maximize();
			System.out.println("Welcome to Sarathiprod");
		} else {
			System.out.println("Application URL is not matched.Please try again");
		}
	}

	public void PerformJob() throws IOException, ClassNotFoundException, SQLException, InterruptedException {
		loaddata();
		stcode = getdata("State");
		NewLLRegistrtionPage = new NewLLRegistrtionPage(driver);
		if (stcode.equalsIgnoreCase("AN")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("AN"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("AP")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("AP"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("AR")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("AR"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("AS")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("AS"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("BR")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("BR"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("CG")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("CG"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("CH")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("CH"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("DD")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("DD"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("DL")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("DL"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("DN")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("DN"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("GA")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("GA"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("GJ")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("GJ"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("HP")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("HP"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("HR")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("HR"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("JH")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("JH"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("JK")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("JK"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("KA")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("KA"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("KL")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("KL"));
			Initiate_Process();
			Flows F = new Flows(driver);
			F.VerifyFlows();
		} else if (stcode.equalsIgnoreCase("LA")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("LA"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("LD")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("LD"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("MH")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("MH"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("ML")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("ML"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("MN")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("MN"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("MP")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("MP"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("MZ")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("MZ"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("NL")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("NL"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("OD")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("OD"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("PB")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("PB"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("PY")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("PY"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("RJ")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("RJ"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("SK")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("SK"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("TN")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("TN"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("TR")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("TR"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("TS")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("TS"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("UA")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("UA"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("UK")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("UK"));
			Initiate_Process();
		} else if (stcode.equalsIgnoreCase("UP")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("UP"));
			Initiate_Process();
			Flows F = new Flows(driver);
			F.VerifyFlows();
		} else if (stcode.equalsIgnoreCase("WB")) {
			NewLLRegistrtionPage.Selectstatename(prop.getProperty("WB"));
			Initiate_Process();
		} else {
			System.out.println("Selected State is not available.Please check and Try Again.");
		}

	}

	public void Initiate_Process() throws ClassNotFoundException, SQLException, IOException {
		ConnecttoExcel(prop.getProperty("RTOCheck"), prop.getProperty("DataFile_State"));
		if (outcome.equalsIgnoreCase("P")) {
			ConnecttoExcel(prop.getProperty("LLDLCheck"), prop.getProperty("DataFile_State"));
			Validating_lldl_same_time_Check();
			NewLLRegistrtionPage.clickonContinue();
			Before_ApplicationSubmission_Checks();
		} else if (outcome.equalsIgnoreCase("B")) {
			NewLLRegistrtionPage.SelectRTO_Office_AfterStateSelection(getdata("RTOCode"));
			ConnecttoExcel(prop.getProperty("LLDLCheck"), prop.getProperty("DataFile_State"));
			Validating_lldl_same_time_Check();
			NewLLRegistrtionPage.clickonContinue();
			Before_ApplicationSubmission_Checks();
		} else if (outcome.equalsIgnoreCase("C")) {
			ConnecttoExcel(prop.getProperty("LLDLCheck"), prop.getProperty("DataFile_State"));
			Validating_lldl_same_time_Check();
			NewLLRegistrtionPage.SelectRTO_Office_AfterApplyNewLL(getdata("RTO"));
			NewLLRegistrtionPage.clickonContinue();
			Before_ApplicationSubmission_Checks();
		} else {
			System.out.println("************************RTO Checks*****************************");
		}
	}

	public void Validating_lldl_same_time_Check() throws ClassNotFoundException, SQLException {
		if (outcome.equalsIgnoreCase("1")) {
			System.out.println("********** Starting First Flow**************");
			NewLLRegistrtionPage.Mouserhoveron_LearnerLicence();
			NewLLRegistrtionPage.Clickon_Application_for_New_LearnerLicence();
		} else if (outcome.equalsIgnoreCase("0")) {
			System.out.println("********** Starting Second Flow**************");
			NewLLRegistrtionPage.Mouserhoveron_LearnerLicence();
			NewLLRegistrtionPage.Clickon_Application_for_New_LearnerLicence();

		} else {
			System.out.println("****Got New Key*****Please Verify*******");
		}

	}

	public void Before_ApplicationSubmission_Checks() throws ClassNotFoundException, SQLException, IOException {
		ConnecttoExcel(prop.getProperty("Camp"), prop.getProperty("DataFile_State"));
		if (outcome.equalsIgnoreCase("Y")) {
			NewLLRegistrtionPage.clickonSubmitonebutton();
			ConnecttoExcel(prop.getProperty("eKYC"), prop.getProperty("DataFile_State"));
			if (outcome.equalsIgnoreCase("Y")) {
				NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
				NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
				NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
				NewLLRegistrtionPage.ClickonGenerateOTP();
				NewLLRegistrtionPage.Getlogotp(prop.getProperty("SarathiCOVeKYCLogURL"));
				NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
				EnterApplicationFormDetails();
			} else if (outcome.equalsIgnoreCase("N")) {
				EnterApplicationFormDetails();
			} else {
				System.out.println("************Before_ApplicationSubmission_Checks_Camp=Y******************");
			}

		} else if (outcome.equalsIgnoreCase("N")) {
			NewLLRegistrtionPage.SelectRTOofficetodisplayCamp(getdata("RTOCode"));
			WebElement ele = driver.findElement(By.xpath(
					"//table[@class='scrollTable table-hover  table-striped table-bordered']/tbody/tr/td/input"));
			setCheckBox(ele, "ON");
			NewLLRegistrtionPage.clickonSubmitonebutton();
			ConnecttoExcel(prop.getProperty("eKYC"), prop.getProperty("DataFile_State"));
			if (outcome.equalsIgnoreCase("Y")) {
				NewLLRegistrtionPage.clickonapplyonApplicantdoesnotholdAadhaarnumber();
				NewLLRegistrtionPage.clickonapplyonSubmittwobutton();
				NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
				NewLLRegistrtionPage.ClickonGenerateOTP();
				NewLLRegistrtionPage.Getlogotp(prop.getProperty("SarathiCOVeKYCLogURL"));
				NewLLRegistrtionPage.ClickonAuthenticateWithSarathibutton();
				EnterApplicationFormDetails();
			} else if (outcome.equalsIgnoreCase("N")) {
				EnterApplicationFormDetails();
			} else {
				System.out.println("***********Before_ApplicationSubmission_Checks_Camp=N******************");
			}
		} else {
			System.out.println("********Before_ApplicationSubmission_Checks_Camp&eKYC*********");
		}
	}

	public void EnterApplicationFormDetails() {
		String State = getdata("State");
		NewLLRegistrtionPage.Set_State(prop.getProperty(State, "Default"));
		Verifying_PinMappingCheck();
		NewLLRegistrtionPage.SetFirstName(getdata("Firstname"));
		NewLLRegistrtionPage.SetLastName(getdata("Lastname"));
		NewLLRegistrtionPage.SetRelationType(getdata("RelationType"));
		NewLLRegistrtionPage.SetRelationFirstName(getdata("RelationFirstname"));
		NewLLRegistrtionPage.SetRelationLastName(getdata("Relationlastname"));
		NewLLRegistrtionPage.SetGender();
		NewLLRegistrtionPage.SetAge(getdata("Age"));
		NewLLRegistrtionPage.SetQualification(getdata("Qualification"));
		NewLLRegistrtionPage.SetBloodgroup(getdata("Bloodgrp"));
		NewLLRegistrtionPage.SetMobilenumber(getdata("Phone"));
		NewLLRegistrtionPage.SetState();
		NewLLRegistrtionPage.TypeDist();
		NewLLRegistrtionPage.SetPincode(getdata("Pincode"));
		NewLLRegistrtionPage.SetCopytopermenentaddress();
		NewLLRegistrtionPage.SetCOV(getdata("COV"));
		NewLLRegistrtionPage.SetCOV1(getdata("COV1"));
		// NewLLRegistrtionPage.SetCOV2(getdata("COV2"));
		NewLLRegistrtionPage.SetRightarrow();
		NewLLRegistrtionPage.ClickonWillingToDonate();
		Form_1_Check();
		CaptureDetails();

	}

	public void Form_1_Check() {
		ConnecttoExcel(prop.getProperty("Form1"), prop.getProperty("DataFile_State"));
		if (outcome.equalsIgnoreCase("Y")) {
			Fill_Form1Details();
			NewLLRegistrtionPage.SetSubmitthree();
		} else if (outcome.equalsIgnoreCase("N")) {
			NewLLRegistrtionPage.SetSubmitthree();
		} else {
			System.out.println("******************FORM1**********************");
		}

	}

	public void Fill_Form1Details() {
		NewLLRegistrtionPage.ClickonForm1_buttton();
		SwitchtoWindowByTitle("formOne", driver);
		List<WebElement> radio = driver.findElements(By.xpath("//label[text()='No']/preceding-sibling::input[1]"));
		for (WebElement subradio : radio) {
			subradio.click();
		}
		NewLLRegistrtionPage.ClickonDeclareCheckbox();
		NewLLRegistrtionPage.ClickonSubmitbuttonatForm1();
		closeWindowByTitle("FormOneSuccess", driver);
		SwitchtoWindowByTitle("Application For NewLL", driver);
	}

	public void Verifying_PinMappingCheck() {
		ConnecttoExcel(prop.getProperty("PinMapping"), prop.getProperty("DataFile_State"));
		if (outcome.equalsIgnoreCase("N")) {
			NewLLRegistrtionPage.Set_RTO_Office(getdata("RTOCode"));
		} else if (outcome.equalsIgnoreCase("R")) {
			NewLLRegistrtionPage.EnterPinCode(getdata("GetPinCode"));
		} else {
			System.out.println("***************New PinCode Mapping Value Found.Please Check***************");
		}
	}

	public void CaptureDetails() {
		NewLLApplicationNo = App_NO(driver, "//table/tbody/tr/td[text()='Application No  ']/following-sibling::td[1]");
		NewLLDOB = DOB(driver, "//table/tbody/tr[2]/td[3]/following-sibling::td");
		String title = driver.getTitle();
		if (title.equals("New LL Acknowledgement")) {
			NewLLRegistrtionPage.setdata("ApplicationNo", NewLLApplicationNo.substring(3).trim());
			NewLLRegistrtionPage.setdata("DateofBirth", NewLLDOB.substring(3).trim());
			NewLLRegistrtionPage.setdata("Status", "Pass");
		} else {
			System.out.println("New LL Acknowledgement is not Generated");
			NewLLRegistrtionPage.setdata("Status", "Fail");
			driver.close();
		}
	}

	public void ArrangeDataSet() {

		Faker faker = new Faker(new Locale("en-IND"));
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String relationfirstname = faker.name().firstName();
		String relationlastname = faker.name().lastName();

		setdata("Firstname", firstname);
		setdata("Lastname", lastname);
		setdata("RelationFirstname", relationfirstname);
		setdata("Relationlastname", relationlastname);

	}

	public String ConnectDB(String DBQuery, String Uservalue) throws ClassNotFoundException, SQLException {
		try {
			System.out.println("Connecting to Database..." + "\n" + df.format(new Date()) + ""
					+ "\n-----------------------------------------------------------------------------");
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://10.249.163.118:5432/sow4stgcov", "readonly",
					"readonly");
			System.out.println("Connected to Database");
		} catch (SQLException | ClassNotFoundException ex) {
			System.err.println("Failed to connect to DB");
			ex.printStackTrace();
		}
		st = conn.createStatement();
		rs = st.executeQuery(DBQuery);
		meta = rs.getMetaData();
		columnnumber = meta.getColumnCount();
		while (rs.next()) {
			String[] columnnames = new String[columnnumber];
			for (int i = 1; i <= columnnumber; i++) {
				columnnames[i - 1] = meta.getColumnName(i);
				// System.out.println(columnnames[i - 1]);
				if ((columnnames[i - 1]).contains(Uservalue)) {
					outcome = rs.getString(Uservalue);
					System.out.println("Fetched value from DB for UserInput is: " + outcome);
				}
			}
		}
		if (conn != null) {

			conn.close();
			System.out.println("Disconnected from Database..." + "\n" + df.format(new Date()) + ""
					+ "\n-----------------------------------------------------------------------------");
		}
		return outcome;
	}

	public void ConnecttoExcel(String Check, String Filename) {

		try {

			String FilePath = "Database\\" + Filename + ".xlsx";
			File f1 = new File(FilePath);
			fis = new FileInputStream(f1);
			wb1 = new XSSFWorkbook(fis);
			XSSFFormulaEvaluator.evaluateAllFormulaCells(wb1);
			ws1 = wb1.getSheetAt(0);
			getoutput(Check);
			fis.close();
			wb1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Map<String, String> getfielddata(String stname) {

		Map<String, String> data = new HashMap<>();
		if (!data.isEmpty()) {

			data.clear();
		}
		try {
			int rowcount = ws1.getLastRowNum();
			System.out.println("Row Count: " + rowcount);
			int colcount = ws1.getRow(rowcount).getLastCellNum();
			System.out.println("Column Count: " + colcount);
			for (int i = 0; i <= rowcount; i++) {
				String stcde = ws1.getRow(i).getCell(0).getStringCellValue();
				if (stcde.equalsIgnoreCase(stname)) {

					for (int j = 0; j < colcount; j++) {
						String header = ws1.getRow(0).getCell(j).getStringCellValue();
						String coldata = ws1.getRow(i).getCell(j).getStringCellValue();
						data.put(header, coldata);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}

	public String getoutput(String Check) {

		try {
			Map<String, String> data = getfielddata(getdata("State"));
			outcome = data.get(Check);
			System.out.println(outcome);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return outcome;

	}

	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("_dd-MMM-yyyy_HH:mm a");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static String GetCurrentDate() {

		Date myDate = new Date();
		File dir = new File(new SimpleDateFormat("dd-MM-yyyy").format(myDate));
		String str = dir.getName();
		return str;
	}

	public static String ParentFolder(String path) {

		File theDir = new File("C:\\" + path);
		if (!theDir.exists()) {
			System.out.println("creating directory: " + theDir.getName());
			theDir.mkdir();
		} else {
			System.out.println("Automation Backup Folder is already exist");
		}
		return path;

	}

	public static String CreateFolder(String path) {

		File theDir = new File("C:\\AutomationBackup\\" + path);
		if (!theDir.exists()) {
			System.out.println("creating directory: " + theDir.getName());
			theDir.mkdir();
		} else {
			System.out.println("Today's Date Folder already created ");
		}
		return path;

	}

	public static void BackupFile(String SourceFileName, String DestinationFileName) throws IOException {

		String Filesource = "DataFiles\\" + SourceFileName + ".xlsx";
		File Source = new File(Filesource);
		File Destination = new File("C:\\" + ParentFolder("AutomationBackup") + "\\" + CreateFolder(GetCurrentDate())
				+ "\\" + DestinationFileName + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".xlsx");
		if (!Source.exists()) {
			return;
		}
		if (!Destination.exists()) {
			Destination.createNewFile();
		}
		FileChannel SourceFile = null;
		FileChannel DestinationFile = null;
		SourceFile = new FileInputStream(Source).getChannel();
		DestinationFile = new FileOutputStream(Destination).getChannel();
		if (DestinationFile != null && SourceFile != null) {
			DestinationFile.transferFrom(SourceFile, 0, SourceFile.size());
		}

		if (SourceFile != null) {
			SourceFile.close();
		}
		if (DestinationFile != null) {
			DestinationFile.close();
		}

	}

}
