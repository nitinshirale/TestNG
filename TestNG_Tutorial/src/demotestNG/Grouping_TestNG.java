package demotestNG;

import org.testng.annotations.Test;


import org.testng.annotations.*;

public class Grouping_TestNG{
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Test(groups = {"fruits", "Apple"})
	public void testFruit() {
		System.out.println("Running Test - Fruit");
	}
	
	@Test(groups = {"fruits", "Pulser"})
	public void testBike() {
		System.out.println("Running Test ");
	}
	
	@Test(groups = { "cars" })
	public void testCars() {
		System.out.println("Running Test - Cars");
	}
	
	@Test(groups = { "flight" })
	public void testHondaCBR() {
		System.out.println("Running Test flight ");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}
}

