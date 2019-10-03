package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SimpledatadrivenTest {
  @Test
  public void f() throws Exception 
  {
	  FileInputStream fis=new FileInputStream("E:\\Automation Testing\\MavenProject\\TestData\\inputdata.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheet("testdata");
	  for(int i=1;i<=sheet.getLastRowNum();i++)
	  {
		  System.out.println("the usernames are :"+sheet.getRow(i).getCell(0).getStringCellValue());
	  }
  }
}
