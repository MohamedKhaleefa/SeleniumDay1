import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass
{

	WebDriver driver;
	
	public void browserLaunch()     
	{
		driver = new ChromeDriver();             //Launch the Browser
	}
	
	public void enterApplicationUrl(String url)    
	{
		driver.get(url);              // Enter URL
	}
	
	public void maximizeWindow()                  
	{
		driver.manage().window().maximize();     //Maximize Window
	}
	
	public void sendkeys(WebElement element,String data) 
	{
		element.sendKeys(data);
	}
	
	public void clickButton(WebElement element) 
	{
		element.click();
	}
	
	public WebElement findLocatorById(String attributeValue)
	{
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	
	public WebElement findLocatorByName(String attributeValue)
	{
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
