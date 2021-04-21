package com.peoplentech.automationtrainingcourse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Amazona {
  @Test//v
  public void f() {
	  System.out.println("This to run test annotation");
  }
  @Test
  public void sd() {
	  System.out.println("this to run test annotation for sd cheching numbers");
  }
  
  @BeforeMethod//iv
  public void beforeMethod() {
	  System.out.println("This to run befoe method annotation");
  }

  @AfterMethod//vi
  public void afterMethod() {
	  System.out.println("This to run after method annotation");
  }

  @BeforeClass//iii
  public void beforeClass() {
	  System.out.println("This to run before class annotation");
  }

  @AfterClass//vii
  public void afterClass() {
	  System.out.println("This to run after class annotation");
  }

  
  @BeforeTest//ii
  public void beforeTest() {
	  System.out.println("this to run before test annotation");
  }

  @AfterTest//viii
  public void afterTest() {
	  System.out.println("this to run after test annotation");
  }

  @BeforeSuite//i
  public void beforeSuite() {
	  System.out.println("This to run before suite annotation");
  }

  @AfterSuite//ix
  public void afterSuite() {
	  System.out.println("This to run after suite annotation");
  }

}
