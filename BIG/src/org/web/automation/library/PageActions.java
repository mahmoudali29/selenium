package org.web.automation.library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	
	WebDriver driver = null;
	WebDriverWait wait;
	public PageActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickButton(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			CaptureScreenshot.takeScreenshot(driver,"clickButton");
		}
		
		
	}
	
	public void enterDataIntoTextbox(WebElement element , String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			CaptureScreenshot.takeScreenshot(driver,"enterDataIntoTextbox");
		}
		
	}
}
