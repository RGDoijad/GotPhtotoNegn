package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadWrite;

public class BaseClass 
{
	
	ReadWrite r=new ReadWrite();
	public String uname=r.getUserInfo();
	public String pword=r.getPWD();
	public String url=r.getURL();
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chorme.driver", r.getBrowser());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
}
