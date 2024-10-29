package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.library.CaptureScreenshot;
import org.web.automation.library.PageActions;
import org.web.automation.library.PropertyReader;

public class LoginPage {
	
	WebDriver driver = null;
	PageActions action;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	
	public void enterUsername(String username) {
		
		try {
			//driver.findElement(By.name("_txtUserName")).sendKeys(PropertyReader.applicationConfigReader("UserName"));  /// write data
			
			action.enterDataIntoTextbox(driver.findElement(By.name("_txtUserName")), username);
			//driver.findElement(By.name("_txtUserName")).sendKeys(username);  /// write data
		} catch (Exception e) {
			System.out.println("*********Exception*******");
			CaptureScreenshot.takeScreenshot(driver,"There is an issue in user name");
			Assert.fail();
			
		}
		
    }

    public void enterPassword(String password) {
    	
    	
    	try {
    		//driver.findElement(By.name("_txtPassword")).sendKeys(password);  /// write data
        	action.enterDataIntoTextbox(driver.findElement(By.name("_txtPassword")), password);
		} catch (Exception e) {
			System.out.println("*********Exception*******");
			CaptureScreenshot.takeScreenshot(driver,"There is an issue in password");
			Assert.fail();
			
		}

    }
    
    public void clickSignin() {
    	
    	
    	try {
    		action.clickButton(driver.findElement(By.xpath("//input[@value='Login']")));
        	//driver.findElement(By.xpath("//input[@value='Login']")).click();
		} catch (Exception e) {
			System.out.println("*********Exception*******");
			CaptureScreenshot.takeScreenshot(driver,"There is an issue in Clicksignin");
			Assert.fail();
			
		}
    	
	}
    
    public void clickLoginTab() {
    	
    	
    	try {
    		action.clickButton(driver.findElement(By.xpath("//label[text()='Login']//parent::li")));
        	//driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
		} catch (Exception e) {
			System.out.println("*********Exception*******");
			Assert.fail();
			
		}
	}
	
    
    
    
    
}
