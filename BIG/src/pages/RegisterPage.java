package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {

    @FindBy(name="fld_username") WebElement usernameTextBox;
    @FindBy(name="fld_email") WebElement emailTextBox;
    //@FindBy(xpath="//input[@type='password']") WebElement passwordTextBox;
    @FindBy(how = How.XPATH , using = "//input[@type='password']") @CacheLookup WebElement passwordTextBox;
     

    public void enterUsername() {
        usernameTextBox.sendKeys("Testing");
    }

    public void enterEmail() {
        emailTextBox.sendKeys("Testing");
    }

    public void enterPassword() {
        passwordTextBox.sendKeys("abcd123");
    }
}