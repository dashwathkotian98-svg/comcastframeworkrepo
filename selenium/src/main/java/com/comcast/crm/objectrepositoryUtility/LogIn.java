package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	private WebDriver driver;


	public LogIn (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private  WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private  WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private  WebElement loginBtn;

	
	public void setUsernameEdt(WebElement usernameEdt) {
		this.usernameEdt = usernameEdt;
	}


	public void setPasswordEdt(WebElement passwordEdt) {
		this.passwordEdt = passwordEdt;
	}


	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}


	public void LogInToApp(String name,String pass)
	{
		
		passwordEdt.sendKeys("manager");
		usernameEdt.sendKeys("admin");
		loginBtn.click();
		
		
	}

}
