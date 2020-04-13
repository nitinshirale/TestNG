package demotestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Report_testNG {
	
	@BeforeClass
	public void set_up() {
		Reporter.log("This runs once before class", true);
	}
	
	@AfterClass
	public void clean_Up() {
		Reporter.log("This runs once after class", true);
	}
	
	@BeforeMethod
	public void before_Method() {
		Reporter.log("This runs before every method", true);
	}

	@AfterMethod
	public void after_Method() {
		Reporter.log("This runs after every method", true);
	}
	
	@Test
	public void test_Method_A() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod1", true);
	}
	
	@Test
	public void test_Method_B() {
		Reporter.log("testMethod2", true);
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={ "test_Method_A" })
	public void test_Method_C() {
		Reporter.log("test_Method_C", true);
	}
}
