package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	//Object References
		WebDriver driver;
		WebDriverWait wait;
		Actions action;
		
		// Constructor
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		/* -----------------		 LOCATORS 	------------------	*/
		
		// Enter Email
		@FindBy(id="input-email")
		WebElement emailField;
		
		@FindBy(id="input-password")
		WebElement passwordField;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement loginButton;
		
		/* ---------------------	ACTIONS 	---------------------*/
		
		public void enterEmailId(String emailAddress) {
			emailField.sendKeys(emailAddress);
		}
		
		public void enterPassword(String pswd) {
			passwordField.sendKeys(pswd);
		}
		
		public void clickLoginButton() {
			loginButton.click();
		}

		public boolean isLoginSuccessful() {
			return false;
		}
		

}

