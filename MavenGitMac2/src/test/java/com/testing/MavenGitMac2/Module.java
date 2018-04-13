package com.testing.MavenGitMac2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.*;

public class Module extends ReUsableMethods{

	public static WebDriver driver;
	public static void Lauch_FirefoxBrowser()
	{
		/*
		String driverPath="/Users/sindhu/Documents/testingjarfiles/geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		driver=new FirefoxDriver();
		
		
		System.out.println("Firefox browser is launched..");
		*/
		
		/*
		String cur_dir = System.getProperty("user.dir");
		String driverPath = cur_dir + "/src/test/java/utility/chromedriver";
		
		//String driverPath="/Users/sindhu/Documents/testingjarfiles/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver=new ChromeDriver();
		
		
		
		
		System.out.println("Chrome browser is launched..");
		*/
		
		/*
		 * opera
		 */
		
		String cur_dir = System.getProperty("user.dir");
		String driverPath = cur_dir + "/src/test/java/utility/operadriver";
		
		//String driverPath="/Users/sindhu/Documents/testingjarfiles/chromedriver";
		System.setProperty("webdriver.opera.driver", driverPath);
		
		driver=new OperaDriver();
		
	
		System.out.println("Chrome browser is launched..");
		
	}
	public static void loginTo_Salesforce(String userName,String passWord)
	{
				//launch url
				driver.get("https://login.salesforce.com/");
				
				System.out.println("Salesforce application is launched..");
				
				//enter UN in username field
				WebElement un=driver.findElement(By.xpath("//*[@id='username']"));
				enterText(un,userName,"UserName");
			    
				//clear password field
				WebElement pwd=(WebElement) driver.findElement(By.xpath("//*[@id='password']"));
				if(passWord.equals(""))
				{
					clearText(pwd,"PassWord");
				}
				else
				{
					enterText(pwd,passWord,"PassWord");
				}
			    //click login button
			    WebElement login=(WebElement) driver.findElement(By.xpath("//*[@id='Login']"));
				clickEvent(login,"LoginButton");
			
	}
	public static void close_FirefoxBrowser()
	{
		driver.close();
		System.out.println("Browser closed..");
	}
	public static void enterUserName()
	{
		
	}
	
}
