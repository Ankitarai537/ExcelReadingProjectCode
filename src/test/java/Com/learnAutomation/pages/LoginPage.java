package Com.learnAutomation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import DataPool.UpdateToExcel;

public class LoginPage {
	 static WebDriver driver;
	
	
	
	@FindBy(name="q") WebElement googleSearchEnter;
	
	@FindBy(xpath="//span[text()='Sign in to Zoho CRM | Zoho CRM Login']") WebElement gettextclick;
	
	public void GoogleSearch() {
		System.out.println("driver is "  +driver);
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		googleSearchEnter.sendKeys("CRM login");
		
	}
	
	public void clickEnter() {
		googleSearchEnter.sendKeys(Keys.ENTER);	
	}

	
	public void gettextdoingtoexport() throws Throwable {
		Thread.sleep(8000);
		System.out.println(gettextclick.getText());
		UpdateToExcel ex=new UpdateToExcel();
		//ex.UpdateExcelNewBusiness("1strow", "2ndroww", "she);
		ex.UpdateExcelNewBusiness(gettextclick.getText(), gettextclick.getText(),gettextclick.getText());
		//return gettextclick.getText();
		
	}
}
