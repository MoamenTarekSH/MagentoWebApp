package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WishListPage extends BasePage 
{

	public WishListPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")
	public WebElement AssertAddWish_Msg;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]")
	WebElement ShareWishList_Btn;
		public void Open_ShareListPage()
		{
			ClicBtn(ShareWishList_Btn);
		}
	
	@FindBy(id="email_address")
	WebElement Email_Friend;
	
	@FindBy(id = "message")
	WebElement MSGTOFriend;	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button")
	WebElement Share_Btn;
		public void Enter_DataToShareWhishList(String email , String msg)
		{
			ENTERTXT(Email_Friend, email);
			ENTERTXT(MSGTOFriend, msg);
			ClicBtn(Share_Btn);
		}

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")
	public WebElement AssertShare_MSG;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr/td[5]/div/button")
	WebElement AddTOCart_Btn;
		public void AddItemToCart()
		{
			ClicBtn(AddTOCart_Btn);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
