package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Api 
{
   static WebDriver driver;
	public static void main( String[] args ) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    //Thread.sleep(6000);
    driver.navigate().refresh();
   // Thread.sleep(6000);
    driver.navigate().back();
   // Thread.sleep(6000);
    driver.navigate().forward();
  String ur=  driver.getCurrentUrl();
  System.out.println("Current URL ="+ur);
  String titlds=driver.getTitle();
  System.out.println("Current title="+titlds);
  String windowhandle=driver.getWindowHandle();
  System.out.println("Current window handle ="+windowhandle);
  driver.close();
    }
}
