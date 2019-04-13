package basics;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependson {
	
	@Test(dependsOnMethods= {"assertfalse"})
	public void Test1() { 
		
		System.out.println("checking dependency - 1");

	}
	
	@Test(dependsOnMethods= {"assertfalse"},alwaysRun=true)
	public void Test2() {
		
		System.out.println("checking dependency - 2");

	}
	@Test
	public void assertfalse() {
		System.out.println("in assertfalse method 1");
		Assert.assertFalse(true, "---testing assert false---");
		System.out.println("in assertfalse method 2");
	}
    }
