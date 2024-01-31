package PageObjectes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage 
{

	public CheckoutPage(WebDriver driver) 
	{
		super(driver);
		Js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30)) ;
				
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button")
	WebElement CheckOut_Btn;
		public void ProcessOfCheckOut()
		{
			ClicBtn(CheckOut_Btn);
		}
		
	@FindBy(id = "billing:firstname")
	WebElement firstname;
	
	@FindBy(id = "billing:middlename")
	WebElement middlename;
	
	@FindBy(id = "billing:lastname")
	WebElement lastname;
	
	@FindBy(id = "billing:street1")
	WebElement Address;
	
	@FindBy(id = "billing:city")
	WebElement City;
	
	@FindBy(id = "billing:region_id")
	WebElement region;
	
	@FindBy(id = "billing:postcode")
	WebElement postcode;
	
	@FindBy(id = "billing:country_id")
	WebElement country;
	
	@FindBy(id = "billing:telephone")
	WebElement Telephone;
	
	@FindBy(id = "billing:use_for_shipping_yes")
	WebElement ShipToAddress_RadioBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button")
	WebElement Continue_Btn;
		public void CheckOut_BILLINGINFORMATION(String address , String city , String zip , String telephone)
		{
			ENTERTXT(Address, address);
			ENTERTXT(City, city);
			Select reg = new Select(region);
			reg.selectByVisibleText("New York");
			ENTERTXT(postcode, zip);
			Select Coun = new Select(country);
			Coun.selectByVisibleText("United States");
			ENTERTXT(Telephone, telephone);
			ClicBtn(ShipToAddress_RadioBtn);
			ClicBtn(Continue_Btn);
		}
		public void ReOrder_CheckOut_BILLINGINFORMATION()
		{
			/*
			 * ENTERTXT(Address, address); ENTERTXT(City, city); Select reg = new
			 * Select(region); reg.selectByVisibleText("New York"); ENTERTXT(postcode, zip);
			 * Select Coun = new Select(country); Coun.selectByVisibleText("United States");
			 * ENTERTXT(Telephone, telephone); ClicBtn(ShipToAddress_RadioBtn);
			 */
			ClicBtn(Continue_Btn);
		}

		
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button")
	WebElement ContinueShiipingMethode_Btn ; 
	
	@FindBy(id = "p_method_checkmo")
	WebElement PaymentInfo_CheckMoneyOrder_RadioBTN;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")
	WebElement ContinuePaymentInfo;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button")
	WebElement 	PlaceOrder_Btn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[2]/button")
	WebElement ContinueLastShipping_Btn;
		public void Complet_CheckoutProcess()
		{
			//ContinueShiipingMethode_Btn
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button"))); 
			Js.executeScript("arguments[0].click();", element);
			ClicBtn(ContinueShiipingMethode_Btn);
			ClicBtn(PaymentInfo_CheckMoneyOrder_RadioBTN);
			ClicBtn(ContinuePaymentInfo);
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button"))); 
			Js.executeScript("arguments[0].click();", element2);
			//ClicBtn(PlaceOrder_Btn);
			ClicBtn(ContinueLastShipping_Btn);
		}
			
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/p[1]/a")
	public WebElement Order_Num;	
		
		
		
		
		
		
		
		
		
		
		
		
		
}
