package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	//Object References
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	
	// Constructor
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	/* --------------------- LOCATORS----------------------*/
	
	// First Name
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	// Last Name
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	// Email
	@FindBy(id="input-email")
	WebElement email;
	
	// Phone Number
	@FindBy(id="input-telephone")
	WebElement phoneNumber;
	
	// Password
	@FindBy(id="input-password")
	WebElement password;
	
	// Confirm Password
	@FindBy(id="Password Confirm")
	WebElement confirmPassword;
	
	// Privacy Policy
	@FindBy(id="input-agree") 
	WebElement privacyPolicyCheckbox;
	
	// Continue Button
	@FindBy(xpath="//input[@value='Continue']")    // I used xpath here because there is no id available in the code snippet as xpath is used at the time of non availability of any uniqie id or name.
	WebElement continueButton;
	
	
	/* ---------------------------	ACTIONS 	----------------------------*/
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);		
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPhoneNumber(String phone) {
		phoneNumber.sendKeys(phone);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void clickPrivacyPolicy() {
		privacyPolicyCheckbox.click();
	}
	
	public void clickContinueBtn() {
		continueButton.click();
	}

	public void fillRegistrationForm(String firstName, String lastName, String email, String telephone, String password) {
		enterFirstName(firstName);
	    enterLastName(lastName);
	    enterEmail(email);
	    enterPhoneNumber(telephone);
	    enterPassword(password);
	    enterConfirmPassword(password);
	    clickPrivacyPolicy();   
    }
	


	public boolean isRegistrationSuccessful() {	
		return false;
	}
	
	
}
