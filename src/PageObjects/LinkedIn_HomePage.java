package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseFiles.BasePage;

public class LinkedIn_HomePage extends BasePage{
	
	//WebElements
	private String strBaseURL = "https://www.linkedin.com/home";
	private By btnSignIn = By.cssSelector("a[href*='login?']");
	
	public LinkedIn_HomePage(WebDriver pwdDriver) {
		super(pwdDriver);
	}
	
	//Go to Home Page
	public LinkedIn_HomePage fnGoToHomePage() {
		wdPageDriver.get(strBaseURL);
		return this;
	}
	
	public LinkedIn_LoginPage fnLoginPageFromHomePage() {
		fnClick(btnSignIn);
		return new LinkedIn_LoginPage(wdPageDriver);
	}
	
	
}
