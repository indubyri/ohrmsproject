package Selenium.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_login {
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
	@Test
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("indhubyri@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Satyam@1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
