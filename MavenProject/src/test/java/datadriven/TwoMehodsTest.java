package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.mysql.cj.result.Row;

public class TwoMehodsTest {
  @Test
  public void f() throws Exception {
	  String path=System.getProperty("user.dir")+"\\TestData\\inputdata.xlsx";
	  String sheet="testdata";
	  
	  File f=new File(path);
	  FileInputStream fis=new FileInputStream(f);
	  Workbook wb=null;
	  Sheet st=null;
	  Row r=null;
	  Cell cell=null;
	 
	  if(path.endsWith(".xls"))
	  
		  wb=new HSSFWorkbook(fis);
	  
	  else if(path.endsWith(".xlsx"))
	  
		  wb=new XSSFWorkbook(fis);
	  
	  st=wb.getSheet("testdata");
	  int nr = st.getLastRowNum();
		//iterating over rows
		for(int i=1; i<nr; i++) {
			cell = st.getRow(i).getCell(0);
			System.out.println(cell);
	  }
	  
	  
  }
}

