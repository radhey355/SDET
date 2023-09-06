package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_page {
	
	WebDriver driver= null;
	 
	public User_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//span)[4]")
	WebElement users;
	
	
	@FindBy(xpath="(//button)[1]")
	WebElement addUsers;
	
	@FindBy(xpath="//form")
	WebElement forms;
	
	public void ClickUsers() {
		users.click();
		addUsers.click();
		System.out.println("=====forms====");
	  System.out.println(	forms.getText());
	  System.out.println("=================");
	}

}
