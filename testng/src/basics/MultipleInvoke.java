package basics;

import org.testng.annotations.Test;

public class MultipleInvoke {
	@Test(invocationCount=5)
    public void Test()
    {
    	System.out.println("---invoke test multiple times ---");
    }
    
}
