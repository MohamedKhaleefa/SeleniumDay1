package org.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
		
//	WebElement logo = driver.findElement(By.xpath("//img[@data-testid=\"omrlogo\"]"));
//	WebElement txtAutomation = driver.findElement(By.xpath("//h1[@data-testid=\"join-automation\"]"));
//	String currentUrl = driver.getCurrentUrl();
//	String title = driver.getTitle();
	
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("mohamedkhaleefa1104@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Greensomr@123");
		
	  //driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		driver.findElement(By.xpath("//button[@value=\"login\"]")).click();
		
	//	Thread.sleep(3000);
		WebElement txtWelcome = driver.findElement(By.xpath("//a[@class=\"icoTwitter mr-2 dropdown-toggle\"]"));
		String text1 = txtWelcome.getText();
		System.out.println(text1);
		
	//	Thread.sleep(3000);
		WebElement txtSearchHere = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		txtSearchHere.sendKeys("nuts");
		
		WebElement btnSearchHere = driver.findElement(By.xpath("//button[@class=\"btn font16 bgTheme colorWhite radius50\"]"));
		btnSearchHere.click();
		
	//	Thread.sleep(3000);
		WebElement txtNutsName = driver.findElement(By.xpath("//h5[text()=\"Yogabars Super healthy Daily Dose | Mixed Nuts Seeds and Berries\"]"));
		String text2 = txtNutsName.getText();
		System.out.println(text2);
		
	//	Thread.sleep(3000);
		WebElement btnAdd = driver.findElement(By.xpath("//a[@class=\"hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17\"]"));
		btnAdd.click();
		
		//Thread.sleep(3000);
		WebElement btnAddCart = driver.findElement(By.xpath("//button[@id=\"cart-21\"]"));
		btnAddCart.click();
		
		//Thread.sleep(3000);
		WebElement btnGotoCart = driver.findElement(By.xpath("//a[@class=\"hover1\"]"));
	//	driverwait.until(ExpectedConditions.visibilityOf(btnGotoCart));
	//	driverwait.until(ExpectedConditions.elementToBeSelected(btnGotoCart));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("argument[0].click()",btnGotoCart);
		btnGotoCart.click();
			
		//Thread.sleep(3000);
		WebElement txtMyCart = driver.findElement(By.xpath("//h5[text()=\"My Cart\"]"));
		String text3 = txtMyCart.getText();
		System.out.println(text3);
		
		//Thread.sleep(3000);
		WebElement btnAddress = driver.findElement(By.xpath("//div[@class=\"diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2\"]"));
		btnAddress.click();
		
	//	Thread.sleep(3000);
		WebElement txtAddressType = driver.findElement(By.xpath("//select[@id=\"address_type\"]"));
		txtAddressType.sendKeys("Home");
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
		txtFirstName.sendKeys("Mohamed");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
		txtLastName.sendKeys("Khaleefa");
		WebElement txtContact = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
		txtContact.sendKeys("9894038018");
		WebElement txtHouseNo = driver.findElement(By.xpath("//input[@name=\"apartment\"]"));
		txtHouseNo.sendKeys("11");
		WebElement txtAddress = driver.findElement(By.xpath("//input[@name=\"address\"]"));
		txtAddress.sendKeys("Home St");
		
	//	Thread.sleep(3000);
		WebElement txtState = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select selectState = new Select(txtState);
		selectState.selectByVisibleText("Tamil Nadu");
		
	//	Thread.sleep(3000);
		WebElement txtCity = driver.findElement(By.xpath("//select[@name=\"city\"]"));
		Select selectCity = new Select(txtCity);
		selectCity.selectByVisibleText("Chennai");
		
	//	Thread.sleep(3000);
		WebElement txtZipcode = driver.findElement(By.xpath("//input[@name=\"zipcode\"]"));
		txtZipcode.sendKeys("123456");
		
	//	Thread.sleep(3000);
		WebElement btnSave = driver.findElement(By.xpath("//button[contains(@class,'saveAddress')]"));
		btnSave.click();
		
	//	Thread.sleep(3000);
		WebElement ddPaymentType = driver.findElement(By.xpath("//select[@id=\"payment_type\"]"));
		Select selectPaymentType = new Select(ddPaymentType);
		selectPaymentType.selectByIndex(1);
		
	//	Thread.sleep(3000);
		WebElement radioVisa = driver.findElement(By.xpath("//div[@class=\"custom-control custom-radio\"]//child::label[text()=\" Visa \"]"));
		radioVisa.click();
		
	//	Thread.sleep(3000);
		WebElement txtCardNumber = driver.findElement(By.xpath("//input[@class=\"form-control mt-2\"]"));
		txtCardNumber.sendKeys("5555555555552222");
		
	//	Thread.sleep(3000);
		WebElement txtMonth = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select SelectMonth = new Select(txtMonth);
		SelectMonth.selectByIndex(8);

	//	Thread.sleep(3000);
		WebElement txtYear = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select SelectYear = new Select(txtYear);
		SelectYear.selectByVisibleText("2023");
		
	//	Thread.sleep(3000);
		WebElement txtCvv = driver.findElement(By.xpath("//input[@name=\"cvv\"]"));
		txtCvv.sendKeys("527");
		
	//	Thread.sleep(3000);
		WebElement btnPlaceOrder = driver.findElement(By.xpath("//button[@id=\"placeOrder\"]"));
		btnPlaceOrder.click();
		
	//	Thread.sleep(3000);
		WebElement txtOrderNo = driver.findElement(By.xpath("//p[text()=\"Order No: \"]//child::span"));
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	//	driver.manage().window().wait(5000);
		String text4 = txtOrderNo.getText();       
		System.out.println(text4);
	}

}
