package assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

import verify.Compare;

public class TC_001 extends InitiateDriver{
	
	//@Test
	public void tc001() {
	     System.out.println("TC_001.tc001()");
	     driver.findElement(By.id("email")).sendKeys("hello");  /// write data
	     Assert.assertEquals("welcome", "welcomee");
	}
	
	//@Test
	public void validateULR() {
		
		// hard assertion
		Assert.assertTrue(Compare.validateULR(driver, "https://thetestingworld.com/testingss/"),"[Error : Not matching the Actaul URL]");
	}
	
	//@Test
	public void validatePageTitle() {
		
		// hard assertion
		Assert.assertTrue(Compare.validatePageTitle(driver, "Login & Sign Up Forms"),"[Error : Not matching the Page title]");
	}
	
	//@Test
	public void validateElementExists() {
		//Assert.assertTrue(Compare.validateElementExists(driver, "//input[@name='fld_username1']"),"[Error : Element Not found]");
		 Assert.assertTrue(Compare.validateElementExists(driver, "name", "fld_username"), "[Error: Element Not Found]");
	}
	
	//@Test
	public void testTextPresentOnElement() {
	     
	    String actualText = Compare.validateTextPresentOnElement(driver, "xpath", "//label[@for=\"tab1\"]");
	    Assert.assertEquals(actualText, "Register", "[Error: Text does not match]");
	}
	
	//@Test
	public void validateTextOnPage() {
	     
	    boolean actualResult = Compare.validateTextOnPage(driver, "Login or Sign Up to start");
	    Assert.assertTrue(actualResult, "[Error: Text Not found on Page]");
	}
	
//	@Test
//	public void validateAttribute() {
//	    boolean actualResult = Compare.validateAttribute(driver, "name", "fld_username", "placeholder", "myusername");
//	    Assert.assertTrue(actualResult, "[Error: Placeholder attribute validation failed for username field]");
//	}
	
	
}
