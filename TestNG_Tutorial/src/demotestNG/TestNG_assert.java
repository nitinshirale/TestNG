package demotestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import demotestNG.Testng_demo;

public class TestNG_assert {
	
	@Test
	public void testSum1() {
		System.out.println("\nRunning Test ---> testSum1");
		Testng_demo obj = new Testng_demo();
		int result = obj.sum(4, 5);
		Assert.assertEquals(result, 9);
	}
	
	@Test
	public void Strings_test() {
		System.out.println("\nRunning Test -> testStrings");
		String expectedString = "Nitin Shirale";
		Testng_demo obj = new Testng_demo();
		String result = obj.addtwoStrings("Nitin", "Shirale");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void test_Arrays() {
		System.out.println("\nRunning Test -> testArrays");
		int[] expectedArray = {9,5,14};
		Testng_demo obj = new Testng_demo();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArrays");
	}
}