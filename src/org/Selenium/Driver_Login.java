package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Login {

	public static void main(String[] args) {
		
		//key                    //Path --> Value

System.setProperty("webdriver.chrome.driver",

"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

WebElement username = driver.findElement(By.id("email"));
username.sendKeys("Karthiece345@gmail.com");

WebElement Password = driver.findElement(By.name("pass"));
Password.sendKeys("Karthi1234");

WebElement login = driver.findElement(By.name("login"));
login.click();

System.out.println("Login is done");
	
	}

}
