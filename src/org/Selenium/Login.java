package org.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

public static void main(String[] args) throws IOException {
		
		//key                    //Path --> Value

System.setProperty("webdriver.chrome.driver",

"C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

WebElement Username = driver.findElement(By.name("email"));
Username.sendKeys("karthiece345@gmail.com");

WebElement Password = driver.findElement(By.name("pass"));
Password.sendKeys("Karthi@1234");

WebElement create_new = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
create_new.click();

TakesScreenshot ts =(TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\WICKY\\eclipse-workspace\\Selenium\\Driver\\Screen_Shot\\facebook.png");
FileUtils.copyFile(source, dest);
System.out.println("Screen shot is taken");

driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9061928%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_raOjYvp9wIV05lmAh0xgQMWEAAYASAAEgJMJPD_BwE");

WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
Firstname.sendKeys("Karthikeyan");

WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
Surname.sendKeys("Loganathan");

WebElement email_or_mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
email_or_mobile.sendKeys("9500610366");

WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
Pass.sendKeys("Karthi@4255");

WebElement birthday = driver.findElement(By.name("birthday_day"));
Select s = new Select(birthday);
s.selectByValue("28");

WebElement month = driver.findElement(By.name("birthday_month"));
Select s1 = new Select(month);
s1.selectByIndex(4);

WebElement Year = driver.findElement(By.name("birthday_year"));
Select s2 = new Select(Year);
s2.selectByValue("1997");

WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
Gender.click();


}

}
