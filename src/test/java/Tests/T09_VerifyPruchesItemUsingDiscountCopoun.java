package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjectes.AboutItemPage;
import PageObjectes.CartPage;
import PageObjectes.CheckoutPage;
import PageObjectes.HomePage;
import PageObjectes.MobilePage;
import PageObjectes.RegisterPage;
import PageObjectes.TVPage;
import PageObjectes.WishListPage;

public class T09_VerifyPruchesItemUsingDiscountCopoun extends BaseTest 
{
	HomePage homeObj;
	RegisterPage registerObj;
	TVPage tvObj;
	MobilePage mobileObj;
	AboutItemPage aboutObj;
	WishListPage wishObj;
	CheckoutPage checkObj;
	CartPage cartObj;
	Faker fake = new Faker();
	String F_Name = fake.name().firstName();
	String M_Name = "Suii";
	String L_Name = fake.name().lastName();
	String E_mail = fake.internet().emailAddress();
	String Pass = fake.internet().password();
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
		System.out.println("Email===>"+E_mail);
		System.out.println("Pass===>"+Pass);
	}
	
	@Test(priority = 1)
	public void Test_AddItemToWishList()
	{
		homeObj = new HomePage(driver);
		homeObj.Opene_Mobile_Page();
		mobileObj = new MobilePage(driver);
		mobileObj.Open_Detail_Item1();
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddItemToWishList();
		wishObj = new WishListPage(driver);
		Assert.assertTrue(wishObj.AssertAddWish_Msg.getText().contains("has been added to your wishlist"));
	}
	
	String Address = "ABC";
	String City = "New York";
	String Zip = "542866";
	String Telephone = "1245678";
	
	@Test(priority = 2)
	public void Test_AddItemToCart()
	{
		wishObj = new WishListPage(driver);
		wishObj.AddItemToCart();		 
	}
	
	String DiscountCopoun = "GURU50";
	
	@Test(priority = 3)
	public void Test_Using_Discount_CopounCode()
	{
		cartObj = new CartPage(driver);
		cartObj.CopounCode(DiscountCopoun);
		Assert.assertTrue(cartObj.AssertSuccessDiscount_MSG.getText().contains("applied"));
		System.out.println("Success MSG"+cartObj.AssertSuccessDiscount_MSG.getText());
	}
	
	@Test(priority = 4)
	public void Test_CheckOut_BILLINGINFORMATION()
	{
		checkObj = new CheckoutPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		checkObj.ProcessOfCheckOut();
		checkObj.CheckOut_BILLINGINFORMATION(Address, City, Zip, Telephone);
		//jse.executeScript("window.scrollup(0,50)");
		checkObj.Complet_CheckoutProcess();
	}
	


}
