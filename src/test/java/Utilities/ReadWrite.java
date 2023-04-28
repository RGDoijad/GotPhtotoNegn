package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadWrite 
{
Properties p1;
	public ReadWrite()
		{
			File src=new File("./Configuration\\config.properties");
			try 
			{
				FileInputStream fis=new FileInputStream(src);
				p1=new Properties();
				p1.load(fis);
			} 
			
			catch (Exception e) 
			{
				
				System.out.println("MESSAGE"+ e.getMessage());
			}
			
		}

	public String getURL()
	{
		String uRL=p1.getProperty("BaseURL");
		return uRL;
		
	}
	
	public String getUserInfo()
	{
		String u=p1.getProperty("USERNAME");
		return u;
		
	}
	
	public String getPWD()
	{
		String P=p1.getProperty("PASSWORD");
		return P;
		
	}
	
	public String getBrowser()
	{
		String b=p1.getProperty("BROWSER");
		return b;
		
	}
}
