package Tests;

import java.awt.AWTException;

import org.openqa.selenium.devtools.v118.fedcm.model.Account;
import org.testng.annotations.Test;

import PageObjectes.AccountPage;
import PageObjectes.HomePage;
import PageObjectes.OrderPage;

public class T07_VerifyPrintOrderPDF extends BaseTest
{
	HomePage homeObj;
	AccountPage accountObj;
	OrderPage orderObjp;
	
	
	//@Test(priority = 0)
	public void Open_Account_HomePage()
	{
		driver.navigate().to("http://live.techpanda.org/index.php/");
	}
	
	
	@Test(priority = 0)
	public void Test_PrintOrderPDF() throws InterruptedException, AWTException 
	{
		homeObj = new HomePage(driver);
		homeObj.Open_MyAccount_Page();
		accountObj = new AccountPage(driver);
		accountObj.Open_MyOrder_Page();
		orderObjp = new OrderPage(driver);
		orderObjp.ViewOrder_Page();
		orderObjp.PrintOrder();
	}
	
	

}
