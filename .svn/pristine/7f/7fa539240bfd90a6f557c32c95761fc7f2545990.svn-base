package testScripts;

import java.util.Properties;

import javax.swing.JOptionPane;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import applicationPages.Pg10_Login;
import applicationPages.DL_Backlog;
import frameworkLibrary.BaseClass;

public class Module2 {
	
	WebDriver driver;

	String selectionString;
	Properties p = new Properties();
	@BeforeSuite
	public String m1() {
		Object[] options = { "Select Option", "S4Preprod", "S4testing", "SarathiCOV" };
		Object selectionObject = JOptionPane.showInputDialog(null, "Choose your option",
				"Select Enviournment to Continue Testing", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		 selectionString = selectionObject.toString();
		System.out.println(selectionObject);
		if(p.contains(selectionString)) {
			
			System.out.println("HI");
		}

		return selectionString;

	}

	@Test(invocationCount = 1)
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(p.getProperty("S4Preprod"));
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void m2() {
		
		System.out.println("Hi");

	}

}
