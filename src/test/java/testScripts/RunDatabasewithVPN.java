package testScripts;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import applicationPages.Data_Refreshfrom_Database;
import frameworkLibrary.BaseClass;

public class RunDatabasewithVPN extends BaseClass {
	WebDriver driver;

	@Test
	public void DataRefresh() throws ClassNotFoundException, SQLException, IOException {
		Data_Refreshfrom_Database db = new Data_Refreshfrom_Database(driver);
		db.ConnectDB(getdata("UserQuery"), getdata("UserDesiredFileName"), getdata("UserdesiredSheetName"));
	}

}
