package org.web.automation.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.library.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class InitiateDriver {
	
	public WebDriver driver;
	public LoginPage login;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException, IOException {
		
		
		
		if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();  /// Browser will start
		}
		else if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();   // Browser Will start
		}
		else
		{
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();  /// Browser will start
		}
		
		
		
		//driver.get("https://thetestingworld.com/testings/"); /// putting url to browser
		
		//driver.navigate().to("http://google.com/");  /// putting url to browser
		driver.navigate().to(PropertyReader.applicationConfigReader("Application_URL"));  /// putting url to browser
//		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);  /// this will apply in the all app 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //// try to wait till the element loaded  (may be the element is hidden)
		//driver.manage().window().minimize();
		
		
//		driver.navigate().back();
//		Thread.sleep(5000);  // 5000 milliseconds = 5 seconds
//		driver.navigate().forward();
//		Thread.sleep(5000);  // 5000 milliseconds = 5 seconds
//		driver.navigate().refresh();
		
		login = new LoginPage(driver);
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);  // 5000 milliseconds = 5 seconds
		driver.close();
		//driver.quit();
	}
}
