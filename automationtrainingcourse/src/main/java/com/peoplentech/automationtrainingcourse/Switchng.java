package com.peoplentech.automationtrainingcourse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchng {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	    Actions ob=new Actions(driver);
	    ob.keyDown(Keys.SHIFT).build().perform();
	    WebElement bt=driver.findElement(By.linkText("Best Sellers"));
	    bt.click();
	    ob.keyUp(Keys.SHIFT).build().perform();
	    String windowid=driver.getWindowHandle();
	   
	    //System.out.println(windowid);
	  Set<String> windosid=  driver.getWindowHandles();
	  //Itrator
	  Iterator<String> windows=windosid.iterator();
	String FirstWindowHandles=  windows.next();
	String SecondWindowHandles=  windows.next();
	System.out.println(FirstWindowHandles);
	System.out.println(SecondWindowHandles);
	driver.switchTo().window(SecondWindowHandles);
	   WebElement New=driver.findElement(By.linkText("Cell Phones & Accessories"));
	   New.click();
	    
	   
	   
	   /*Page object model
    i)What evere elements we beed from that page locate that elements	  
    ii)Constructor of the class
    iii)Create the methods according to the actions have to put on each element
    */ 
	}

}
