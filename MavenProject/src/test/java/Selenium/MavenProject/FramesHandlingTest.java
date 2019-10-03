package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FramesHandlingTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.switchTo().frame("iframe1");
	  driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/div[3]/div/a[4]/span[2]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.toolsqa.com/iframe-practice-page");
	  driver.manage().window().maximize();
	  
  }

}
