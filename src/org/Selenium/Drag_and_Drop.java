package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	
public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",

"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://www.leafground.com/pages/drop.html");

WebElement Drag = driver.findElement(By.id("draggable"));

WebElement Drop = driver.findElement(By.id("droppable"));

Actions ac = new Actions(driver);

ac.clickAndHold(Drag).build().perform();
ac.release(Drop).build().perform();

System.out.println("Element drag and dropped");


}

}
