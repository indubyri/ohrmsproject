package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class SwiggyTest {
	WebDriver driver;
	 @Test
	  public void screenshot() throws IOException
	  {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(f, new File("E:\\Automation Testing\\MavenProject\\Screenshots\\alert.jpg"));
				  
	  }
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//table[@class='lForm']//tbody//tr//td//a//img")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://netbanking.hdfcbank.com/netbanking");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }
  }


