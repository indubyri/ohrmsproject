package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataDriven2Test {
  @Test
  public void f() throws Exception {
	  String path=System.getProperty("user.dir")+"\\TestData\\inputdata.xlsx";
	  File f=new File(path);
	  FileInputStream fis = new FileInputStream(f);
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheet("testdata");
	  for(int i=1;i<=sheet.getLastRowNum();i++)
	  {
		  System.out.println("The values are:"+sheet.getRow(i).getCell(0).getStringCellValue());
	  }
	  
  }
}
