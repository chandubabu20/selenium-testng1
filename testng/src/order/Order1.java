//*********** Order of TESTNG annotations*******************************
package order; 

import org.testng.annotations.*;

public class Order1 {
	@Test
	public void Order1TestMethod1(){
		System.out.println("Order1TestMethod1");
	}
	@Test
	public void Order1TestMethod2(){
		System.out.println("Order1TestMethod1");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("--before test");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("--before method");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("--before class");
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("--before suite");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("--After test");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("--After method");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("--After class");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("--After suite");
	}
	
	

}
