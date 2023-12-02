package org.omrbranch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;

public class Annotaion1 {
	
	static WebDriver driver;
	//@BeforeMethod
	@BeforeClass
     public static void beforeClass() {
		// TODO Auto-generated method stub
       driver = new ChromeDriver();
       driver.get("https://omrbranch.com/");
       driver.manage().window().maximize();   
	}
	@AfterClass
	public static void afterClass() {
		// TODO Auto-generated method stub
       driver.quit();
	}
	
	@Before
	public void before() throws IOException {
		
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		 File s = takeScreenShot.getScreenshotAs(OutputType.FILE);
		 System.out.println(s);
		 File d = new File("C:\\Users\\hp\\eclipse-workspace\\Maven\\Snap\\before.png");
		 FileUtils.copyFile(s, d);
	}
	
	@After
	public void after() throws IOException {
		
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		 File s1 = takeScreenShot.getScreenshotAs(OutputType.FILE);
		 System.out.println(s1);
		 File d1 = new File("C:\\Users\\hp\\eclipse-workspace\\Maven\\Snap\\after.png");
		 FileUtils.copyFile(s1, d1);
		 
	}
	@Ignore
	@Test
	public void Login() {
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("mohamedkhaleefa1104@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Greensomr@123");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}