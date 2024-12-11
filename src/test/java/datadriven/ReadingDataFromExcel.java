package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//excel file--->Workbook---->Sheets--->Rows---->cells
public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		//Read file from excel
	  FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\data\\Data.xlsx");
	  
	  //cature workbook
	  XSSFWorkbook workbook=new XSSFWorkbook(file);

	  //extract specific sheet on workbook
      XSSFSheet sheet= workbook.getSheet("Sheet1");
      
      //extract rows
      int totalrow= sheet.getLastRowNum();
      
      //extract cells
      int totalcell= sheet.getRow(1).getLastCellNum();
      
      System.out.println(totalrow);
      System.out.println(totalcell);
      
      for(int r=0;r<=totalrow;r++) 
      {
            XSSFRow	currentrow= sheet.getRow(r);
    	  for(int c=0;c<totalcell;c++) 
    	  {
    	     XSSFCell currentcell= currentrow.getCell(c);
    	     System.out.print(currentcell.toString()+"\t");
    	  }
    	  System.out.println();
      }
     workbook.close();
     file.close();
      
}
}
