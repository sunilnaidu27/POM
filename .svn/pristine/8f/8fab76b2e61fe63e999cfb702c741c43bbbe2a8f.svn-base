package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BasePage {

	BasePage basepage = new BasePage();
	WebDriver driver;

	boolean stepstatus;

	public Sample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define webelements
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Selectstatename;
	
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement UserName;
	
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//select[@name='stName']")
	WebElement Login;
	
	// Createing Methods which defines Selenium methods by calling above Webelement reference

	public void Selectstatename(String Option) {
		stepstatus = basepage.setOptionInSelectBox(Selectstatename, Option);
		reportEvent(stepstatus, "Able to Select Statename", "Unable to Select Statename", driver, true);
	}

	public void EnterUsername(String Option) {
		stepstatus = basepage.setText(UserName, Option);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter Username", driver, true);
	}

	public void EnterPassword(String Option) {
		stepstatus = basepage.setText(Password, Option);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password", driver, true);
	}
	public void Clickonloginbutton() {
		stepstatus = basepage.clickElement(Login);
		reportEvent(stepstatus, "Able to clickon login button", "Unable to clickon login button", driver, true);
	}
	

}
