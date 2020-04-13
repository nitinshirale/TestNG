package demotestNG;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_TestNG {
	
	@BeforeClass
	public void set_Up() {
		System.out.println("TestNG_Prioritiy -> before class");
	}
	
	@AfterClass
	public void clean_down() {
		System.out.println("TestNG_Prioritiy -> after class");
	}
	
	@Test(priority=2)
	public void test_Method_A() {
		System.out.println("TestNG_Prioritiy -> testMethod A");
	}
	
	@Test(priority=0)
	public void testMethod_B() {
		System.out.println("TestNG_Prioritiy -> testMethod B");
	}
	
	@Test(priority=1)
	public void test_Method_C() {
		System.out.println("TestNG_Prioritiy -> testMethod ");
	}
}
