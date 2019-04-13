//**************Assertions ************
package basics;
  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\Testing\\Selenium-material\\jars\\chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
        @BeforeClass
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
          driver.get(baseUrl);
      }
      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
          @Test(priority = 0)
      public void register(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
      }
          @Test(priority = 1)
      public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
      }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
      }
       
      @AfterClass
      public void terminateBrowser(){
          driver.close();
      }

}
