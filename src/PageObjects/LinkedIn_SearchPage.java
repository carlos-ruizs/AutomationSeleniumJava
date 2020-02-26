package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseFiles.BasePage;

public class LinkedIn_SearchPage extends BasePage {
	
	//WebElements
	public By strSearchField = By.cssSelector("[class*='search-global-typeahead__input']");
	public By btnSearch = By.cssSelector("[data-control-name*='button']");
	public By btnPeople =  By.xpath("//button[span[text()='People' or text()='Gente']]");
	public By btnAllFilter = By.xpath("//button[span[text()='All Filters' or text()='Todos los filtros']]");
	public By objMexicoCheckbox =  By.xpath("//label[text()='Mexico' or text()='México']");
	public By objLangEspCheckbox = By.xpath("//label[text()='Spanish' or text()='Español']");
	public By objLangEngCheckbox = By.xpath("//label[text()='English' or text()='Ingles']");
	
	//Constructor
	public LinkedIn_SearchPage (WebDriver pwdDriver) {
		super(pwdDriver);
	}
	
	public LinkedIn_SearchPage fnEnterSearchText(String pstrSearchText) {
		fnClick(strSearchField);
		fnWriteText(strSearchField,pstrSearchText);
		return this;
	}
	
	public LinkedIn_SearchPage fnClickLangEn() {
		fnClick(objLangEngCheckbox);
		return this;
	}
	
	public LinkedIn_SearchPage fnClickLangEs() {
		fnClick(objLangEspCheckbox);
		return this;
	}
	
	public LinkedIn_SearchPage fnClickAllFilter() {
		fnClick(btnAllFilter);
		return this;
	}
	
	public LinkedIn_SearchPage fnClickPeople() {
		fnClick(btnPeople);
		return this;
	}
	
	public LinkedIn_SearchPage fnClickSearchBtn() {
		fnClick(btnSearch);
		return this;
	}
	
	
}
