package datadriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;

public class DatabaseDrivenTest {
	String dbUrl,username,password;
	WebDriver driver;
	@Test(priority = 1)
	public void browser()
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium software\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	}
  @Test(priority=2)
  public void f() {
	  try
	  {
	  dbUrl="jdbc:mysql://localhost:3306/oranges";
	  username="root";
	  password="root";
	  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(dbUrl,username,password);
		Statement st=conn.createStatement();
		Resultset rs=(Resultset) st.executeQuery("select * from details");
		while (((ResultSet) rs).next())
		{
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(((ResultSet) rs).getString("username"));
			//driver.findElement(By.xpath("//input[@name='pass']")).clear();
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(((ResultSet) rs).getString("password"));
			driver.findElement(By.xpath("//input[@type='submit']")).click();

	    	/*if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
	    	{
	    		WebDriverWait wait=new WebDriverWait(driver, 30);
	    		wait.until( ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='userNavigationLabel']"))).click();
			   	  Thread.sleep(2000);
			   	  	  driver.findElement(By.linkText("Logout")).click();
			   	   Thread.sleep(2000);
	    	}
	    	else {
	    	 driver.navigate().back();
	    		
	    		} 	*/
			
		}
		 conn.close(); 

	  }
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
