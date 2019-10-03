package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class HeadlessrBrowserTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("1000,800");
	  options.addArguments("headless");
	  
	  driver=new ChromeDriver(options);
	  driver.get("https://gofile.io/?t=welcome");
	  //driver.manage().window().maximize();
	  String str=driver.getTitle();
	  System.out.println("Title:"+str);
  }

}
