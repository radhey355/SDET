package com.all_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.login.Dashboard;
import com.login.User_page;
import com.login.Userlogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_for_all {
	
	WebDriver driver= null;
	Userlogin ul= null;
	Dashboard ds= null;
	User_page up= null;
	
	@BeforeSuite
	public void Browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/JARS/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	@Test(priority = 1)
	public void LoginToPage() {
		ul= new Userlogin(driver);
	    ul.LoginToPage();
		
	}
	@Test(priority = 2)
	public void Dash() {
		ds= new Dashboard(driver);
		ds.Courses_page();
		
	}
	
	@Test(priority = 3)
	public void use_rform() {
		up= new User_page(driver);
		up.ClickUsers();
	}
	
	
		
		
	}


