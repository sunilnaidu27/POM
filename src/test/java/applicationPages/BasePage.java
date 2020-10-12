package applicationPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import frameworkLibrary.FrameworkVariables;
import frameworkLibrary.ReportLibrary;

public class BasePage extends ReportLibrary {
	Properties prop;
	protected static String s1, s2, s3, s4, s5, s6, s7, s10, s11, s12, s13, s14, CLApplicationnumber, CLDateofBirth,
			CLLicencenumber, CLBadgenumber, ChangeofnameinDLAppliationno, ChangeofAddressApplicationNo,
			ChangeofAddressDOB, RenewalofDLApplicationNo, DL_Service_IssueofDuplicateDLApplicationNo,
			DL_Service_ReplacementofDLApplicationNo, DL_Service_IssueofNOCApplicationNo, DL_ExtractApplicationNo,
			Issueof_International_Driving_PermitApplicationNo, Change_of_Biometrics_in_DLApplicationNo,
			DL_Service_Issue_Of_PSVBadge_to_DriverApplicationNo, HolidingforeignDLApplicationNo,
			HolidingforeignDLDateofBirth, Renewal_with_ReTestApplicationNo,
			Endorsement_to_drive_in_Hill_regionApplicationNo;

	/* New Global Strings */
	protected static String NewLLApplicationNo, NewLLDOB;
	protected static String otptextineKYCform;
	protected static String stcode;
	protected static SimpleDateFormat df = new SimpleDateFormat();
	Connection conn = null;
	Statement st;
	ResultSet rs;
	ResultSetMetaData meta;
	int columnnumber;
	String outcome = null;

