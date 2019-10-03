package Selenium.MavenProject;

import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups = "fruits",priority = 0)
  public void apple() {
	  System.out.println("Apple");
  }
  @Test(groups = "fruits",priority = 1)
  public void banana()
  {
	  System.out.println("banana");
  }
  @Test(groups = "fruits",priority = 3)
  public void pineapple()
  {
	  System.out.println("pineapple");
  }
  @Test(groups = "vegetables",priority = 4)
  public void potato()
  {
	  System.out.println("potatp");
  }
  @Test(groups = "vegetables",priority = 5)
  public void ladyfinger()
  {
	  System.out.println("ladyfinger");
  }
}
