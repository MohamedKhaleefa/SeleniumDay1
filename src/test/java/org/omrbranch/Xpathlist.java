package org.omrbranch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlist {
	
	 public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmailUsingFollwing1 = driver.findElement(By.xpath("//h1[text()=\"For Joining Automation Course\"]//ancestor::div[contains(@class,'Automation ')]//following-sibling::div[contains(@class,'tabssignup')]//child::div//input[@id=\"email\"]"));
		txtEmailUsingFollwing1.sendKeys("Mohamed");
		System.out.println("Mohamed");
		
		WebElement txtEmailUsingFollwing2 = driver.findElement(By.xpath("//h1[contains(text(),'For')]//ancestor::div//following-sibling::div//input[@id=\"pass\"]"));
		txtEmailUsingFollwing2.sendKeys("Khaleefa@123");
		System.out.println("Khaleefa@123");
		
		WebElement txtPassUsingEmail = driver.findElement(By.xpath("//input[@id=\"email\"]//ancestor::form//child::div//input[@id=\"pass\"]"));
		txtPassUsingEmail.sendKeys("Khaleefa@1234567890");
		System.out.println("Khaleefa@1234567890");
		
		WebElement txtLoginUsingEmail = driver.findElement(By.xpath("//input[@id=\"email\"]//ancestor::form//child::div//button[text()=\"Login\"]"));
		txtLoginUsingEmail.click();
		System.out.println("Login");
		
		WebElement txtSignUpUsingEmail = driver.findElement(By.xpath("//input[@id=\"pass\"]//ancestor::form//child::a[@data-target=\"#opensignup\"]"));
		txtSignUpUsingEmail.click();
		System.out.println("SignUp");
		
		
		
		
	}

}
