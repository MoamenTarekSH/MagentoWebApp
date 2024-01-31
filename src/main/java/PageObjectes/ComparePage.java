package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends BasePage 
{

	public ComparePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div/button")
	WebElement Compare_Btn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/div[2]/div[2]/ol/li[1]/a")
	public WebElement Remove_Btn1;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/ol/li[2]/a")
	WebElement Remove_Btn2;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/div[3]/div[2]/div/a")
	public WebElement Clear_Btn;
					
	@FindBy(css = ".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)") //The comparison list was cleared.
	public WebElement AssertClear_MSG;

}
