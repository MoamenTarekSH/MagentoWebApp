package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectes.HomePage;
import PageObjectes.MobilePage;

public class T01_VerifyMobailPage  extends BaseTest
{
	
	HomePage homeObj;
	MobilePage mobileObj;
	
	
	
	@Test
	public void Test_MobailPage()
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_Mobile_Page();
		Assert.assertTrue(driver.getTitle().contains("Mobile"));
		mobileObj = new MobilePage(driver);
		mobileObj.Select_SortBy();
		Assert.assertTrue(mobileObj.SortBy_Option.getText().contains("Name"));
	}

}
