package Com.learnAutomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.learnAutomation.pages.LoginPage;
import Com.learnAutomation.utility.BaseClass;
import Com.learnAutomation.utility.BrowserFactory;
import DataPool.UpdateToExcel;



public class Login_Test_CRM {
	
	
	
	static WebDriver driver;
	@Test
	public void loginApp() throws Throwable {
		
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		
		driver=new InternetExplorerDriver();	
		System.out.println("driver is "  +driver);
		//BrowserFactory.startBrowser("driver", "IE", "http://google.com/");
		driver.get("http://google.com/");
		System.out.println("hi");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.GoogleSearch();
		loginpage.clickEnter();
		loginpage.gettextdoingtoexport();
		
		
		
	}

}
