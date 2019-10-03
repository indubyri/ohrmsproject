package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ElixraidTest {
	WebDriver driver;
	
  @Test
  public void adminlogin() {
	  driver.findElement(By.xpath("//div[contains(@class,'animate fadeInUp')]//span[contains(@class,'button_label')][contains(text(),'Login')]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://elixiraid.com/try-demo");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }

}
