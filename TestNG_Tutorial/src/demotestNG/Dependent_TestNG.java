package demotestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependent_TestNG {
	@BeforeClass
	public void set_Up() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void clean_down() {
		System.out.println("after class");
	}
	
	@Test(dependsOnMethods={ "testMethod2" }, alwaysRun=true)
	public void testMethod1() {
		System.out.println("test Method 1");
	}
	
	@Test
	public void test_Method2() {
		System.out.println("test Method 2");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={ "testMethod1" })
	public void test_Method3() {
		System.out.println("test Method 3");
	}
	
	@Test
	public void test_Method4() {
		System.out.println("test Method 4");
	}
}
