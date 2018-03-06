package com.demo.selenium.automation.bdd_jbehave_automation.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.jcabi.aspects.Loggable;

/**
 * @author Harshal Mistry
 *
 */
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class SearchResult extends PageObject {

    public SearchResult(final WebDriver driver){
        super(driver);
    }

    @FindBy(css="#p-lang div ul li.interlanguage-link.interwiki-en")
	private WebElementFacade linkEnglish;
    
    
    @Loggable(Loggable.INFO)
	public void uservalidatethatthefirstheadingofthesearchresultspagematchesthesearchstring(String parameter) {
    	assertTrue("Page Header does not match", getDriver().getTitle().toLowerCase().contains(parameter.trim()));
	}
    
    @Loggable(Loggable.INFO)
	public void verifythatthesearchresultspageisavailableinalanguagegivenasparameter(String language) {
		String urlLanguage = null;
    	
    	switch (language) {
		
		case "English":
			urlLanguage = "en.wikipedia.org";
			break;
		
		case "Italiano":
			urlLanguage = "it.wikipedia.org";
			break;
				
		case "Deutsch":
			urlLanguage = "de.wikipedia.org";
			break;
		
		case "Espanol":
			urlLanguage = "es.wikipedia.org";
			break;
			
		default :
			urlLanguage = "en.wikipedia.org";
			break;
		}
		assertTrue("Page language does not match", getDriver().getCurrentUrl().contains(urlLanguage.trim()));
	}

    
    @Loggable(Loggable.INFO)
	public void navigatetothesearchresultspageinthatlanguage(String otherLanguage) {
    	
		String urlLanguage = null;
		System.out.println(otherLanguage);
		
    	
    	switch (otherLanguage) {
		
		case "English":
			urlLanguage = "https://en.wikipedia.org/";
			break;
		
		case "Italiano":
			urlLanguage = "https://it.wikipedia.org/";
			break;
				
		case "Deutsch":
			urlLanguage = "https://de.wikipedia.org/";
			break;
		
		case "Espanol":
			urlLanguage = "https://es.wikipedia.org/";
			break;
			
		default :
			urlLanguage = "https://en.wikipedia.org/";
			break;
		}
       	getDriver().navigate().to(urlLanguage);
       	getDriver().navigate().to(urlLanguage);
	}
    
    @Loggable(Loggable.INFO)
	public void validateLinkToEnglish() {
		assertTrue("English language link does not exists", linkEnglish.isPresent());
		assertTrue("English language link does not exists", linkEnglish.isPresent());
	}

}