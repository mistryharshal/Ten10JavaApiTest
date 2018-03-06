package com.demo.selenium.automation.bdd_jbehave_automation.pages;

import org.openqa.selenium.WebDriver;

import com.jcabi.aspects.Loggable;

/**
 * @author Harshal Mistry
 *
 */
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class MainPage extends PageObject {

	public MainPage(final WebDriver driver){
		super(driver);
	}
	
	final static String START_URL = "https://www.wikipedia.org/";
	
	@DefaultUrl(MainPage.START_URL)
	final class StartMainPage extends PageObject{
		public StartMainPage(final WebDriver driver){
			super(driver);
		}
	}
	
	@FindBy(xpath="//*[@id=\"js-link-box-en\"]/strong")
	private WebElementFacade lblEnglish;
	
	@FindBy(xpath="//*[@id=\"js-link-box-it\"]/strong")
	private WebElementFacade lblItaliano;
	
	@FindBy(xpath="//*[@id=\"js-link-box-de\"]/strong")
	private WebElementFacade lblDeutsch;
	
	@FindBy(xpath="//*[@id=\"js-link-box-es\"]/strong")
	private WebElementFacade lblEspanol;
	

    @Loggable(Loggable.INFO)
	public void isUserOnHomePage() {
		PageObject page = new StartMainPage(getDriver());
		page.open();
	}
    
    @Loggable(Loggable.INFO)
	public EnquiryPage usersearchforagivenstringinlanguage(String language) {
		switch (language) {
			
		case "English":
			lblEnglish.click();
			break;
		
		case "Italiano":
			lblItaliano.click();
			break;
				
		case "Deutsch":
			lblDeutsch.click();
			break;
		
		case "Espanol":
			lblEspanol.click();
			break;
			
		default :
			lblEnglish.click();
			break;
		}
		return new EnquiryPage(getDriver());
	}
}