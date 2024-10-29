package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {
	
	public static boolean validateULR(WebDriver driver , String expURL) {
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result = true;
		}
		
		return result;
	}
	
	public static boolean validatePageTitle(WebDriver driver , String pageTitle) {
		boolean result = false;
		if(driver.getTitle().equalsIgnoreCase(pageTitle))
		{
			result = true;
		}
		
		return result;
	}
	
	public static boolean validateElementExists(WebDriver driver, String locType, String locValue) {
	    boolean result = false;

	    try {
	        if (locType.equalsIgnoreCase("xpath")) {
	            driver.findElement(By.xpath(locValue));
	        } else if (locType.equalsIgnoreCase("id")) {
	            driver.findElement(By.id(locValue));
	        } else if (locType.equalsIgnoreCase("name")) {
	            driver.findElement(By.name(locValue));
	        } else if (locType.equalsIgnoreCase("cssSelector")) {
	            driver.findElement(By.cssSelector(locValue));
	        } else if (locType.equalsIgnoreCase("className")) {
	            driver.findElement(By.className(locValue));
	        } else if (locType.equalsIgnoreCase("tagName")) {
	            driver.findElement(By.tagName(locValue));
	        } else if (locType.equalsIgnoreCase("linkText")) {
	            driver.findElement(By.linkText(locValue));
	        } else if (locType.equalsIgnoreCase("partialLinkText")) {
	            driver.findElement(By.partialLinkText(locValue));
	        } else {
	            throw new IllegalArgumentException("Invalid locator type: " + locType);
	        }
	        
	        result = true;  // Set result to true if the element is found
	    } catch (Exception e) {
	        // Handle the exception or log it if needed
	    }

	    return result;
	}
	
	public static String validateTextPresentOnElement(WebDriver driver, String locType, String locValue) {
	    String actValue = "";

	    try {
	        if (locType.equalsIgnoreCase("xpath")) {
	            actValue = driver.findElement(By.xpath(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("id")) {
	            actValue = driver.findElement(By.id(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("name")) {
	            actValue = driver.findElement(By.name(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("cssSelector")) {
	            actValue = driver.findElement(By.cssSelector(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("className")) {
	            actValue = driver.findElement(By.className(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("tagName")) {
	            actValue = driver.findElement(By.tagName(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("linkText")) {
	            actValue = driver.findElement(By.linkText(locValue)).getText();
	        } else if (locType.equalsIgnoreCase("partialLinkText")) {
	            actValue = driver.findElement(By.partialLinkText(locValue)).getText();
	        } else {
	            throw new IllegalArgumentException("Invalid locator type: " + locType);
	        }
	    } catch (Exception e) {
	        // Handle the exception or log it if needed
	    }

	    return actValue;  // Return the actual text value from the element
	}

	public static boolean validateTextOnPage(WebDriver driver, String expValue) {
        boolean result = false;
        if (driver.getPageSource().contains(expValue)) {
            result = true;
        }
        return result;
    }
	
	public static boolean validateAttribute(WebDriver driver, String locType, String locValue, String attributeName , String expValue)
	{
	    boolean result = false;
	    String value = "";
	    try
	    {
	        if(locType.equalsIgnoreCase("xpath"))
	        {
	            value = driver.findElement(By.xpath(locValue)).getAttribute(attributeName);
	        }
	        else if(locType.equalsIgnoreCase("id"))
	        {
	            value = driver.findElement(By.id(locValue)).getAttribute(attributeName);
	        }
	        else if(locType.equalsIgnoreCase("name"))
	        {
	            value = driver.findElement(By.name(locValue)).getAttribute(attributeName);
	        }
	        
	        if(value.equalsIgnoreCase(expValue))
	        {
	            result = true;
	        }
	    }
	    catch(Exception e){}
	    return result;
	}



}
