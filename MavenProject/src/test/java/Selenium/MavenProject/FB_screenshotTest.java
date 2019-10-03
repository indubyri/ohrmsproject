package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class FB_screenshotTest {
	WebDriver driver;
  @Test
  public void screenshot() throws IOException
  {
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("E:\\Automation Testing\\MavenProject\\Screenshots\\fbhome.jpg"));
			  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  screenshot();
	  
	  
	  
	  
	  driver.manage().deleteAllCookies();
  }

}
