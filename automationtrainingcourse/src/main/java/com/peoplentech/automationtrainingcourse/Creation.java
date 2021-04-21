package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creation {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    WebElement CreateAnAccount=driver.findElement(By.linkText("Create New Account"));
	    CreateAnAccount.click();
	    Thread.sleep(6000);
	    WebElement name=driver.findElement(By.name("firstname"));
	    name.sendKeys("John");
	    WebElement lastname=driver.findElement(By.name("lastname"));
	    lastname.sendKeys("Silver");
	    WebElement phonenumberfields=driver.findElement(By.name("reg_email__"));
	    phonenumberfields.sendKeys("John@gmail.com");
	    WebElement Psswd=driver.findElement(By.name("reg_passwd__"));
	    	    Psswd.sendKeys("Johnson");
	    	    WebElement months=driver.findElement(By.name("birthday_month"));
	    Select ob=new Select(months);
	    ob.selectByIndex(6);
	    ob.selectByVisibleText("Feb");
	    ob.selectByValue("6");
	    WebElement female=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
	    female.click();
	}

}
