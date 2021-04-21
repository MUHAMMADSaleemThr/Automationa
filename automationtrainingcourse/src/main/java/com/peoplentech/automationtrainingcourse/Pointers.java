package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Wiekendisg\\automationtrainingcourse\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    Actions ob=new Actions(driver);
	/* WebElement Signofids=   driver.findElement(By.id("nav-link-accountList"));
	    ob.moveToElement(Signofids).build().perform();
	    WebElement linkedid=driver.findElement(By.linkText("Kindle Unlimited"));
	    ob.moveToElement(linkedid).click().build().perform();*/
	    driver.switchTo().frame(0);
	    WebElement dragged=driver.findElement(By.id("draggable"));
	    WebElement droppable=driver.findElement(By.id("droppable"));
	    ob.dragAndDrop(dragged, droppable).build().perform();
	    Thread.sleep(6000);
	    driver.switchTo().parentFrame();
	    WebElement dopablelink=driver.findElement(By.linkText("Droppable"));
	    dopablelink.click();
	    WebElement droptx=driver.findElement(By.xpath("(//*[text()='Droppable'])[1]"));
	   String tx= droptx.getText();
	   System.out.println(tx);
	}

}
