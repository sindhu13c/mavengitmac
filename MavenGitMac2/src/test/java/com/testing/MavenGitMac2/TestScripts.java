package com.testing.MavenGitMac2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestScripts extends Module{

@BeforeMethod
public void beforeMethod()
{
	Lauch_FirefoxBrowser();
}

@Test
public void Login_ErrorMessageWithoutPassword_01()
{
	//invalid login
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	String userName="sindhu13.c@gmail.com";
	String passWord="";
	loginTo_Salesforce(userName,passWord);
	String expValue="Please enter your password.";
	WebElement er=driver.findElement(By.xpath("//*[@id='error']"));
	String actValue=er.getText();
	Assert.assertEquals(expValue, actValue);
}

@Test
public void Login_SFDC_02() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	String userName="sindhu13.c@gmail.com";
	String passWord="Tarun123*";
	loginTo_Salesforce(userName,passWord);
	Thread.sleep(3000);
	System.out.println("title"+driver.getTitle());
	Assert.assertNotNull(driver.findElement(By.xpath("//*[@id='userNavButton']")));
}

@AfterMethod
public void afterMethod()
{
	close_FirefoxBrowser();
}
}
