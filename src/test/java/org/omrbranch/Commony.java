package org.omrbranch;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Commony {

	public static void main(String[] args) throws InterruptedException {

				WebDriver driver = new ChromeDriver();
				driver.get("https://omrbranch.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.manage().window().maximize();
				WebElement txtEmail = driver.findElement(By.id("email"));
				txtEmail.sendKeys("mohamedkhaleefa1104@gmail.com");
				WebElement txtPass = driver.findElement(By.id("pass"));
				txtPass.sendKeys("Greensomr@123");
				WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
				loginBtn.click();
				WebElement userName = driver.findElement(By.xpath("//a[@data-testid='username']"));
				String user=userName.getText();
				System.out.println(user);


				WebElement searchHotelbooking	 = driver.findElement(By.xpath("//div[@class='fliter_box_inner text-center'] [@data-href='https://omrbranch.com/hotel-booking']"));
				searchHotelbooking.click();

				WebElement state=	driver.findElement(By.xpath("//select[@id='state']"));
				Select select = new Select(state);
				select.selectByVisibleText("Tamil Nadu");

				WebElement city=driver.findElement(By.xpath("//select[@id='city']"));
				Select s = new Select(city);
				s.selectByVisibleText("Chennai");

				WebElement roomType=driver.findElement(By.xpath("//select[@id='room_type']"));
				Select a = new Select(roomType);
				a.selectByVisibleText("Standard");
				a.selectByVisibleText("Deluxe");
				a.selectByVisibleText("Suite");

				WebElement	e7=	driver.findElement(By.xpath("//input[@name='check_in']"));
				e7.click();

				WebElement element=driver.findElement(By.xpath("//a[text()='29']"));
				element.click();
				WebElement	e9=	driver.findElement(By.xpath("//input[@name='check_out']"));
				e9.click();
				//WebElement checkOut=driver.findElement(By.xpath("//input[@type='text'] [@name='check_out']"));
				//checkOut.sendKeys("2023-11-23"+Keys.ENTER);
				WebElement elements=driver.findElement(By.xpath("//a[text()='30']"));
				elements.click();




				/*	WebElement	checkIn=	driver.findElement(By.xpath("//input[@type='text']"));
				checkIn.sendKeys("2023-11-22"+Keys.ENTER);*/


				/*	WebElement checkOut=driver.findElement(By.xpath("//input[@type='text'] [@name='check_out']"));
				checkOut.sendKeys("2023-11-23"+Keys.ENTER);*/

				WebElement noOfrooms =	driver.findElement(By.xpath("//select[@id='no_rooms']"));
				Select c = new Select(noOfrooms);
				c.selectByVisibleText("1-One");

				WebElement noOfadults =	driver.findElement(By.xpath("//select[@id='no_adults']"));
				Select g = new Select(noOfadults);
				g.selectByVisibleText("1-One");


				driver.switchTo().frame(0);

				WebElement searchBt=driver.findElement(By.xpath("//button[text()='Search']"));
				searchBt.click();
				WebElement selectHotel=driver.findElement(By.xpath("//h5[text()='Select Hotel']"));
				String o= selectHotel.getText();
				System.out.println(o);

				WebElement firstHotelNmae=driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Suite']"));
				String p=	firstHotelNmae.getText();
				System.out.println(p);


				//strong[text()='$ 1,534']

				WebElement firstHotelPrice=driver.findElement(By.xpath("(//strong[contains(text(),'$')])[1]"));
				String q=	firstHotelPrice.getText();
				System.out.println(q);

				//a[text()='Continue']

				WebElement clickContinue=driver.findElement(By.xpath("//a[text()='Continue']"));	
				clickContinue.click();

				Alert alert = driver.switchTo().alert();
				alert.accept();
				//h2[text()='Book Hotel - Hyatt Regency Chennai Suite']
				WebElement bookHotelName=driver.findElement(By.xpath("//h2[text()='Book Hotel - Hyatt Regency Chennai Suite']"));
				String book= bookHotelName.getText();
				System.out.println(book);

				//select[@name='title']

				//input[@id='own']
				//input[@id='first_name']
				//input[@id='last_name']
				//input[@id='user_phone']
				//input[@id='user_email']

				WebElement checkBox=driver.findElement(By.xpath("//input[@id='own']"));
				checkBox.click();

				WebElement y=driver.findElement(By.xpath("//select[@name='title']"));
				Select r = new Select(y);
				r.selectByVisibleText("Mr.");


				WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
				firstName.sendKeys("Greens Tech");

				WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
				lastName.sendKeys("OMR Branch");

				WebElement mobileNo = driver.findElement(By.xpath("//input[@id='user_phone']"));
				mobileNo.sendKeys("9043592058");

				WebElement email = driver.findElement(By.xpath("//input[@id='user_email']"));
				email.sendKeys("srinivasansrinivasan951@gmail.com");	

				WebElement nextBt=driver.findElement(By.xpath("//button[text()='Next']"));
				nextBt.click();

				WebElement nextBtn=driver.findElement(By.xpath("//button[@id=\"step2next\"]"));
				nextBtn.click();



				//p[text()='Visa, MasterCard, Amex, Discover']


				WebElement	b=driver.findElement(By.xpath("//p[text()='Visa, MasterCard, Amex, Discover']"));
				b.click();

				//select[@id='payment_type']
				//select[@id='card_type']	
				//input[@id='card_no']	
				//input[@id='card_name']		
				//select[@id='card_month']
				//select[@id='card_year']
				//input[@id='cvv']	
				//button[@id="submitBtn"]


				WebElement z=driver.findElement(By.xpath("//select[@id='payment_type']"));
				Select rs = new Select(z);
				rs.selectByVisibleText("Debit Card");

				WebElement u=driver.findElement(By.xpath("//select[@id='card_type']"));
				Select es = new Select(u);
				es.selectByVisibleText("Visa");

				WebElement w=driver.findElement(By.xpath("//input[@id='card_no']"));
				w.sendKeys("5555555555552222");

				WebElement t=driver.findElement(By.xpath("//input[@id='card_name']"));
				t.sendKeys("srinivasan");

				WebElement gs=driver.findElement(By.xpath("//select[@id='card_month']"));
				Select pl = new Select(gs);
				pl.selectByVisibleText("November");

				WebElement gss=driver.findElement(By.xpath("//select[@id='card_year']"));
				Select pls = new Select(gss);
				pls.selectByVisibleText("2027");

				WebElement v=driver.findElement(By.xpath("//input[@id='cvv']"));
				v.sendKeys("222");


				WebElement cd = driver.findElement(By.xpath("//button[@id=\"submitBtn\"]"));
				cd.click();



				//strong[text()='#STNHZ78814']
				//strong[text()='Hyatt Regency Chennai']


				WebElement boo=driver.findElement(By.xpath("//strong[contains(text(),'#')]"));
				String bok= boo.getText();
				String v1=bok.replace("#", "");
				System.out.println(v1);

				WebElement jk=driver.findElement(By.xpath("//h2[@class='couppon-code']"));
				String bop= jk.getText();
				String v2 = bop.replace("#", "");
				System.out.println(v2);

				WebElement bo=driver.findElement(By.xpath("//strong[text()='Hyatt Regency Chennai']"));
				String bokj= bo.getText();
				System.out.println(bokj);
				//h2[@class='couppon-code']

				//Change Booking.

				//button[text()='My Booking']

				WebElement	gok	= driver.findElement(By.xpath("//button[text()='My Booking']"));
				gok.click();

				//h4[contains(text(),'Bookings')] 
				//input[@type='text']
				WebElement jojo =driver.findElement(By.xpath("//h4[contains(text(),'Bookings')]"));
				String x=jojo.getText();
				System.out.println(x);

				WebElement jg =driver.findElement(By.xpath("//input[@type='text']"));
				jg.sendKeys(v1);
				System.out.println(v1);

				//span[contains(text(),'#')][2]
				//h5[text()='Hyatt Regency Chennai Suite']
				//strong[text()='Rs 1,534']
				//button[text()='Edit']
				//button[text()='Confirm']
				//li[text()='Booking updated successfully']

				WebElement brin =driver.findElement(By.xpath("(//span[contains(text(),'#')])[2]"));
				String yx=brin.getText();
				String s3=yx.replace("#", "");
				System.out.println(s3);

				WebElement gan =driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Suite']"));
				String yxx=gan.getText();
				System.out.println(yxx);

				WebElement babu =driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[1]"));
				String ec=babu.getText();
				System.out.println(ec);

				WebElement avs =driver.findElement(By.xpath("//button[text()='Edit']"));
				avs.click();

				WebElement pvs =driver.findElement(By.xpath("//button[text()='Confirm']"));
				pvs.click();

				WebElement pvsk =driver.findElement(By.xpath("//li[text()='Booking updated successfully']"));
				String cbq=pvsk.getText();
				System.out.println(cbq);


				//a[text()='Cancel']
				//li[text()="Your booking cancelled successfully"]

				WebElement rs1=driver.findElement(By.xpath("//a[text()='Cancel']"));
				rs1.click();

				Alert al	=driver.switchTo().alert();
				al.accept();

				WebElement ll =driver.findElement(By.xpath("//li[text()=\"Your booking cancelled successfully\"]"));
				String sd=ll.getText();
				System.out.println(sd);


				WebElement nm =driver.findElement(By.xpath("(//span[contains(text(),'#')])[2]"));
				String xyz=nm.getText();
				String s4=xyz.replace("#", "");
				System.out.println(s4);

				WebElement gre =driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Suite']"));
				String pqw=gre.getText();
				System.out.println(pqw);

				WebElement dev =driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[1]"));
				String pan=dev.getText();
				System.out.println(pan);

				WebElement cancelBtn=driver.findElement(By.xpath("//button[text()='Cancelled']"));
				String can = cancelBtn.getText();
				System.out.println(can);

				//input[@type='text']
				WebElement te =driver.findElement(By.xpath("//input[@type='text']"));
		te.sendKeys(s4+Keys.ENTER);

			}

	}

