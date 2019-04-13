package basics;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SkipTest {
	  @Test(enabled = false)
	  public void myTestMethod1() {
	    System.out.println("myTestMethod one");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("myTestMethod two");
	  }
	  
	  @Test(enabled = true)
	  public void myTestMethod3() {
	    System.out.println("myTestMethod three");
	  }
	  
	  @Ignore @Test
	  public void myTestMethod4() {
	    System.out.println("myTestMethod four");
	  }
	  
	  @Test
	  public void myTestMethod5() {
		    System.out.println("myTestMethod five");
		    throw new SkipException("any message");

		  }
}
