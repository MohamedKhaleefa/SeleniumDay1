package org.pom_fight;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.utilityclass.Utility;

public class Login extends Utility
{

//	@FindAll({
//		@FindBy(),   //OR
//		@FindBy()
//	})
//	private WebElement element;
	
	
//	@FindBys({
//		@FindBy(),    //AND
//		@FindBy()
//	})
//	private WebElement element;

	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy (id="pass")
	private WebElement txtpass;
	
	@FindBy (xpath = "//button[@value='login']")
	private WebElement btnLogin;
	
	
	
	
	public WebElement getTxtEmail()
	{
		return txtEmail;
	}
	
	public WebElement getTxtPass()
	{
		return txtpass;
	}
	
	public WebElement getBtnLogin()
	{
		return btnLogin;
	}
	
	
	
	
	public void login(String username, String password)
	{
	//	elementSendKeys(txtEmail,username);
	//	elementSendKeys(txtpass,password);
	//	elementSendKeys(btnLogin);
		
	}
	
}
