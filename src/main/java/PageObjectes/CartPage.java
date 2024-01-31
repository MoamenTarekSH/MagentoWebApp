package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage
{

	public CartPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")
	WebElement QTY_Box;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button")
	WebElement Update_Btn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[2]/p")
	public WebElement AssertQTY_MSG;
	
		public void Enter_QTYOfItem(String qtynum)
		{
			ENTERTXT(QTY_Box, qtynum);
			ClicBtn(Update_Btn);
		}
		
	@FindBy(id = "empty_cart_button")
	WebElement EmptyCart_Btn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[2]/p[1]")
	public WebElement AssertNoItemCart_MSG;
		public void ClearCartList()
		{
			ClicBtn(EmptyCart_Btn);
		}
	
	@FindBy(id = "coupon_code")
	WebElement CopounCode_TXTBox;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div/div/button")
	WebElement Apply_Btn;
	
	@FindBy(xpath  = "/html/body/div/div/div[2]/div/div/div/ul/li/ul/li/span")
	public WebElement AssertSuccessDiscount_MSG;			//Coupon code "GURU50" was applied.
		public void CopounCode(String code)
		{
			ENTERTXT(CopounCode_TXTBox, code);
			ClicBtn(Apply_Btn);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
