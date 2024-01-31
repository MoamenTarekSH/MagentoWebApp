package PageObjectes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage 
{

	public OrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/span/a[1]")
	WebElement ViewOrder_Btn;
		public void ViewOrder_Page()
		{
			ClicBtn(ViewOrder_Btn);
		}
		
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
	WebElement PrintOrder_Btn;
		public void PrintOrder() throws InterruptedException, AWTException
		{
			ClicBtn(PrintOrder_Btn);
			Thread.sleep(2000);
			Robot Rob = new Robot();
			Rob.keyPress(KeyEvent.VK_ENTER);
			Rob.keyRelease(KeyEvent.VK_ENTER);
			Rob.delay(2000);
			Rob.keyPress(KeyEvent.VK_O);
			Rob.keyRelease(KeyEvent.VK_O);
			Rob.keyPress(KeyEvent.VK_R);
			Rob.keyRelease(KeyEvent.VK_R);
			Rob.keyPress(KeyEvent.VK_D);
			Rob.keyRelease(KeyEvent.VK_D);
			Rob.delay(2000);
			Rob.keyPress(KeyEvent.VK_ENTER);
			Rob.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/div[3]/table/tbody/tr/td[6]/span/a[2]")
	WebElement Reorder_Btn;
		public void ReOrder()
		{
			ClicBtn(Reorder_Btn);
		}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")
	WebElement QTY_TxtBox;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button")
	WebElement UpdateQTY_Btn;
		public void Change_ItemQTY()
		{
			QTY_TxtBox.clear();
			QTY_TxtBox.sendKeys("10");
			ClicBtn(UpdateQTY_Btn);
		}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[3]/div/table/tfoot/tr/td[2]/strong/span")
	public  WebElement AssertGrandTotal_MS;		//$6,150.00
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
