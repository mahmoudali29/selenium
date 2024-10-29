package org.web.automation.testcases;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;
import org.web.automation.library.CaptureScreenshot;
import org.web.automation.library.PropertyReader;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.RegisterPage;

import java.time.Duration;

public class TC_001_Registration_Functionality extends InitiateDriver {
	
	
	
//	@Test
	public void tc001() throws InterruptedException, IOException {
		//System.out.println("TC_001_Registration_Functionality.tc001()");
		//ChromeDriver   FirefoxDriver
		
		// sendkeys works with input and textarea  
		// sendkeys works as append 
		//driver.findElement(By.name("fld_username")).sendKeys("mahmoud Mohamed ");  /// write data
		 
		//driver.findElement(By.name("fld_username1")).sendKeys("ahmed ali");  /// write data
		
		driver.findElement(By.id("email")).sendKeys("01222846412");  /// write data
		driver.findElement(By.id("pass")).sendKeys("01222846412");  /// write data
		driver.findElement(By.xpath("//button [@name='login']")).click();   
		
		CaptureScreenshot.takeScreenshot(driver,"tc001");
//		
//		driver.findElement(By.name("fld_email")).sendKeys("mahmoud.ali@gmail.com");  /// write data
//		//driver.findElement(By.xpath("//a [text()='Read Detail']")).click();
//		//driver.findElement(By.xpath("//input [@value='Sign up']")).click();    /// click on Button
//		driver.findElement(By.xpath("//input[@type='radio' and @value='home']")).click();
//		driver.findElement(By.xpath("//input[@type='checkbox' and @name='terms']")).click();
//		Select country = new Select(driver.findElement(By.id("countryId")));
//		//country.selectByValue("64");
//		country.selectByVisibleText("Egypt");
//		//country.deselectByValue("64");
//		
//		 
////		System.out.println("URL of Current Page is : -->  " + driver.getCurrentUrl());
////		System.out.println("Title of Page is : -- > " + driver.getTitle());
////        System.out.println("HTML OF PAGE IS HERE : -- > " +  driver.getPageSource());
//        
//        System.out.println("Inner text is :---> "+driver.findElement(By.xpath("//a [text()='Read Detail']")).getText());
//        System.out.println("Attribute Value is : -  "+ driver.findElement(By.name("terms")).getAttribute("type"));
//        System.out.println("Cordinates of element is : -  "+  driver.findElement(By.name("fld_username")).getLocation());
//		 
//		
//        // Apply the logic for checking element's enablement, visibility, and selection
//        System.out.println("Element Enable : " + driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled());
//        System.out.println("Element Visible : " + driver.findElement(By.xpath("//input[@value='Sign up']")).isDisplayed());
//        System.out.println("Checkbox (terms) Selected (before click): " + driver.findElement(By.name("terms")).isSelected());
//        
//        // Click the checkbox to change its selection status
//        driver.findElement(By.name("terms")).click();
//        System.out.println("Checkbox (terms) Selected (after click): " + driver.findElement(By.name("terms")).isSelected());
//        
//        
//      //System.out.println(country.getFirstSelectedOption().getText());
//      
//	     List<WebElement> allOptions = country.getOptions();
//	     for(WebElement e : allOptions){
//	    	 System.out.println(e.getText());
//	     }
		
		
		//// keyborad single
		
		
	}
	
//	@Test
	public void tc002() {
		driver.findElement(By.name("fld_username")).sendKeys("mahmoud Mohamed ");  /// write data
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("mahmoud.ali.@gmail.com").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
	//@Test
	public void tc003() throws InterruptedException {
		driver.findElement(By.name("fld_username")).sendKeys("mahmoud Mohamed ");  /// write data
		Actions act = new Actions(driver);
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(2000);
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyDown(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_UP).perform();
		
	}
	
	//@Test
	public void tc004() throws InterruptedException {
		driver.findElement(By.name("fld_username")).sendKeys("mahmoud Mohamed ");  /// write data
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//input[@value='Sign up']"))).perform();
		act.doubleClick(driver.findElement(By.name("fld_username"))).perform();
		act.contextClick(driver.findElement(By.xpath("//input[@value='Sign up']"))).perform();   ///right click
		
	}
	
	//@Test
	public void tc005() throws InterruptedException {
		driver.findElement(By.name("fld_username")).sendKeys("mahmoud Mohamed ");  /// write data
		Actions act = new Actions(driver);
		driver.get("https://thetestingworld.com/"); 
		act.moveToElement(driver.findElement(By.xpath("//span[@class='menu-title' and normalize-space(text())='VIDEOS']"))).perform();
		driver.findElement(By.xpath("//a[@title=\"Free Videos\"]")).click();
		
	}
	
	//@Test
	public void tc006() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
		driver.findElement(By.name("_txtUserName")).sendKeys(PropertyReader.applicationConfigReader("UserName"));  /// write data
		driver.findElement(By.name("_txtPassword")).sendKeys(PropertyReader.applicationConfigReader("Password"));  /// write data
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);  //// this make my script slow 
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Download']"))).keyUp(Keys.CONTROL).build().perform();;
		
