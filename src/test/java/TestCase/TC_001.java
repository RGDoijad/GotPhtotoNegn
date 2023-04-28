package TestCase;

import org.testng.annotations.Test;

import PageObject.LogIN;

public class TC_001 extends BaseClass
{
	@Test
	public void L1()
	{
		driver.get(url);
		LogIN l=new LogIN(driver);
	
		
	}
}
