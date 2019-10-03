package Selenium.MavenProject;

import org.testng.annotations.Test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AuthenticationTest {
	WebDriver driver;
  @Test
  public void screnshot() throws Exception {
	  File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f,new File("E:\\Automation Testing\\MavenProject\\Screenshots\\authentication.jpg"));
  }
	
	
	@Test
  public void f() throws Exception {
	  
		 System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
			driver=new ChromeDriver();		
		
     //Launching the site.				
         driver.get("https://www.indiehackers.com/sign-in");
         Thread.sleep(6000);
         try {
        	 driver.findElement(By.xpath("//a[contains(text(),'Reset')]")).click();

		} catch (Exception e) {
			e.printStackTrace();
			
		}
         driver.switchTo().alert().sendKeys("selenium");
         Thread.sleep(3000);
        String str= driver.switchTo().alert().getText();
        System.out.println(str); 
        driver.switchTo().alert().accept();
        screnshot();
                 
        // driver.navigate().to("https://selenium@www.indiehackers.com/sign-in");
         
         //driver.navigate().back();
  }
 

}
