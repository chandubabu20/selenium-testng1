//**************Assertions ************
package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG3 { 
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium-material\\jars\\chromedriver.exe");    	
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		//Assert.assertFalse(isUserLoggedOut());
		}
	@Test
	public void asserttrue() {
		Assert.assertTrue(true, "testing assert true ");
		System.out.println("in asserttrue method");

	}
	@Test
	public void assertfalse() {
		Assert.assertFalse(true, "---testing assert false---");
		System.out.println("in assertfalse method");
	}

	}


