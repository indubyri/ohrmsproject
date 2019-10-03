package Selenium.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_login
{
  WebDriver driver;
  @BeforeTest
  public void browser()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com");
	  driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
  }
  @Test
  public void login() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@id='identifierId' or type='email']")).sendKeys("indhubyri@gmail.com");
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	  //driver.findElement(By.xpath("//div[@id='passwordNext']")).sendKeys("Satyamhj1");
	  //driver.manage().addCookie();;
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ghsghjdja");
	  driver.findElement(By.className("CwaK9")).click();
	 
	  //driver.quit();
  }
}
