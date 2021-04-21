package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identification {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	    WebElement Sicon= driver.findElement(By.id("nav-search-submit-button"));
	    WebElement fields=driver.findElement(By.name("field-keywords"));
	    fields.sendKeys("Computer");
	    Sicon.click();
	    WebElement books=driver.findElement(By.linkText("Books"));
	    books.click();
	    
	   // WebElement lw=driver.findElement(By.partialLinkText("Spring clean with"));
	   // lw.click();
	    //WebElement cart=driver.findElement(By.className("nav-a nav-a-2 nav-progressive-attribute"));
	    Thread.sleep(6000);
	    //cart.click();
	    WebElement rturns=driver.findElement(By.xpath("(/html/body/div/header/div/div/div/div/a)[4]"));
	    rturns.click();
	    WebElement lg=driver.findElement(By.xpath("(//*[text()='Best Sellers'])[1]"));
	    
	    lg.click();
	}

}
