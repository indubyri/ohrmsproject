package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class Gmailfileupload {
	WebDriver driver;                                
  
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com");
	  driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  
  }
  @Test
  public void login() throws InterruptedException
  {  driver.findElement(By.xpath("//input[@id='identifierId' or type='email']")).sendKeys("indhubyri@gmail.com");
  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
  //driver.findElement(By.xpath("//div[@id='passwordNext']")).sendKeys("Satyamhj1");
  //driver.manage().addCookie();;
  Thread.sleep(5000);
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam@1");
  driver.findElement(By.className("CwaK9")).click();
  Thread.sleep(2000);
 //driver.manage().timeouts().implicitlyWait(time, unit)(60, TimeUnit.SECONDS);
  
	 driver.findElement(By.xpath("//*[@class='gb_Ze' or xpath='1']")).click();
	 driver.findElement(By.xpath("//a[@id='gb23']//span[@class='gb_m']")).click();
	 Thread.sleep(2000);

	 // driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	  //driver.quit();
  }
  @Test
  @Ignore
  public void sendingfile() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
  }

}
