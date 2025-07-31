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
}
