package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	
	public static WebDriver driver ;
	
	/*
	 * @BeforeTest public void Open_URL() { driver = new FirefoxDriver();
	 * driver.get("http://live.techpanda.org/");
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); }
	 */
	@BeforeSuite
	@Parameters({"Browser"})
	public void OpenWebSite(@Optional("firefox") String broswerName) 
	{
		if(broswerName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(broswerName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(broswerName.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().to("http://live.techpanda.org/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//@AfterTest
	public void Quit_URL()
	{
		driver.quit();
	}
}
