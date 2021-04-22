package com.peoplentech.automationtrainingcourse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ilistners extends Comon implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Comon)result.getInstance()).driver;
		Date dt=new Date();
		  System.out.println(dt);
		  String si=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(si);
		  String Path=System.getProperty("user.dir");
		File shotsofscreen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(shotsofscreen, new File(Path+"\\Pictures\\Passed\\"+si+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Comon)result.getInstance()).driver;
		Date dt=new Date();
		  System.out.println(dt);
		  String si=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(si);
		  String Path=System.getProperty("user.dir");
		File shotsofscreen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(shotsofscreen, new File(Path+"\\Pictures\\Failed\\"+si+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
