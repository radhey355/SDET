package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userlogin {
	
	
	WebDriver driver= null;
	
	public Userlogin(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//button")
	WebElement Button;
	
	
	 public void LoginToPage() {
		 Email.sendKeys("kiran@gmail.com");
		 Password.sendKeys("123456");
		 Button.click();
	
	    	
	    }
	
		
	}
   
