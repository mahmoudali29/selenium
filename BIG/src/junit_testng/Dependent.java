package junit_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Dependent {
  @Test(groups = "high")
  public void login() {
	  System.out.println("login");
  }
  
  @Test(dependsOnMethods = "login")
  public void sendEMail() {
	  Assert.assertTrue(true);
	  System.out.println("sendEMail");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
