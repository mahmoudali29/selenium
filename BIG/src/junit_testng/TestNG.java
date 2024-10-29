package junit_testng;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

public class TestNG {
	
  @Test(enabled = false)
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(groups = "high",dependsOnMethods = "test3")
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(groups = "smoke")
  public void test3() {
	  System.out.println("test3");
	  Assert.assertEquals("hello", "hello", "[ERROR] TestCase is failed ");
	  
  }
  
  
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
	  System.out.println("Start Browser + Enter URL");
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  System.out.println("Close Browser");
  }

}
