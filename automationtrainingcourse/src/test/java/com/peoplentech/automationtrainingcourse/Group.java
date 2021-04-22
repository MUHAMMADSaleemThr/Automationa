package com.peoplentech.automationtrainingcourse;

import org.testng.annotations.Test;

public class Group {
  @Test(groups="Smoke")
  public void f() {
	  System.out.println("this is smoke group");
  }
  @Test(groups="Regression")
  public void f6() {
	  System.out.println("This is regression group");
  }
  @Test(groups="Function")
  public void f9() {
	  System.out.println("This is function group");
	  
  }
}
