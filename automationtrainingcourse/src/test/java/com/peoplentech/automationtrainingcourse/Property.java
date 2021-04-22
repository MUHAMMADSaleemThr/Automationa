package com.peoplentech.automationtrainingcourse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Property extends Comon {
  @Test
  public void f() throws IOException, InterruptedException {
	 
	  FileInputStream ds=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\Amzn.properties");
	  Properties prop=new Properties();
	  prop.load(ds);
	  System.out.println(prop.getProperty("Ids"));
	  System.out.println(prop.getProperty("Pssword"));
	  driver.findElement(By.name("email")).sendKeys(prop.getProperty("Ids"));
	  driver.findElement(By.name("pass")).sendKeys(prop.getProperty("Pssword"));
	  Thread.sleep(6000);
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("pass")).clear();
	  Thread.sleep(6000);
  }
}
