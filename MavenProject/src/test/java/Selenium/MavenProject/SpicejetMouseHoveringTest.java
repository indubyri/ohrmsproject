package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class SpicejetMouseHoveringTest {
	WebDriver driver;
	@Test
	public void screenshot() throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f,new File("E:\\Automation Testing\\MavenProject\\Screenshots\\spicejet.jpg"));
	}
  @Test
  public void f() throws InterruptedException, IOException {
	  /*Actions at=new Actions(driver);
	  at.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("GST Invoice")).click();*/
	  
	  driver.findElement(By.linkText("Special Assistance")).click();
	  screenshot();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }
  

}
