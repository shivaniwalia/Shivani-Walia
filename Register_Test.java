package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Test_Base.BaseTest;
import Test_Pages.HomePage;
import Test_Pages.RegisterPage;

public class Register_Test extends BaseTest {
	@Test
	public void verifyUserRegistration() {
		// Open HomePage
		HomePage hp = new HomePage(driver);
		
		// Navigate to Register Page
		hp.clickMyAccount();
		hp.clickRegisterButton();
		
		// Fill Registration Details
		RegisterPage register = new RegisterPage(driver);
		
		// Generate unique email id for each test run
		// System.currentTimeMillis() gives a unique number (the current time in milliseconds).
		String email = "shivani" + System.currentTimeMillis() + "@test.com";
		
		// Method
		register.fillRegistrationForm(
			"Shivani", "Walia", email,  "9876543210", "Test@123" 
    );
		
		//Verify Registration Success
		Assert.assertTrue(register.isRegistrationSuccessful(), "Registration Failed ..");
		}
		
	}


