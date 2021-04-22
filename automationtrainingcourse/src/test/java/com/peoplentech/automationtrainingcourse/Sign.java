package com.peoplentech.automationtrainingcourse;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class Sign extends Comon {
  @Test(dataProvider = "Sign")
  public void f(String n, String s) throws InterruptedException {
	 /* Home home=new Home(driver);
	  home.HoverToSign();
	  home.SignButtonClick();
	  home.EmailSendKeys(n);
	  Thread.sleep(6000);
	  home.ContinueButtonClick();
	  home.PsswordSendKeys(s);
	  Thread.sleep(6000);
	  //home.SignButtonClickIn();
	  //Thread.sleep(6000);
	  home.ChangeIdSign();
	  Thread.sleep(6000);*/
	  driver.findElement(By.name("email")).sendKeys(n);
	  driver.findElement(By.name("pass")).sendKeys(s);
	  Thread.sleep(6000);
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("pass")).clear();
	  Thread.sleep(6000);
	  
  }

  @DataProvider
  public Object[][] Sign() {
    return new Object[][] {
      new Object[] { "Shahbaz@gmail.com", "Ashburn" },
      new Object[] { "Silver@gmail.com", "Silver" },
    };
  }
}
