package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InternetfilleuploadTest {
	WebDriver driver;
  @Test
  public void fileupload() 
  {
	  driver.findElement(By.linkText("File Upload")).click();
	  driver.findElement(By.xpath("//input[@id='file-upload' or type='file']")).sendKeys("D:\\Ward_Adminitrative_Secretary.pdf");
	  driver.findElement(By.xpath("//input[@id='file-submit' or type='submit']")).click();
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
  }

}
