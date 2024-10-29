package junit_testng;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Junit {
	
	@BeforeClass
	public static void startBrowser() {
		System.out.println("startBrowser()");
	}
	
	@Before
	public void enterUrl() {
		System.out.println("enterUrl()");
	}
	
	
	@Test                            /// Annotation
	public void test1() {
		System.out.println("test1()");
	}
	
	@Ignore
	@Test  
	public void test2() {
		System.out.println("test2()");
	}
	@Test  
	public void test3() {
		System.out.println("test3()");
	}
	@Test
	public void test4() {
//		Assert.assertTrue(true);
//		Assert.assertTrue(false);
		Assert.assertEquals("Not Matched", "hello", "hello");
		System.out.println("test4()");
	}
	
	
	@After
	public void cleanCose() {
		System.out.println("cleanCose()");
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("closeBrowser()");
	}
	
	

	 
	 
}
