package TestCases;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseFiles.BaseTest;
import PageObjects.*;

public class LinkedIn_LoginTests extends BaseTest {
	@Test (priority = 0)
	@Ignore
	public void sucess_LoginTest() {
		LinkedIn_LoginPage objLoginPage = new LinkedIn_LoginPage(wdTestDriver);
		
		objLoginPage.fnGoToLoginPage()
		            .fnLoginToLinkedIn("test@dummyemail.com", "");
	}
	
	
}
