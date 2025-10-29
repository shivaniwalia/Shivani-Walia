package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Test_Base.BaseTest;
import Test_Pages.HomePage;

public class HomePage_Test extends BaseTest{
	@Test
	public void verifyHomepageTitle() {
		HomePage hp = new HomePage(driver);
		String expectedTitle = "Your Store";
		String actualTitle = hp.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, " Actual and Expected Title does not match!!!");
	}
	@Test
	public void verifySearchFunctionality() {
		HomePage hp = new HomePage(driver);
		hp.searchProduct("HTC Touch HD");
		Assert.assertTrue(driver.getTitle().contains("Search - HTC Touch HD"), "Search Unsuccessful" );
	}
	

}
