package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjectes.AboutItemPage;
import PageObjectes.HomePage;
import PageObjectes.RegisterPage;
import PageObjectes.TVPage;
import PageObjectes.WishListPage;

public class T05_VerifyCreateAccountAndShareWishList extends BaseTest 
{
	HomePage homeObj;
	RegisterPage registerObj;
	TVPage tvObj;
	AboutItemPage aboutObj;
	WishListPage wishObj;
	Faker fake = new Faker();
	String F_Name = "Moamen";
	String M_Name = "Tarek";
	String L_Name = "Shaban";
	String E_mail = "MoamenTarek2@Test.com";
	String Pass = "1478526ASD#2";
	String Email_Friend = fake.internet().emailAddress();
	String MSGToFriend = "I want to buy this item what your openion";
	
	@Test(priority = 0)
	public void Test_Register_Account() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.Open_Register_Page();
		registerObj = new RegisterPage(driver);
		registerObj.Enter_Register_Data(F_Name, M_Name, L_Name, E_mail, Pass , Pass);
		Assert.assertTrue(registerObj.AssertSuccessReg_MSG.getText().contains("Thank you for registering with Main Website Store."));	
		System.out.println(E_mail);
		System.out.println(Pass);
	}
	
	@Test(priority = 1)
	public void Test_AddItemToWishList()
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_TV_Page();
		tvObj = new TVPage(driver);
		tvObj.OpenDetail_Item1();
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddItemToWishList();
		wishObj = new WishListPage(driver);
		Assert.assertTrue(wishObj.AssertAddWish_Msg.getText().contains("has been added to your wishlist"));
	}
	
	@Test(priority = 2)
	public void Test_ShareWishList()
	{
		wishObj = new WishListPage(driver);
		wishObj.Open_ShareListPage();
		wishObj.Enter_DataToShareWhishList(Email_Friend, MSGToFriend);
		Assert.assertTrue(wishObj.AssertShare_MSG.getText().contentEquals("Your Wishlist has been shared."));
	}
			

}
