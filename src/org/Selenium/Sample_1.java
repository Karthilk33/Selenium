package org.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_1 {
	


		
		public static void main(String[] args) throws InterruptedException { 
			
			System.setProperty("webdriver.chrome.driver",

					"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://adactinhotelapp.com/");
			
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("Karthiklk");
			
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Karthi@4255");
			
			WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
			login.click();
			
			System.out.println("Login completed");
			
			WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
			Select s = new Select(Location);
			s.selectByIndex(4);
			
			WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
			Select s1 = new Select(hotels);
			s1.selectByIndex(1);
			
			WebElement Room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
			Select s2 = new Select(Room_type);
			s2.selectByIndex(3);
			
			WebElement Room_no = driver.findElement(By.xpath("//select[@name='room_nos']"));
			Select s3 = new Select(Room_no);
			s3.selectByIndex(1);
			
			WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
			checkin.clear();
			checkin.sendKeys("30/06/2022");
			
			WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
			checkout.clear();
			checkout.sendKeys("02/07/2022");
			
			WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
			Select s4 = new Select(adult);
			s4.selectByIndex(1);
			
			WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
			Select s5 = new Select(child);
			s5.selectByIndex(1);
			
			WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
			search.click();
			
			WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
			button.click();
			
			WebElement Continue = driver.findElement(By.xpath("//input[@name='continue']"));
			Continue.click();
			
			WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
			first_name.sendKeys("Karthikeyan");
			
			WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
			last_name.sendKeys("L");
			
			WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
			address.sendKeys("235 Samantha Way, Carrollton,Texas, 75006");
			
			WebElement credit_card = driver.findElement(By.xpath("//input[@name='cc_num']"));
			credit_card.sendKeys("4088 5000 0156 4235");
			
			WebElement Card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
			Select s6 = new Select(Card_type);
			s6.selectByIndex(2);
			
			WebElement exp_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
			Select s7 = new Select(exp_month);
			s7.selectByIndex(11);
			
			WebElement exp_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
			Select s8 = new Select(exp_year);
			s8.selectByVisibleText("2022");
			
			WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
			cvv.sendKeys("018");
			
			WebElement Book_Now = driver.findElement(By.id("book_now"));
			Book_Now.click();
			
			//Thread.sleep(2000);
			
			WebElement my_itinerary = driver.findElement(By.name("my_itinerary"));
			my_itinerary.click();
			
			WebElement check_box = driver.findElement(By.xpath("//input[@value='632595']"));
			check_box.click();
			
			driver.findElement(By.name("logout")).click();
			
			System.out.println("Logged out");
				
			}
	}


