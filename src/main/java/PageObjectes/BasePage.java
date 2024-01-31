package PageObjectes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	public WebDriver driver ;
	public JavascriptExecutor Js;
	WebDriverWait wait;
	
	
	public  BasePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	protected void ClicBtn(WebElement button) 
	{
		button.click();
	}
	
	protected void ENTERTXT(WebElement textelement , String vlue) 
	{
		textelement.sendKeys(vlue);
	}
	

}
