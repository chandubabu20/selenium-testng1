package parameters;

import org.testng.annotations.*;

public class Parameters1 {
	public class ParameterizedTest1 {
		   @Test
		   @Parameters("myName")
		   public void parameterTest(String myName) {
		      System.out.println("Parameterized value is : " + myName);
		   }
		}
}
//**********************execute the corresponding xml file******************