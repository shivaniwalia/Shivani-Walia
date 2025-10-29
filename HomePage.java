package Test_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	// Object References
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	
	// Constructor
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);  // Used to initialize the Web Elements that are defined using @FindBy annotations	
	}
	
	/* -------------------------Locators -------------------------------*/
	
	// @FindBy is PageFactory annotation. It tells Selenium how to locate a specific element on the Webpage.
	
	//  Logo
	@FindBy(xpath = "//img[@alt='Poco Electro']")
    WebElement logo;
	
	//  My Account	
	@FindBy(xpath="//div[text()='My account']")
	WebElement myAccount;
	
	//  Login	
	@FindBy(xpath= "//div[text()='Login']")
	WebElement login;
	
	//  RegisterPage	
	@FindBy(xpath="//div[text()='RegisterPage']")
	WebElement register;
	
	// Search for Product
	@FindBy(xpath="//input[@name='search']")
	WebElement searchBox;
	
	// Search Button
	@FindBy(xpath="//button[@title='Search']")
	WebElement SearchButton;
	
	// All Categories DropDown
	@FindBy(xpath="//button[@class='btn dropdown-toggle']")
	WebElement allCategoriesDropdown;
	
	// Wishlist
	@FindBy(xpath="//span[@data-original-title='Wishlist']")
	WebElement wishlist;
	
	// Cart Icon
	@FindBy(xpath="//div[@class='cart-icon']")
	WebElement cartIcon;
	
	
	/* ------------------------Actions----------------------------*/
	
	// Verify Logo Visibility
	public Boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}
	
	public String getPageTitle() {
        return driver.getTitle();
    }
	
	// Click My Account DropDown
	public void clickMyAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(myAccount)).click();
	}
	
	// Navigate to Login Page
	public void clickLoginButton() {
		clickMyAccount();
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	
	// Navigate to RegisterPage Page
		public void clickRegisterButton() {
			clickMyAccount();
			wait.until(ExpectedConditions.elementToBeClickable(register)).click();
		}
		
		// Search for a Product
		public void searchProduct(String productName) {
	        searchBox.clear();
	        searchBox.sendKeys(productName);
	        searchBox.click();
	    }
		
		// Check Wishlist
		public void openWishlist() {
			wait.until(ExpectedConditions.elementToBeClickable(wishlist)).click();
		}
		
		// Open Cart
		public void openCart() {
			wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
		}
		

}
