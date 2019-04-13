//***********priorities, description parameters and Assertions*************
package basics;
 
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG1 {

	@Test(priority=-1,description="---test -1 description---")
    public void Testminus1()
    {
    	System.out.println("---Test -1---");
    }
	
    @Test(priority=0,description="---test0 description---")
    public void Test0()
    {
    	System.out.println("---Test 0---");
    }
    
    @Test(priority=1,description="---test1 description---")
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = "Welcome: Mercury Tours";
          Assert.assertEquals(actualTitle, expectedTitle);
          System.out.println("---Test 1---"); 
     }
    
    @Test(priority=2,description="---test2 description---")
    public void Test2()
    {
    	System.out.println("---Test 2--- ");
    }
     
    
}

