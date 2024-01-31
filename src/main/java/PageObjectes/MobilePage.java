package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MobilePage extends BasePage
{

	public MobilePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath =   "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	public WebElement  SortBy_Option;
		public void Select_SortBy()
		{
		
			//ClicBtn(SortBy_Option);
			Select name = new Select(SortBy_Option);
			name.selectByValue("http://live.techpanda.org/index.php/mobile.html?dir=asc&order=name");
					
					
		}
	

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/p/strong")
	WebElement ViewAs_Grid;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/p/a")
	WebElement ViewAs_List;
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[1]/span/span")
	public WebElement priceInList_TXT;
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a")
	WebElement AboutItem_Btn;
	
	public void Opene_About_Item()
	{
		ClicBtn(AboutItem_Btn);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")
	WebElement SelecteItem1_Btn;
		public void Open_Detail_Item1()
		{
			ClicBtn(SelecteItem1_Btn);
		}
	
	 
	
}
