package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Test {

	public static void main(String[] args) throws IOException {
		String filepath = "Database\\RTOCustom.xlsx";
		File file = new File(filepath);
		XSSFWorkbook workbook;
		if (file.exists() == false) {
			System.out.println("Creating a new workbook '" + file + "'");
			workbook = new XSSFWorkbook();
		} else {
			System.out.println("Appending to existing workbook '" + file + "'");
			final InputStream is = new FileInputStream(file);
			
			
			try {
				workbook = new XSSFWorkbook(is);
			} finally {
				is.close();
			}
		}
	
	}
}