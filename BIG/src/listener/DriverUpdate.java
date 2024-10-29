package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class DriverUpdate implements WebDriverListener {

    @Override
    public void beforeGet(WebDriver driver, String url) {
        System.out.println("Navigating to: " + url);
    }

    @Override
    public void afterGet(WebDriver driver, String url) {
        System.out.println("Navigated to: " + url);
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        System.out.println("Trying to find Element By: " + locator);
    }

    public void afterFindElement(WebDriver driver, WebElement element, By locator) {
        System.out.println("Found Element By: " + locator);
    }

    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Attempting to click on: " + element);
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("Clicked on: " + element);
    }

    public void onError(WebDriver driver, Throwable throwable) {
        System.out.println("Error occurred: " + throwable.getMessage());
    }
}
