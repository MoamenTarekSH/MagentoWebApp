package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/header/div/div[2]/div/a")
	WebElement Account_Btn;
	
	@FindBy(xpath = "/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")
	WebElement Register_Page;
		public void Open_Register_Page() throws InterruptedException
		{
			ClicBtn(Account_Btn);
			Thread.sleep(2000);
			ClicBtn(Register_Page);
		}
	@FindBy(xpath = "/html/body/div/div/header/div/div[5]/div/ul/li[1]/a")
	WebElement MyAccount_Page;
		public void Open_MyAccount_Page() throws InterruptedException
		{
			ClicBtn(Account_Btn);
			Thread.sleep(2000);
			ClicBtn(MyAccount_Page);
		}
	@FindBy(xpath = "/html/body/div/div/header/div/div[5]/div/ul/li[6]/a")
	WebElement Login_Page;
		public void Open_Login_Page() throws InterruptedException
		{
			ClicBtn(Account_Btn);
			Thread.sleep(2000);
			ClicBtn(Login_Page);
		}
		
	@FindBy(xpath = "/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")
	WebElement Logout_Btn;
		public void logout() throws InterruptedException
		{
			ClicBtn(Account_Btn);
			Thread.sleep(2000);
			ClicBtn(Logout_Btn);
		}
	
	

	@FindBy(id = "search")
	WebElement Search_Box;
		public void Enter_Search_Item(String Itemname)
		{
			ENTERTXT(Search_Box, Itemname);
			Search_Box.submit();
		}
	
	@FindBy(xpath = "/html/body/div/div/header/div/div[2]/div/div/a")
	WebElement Cart_Btn;
		public void Open_Cart_Page()
		{
			ClicBtn(Cart_Btn);
		}
	
	@FindBy(xpath = "/html/body/div/div/header/div/div[3]/nav/ol/li[1]/a")
	WebElement Mobile_Page;
		public void Opene_Mobile_Page()
		{
			ClicBtn(Mobile_Page);
		}
	
	@FindBy(xpath = "/html/body/div/div/header/div/div[3]/nav/ol/li[2]/a")
	WebElement TV_Page;
		public void Opene_TV_Page()
		{
			ClicBtn(TV_Page);
		}
	

}
