package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

public class SeleniumGrid {
	WebDriver driver;
	String baseUrl,nodeUrl;
	public void setup()
	{
		baseUrl="https://www.google.com/?gws_rd=ssl";
		nodeUrl="http://192.168.43.178:4444/wd/hub";
	}
	public void chrome() throws URISyntaxException, MalformedURLException {
		new DesiredCapabilities();
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver=new org.openqa.selenium.remote.RemoteWebDriver(new URL(nodeUrl), capability);
		driver.get(baseUrl);
		Assert.assertEquals("Google", driver.getTitle());
	}
	

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		SeleniumGrid s=new SeleniumGrid();
		s.setup();
		s.chrome();


	}

}
