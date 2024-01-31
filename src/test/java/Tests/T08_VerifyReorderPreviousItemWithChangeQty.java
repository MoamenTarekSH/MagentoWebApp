package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjectes.AboutItemPage;
import PageObjectes.CheckoutPage;
import PageObjectes.HomePage;
import PageObjectes.LoginPage;
import PageObjectes.OrderPage;
import PageObjectes.RegisterPage;
import PageObjectes.TVPage;
import PageObjectes.WishListPage;

public class T08_VerifyReorderPreviousItemWithChangeQty extends BaseTest 
{
	HomePage homeObj;
	LoginPage loginObj;
	OrderPage orderObjp;
	CheckoutPage checkObj;
	String E_mail = "MoamenTarek2@Test.com";
	String Pass = "1478526ASD#2";
	
	@Test(priority = 0)
	public void Open_Account_HomePage()
	{
		driver.navigate().to("http://live.techpanda.org/index.php/");
	}
	
	@Test(priority = 1)
	public void Test_Logout_Account() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.logout();
	}
	
	@Test(priority = 2)
	public void Test_Login_Account() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.Open_Login_Page();
		loginObj = new LoginPage(driver);
		loginObj.Login_Data(E_mail, Pass);
	}
	
	@Test(priority = 3)
	public void Test_ReOrderPreviousItemHasBeenOrdered()
	{
		
		orderObjp = new OrderPage(driver);
		orderObjp.ReOrder();
		orderObjp.Change_ItemQTY();
		Assert.assertTrue(orderObjp.AssertGrandTotal_MS.getText().contains("$6,150.00"));
	}
	
	String Address = "ABC";
	String City = "New York";
	String Zip = "542866";
	String Telephone = "1245678";
	

	@Test(priority = 4)
	public void Test_CheckOut_BILLINGINFORMATION()
	{
		checkObj = new CheckoutPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		checkObj.ProcessOfCheckOut();
		checkObj.ReOrder_CheckOut_BILLINGINFORMATION();
		//jse.executeScript("window.scrollup(0,50)");
		checkObj.Complet_CheckoutProcess();
		//System.out.println(checkObj.Order_Num.getText());
	}
	


}
