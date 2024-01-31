package Tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectes.AboutItemPage;
import PageObjectes.ComparePage;
import PageObjectes.HomePage;
import PageObjectes.TVPage;



public class T04_VerifyCompareTwoItem extends BaseTest
{
	HomePage homeObj;
	TVPage tvObj;
	AboutItemPage aboutObj;
	ComparePage compareObj;
	
	
	@Test
	public void Test_CompareBetweenTwoItem() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_TV_Page();
		tvObj = new TVPage(driver);
		tvObj.OpenDetail_Item1();
		aboutObj = new AboutItemPage(driver);
		aboutObj.ADD_To_Compare();
		driver.navigate().back();
		tvObj.OpenDetail_Item2();
		aboutObj.ADD_To_Compare();
		driver.navigate().back();
		compareObj = new ComparePage(driver);
		compareObj.Remove_Btn1.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		compareObj.Clear_Btn.click();
		alert.accept();
		Thread.sleep(4000);
		Assert.assertTrue(compareObj.AssertClear_MSG.getText().contains("The comparison list was cleared."));
		
	}

}
