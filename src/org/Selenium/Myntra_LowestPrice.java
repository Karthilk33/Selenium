package org.Selenium;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_LowestPrice {

	static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men?f=Categories%3ATshirts&plaEnabled=false&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");

	}

	public static void allProduct() {
		List<WebElement> productPrice = driver.findElements(By.xpath("//li//div//div//span[@class='product-discountedPrice']"));

		for (WebElement discountedPrice : productPrice) {
			System.out.println(discountedPrice.getText());
		
		}
		
		

	}

	public static void main(String[] args) {
		browserLaunch();
		allProduct();

	}

}
