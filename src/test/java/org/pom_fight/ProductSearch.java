package org.pom_fight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utilityclass.Utility;

public class ProductSearch extends Utility
{

	@FindBy (id="search")
	private WebElement txtSearch;
	
	@FindBy (xpath = "//a[@data-testid='username']")
	private WebElement txtLoginSuccessfulMsg;
	
	
	
	public WebElement getTextSxearch() 
	{
	return txtSearch;
	}
	
	public WebElement getTextLoginSuccessfulMsg()
	{
		return txtLoginSuccessfulMsg;
	}
	
	
	public void searchProductId(String productname)
	{
	//	elementSendKeysEnter(txtSearch, productname);
	}
	
//	public String getLoginSearchMsgText() 
//	{
//		String elementGetText:elementOfText(textLoginSuccessful);
//		return elementGetText;
//	}
	
	
	
	
	
	
	
	
	
}
