package listenerimplementation;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListenersTest   {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test(priority = 2)
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("indhubyri@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Satyam@11");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@Test(priority = 1)
	public void signup()
	{
		driver.findElement(By.name("firstname")).sendKeys("indu");
		driver.findElement(By.name("lastname")).sendKeys("bhairi");
	}

}
