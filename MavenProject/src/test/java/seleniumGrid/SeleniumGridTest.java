package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	WebDriver driver;
	String baseUrl,nodeUrl;
	@Test
	public void setup() throws MalformedURLException
	{
		baseUrl="https://www.google.com/?gws_rd=ssl";
		nodeUrl="http://192.168.43.178:2405/wd/hub";
	
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeUrl), capability);
	}
	@Test
	public void verify()
	{
		
		driver.get(baseUrl);
		Assert.assertEquals("Google",driver.getTitle());
	}
}