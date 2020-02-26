package BaseFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	public WebDriver wdPageDriver;
	public WebDriverWait wdWait;
	
	//constructor
	public BasePage (WebDriver pwdDriver) {
		this.wdPageDriver = pwdDriver;
		wdWait = new WebDriverWait(wdPageDriver, 15);
	}
	
	//Wait Wrapper Method
	public void fnWaitVisibility(By pElementBy) {
		wdWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pElementBy));
	}
		
	//Click Method
	public void fnClick(By pElementBy) {
		fnWaitVisibility(pElementBy);
		wdPageDriver.findElement(pElementBy).click();
	}
		
	//Write Text
	public void fnWriteText(By pElementBy, String pstrText) {
		fnWaitVisibility(pElementBy);
		wdPageDriver.findElement(pElementBy).sendKeys(pstrText);
	}
		
	//Read Text
	public String fnReadText(By pElementBy) {
		fnWaitVisibility(pElementBy);
		return wdPageDriver.findElement(pElementBy).getText();
	}
		
	//Assert
	public void fnAssertEquals(By pElementBy, String pstrExpectedText) {
		fnWaitVisibility(pElementBy);
		Assert.assertEquals(fnReadText(pElementBy), pstrExpectedText);
	}
		
	//Select from Dropdown
	public void fnSelectElement(By pElementBy, String pstrItemSelected) {
		fnWaitVisibility(pElementBy);
		Select listItems = new Select(wdPageDriver.findElement(pElementBy));
		listItems.selectByValue(pstrItemSelected);
	}
	
}
