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

public class ScreenCaapturingTest {
	WebDriver driver;
	public void screencapturing(String str) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("E:\\Automation Testing\\MavenProject\\Screenshots\\"+str+".jpg"));
		
	}
	@Test(priority = 1)
	public void signup() throws IOException
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("indu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bhairi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("indhubyri@gmail.com");
		screencapturing("signup");
	}
	@Test(priority = 2)
	public void login() throws IOException
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("indhubyri@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Satyam@1");
		screencapturing("login");
	}
  
	@Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  screencapturing("browser");
  }

}
