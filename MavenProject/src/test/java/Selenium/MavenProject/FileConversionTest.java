package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileConversionTest {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  driver.findElement(By.xpath("//span[contains(text(),'JPG to PDF')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();

	  Thread.sleep(2000);
	  Runtime.getRuntime().exec("E:\\Automation Testing\\MavenProject\\src\\test\\java\\Selenium\\MavenProject\\jpgfileupload.exe");
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[contains(text(),'Clear Queue')]")).click();
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://pdf2doc.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }

}
