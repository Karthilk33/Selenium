package org.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			//	driver.manage().window().maximize();

				driver.get("http://automationpractice.com/index.php");
				
				WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
				Signin.click();
				
				WebElement Create_Account = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				Create_Account.sendKeys("karthi555@gmail.com");
				
				WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				Submit.click();
				
				WebElement Gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
				Gender.click();
				
				WebElement First_Name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
				First_Name.sendKeys("Karthikeyan");
				
				WebElement Last_Name = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
				Last_Name.sendKeys("Loganathan");
				
				WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("");
				
				WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
				Password.sendKeys("Karthi@4255");
				
				WebElement Date = driver.findElement(By.xpath("//select[@name='days']"));
				Select s = new Select(Date);
				s.selectByValue("28");
				
				WebElement Month = driver.findElement(By.xpath("//select[@name='months']"));
				Select s1 = new Select(Month);
				s1.selectByIndex(4);
				
				WebElement Year = driver.findElement(By.xpath("//select[@name='years']"));
				Select s2 = new Select(Year);
				s2.selectByValue("1997");
				
				WebElement Check_box_1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
				Check_box_1.click();
				
				WebElement Check_box_2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
				Check_box_2.click();
				
				WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
				firstname.sendKeys("Karthikeyan");
				
				WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
				lastname.sendKeys("Loganathan");
				
				WebElement Company = driver.findElement(By.xpath("//input[@name='company']"));
				Company.sendKeys("FAI");
				
				WebElement Address_1 = driver.findElement(By.xpath("//input[@name='address1']"));
				Address_1.sendKeys("2635 samantha way");
				
				WebElement Address_2 = driver.findElement(By.xpath("//input[@name='address2']"));
				Address_2.sendKeys("Harris County");
				
				WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
				City.sendKeys("Dallas");
				
				WebElement State = driver.findElement(By.xpath("//select[@name='id_state']"));
				Select s3 = new Select(State);
				s3.selectByVisibleText("Texas");
				
				WebElement Zipcode = driver.findElement(By.xpath("//input[@name='postcode']"));
				Zipcode.sendKeys("75254");
				
				WebElement Country = driver.findElement(By.xpath("//select[@name='id_country']"));
				Select s4 = new Select(Country);
				s4.selectByIndex(1);
				
				WebElement Additional = driver.findElement(By.xpath("//textarea[@name='other']"));
				Additional.sendKeys("NA");
				
				WebElement Home_Phone = driver.findElement(By.xpath("//input[@name='phone']"));
				Home_Phone.sendKeys("9500610266");
				
				WebElement Mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
				Mobile.sendKeys("9500610466");
				
				WebElement Future_Address = driver.findElement(By.xpath("//input[@value='My address']"));
				Future_Address.clear();
				Future_Address.sendKeys("NA");
				
				WebElement Register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
				Register.click();
				
				System.out.println("Account Created Success fully");
				
				WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));	
				
				System.out.println("Element found");
				
			    Actions ac = new Actions(driver);
			    ac.moveToElement(Women).build().perform();
			
				WebElement Evening_Dress = driver.findElement(By.xpath("//a[text()='Evening Dresses']"));
				Evening_Dress.click();
				
				System.out.println("Done");
				
				driver.findElement(By.xpath("//a[@class='quick-view-mobile']")).click();
				
				System.out.println("Clicked successfully");
				
				WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
				driver.switchTo().frame(frame);
				
				System.out.println("frame done");
							
				WebElement Quantity = driver.findElement(By.xpath("//input[@name='qty']"));
				Quantity.clear();
				Quantity.sendKeys("1");
				
				WebElement Size = driver.findElement(By.xpath("//select[@name='group_1']"));
				Select s5 = new Select(Size);
				s5.selectByIndex(2);
				
				WebElement Color = driver.findElement(By.xpath("//a[@name='Beige']"));
				Color.click();
				
				System.out.println("Color selected");
				
				TakesScreenshot ts =(TakesScreenshot) driver;
				File Source = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\src\\org\\Selenium\\Screen shot\\Automation.png");
				FileUtils.copyFile(Source, dest);
				
				WebElement Add_Cart = driver.findElement(By.xpath("//button[@class='exclusive']"));
				Add_Cart.click();
				
				driver.switchTo().defaultContent();
				
				System.out.println("exit from frame");
				
		        WebElement Proceed_Checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		        Proceed_Checkout.click();
		        
		        System.out.println("Done");
		        
		        WebElement Proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		        Proceed.click();
		        
		        WebElement Continue_Proceed = driver.findElement(By.xpath("//button[@name='processAddress']"));
		        Continue_Proceed.click();
		        
		        WebElement Terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
		        Terms.click();
		        
		        WebElement Continue_Proceed_1 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		        Continue_Proceed_1.click();
		        
		        WebElement Payment_wire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		        Payment_wire.click();
		        
		        WebElement Confirm_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		        Confirm_Order.click();
		        
		        TakesScreenshot ts1 =(TakesScreenshot) driver;
				File Source1 = ts1.getScreenshotAs(OutputType.FILE);
				File dest1 = new File("C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\src\\org\\Selenium\\Screen shot\\Automation1.png");
				FileUtils.copyFile(Source1, dest1);
		        
		        System.out.println("Your order has been confirmed");
		        
		        

		
	}
}


