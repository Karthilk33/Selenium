package org.Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_GetAllProducts {

	static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(
				"https://www.myntra.com/men?f=Categories%3ATshirts&plaEnabled=false&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");

	}

	public static void numberofProducts() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//li//div//h3"));

		for (WebElement brandName : allProducts) {
			System.out.println(brandName.getText());

		}
		System.out.println("Total Number of Products = " + allProducts.size());
	}

	public static void productsPrice() {
		List<WebElement> productPrice = driver
				.findElements(By.xpath("//li//div//div//span[@class='product-discountedPrice']"));

		List<Integer> l = new ArrayList<Integer>();

		for (WebElement discountedPrice : productPrice) {
			String text = discountedPrice.getText();
			String replace = text.replace("Rs. ", "");

			int parseInt = Integer.parseInt(replace);

			//System.out.println(parseInt);

			l.add(parseInt);

		}
		System.out.println("Minimum Price = " + Collections.min(l));
	}


	public static void main(String[] args) {

		browserLaunch();
		// numberofProducts();
		productsPrice();
	}

}
