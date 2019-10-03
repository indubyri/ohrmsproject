package Selenium.MavenProject;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Pdf2docTest {
	WebDriver driver;
  @Test
  public void fileupload() throws Exception {
	  driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
	  Thread.sleep(2000);
	  Runtime.getRuntime().exec("E:\\Automation Testing\\MavenProject\\src\\test\\java\\Selenium\\MavenProject\\fileupload.exe");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://pdf2doc.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
  }

}
