package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectes.AboutItemPage;
import PageObjectes.HomePage;
import PageObjectes.MobilePage;

public class T02_VerifyPriceOfItemEquleInPages extends BaseTest 
{

	HomePage homeObj;
	MobilePage moblieObj;
	AboutItemPage aboutObj;
	
	
	@Test
	public void Assert_PriceOfItems()
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_Mobile_Page();
		moblieObj = new MobilePage(driver);
		String PriceInList = moblieObj.priceInList_TXT.getText();
		System.out.println(PriceInList);
		moblieObj.Opene_About_Item();
		aboutObj = new AboutItemPage(driver);
		String PriceInDetail = aboutObj.PriceInDetail_TXT.getText();
		System.out.println(PriceInDetail);
		Assert.assertTrue(PriceInList.contains(PriceInDetail));
	}
	 
}