		CaptureScreenshot.takeScreenshot(driver,"login");
		
	}
	
	//@Test
	public void tc007() throws InterruptedException {
	    Select country = new Select(driver.findElement(By.id("countryId")));
	    country.selectByVisibleText("Egypt");

	    // Explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "al-Gharbiyah"));
	    Select state = new Select(driver.findElement(By.id("stateId")));
	    state.selectByVisibleText("al-Gharbiyah");
	}
	
	//@Test
	public void Register() {   //// with PageFactory
		
		/// Approach 1
		//RegisterPage register = PageFactory.initElements(driver, RegisterPage.class);
		
		/// Approach 2
		RegisterPage register = new RegisterPage();
		PageFactory.initElements(driver, register);
		
		register.enterUsername();
		register.enterEmail();
		register.enterPassword();
	}
	
	@Test(dataProvider = "loginData")
	public void Login(String username, String password) {   //// with Java
		LoginPage login = new LoginPage(driver);
		login.clickLoginTab();
		login.enterUsername(username);
        login.enterPassword(password);
		login.clickSignin();
	}
	
	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() {
        return new Object[][] {
            {"mahmoudali", "test"},
            {"user2", "password2"},
            {"user3", "password3"}
        };
    }
	
	
	
	//@Test
	public void GetAllSimilarElements() {
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total number of links: " + allLinks.size());
		for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }
	}
	
	//@Test
	public void CheckBrokenLinkTestCase() throws Exception {
	    int count = 0;
	    
	    // Find all <a> elements using XPath
	    List<WebElement> links = driver.findElements(By.xpath("//a"));
	    
	    // Loop through each element
	    for (WebElement ele : links) {
	        // Check if the href attribute is not null and does not contain "javascript:void(0)"
	        if (ele.getAttribute("href") != null && !ele.getAttribute("href").contains("javascript:void(0)")) {
	            // Check if the link is broken
	            boolean res = this.checkLink(ele.getAttribute("href"));
	            if (res == false) {
	                // Increment count if the link is broken
	                count = count + 1;
	                System.out.println(ele.getAttribute("href"));
	            }
	        }
	        
	    }
	    
	    // Print the total count of broken links
	    System.out.println(count);
	}
	
//	@Test
	public void scrollDown() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)","");
	}
	
	public boolean checkLink(String linkURL) {
	    boolean result = false;
	    try {
	        URL url = new URL(linkURL);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setConnectTimeout(5000); // Set a timeout of 5 seconds
	        conn.connect();
	        
	        if (conn.getResponseCode() == 200) {
	            result = true; // Link is working
	        }
	    } catch (Exception e) {
	        // Exception handling can be added if needed
	    }
	    return result;
	}
	
	
}
