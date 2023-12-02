package org.subname1;

import org.openqa.selenium.WebElement;
import org.utilityclass.Utility;

public class PractiseMain extends Utility
{
	public static void main(String[] args)
	{
		browserLaunch();
		
		launchUrl("https://www.facebook.com/");
		
		maximizewindow();
		
		FacebookHomePage fbhp = new FacebookHomePage();
		
		WebElement txtEmail = fbhp.getTxtEmail();
		sendkeys(txtEmail, "Hello");
		
		WebElement txtPass = fbhp.getTxtpass();
		sendkeys(txtPass, "Text");
		
		WebElement btnLogin = fbhp.getBtnLogin();
		click(btnLogin);
	}
	
}
