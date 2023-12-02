package org.utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility 
{
	protected static WebDriver driver;
	
	public static void browserLaunch()
	{
		driver = new ChromeDriver();	
	}
	
	public static void launchUrl(String url)
	{
	driver.get(url);
	}
	
	public static void maximizewindow() 
	{
		driver.manage().window().maximize();
	}
	
	public static void browserQuit()
	{
		driver.quit();
	}
	
	public WebElement findLocatorById(WebElement element, String id)
	{
	    WebElement elementId = driver.findElement(By.id(id));
		return elementId;
	}
	
	public WebElement findLocatorByName( String Name)
	{
		WebElement elementName = driver.findElement(By.id(Name));
		return elementName;
	}
	
	public WebElement findLocatorByClassname(WebElement element, String Classname)
	{
		WebElement elementClassName = driver.findElement(By.id(Classname));
		return elementClassName;
	}
	
	public WebElement findLocatorByXpath(WebElement element, String xpath)
	{
		WebElement elementXpath = driver.findElement(By.id(xpath));
		return elementXpath;
	}
	
	public String getText(WebElement element)
	{
		String text=element.getText();
		return text;
	}
	
	public String getAttribute(WebElement element,String value)
	{
		String attribute = element.getAttribute(value);
		return attribute;
	}
	
	public static void sendkeys(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void QuitBrowser()
	{
		driver.quit();
	}
}
