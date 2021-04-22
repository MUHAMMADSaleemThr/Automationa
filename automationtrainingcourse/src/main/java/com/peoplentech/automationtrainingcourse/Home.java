package com.peoplentech.automationtrainingcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement searchoficon;
	@FindBy(linkText = "Customer Service")WebElement Customer;
	@FindBy(xpath = "//*[@class='a-color-state a-text-bold']") WebElement Computer;
	@FindBy(id="nav-link-accountList") WebElement Sign;
	@FindBy(xpath="(//*[text()='Sign in'])[1]") WebElement signbutton;
	@FindBy(id="ap_email") WebElement id;
	@FindBy(id="continue") WebElement Continue;
	@FindBy(id="ap_password") WebElement Psswd;
	@FindBy(id="signInSubmit") WebElement Signbuttonclickds;
	@FindBy(linkText = "Change") WebElement ChangeIdT;
	
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
	public void HoverToSign() {
		Actions actions=new Actions(driver);
		actions.moveToElement(Sign).build().perform();
	}
	public void SignButtonClick() {
		Actions action=new Actions(driver);
		action.moveToElement(signbutton).click().build().perform();
	}
	public void EmailSendKeys(String it) {
		id.sendKeys(it);
	}
	public void ContinueButtonClick() {
		Continue.click();
	}
	public void PsswordSendKeys(String br) {
		Psswd.sendKeys(br);
	}
	public void SignButtonClickIn() {
		Signbuttonclickds.click();
	}
	public void ChangeIdSign() {
		ChangeIdT.click();
	}
}
