package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage 
{

	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "firstname")
	WebElement F_Name;
	
	@FindBy(id = "middlename")
	WebElement M_Name;
	
	@FindBy(id = "lastname")
	WebElement L_Name;
	
	@FindBy(id = "email_address")
	WebElement E_Mail;
	
	@FindBy(id = "password")
	WebElement Pass;
	
	@FindBy(id = "confirmation")
	WebElement Conf_Pass;
	
	@FindBy(id = "is_subscribed")
	WebElement Subscribr_CheckBox;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/div[2]/button")
	WebElement Register_Btn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span") //Thank you for registering with Main Website Store.
	public WebElement AssertSuccessReg_MSG;
		
	
	public void Enter_Register_Data(String fname ,String mname , String lname , String email , String pass ,String confpass)
	{
		ENTERTXT(F_Name, fname);
		ENTERTXT(M_Name, mname);
		ENTERTXT(L_Name, lname);
		ENTERTXT(E_Mail, email);
		ENTERTXT(Pass, pass);
		ENTERTXT(Conf_Pass, pass);
		ClicBtn(Subscribr_CheckBox);
		ClicBtn(Register_Btn);
	}


}
