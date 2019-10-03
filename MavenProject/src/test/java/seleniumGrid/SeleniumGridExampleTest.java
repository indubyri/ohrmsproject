package seleniumGrid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class SeleniumGridExampleTest {
	WebDriver driver;
	String baseUrl,nodeUrl;
	@Test
	
	public void setup () 
	  {
		/*baseUrl is an application url*/
		 baseUrl="http://www.newtours.demoaut.com/";
		 /*nodeUrl is an client registred url contains client port number */
		 nodeUrl="http://192.168.43.178:2405/wd/hub";

		 /*browser capability intitialization using Desiredcapabilities class*/
		 DesiredCapabilities capability = DesiredCapabilities.firefox();
		 capability.setBrowserName("chrome"); // browser name declaration
		 capability.setPlatform(Platform.WINDOWS); // operating system name declaration
		 try {
	/* Remotewebdriver is a class to specify client registered URL using capabilities*/
	 /* Remotewebdriver class returns MalformedURLException when declared new URL method */
			 driver=new RemoteWebDriver(new URL(nodeUrl),capability);
						
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// Thread.sleep(10000);
		 }
@Test
public void simpletest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
	
}

	}

