package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframesTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	 /*driver.switchTo().frame("testng");
	  driver.findElement(By.linkText("IDEA")).click();*/
	  JavascriptExecutor exe=(JavascriptExecutor) driver;
	  Integer numerOfFrames=Integer.parseInt(exe.executeScript("return window.length").toString());
	  System.out.println("The no of frames:"+numerOfFrames);
	  List<WebElement>iframeElements=driver.findElements(By.tagName("iframe"));
	  System.out.println("The no of frames:"+iframeElements.size());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("E:\\Automation Testing\\MavenProject\\iframe.html");
	  driver.manage().window().maximize();
	  
  }

}
