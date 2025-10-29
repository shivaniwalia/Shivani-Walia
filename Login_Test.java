package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Test_Base.BaseTest;
import Test_Pages.HomePage;
import Test_Pages.LoginPage;

public class Login_Test extends BaseTest{
	 @Test
	    public void verifyValidLogin() {
	        // Open HomePage
	        HomePage hp = new HomePage(driver);
	        
	        // Navigate to Login Page
	        hp.clickMyAccount();
	        hp.clickLoginButton();
	        
	        // Initialize LoginPage
	        LoginPage login = new LoginPage(driver);
	        
	        // Enter credentials (use valid ones that you registered earlier)
	        login.enterEmailId("shivani123@test.com");
	        login.enterPassword("Test@123");
	        
	        // Click Login
	        login.clickLoginButton();
	        
	        // Verify successful login
	        Assert.assertTrue(login.isLoginSuccessful(), "❌ Login Failed! Check credentials or locators.");
	 }
}
