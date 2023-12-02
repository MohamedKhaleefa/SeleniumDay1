package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WebTable 
{
WebDriver driver;

@Ignore
@Test
private void techlisticStaticTableDemo() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement tblStatic = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
	
	List<WebElement> tblRow = tblStatic.findElements(By.tagName("tr"));
	
	int size = tblRow.size();
	
//	for(int i=0;i<size;i++)
//	{
//		String text = tblRow.get().getText();

	switch (3) {
	case 1:
		String text1 = tblRow.get(1).getText();
		System.out.println(text1);
		break;

	case 2:
		String text2 = tblRow.get(2).getText();
		System.out.println(text2);
		break;

	case 3:
		String text3 = tblRow.get(3).getText();
		System.out.println(text3);
		break;

	case 4:
		String text4 = tblRow.get(4).getText();
		System.out.println(text4);
		break;

	case 5:
		String text5 = tblRow.get(5).getText();
		System.out.println(text5);
		break;

	case 6:
		String text6 = tblRow.get(6).getText();
		System.out.println(text6);
		break;

	case 7:
		String text7 = tblRow.get(7).getText();
		System.out.println(text7);
		break;

	default:
	System.out.println("Enter Valid Table Row");
	}
	System.out.println(size);
//	}
}


@Test
private void techlisticDynamicTableDemo() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
	WebElement tblDynamic = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]"));
	
	//List<WebElement> tblHead = tblDynamic.findElements(By.tagName("//child::thead//child::tr//span"));
	
	List<WebElement> tblBody = tblDynamic.findElements(By.tagName("//child::tr//span"));
	
	//List<WebElement> tblFoot = tblDynamic.findElements(By.tagName("//child::tfoot//child::tr//span"));
	for(int i=1;i<tblBody.size();i++)
	{
		
	String text = tblBody.get(i).getText();
	
    System.out.println(text);
	}
}
}
