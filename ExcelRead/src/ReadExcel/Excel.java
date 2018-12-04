package ReadExcel;

import java.io.File;
import jxl.Workbook;

public class Excel {

	public static void main(String[] args) throws Exception  {
		
		File src = new File("D:\\Zakiya\\Book1.xls");
		
		System.out.println("Excel located");
		
		Workbook wb =Workbook.getWorkbook(src);
		
		System.out.println("Workbook loaded");
		
		
	String data00 = wb.getSheet(0).getCell(0, 0).getContents();
	
	System.out.println("Data is "+data00);
	
	
	}
	

}
