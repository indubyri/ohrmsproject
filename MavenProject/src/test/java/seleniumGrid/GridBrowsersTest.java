package seleniumGrid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class GridBrowsersTest {
	WebDriver driver;
	String baseUrl,nodeUrl;
  @Test
  public void f() throws MalformedURLException {
	  baseUrl="https://www.facebook.com/";
      nodeUrl="http://192.168.43.178:2405/wd/hub";
      DesiredCapabilities capability=DesiredCapabilities.firefox();
      capability.setBrowserName("firefox");
      capability.setPlatform(Platform.WINDOWS);
     driver=new RemoteWebDriver(new URL(nodeUrl), capability);
     driver.get(baseUrl);
     

  }
  @Test
  public void chrome() throws MalformedURLException
  {
	  baseUrl="https://mail.google.com/mail/u/0/#inbox";
      nodeUrl="http://192.168.43.178:2455/wd/hub";
      DesiredCapabilities capability=DesiredCapabilities.chrome();
      capability.setBrowserName("chrome");
      capability.setPlatform(Platform.WINDOWS);
     driver=new RemoteWebDriver(new URL(nodeUrl), capability);
     driver.get(baseUrl);
	  
  }
  
  }

