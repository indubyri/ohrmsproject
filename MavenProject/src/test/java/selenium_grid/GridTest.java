package selenium_grid;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//import io.appium.java_client.android.AndroidDriver;

//import com.opera.core.systems.OperaSettings.Capability;

public class GridTest {
	WebDriver driver;
	String baseUrl="https://opensource-demo.orangehrmlive.com";
	//String nodeUrl="http://192.168.0.168:9876/wd/hub";
	String nodeUrl1="http://192.168.72.128:9877/wd/hub";
	//String nodeUrl2="http://127.0.0.1:4723/wd/hub";
	
	 public void url_insertion() {
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		  Assert.assertEquals("OrangeHRM",driver.getTitle());
	  }
 
	 public void login() {
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
		  //driver.quit();
		     
	  }
	 
 @Test()
  public void linux() throws Exception 
  {
	  DesiredCapabilities capability = DesiredCapabilities.firefox(); // browser capability intitialization
		 capability.setBrowserName("firefox"); // browser name setup
		 capability.setPlatform(Platform.LINUX); // operating system initialization
	
		 try {
			 Thread.sleep(4000);
			driver=new RemoteWebDriver(new URL(nodeUrl1),capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		url_insertion();
		login();
	}
  

}

  
 