package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GofileuploadTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//p[contains(text(),'Upload files')]")).click();
	  
	  driver.findElement(By.xpath("//button[@id='btnChooseFiles' or xpath='1']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='swal2-cancel btn']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://gofile.io/?t=welcome");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }
  
  

}
