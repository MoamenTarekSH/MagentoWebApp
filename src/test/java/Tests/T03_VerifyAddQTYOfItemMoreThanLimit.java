package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectes.AboutItemPage;
import PageObjectes.CartPage;
import PageObjectes.HomePage;
import PageObjectes.MobilePage;

public class T03_VerifyAddQTYOfItemMoreThanLimit extends BaseTest 
{

	HomePage homeObj;
	MobilePage moblieObj;
	AboutItemPage aboutObj;
	CartPage cartObj;
	
	@Test
	public void Assert_PriceOfItems()
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_Mobile_Page();
		moblieObj = new MobilePage(driver);
		moblieObj.Opene_About_Item();
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddTOCart_BTN();
		cartObj = new CartPage(driver);
		cartObj.Enter_QTYOfItem("1000");
		Assert.assertTrue(cartObj.AssertQTY_MSG.getText().contains("The maximum quantity allowed for purchase is 500."));
		cartObj.ClearCartList();
		Assert.assertTrue(cartObj.AssertNoItemCart_MSG.getText().contains("You have no items in your shopping cart."));
	}
	 
}
