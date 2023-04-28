package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIN 

{
	WebDriver adriver;
	public LogIN(WebDriver bdriver)
	{
		adriver=bdriver;
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://app.gotphoto.com/login/login']")
	WebElement logINButton;
	
	@FindBy(xpath="//*[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='UserPassword']")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	
	
	//Action
	public void clickLoginButton()
	{
		logINButton.click();
	}
	
	public void enterUserName(String a)
	{
		username.sendKeys(a);
	}
	
	public void enterPassword(String b)
	{
		password.sendKeys(b);
	}
	
	public void enter()
	{
		submit.click();
	}
}
