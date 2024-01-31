package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage extends BasePage 
{

	public TVPage(WebDriver driver) 
	{
		super(driver);

	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/h2/a")
	WebElement AboutItem1_Btn;
		public void OpenDetail_Item1()
		{
			ClicBtn(AboutItem1_Btn);
		}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/h2/a")
	WebElement AboutItem2_Btn;
		public void OpenDetail_Item2()
		{
			ClicBtn(AboutItem2_Btn);
		}
		

}
