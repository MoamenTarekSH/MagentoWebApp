package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "pass")
	WebElement Pass;
	
	@FindBy(id = "send2")
	WebElement Login_Btn;
		public void Login_Data(String email , String pass)
		{
			ENTERTXT(Email, email);
			ENTERTXT(Pass, pass);
			ClicBtn(Login_Btn);
		}
		
	
}
