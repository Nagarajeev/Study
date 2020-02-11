package mycode;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {
	
	public static String[][] readxl() throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook("./data/Testdata.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int coloumncount = sheet.getRow(1).getLastCellNum();
		String [][] tstdata = new String [rowcount][coloumncount] ;
		for (int i = 0; i <= rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for (int j =0; j < coloumncount; j++)
			{
				XSSFCell cell = row.getCell(j);
				if(i==0)
					tstdata[i][j]= cell.getStringCellValue();	
				else	
					tstdata[i-1][j]= cell.getStringCellValue();
				System.out.println(tstdata[i-1][j]);
			}
		}
		
		return tstdata;
	}

}
