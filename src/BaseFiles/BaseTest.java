package BaseFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver wdTestDriver;
	
	@BeforeClass
	public void setup() {
		//Create a chrome driver.
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		wdTestDriver = new ChromeDriver();
		
		wdTestDriver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		wdTestDriver.close();
		wdTestDriver.quit();
	}
}
