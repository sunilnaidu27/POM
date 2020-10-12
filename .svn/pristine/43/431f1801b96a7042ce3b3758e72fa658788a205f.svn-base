package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginRTO extends BasePage {
	BasePage basepage = new BasePage();
	WebDriver driver;
	boolean stepstatus;

	public LoginRTO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement Username;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[@id='logmode']")
	WebElement Captcha;

	@FindBy(how = How.XPATH, using = "//input[@id='frmsubmt']")
	WebElement Next;

	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement Singin;

	// related methods to perform operation on webelements
	public void setUserName(String Strusername) {
		stepstatus = basepage.setText(Username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username", driver);
	}

	public void setpassword(String Strpassword) {
		stepstatus = basepage.setText(Password, Strpassword);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password", driver);
		if (basepage.isDisplayed(Next)) {
			ClickonNext();
			SetCaptcha();
		} else {
			SetCaptcha();
		}

	}

	public void ClickonLogin() {
		stepstatus = basepage.clickElement(Singin);
		reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button", driver, true);
	}

	public void SetCaptcha() {
		stepstatus = basepage.setText(Captcha, "123456");
		reportEvent(stepstatus, "Able to Enter Captcha", "Unable to Enter Captcha", driver, true);
	}

	public void ClickonNext() {
		stepstatus = basepage.clickElement(Next);
		reportEvent(stepstatus, "Able to click on Next BUtton", "Unable to click on Next Button", driver, true);
	}

}
