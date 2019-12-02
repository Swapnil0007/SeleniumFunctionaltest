package SeleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testselenium {
  ChromeDriver driver;
  @BeforeMethod
  public void launch() 
  {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
  }
  @Test
  public void VerifyingTitle() {
	  String x =driver.getTitle();
		System.out.println("Title is" + x);
		Assert.assertEquals(x, "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
  }
  @Test
  public void Verifyurl()
  {
  String y = driver.getCurrentUrl();
	System.out.println("Url is" +y);
	Assert.assertEquals(y, "https://www.edureka.co/");
  }
  
	  
 
  @AfterMethod
  public void close() {
	  driver.close();
  }
}


