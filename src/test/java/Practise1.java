import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		
		//ul[contains(@class,'uiList localeSelectorList')]
		
		//img[contains(@src,'static')]
		
		//form[contains(@action,'login')]
		
		
		
	}

}
