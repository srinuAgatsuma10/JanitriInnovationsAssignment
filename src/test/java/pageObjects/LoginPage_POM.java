package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_POM extends BasePOM {

	public LoginPage_POM(WebDriver driver) {
		super(driver);
	}
	
	// WebElements
	
	@FindBy(xpath = "//input[@id='formEmail']")
	WebElement emailBox;
	
	@FindBy(xpath = "//input[@id='formPassword']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//button[normalize-space()='Log In']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//img[@alt='Password Not Visible']")
	WebElement eyeToggle;
	
	@FindBy(xpath = "//div[@class='invalid-credential-div']//p")
	WebElement errorMessage;
	
	@FindBy(xpath = "//img[@alt='Janitri Logo']")
	WebElement logo;
	
	
	// Action Methods
	
	public void enterEmail(String email) {
		emailBox.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		passwordBox.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void checkEyeToggle() {
		eyeToggle.click();
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	
	public boolean isUIElementsPresent() {
		return(emailBox.isDisplayed() && passwordBox.isDisplayed() && loginBtn.isDisplayed()
				&& eyeToggle.isDisplayed() && logo.isDisplayed());
	}
	
	public boolean isLoginBtnDisabled() {
		return loginBtn.isEnabled();
	}
	
	public String getPasswordFieldType() {
		return passwordBox.getAttribute("value");
	}
	
}
