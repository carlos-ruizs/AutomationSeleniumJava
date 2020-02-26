package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseFiles.BasePage;

public class LinkedIn_LoginPage extends BasePage {
	
	//WebElements
	public String strLoginURL = "https://www.linkedin.com/login?";
	public By objUserNameField = By.id("username");
	public By objPasswordField = By.id("password");
	public By btnSubmit = By.cssSelector("[type*='submit']");
	public By errUserName = By.id("error-for-username");
	public By errPassword = By.id("error-for-password");
	
	//constructor
	public LinkedIn_LoginPage(WebDriver pwdDriver) {
		super(pwdDriver);
	}
	
	public LinkedIn_LoginPage fnGoToLoginPage() {
		wdPageDriver.get(strLoginURL);
		return this;
	}
	
	public LinkedIn_LoginPage fnLoginToLinkedIn(String pstrEmail, String pstrPassword) {
		//write username
		fnWriteText(objUserNameField, pstrEmail);
		
		//write password
		fnWriteText(objPasswordField, pstrPassword);
		
		//click submit
		fnClick(btnSubmit);
		
		return this;
	}
	
	public LinkedIn_LoginPage fnVerifyLoginUsername(String pstrExpectedText) {
		fnAssertEquals(errUserName, pstrExpectedText);
		return this;
	}
	
	public LinkedIn_LoginPage fnVerifyLoginPassword(String pstrExpectedText) {
		fnAssertEquals(errPassword, pstrExpectedText);
		return this;
	}
}