	protected boolean setText(WebElement ele, String StrValue) {
		boolean stepstatus;
		try {
			ele.clear();
			ele.sendKeys(StrValue);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SetTextAndEscape(WebElement ele, String Value) {
		Boolean stepStatus;
		try {

			ele.clear();
			ele.sendKeys(Value);
			ele.sendKeys(Keys.ESCAPE);
			String Enteredvalue = "";
			Enteredvalue = ele.getAttribute("value");
			if (!Enteredvalue.equalsIgnoreCase(Value)) {
				stepStatus = false;
			}
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepStatus;
	}

	protected boolean SetTextAndTAB(WebElement ele, String Value) {
		Boolean stepStatus;
		try {

			ele.clear();
			ele.sendKeys(Value);
			ele.sendKeys(Keys.TAB);
			String Enteredvalue = "";
			Enteredvalue = ele.getAttribute("value");
			if (!Enteredvalue.equalsIgnoreCase(Value)) {
				stepStatus = false;
			}
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepStatus;
	}

	protected boolean clickElement(WebElement ele) {
		boolean stepstatus;
		try {
			ele.click();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean clickifElementTextEquals(List<WebElement> allitems, String TextValue) {
		boolean stepstatus;
		try {
			for (WebElement ele : allitems) {
				if (ele.getText().equals(TextValue)) {
					ele.click();
				}
			}
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean clickifElementAttributeValueEquals(List<WebElement> allitems, String AttributeName,
			String AttributeValue) {
		boolean stepstatus;
		try {
			for (WebElement ele : allitems) {
				if (ele.getAttribute(AttributeName).equals(AttributeValue)) {
					ele.click();
				}
			}
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean setOptionInSelectBox(WebElement ele, String eleOption) {
		boolean stepstatus = false;
		try {
			new Select(ele).selectByVisibleText(eleOption);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean setValueInSelectBox(WebElement ele, String eleOption) {
		boolean stepstatus = false;
		try {
			new Select(ele).selectByValue(eleOption);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean setCheckBox(WebElement ele, String ONorOFF) {
		boolean stepstatus = false;
		try {

			switch (ONorOFF.toLowerCase()) {
			case "on":
				if (!ele.isSelected()) {
					ele.click();
				}
				stepstatus = true;
				break;
			case "off":
				if (ele.isSelected()) {
					ele.click();
				}
				stepstatus = true;
				break;
			default:
				stepstatus = false;
				break;
			}

		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected String getLinkText(WebElement ele) {
		String value = "";
		try {

			if (exists(ele)) {
				value = ele.getText();
			}
		} catch (Exception e) {
			value = "";
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return value;
	}

	protected String getAttributeValue(WebElement ele, String AttributeName) {
		String value = "";
		try {

			if (exists(ele)) {
				value = ele.getAttribute(AttributeName);
			}
		} catch (Exception e) {
			value = "";
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return value;
	}

	protected void waitForPageToLoad(WebDriver driver) {
		String pageLoadStatus;
		do {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			pageLoadStatus = (String) js.executeScript("return document.readyState");
		} while (!pageLoadStatus.equals("complete"));
	}

	protected boolean exists(WebElement ele) {
		boolean stepstatus;
		try {

			stepstatus = ele.isDisplayed();
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean isEnabled(WebElement ele) {
		boolean stepstatus;
		try {
			stepstatus = ele.isEnabled();
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean isSelected(WebElement ele) {
		boolean stepstatus;
		try {
			stepstatus = ele.isSelected();
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean isDisplayed(WebElement ele) {
		boolean stepstatus;
		try {
			stepstatus = ele.isDisplayed();
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean mouseHover(WebElement ele, WebDriver driver) {
		boolean stepstatus;
		try {
			Actions a1 = new Actions(driver);
			a1.moveToElement(ele);
			a1.build().perform();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean rightClick(WebElement ele, WebDriver driver) {
		boolean stepstatus;
		try {
			Actions a1 = new Actions(driver);
			a1.contextClick(ele);
			a1.build().perform();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean doubleClick(WebElement ele, WebDriver driver) {
		boolean stepstatus;
		try {
			Actions a1 = new Actions(driver);
			a1.doubleClick(ele);
			a1.build().perform();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean dragAndDrop(WebElement drag, WebElement drop, WebDriver driver) {
		boolean stepstatus;
		try {
			Actions a1 = new Actions(driver);
			a1.dragAndDrop(drag, drop);
			a1.build().perform();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean JsclickElement(WebElement ele, WebDriver driver) {
		boolean stepstatus;
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean JssetText(WebElement ele, String StrValue, WebDriver driver) {
		boolean stepstatus;
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='" + StrValue + ";", ele);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean JsScrollToWebElement(WebElement ele, WebDriver driver) {
		boolean stepstatus;
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean acceptAlert(WebDriver driver) {
		boolean stepstatus;
		try {
			Alert a1 = driver.switchTo().alert();
			a1.accept();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean dismissAlert(WebDriver driver) {
		boolean stepstatus;
		try {
			Alert a1 = driver.switchTo().alert();
			a1.dismiss();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean alertExist(WebDriver driver) {
		boolean stepstatus;
		try {
			driver.switchTo().alert();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected String alertGetText(WebDriver driver) {
		String StrValue = "";
		try {
			Alert a1 = driver.switchTo().alert();
			StrValue = a1.getText();
		} catch (Exception e) {
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return StrValue;
	}

	protected boolean isWindowExistsByURL(String URL, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getCurrentUrl();
				if (CurrentURL.contains(URL)) {
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean isWindowExistsByTitle(String Title, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getTitle();
				if (CurrentURL.contains(Title)) {
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SwitchtoWindowByURL(String URL, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getCurrentUrl();
				if (CurrentURL.contains(URL)) {
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean Closeandcheckchildwindows(WebDriver driver, String Parentwindow, String ChildWindow) {
		boolean isclosedflag = false;
		Set<String> allwindoes = driver.getWindowHandles();
		try {

			for (String str : allwindoes) {

				if (!(str.equals(Parentwindow) && !(str.equalsIgnoreCase(ChildWindow)))) {

					driver.close();
					isclosedflag = true;
				}

			}
			return isclosedflag;
		} catch (Exception e) {

		}
		return isclosedflag;

	}

	protected boolean SwitchtoWindowByTitle(String Title, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getTitle();
				if (CurrentURL.contains(Title)) {
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean closeWindowByURL(String URL, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getCurrentUrl();
				if (CurrentURL.contains(URL)) {
					driver.close();
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean closeWindowByTitle(String Title, WebDriver driver) {
		boolean stepstatus = false;
		try {
			Set<String> allhandles = driver.getWindowHandles();
			for (String handle : allhandles) {
				driver.switchTo().window(handle);
				String CurrentURL = driver.getTitle();
				if (CurrentURL.contains(Title)) {
					driver.close();
					stepstatus = true;
					break;
				}
			}
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SwitchtoFrameByElementReference(WebElement FrameRef, WebDriver driver) {
		boolean stepstatus = false;
		try {
			driver.switchTo().frame(FrameRef);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SwitchtoFrameByName(String FrameName, WebDriver driver) {
		boolean stepstatus = false;
		try {
			driver.switchTo().frame(FrameName);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SwitchtoFrameByIndex(int FrameIndex, WebDriver driver) {
		boolean stepstatus = false;
		try {
			driver.switchTo().frame(FrameIndex);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean SwitchtoMainDocument(WebDriver driver) {
		boolean stepstatus = false;
		try {
			driver.switchTo().defaultContent();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean RobotKeysFileUpload(String Filepath) {
		boolean stepstatus;
		try {
			wait(2);
			StringSelection selection = new StringSelection(Filepath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(selection, selection);

			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);

			wait(2);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			wait(2);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean clickifElementAttributeValueContains(List<WebElement> allitems, String AttributeName,
			String AttributeValue) {
		boolean stepstatus;
		try {
			for (WebElement ele : allitems) {
				if (ele.getAttribute(AttributeName).contains(AttributeValue)) {
					ele.click();
				}
			}
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean wait(int timeInSec) {
		boolean stepStatus;
		try {
			Thread.sleep(timeInSec * 1000);
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepStatus;
	}

	protected boolean dynamicWait(By by, int waittimeinsec, WebDriver driver) {
		boolean status = false;
		int counter = 0;
		while (counter <= waittimeinsec) {
			try {
				driver.findElement(by);
				status = true;
				break;
			} catch (Exception e) {
				wait(1);
			}
			counter = counter + 1;
		}
		if (counter > waittimeinsec) {
			status = false;
		}
		return status;
	}

	protected boolean quitdriver(WebDriver driver) {
		boolean stepstatus = false;
		try {
			driver.quit();
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;
	}

	protected boolean scrooldown(WebDriver driver) {
		boolean stepstatus = false;

		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			stepstatus = true;
		} catch (Exception e) {

			stepstatus = false;
			System.out.println("Scroll down not working");
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepstatus;

	}

	protected boolean Upload(String filepath) {
		boolean stepstatus;
		try {
			//
			// ProcessBuilder p = new ProcessBuilder(filepath);
			// p.start();
			Runtime.getRuntime().exec(filepath);
			stepstatus = true;
		} catch (Exception e) {
			stepstatus = false;
			System.out.println("Upload file is failed");
			FrameworkVariables.getInstance().setExceptionDescription(e);

		}
		return stepstatus;

	}

	protected Boolean CaptureSignature(WebDriver driver, WebElement ele, String ObjectXpath) {
		boolean stepStatus;
		try {

			WebElement text = driver.findElement(By.cssSelector(ObjectXpath));
			Actions actionBuilder = new Actions(driver);
			Action drawAction = actionBuilder.moveToElement(text, 300, 40).click().clickAndHold(text)
					.moveByOffset(80, 80).moveByOffset(40, 40).moveByOffset(-70, -70).release(text).build();
			drawAction.perform();
			stepStatus = true;

		} catch (Exception e) {

			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);

		}
		return stepStatus;
	}

	protected boolean Random_Datepicker(WebDriver driver) {
		@SuppressWarnings("unused")
		boolean stepStatus;

		String str;
		try {
			/* 1st Random */
			Random r = new Random();
			int low = 30;
			int high = 30;
			int result = r.nextInt(high - low) + low;
			// System.out.println("Random Number is " + result);

			/* 2nd Random */
			Random r1 = new Random();
			int low1 = 29;
			int high1 = 30;
			int result1 = r1.nextInt(high1 - low1) + low1;
			// System.out.println("Random Number is " + result1);

			/* 3rd Random */
			Random r2 = new Random();
			int low2 = 29;
			int high2 = 30;
			int result2 = r2.nextInt(high2 - low2) + low2;
			// System.out.println("Random Number is " + result2);

			List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
			// int sa = ele.size();
			// System.out.println("Size is "+sa);
			for (WebElement ele1 : ele) {
				str = ele1.getText();
				if (str.contains(Integer.toString(result))) {
					System.out.println("Selected Date is in result :" + result);
					ele1.click();
					break;
				} else if (str.contains(Integer.toString(result1))) {
					System.out.println("Selected Date is in result1:" + result1);
					ele1.click();
					break;
				} else if (str.contains(Integer.toString(result2))) {
					System.out.println("Selected Date is in result2 :" + result2);
					ele1.click();
					break;
				} else {

					System.out.println("Selected date is Holoday.Please Try again");
				}
			}
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);

		}
		return stepStatus;
	}

	protected String App_NO(WebDriver driver, String ObjectXpath) {
		@SuppressWarnings("unused")
		boolean stepStatus;
		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));
			NewLLApplicationNo = ele.getText();
			System.out.println("Application Number is :" + NewLLApplicationNo.substring(3).trim());
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			System.out.println("*******Application Number Not Stored.Please Check**********");
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return NewLLApplicationNo;

	}

	protected String DOB(WebDriver driver, String ObjectXpath) {
		@SuppressWarnings("unused")
		boolean stepStatus;
		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));
			NewLLDOB = ele.getText();
			System.out.println("Date of Birth is :" + NewLLDOB.substring(3).trim());
			stepStatus = true;
		} catch (Exception e) {
			stepStatus = false;
			System.out.println("**************DateofBirth Not Stored.Please Check***************");
			FrameworkVariables.getInstance().setExceptionDescription(e);

		}
		return NewLLDOB;
	}

	protected String LL_No(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));
			s3 = ele.getText();
			System.out.println(s3.substring(25, 43));
		} catch (Exception e) {
			System.out.println("LL no Not Allowd");
		}
		return s3;

	}

	protected String DL_App_NO(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));
			s4 = ele.getText();
			System.out.println("DL Application Number is :" + s4);
		} catch (Exception e) {
			System.out.println("Not allowed");
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return s4;

	}

	protected String DL_No(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));

			s5 = ele.getText();
			System.out.println(s5);
		} catch (Exception e) {
			System.out.println("LL no Not Allowd");

		}
		return s5;

	}

	protected String LL_Backlog_App_NO(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));

			s6 = ele.getText();
			System.out.println(s6);

		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		return s6;

	}

	protected String LL_Backlog_LL_NO(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));

			s7 = ele.getText();
			System.out.println(s7);

		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		return s7;

	}

	protected String DL_Backlog(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));
			s10 = ele.getText();
			System.out.println(s10);

		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		return s10;

	}

	protected String DL_Approvedappno(WebDriver driver, String ObjectXpath) {

		try {
			WebElement ele = driver.findElement(By.xpath(ObjectXpath));

			s11 = ele.getText();
			System.out.println(s11);

		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		return s11;

	}

	protected void DB_Check(String DBQuery, String Value, String Uservalue)
			throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection c = DriverManager.getConnection("jdbc:postgresql://10.249.163.118:5432/sow4stgcov", "readonly",
				"readonly");
		System.out.println("Connection Established");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(DBQuery);
		System.out.println("statement created");

		/*
		 * ResultSetMetaData meta = rs.getMetaData(); int colcount
		 * =meta.getColumnCount(); String[] columnnames =new String[colcount]; for (int
		 * i = 1; i <= colcount; i++) { columnnames[i-1] = meta.getColumnName(i);
		 * System.out.println(columnnames[i-1]); }
		 */

		while (rs.next()) {
			String s = rs.getString(Value);
			System.out.println(s);
			if (s.contains(Uservalue)) {
				System.out.println("User value & Database value both are MATCHES.");
			} else {

				System.out.println("User value & Database value both are NOT MATCHES Please check again.");

			}
		}
	}

	protected void Download() {

	}

	protected boolean Slot_booking(WebDriver driver, String ObjectXpath, String ObjectXpath1) {

		boolean stepStatus = true;
		try {

			List<WebElement> n = driver.findElements(By.xpath(ObjectXpath));
			int size1 = n.size();
			// System.out.println(size1);
			for (int j = 0; j <= size1; j++) {

				String slot = n.get(j).getText();
				System.out.println("Total slots available : " + slot);

				if (slot.equals("0")) {

					System.out.println("Slots is Zero for your given date please select another day");
					String str;
					/* 1st Random */
					Random r = new Random();
					int low = 1;
					int high = 31;
					int result = r.nextInt(high - low) + low;
					// System.out.println("Random Number is " + result);
					List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr/td[@class='cal_green']"));
					int s = ele.size();
					System.out.println("Size is " + s);
					for (WebElement ele1 : ele) {
						str = ele1.getText();
						if (str.contains(Integer.toString(result))) {
							System.out.println("Selected Date is in result :" + result);
							ele1.click();
							break;
						} else {

							System.out.println("Please Try again.slotbooking section date also have zero slots.");
						}
					}
					driver.findElement(By.xpath(ObjectXpath1)).click();
					System.out.println("Your slot is booked sucessfully in slotbooking statement");
					break;
				} else {
					driver.findElement(By.xpath(ObjectXpath1)).click();
					System.out.println("Your slot is booked sucessfully");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Try Again in slot booking");
			stepStatus = false;
			FrameworkVariables.getInstance().setExceptionDescription(e);
		}
		return stepStatus;

	}

	protected void Highlight(WebDriver driver, String ObjectXpath) {
		try {
			WebElement element = driver.findElement(By.xpath(ObjectXpath));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int iCnt = 0; iCnt < 2; iCnt++) {
				js.executeScript("arguments[0].style.border='solid 3px red'", element);
				Thread.sleep(200);
				js.executeScript("arguments[0].style.border=''", element);
				Thread.sleep(200);
			}
		} catch (Exception e) {

		}
	}
	
	public void loaddata() throws IOException {
		FileReader reader = new FileReader("DataFiles\\Application.properties");
		prop = new Properties();
		prop.load(reader);

	}

}
