package Com.learnAutomation.testcases;

import DataPool.TryUpdateExcelOwn;
import DataPool.UpdateToExcel;

public class exceltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateToExcel ex=new UpdateToExcel();
		//ex.UpdateExcelNewBusiness("1strow", "2ndroww", "she);
		ex.UpdateExcelNewBusiness("abc", "test","tw");
		TryUpdateExcelOwn ex1=new TryUpdateExcelOwn();
		ex1.UpdateExcelNewBusiness("465768@123@#$", "2646464", "ankita");
	}

}
