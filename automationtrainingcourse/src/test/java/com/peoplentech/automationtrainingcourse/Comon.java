package com.peoplentech.automationtrainingcourse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Comon {
  public WebDriver driver;
  @Parameters({"browser","Wbsite"})
  @BeforeClass
  public void beforeClass(String browser, String sitesd) {
	  String Path=System.getProperty("user.dir");
	  if(browser.equalsIgnoreCase("Chrome")) {
		   System.setProperty("webdriver.chrome.driver", Path+"\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.get(sitesd);
		    driver.manage().window().maximize();
		  
	  }else if(browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", Path+"\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(sitesd);
		    driver.manage().window().maximize();
		  
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", Path+"\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		    driver.get(sitesd);
		    driver.manage().window().maximize();
		  
		  
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
