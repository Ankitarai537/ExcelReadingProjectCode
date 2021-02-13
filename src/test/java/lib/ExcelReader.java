package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
public String getdata(String sheetName,int ) {
		
		try {
			FileInputStream fis=new FileInputStream("G:\\MukeshFramework\\FrameWorkMukesh\\Excel\\ExcelData.xlsx");
			try {
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				wb.getSheetAt(0).getRow(0).getCell(cellnum);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
}
		
	}

