package testScripts;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import applicationPages.LLBacklogPage;
import frameworkLibrary.BaseClass;

public class _05_LLBacklog_with_Approval extends BaseClass {

	WebDriver driver;
	LLBacklogPage LLBacklogPage;
	
	String selectionString;
//	@BeforeSuite
//	public String EnviournmentSelection() {
//		Object[] options = { "Select Option", "S4Preprod", "S4testing", "SarathiCOV" };
//		Object	selectionObject = JOptionPane.showInputDialog(null, "Choose your option",
//				"Select Enviournment to Continue Testing", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
//		selectionString = selectionObject.toString();
//		//System.out.println(selectionObject);
//		System.out.println(selectionString);
//		return selectionString;
//	}

	
	@Test(invocationCount = 20)
	public void TC401() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://s4testing.nic.in/cas/login?service=https%3A%2F%2Fs4testing.nic.in%2Fsarathiservice%2Fsarathilogin.do");
		driver.manage().window().maximize();
		LLBacklogPage = new LLBacklogPage(driver);
		// LLBacklogPage.Clickon_Login_Button();
	//	LLBacklogPage.m1(selectionString);
		LLBacklogPage.setUserName(getdata("UserName"));
		LLBacklogPage.setpassword(getdata("Password"));
		LLBacklogPage.ClickonNext();
		LLBacklogPage.setotptext("123456");
		LLBacklogPage.ClickonLogin();
//		LLBacklogPage.SelectRTOtype();
//		LLBacklogPage.Clickonlogin();
		LLBacklogPage.Clickon_LL_Link();
		LLBacklogPage.Clickon_LLBacklog();
		LLBacklogPage.Set_Issuedate(getdata("Issuedate"));
		LLBacklogPage.Set_OriginalLLno(getdata("OriginalLLno"));
		LLBacklogPage.Set_NumaricLLNo(getdata("NumaricLLNo"));
		WebElement refno = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[2][normalize-space(text())]"));
		String text = refno.getText();
		System.out.println(text);

		LLBacklogPage.setdata("RefNo", text.substring(24).trim());

		WebElement LLtext = driver
				.findElement(By.xpath("//form[@id='LLBacklogAction']/center/h4[3][normalize-space(text())]"));
		String LLno = LLtext.getText();
		System.out.println(text);
		LLBacklogPage.setdata("LLNo", LLno.substring(17).trim());
		LLBacklogPage.Clickon_LLLink();
		LLBacklogPage.Clickon_LLBacklogApprove();
		LLBacklogPage.Clickon_LLBacklogApplicationno();
		LLBacklogPage.Clickon_LLBacklogApplicationnoProceed();
		LLBacklogPage.Clickon_LLBacklogApprovebutton();
		LLBacklogPage.Clickon_Logout();
		wait(3);
		driver.close();

	}
	
	
//	@AfterSuite
//	public void m2() {
//		
//		System.out.println("Hi");
//
//	}


}
