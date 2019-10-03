package datadriven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProviderTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).clear();

	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"))
		{
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			driver.navigate().back();
		}
		
	  
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "indhu@gmail.com", "password" },
    		  {"satyam@gmail.com","indu"},
    		  {"indu@gmail.com","manikanta"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
  }

}
