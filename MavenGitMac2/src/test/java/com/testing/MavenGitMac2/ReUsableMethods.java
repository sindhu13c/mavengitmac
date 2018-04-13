package com.testing.MavenGitMac2;
import org.openqa.selenium.WebElement;

public class ReUsableMethods {

	/*
	 * MethodName:EnterText
	 * Brief Description : Enter text in Object
	 * Arguments: obj --> Object, textval--> test value to be entered, objName --> Name of the object
	 * Created By: Sindhuja
	 * Creation Date: Mar 09 2018
	 * Modified By: Sindhuja
	 * Modified Date: Mar 09 2018
	 * */

	public static void enterText(WebElement obj, String textValue, String objName) {
		// TODO Auto-generated method stub
		if(obj.isDisplayed())
		{
			obj.sendKeys(textValue);
			System.out.println("Pass: "+textValue+" is entered in "+objName+"field.");
		}
		else
		{
			System.out.println("Fail: "+objName+" field does not exist please check your application");
		}
	}
	
	/*
	 * MethodName:clickEvent
	 * Brief Description : Click on Object
	 * Arguments: obj --> Object, objName --> Name of the object
	 * Created By: Sindhuja
	 * Creation Date: Mar 09 2018
	 * Modified By: Sindhuja
	 * Modified Date: Mar 09 2018
	 * */
	
	public static void clickEvent(WebElement obj, String objName) {
		// TODO Auto-generated method stub
		if(obj.isDisplayed())
		{
			obj.click();
			System.out.println("Pass: "+objName+" is clicked");
		}
		else
		{
			System.out.println("Fail: "+objName+" field does not exist please check your application");
		}
	}
	
	/*
	 * MethodName:clearText
	 * Brief Description :Clear the content in the textbox
	 * Arguments: obj --> Object,objName --> Name of the object
	 * Created By: Sindhuja
	 * Creation Date: Mar 09 2018
	 * Modified By: Sindhuja
	 * Modified Date: Mar 09 2018
	 * */
	
	public static void clearText(WebElement obj,String objName)
	{
		if(obj.isDisplayed())
		{
			obj.clear();
			System.out.println("Pass: text cleared in "+objName+"field.");
		}
		else
		{
			System.out.println("Fail: "+objName+" field does not exist please check your application");
		}
	}
	
}
