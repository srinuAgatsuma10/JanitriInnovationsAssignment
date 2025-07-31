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
	
	@Test(priority = 2)
	public void testPasswordMaskedbutton() throws InterruptedException {
		
		faker = new Faker();
		String password = faker.internet().password();
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.enterPassword(password);
		String typeBefore = lp.getPasswordFieldType();
		lp.checkEyeToggle();
		String typeAfter = lp.getPasswordFieldType();
		
		Assert.assertEquals(typeBefore, typeAfter, "Password visibility toggeled is workings");
		
	}
}
