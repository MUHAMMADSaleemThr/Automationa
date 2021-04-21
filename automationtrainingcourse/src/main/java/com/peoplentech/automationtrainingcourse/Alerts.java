package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.travelocity.com/Flights");
	    driver.manage().window().maximize();
	  /* WebElement alerts= driver.findElement(By.name("alert"));
	   alerts.click();
	   driver.switchTo().alert().accept();
	   WebElement doublsr=driver.findElement(By.name("confirmation"));
	   doublsr.click();
	   Thread.sleep(6000);
	  // driver.switchTo().alert().accept();
	   driver.switchTo().alert().dismiss();
	   WebElement switching=driver.findElement(By.name("prompt"));
	   switching.click();
	   Thread.sleep(6000);
	   driver.switchTo().alert().sendKeys("Johnsilver");
	   Thread.sleep(6000);
	   driver.switchTo().alert().accept();*/
	    WebElement flight=driver.findElement(By.id("d1-btn"));
	    flight.click();
	    WebElement dt=driver.findElement(By.xpath("//*[@aria-label='Apr 26, 2021.']"));
	    dt.click();
	   
	}

}
