package DataPool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TryUpdateExcelOwn {

	//public class UpdateToExcel {
		
		public static void UpdateExcelNewBusiness(String type1,String lob,String type) {
			String excelpath="G:\\MukeshFramework\\FrameWorkMukesh\\Excel\\Anky.xls";
			int rowcount=0;
			Workbook workbook=null;
			String a[]=new String[] {type1,lob,type};
			Sheet sheet=null;
			Sheet sheet1=null;
			try {
				FileInputStream fis=new FileInputStream(excelpath);
				
				workbook=WorkbookFactory.create(fis);
				sheet=workbook.getSheet(type);
				rowcount=sheet.getLastRowNum();
				System.out.println("fis close");
				fis.close();
			}
			
			catch (FileNotFoundException e) {
				workbook=new HSSFWorkbook();
				sheet=workbook.createSheet(type);
				
			}
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
				
			try {
				for (int i=0;i<=rowcount;i++) {
					Row row=sheet.createRow(++rowcount);
					System.out.println(rowcount);
					--rowcount;
					System.out.println(rowcount);
					for(int j=0;j<a.length;j++) {
						
						Cell cell=row.createCell(++j);
						--j;
						cell.setCellValue( a[j]);
					}}
				FileOutputStream output=new FileOutputStream(excelpath);
				System.out.println("fis open");
				workbook.write(output);
				output.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
					
					
				
			}
}
			
			
			
		
