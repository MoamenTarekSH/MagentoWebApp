package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutItemPage extends BasePage 
{

	public AboutItemPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div/span/span")
	public WebElement PriceInDetail_TXT;
	
	@FindBy(id = "qty")
	WebElement QTY_Box;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/div/div[2]/button")
	WebElement AddCart_Btn;
		public void Enter_NumOfQTY(String qtynum)
		{
			ENTERTXT(QTY_Box, qtynum);
			ClicBtn(AddCart_Btn);
		}
		
		public void AddTOCart_BTN()
		{
			ClicBtn(AddCart_Btn);
		}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[1]/ul/li/ul/li/span")
	public  WebElement AssertQTY_MSG;

	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/ul[1]/li[2]/a")
	WebElement AddCompare_Btn;
		public void ADD_To_Compare()
		{
			ClicBtn(AddCompare_Btn);	
		}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/ul[1]/li[1]/a")
	WebElement AddToWish_Btn;
		public void AddItemToWishList()
		{
			ClicBtn(AddToWish_Btn);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
