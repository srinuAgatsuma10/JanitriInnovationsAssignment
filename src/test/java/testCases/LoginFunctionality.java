package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.LoginPage_POM;
import testBase.BaseClass;

public class LoginFunctionality extends BaseClass {
	public static Faker faker;
	@Test
	public void testLogin() {
		faker = new Faker();
		String email = faker.internet().safeEmailAddress();
		String password = faker.internet().password();
		
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.enterEmail(email);
		lp.enterPassword(password);
		lp.clickLoginBtn();
		
		Assert.assertEquals(lp.getErrorMessage(), "Invalid Credentials");
	}
}
