package com.peoplentech.automationtrainingcourse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Duplicate extends Comon {
	
	
	//
  @Test(priority = 1)
  public void f() throws IOException {
		  Home home=new Home(driver);
		  home.SearchfieldCharacters();
		  home.SearcIconClick();
		  shots();
		  String tx=  home.ComputerGetText();
		  System.out.println(tx);
		  SoftAssert ob=new SoftAssert();
		  ob.assertEquals(tx, "\"Computer\"");
		  shots();
		  System.out.println("this to after assertion");
		  shots();
		  ob.assertAll();
		  }
	  @Test(priority = 2, dependsOnMethods = "f")
	  public void verification() {
		  System.out.println(" this is verification");
		  Home home=new Home(driver);
		  home.CustomerServiceClick();
		  
	  }
	 
		 
		  
	  

	  
	  public void shots() throws IOException {
		  Date dt=new Date();
		  System.out.println(dt);
		  String si=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(si);
		File shotsofscreen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shotsofscreen, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\automationtrainingcourse-20210414T220957Z-001\\automationtrainingcourse\\Pictures\\"+si+"shots.png"));
		
	  }
	  

  }

