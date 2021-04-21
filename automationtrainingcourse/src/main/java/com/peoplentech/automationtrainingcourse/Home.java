package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement searchoficon;
	@FindBy(linkText = "Customer Service")WebElement Customer;
	@FindBy(xpath = "//*[@class='a-color-state a-text-bold']") WebElement Computer;
	
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void SearchfieldCharacters() {
		search.sendKeys("Computer");
	}
	public void SearcIconClick() {
		searchoficon.click();
	}
	public void CustomerServiceClick() {
		Customer.click();
	}
	public String ComputerGetText()
	{
	String textofcomputer=	Computer.getText();
	return textofcomputer;
	}
}
