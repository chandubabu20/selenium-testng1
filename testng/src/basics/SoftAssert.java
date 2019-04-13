package basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

 
public class SoftAssert {
 
 @Test
 public void softAssert(){
 SoftAssert sa= new SoftAssert();
 System.out.println("softAssert Method Was Started");
 //sa.assertEquals();
 System.out.println("softAssert Method Was Executed");
 //sa.assertAll();
 }
 
 @Test
 public void hardAssert(){
 System.out.println("hardAssert Method Was Started");
 Assert.assertTrue(false);
 System.out.println("hardAssert Method Was Executed");
 }
}
