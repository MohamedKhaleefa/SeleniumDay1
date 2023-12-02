
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

package org.subname1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.Utility;

public class FacebookHomePage extends Utility
{
	public FacebookHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
