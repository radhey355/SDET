package com.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver= null;
	
	 public Dashboard(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//h3")
	 List<WebElement> courses;
	
	  
    public void Courses_page() {
    	System.out.println("===Dashoards===");
	for (WebElement webElement : courses) {
	System.out.println(webElement.getText());
		
	}
	
}

}
