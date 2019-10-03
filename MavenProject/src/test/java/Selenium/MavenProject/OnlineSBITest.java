package Selenium.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class OnlineSBITest {
	WebDriver driver;
	public void screencapturing(String str) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("E:\\Automation Testing\\MavenProject\\Screenshots\\"+str+".jpg"));
		
	}
  @Test(priority = 1)
  public void login() throws IOException 
  {

		 driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
		 driver.findElement(By.partialLinkText("CONTINUE")).click();
		 screencapturing("login");
  }
  @Test(priority = 2)
  public void alerthandling() throws IOException, Exception
  {
		 driver.findElement(By.partialLinkText("New")).click();


		 String str=driver.switchTo().alert().getText();
		 System.out.println(str);
		// driver.switchTo().alert().accept();
		 //driver.switchTo().alert().accept();
		 //screencapturing("alerthandling");
		 //driver.quit();
	 
		 BufferedImage image=new Robot().createScreenCapture(new java.awt.Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		 ImageIO.write(image, "jpg",new File("E:\\Automation Testing\\MavenProject\\Screenshots\\alert.jpg"));

		 
	 
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.onlinesbi.com");
	  driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  screencapturing("browser");
	  
  }

}
