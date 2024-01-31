package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage 
{

	public AccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement MyOrder_Btn;
		public void Open_MyOrder_Page()
		{
			ClicBtn(MyOrder_Btn);
		}
	

	
	
	
	
	
	
	
	

}
