package testScripts;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import applicationPages.Data_Refreshfrom_Database;
import applicationPages.UniversalState;
import frameworkLibrary.BaseClass;

public class NewLL extends BaseClass {
	WebDriver driver;
	UniversalState universalstate;

	@BeforeSuite
	public void Start() {

		System.out.println("***************Welcome to Sarathi Automation*********************");
	}

	@BeforeMethod
	public void Predatacheck() throws IOException {
		System.out.println("*************Staring Data Pre Check**************");
		universalstate = new UniversalState(driver);
		universalstate.ArrangeDataSet();

	}

	@Test(invocationCount = 2)
	public void NewLL_Public() throws ClassNotFoundException, IOException, SQLException, InterruptedException {
		universalstate = new UniversalState(driver);
		universalstate.StartAPP();
		universalstate.PerformJob();

	}

	@AfterMethod
	public void CloseBrowsers() {
		System.out.println("**************Data Precheck Sucess***************");
	}

	@AfterSuite
	public void End() throws IOException {
		System.out.println("***************Backuping the Files*****************");
		UniversalState.BackupFile("NewLL", "NewLLTestBackup");
	}

}
