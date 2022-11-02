package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Thread {

public static void main(String[] args) throws AWTException {
		
		//key                    //Path --> Value

System.setProperty("webdriver.chrome.driver",

"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://automationpractice.com/index.php");

WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
Actions ac = new Actions(driver);
ac.moveToElement(Women).build().perform();
ac.contextClick(Women).build().perform();

Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
System.out.println("New tab opened");

WebElement Dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
Actions ac1 = new Actions(driver);
ac1.moveToElement(Dress).build().perform();
ac1.contextClick().build().perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);

driver.navigate().to("http://automationpractice.com/index.php");
WebElement T_shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
Actions ac2 = new Actions(driver);
ac2.moveToElement(T_shirts).build().perform();
ac2.contextClick(T_shirts).build().perform();

}

}





