package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.LoginPage_POM;
import testBase.BaseClass;

public class LoginFunctionality extends BaseClass {
	public static Faker faker;

	@Test(priority = 1)
	public void testLoginButtonDisabledWhenFieldAreEmpty() throws InterruptedException {
		
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.enterEmail("");
		lp.enterPassword("");
		lp.clickLoginBtn();

		Assert.assertTrue(lp.isLoginBtnDisabled(), "Login Button should not enable.");

	}
	
	@Test
	public void testPasswordMaskedbutton() {
		faker = new Faker();
		String email = faker.internet().safeEmailAddress();
		String password = faker.internet().password();
	}
}
