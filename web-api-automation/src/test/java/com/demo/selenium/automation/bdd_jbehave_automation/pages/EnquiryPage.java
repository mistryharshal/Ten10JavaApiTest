package com.demo.selenium.automation.bdd_jbehave_automation.pages;

import org.openqa.selenium.WebDriver;

import com.jcabi.aspects.Loggable;

/**
 * @author Harshal Mistry
 *
 */
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class EnquiryPage extends PageObject {

	public EnquiryPage(final WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"searchInput\"]")
	private WebElementFacade txtSearch;

	@FindBy(xpath="//*[@id=\"searchButton\"]")
	private WebElementFacade btnSearch;
	
    @Loggable(Loggable.INFO)
	public void usertypeinastringinthesearchinputfield(String parameter) {
		txtSearch.sendKeys(parameter);
	}
	
	@Loggable(Loggable.INFO)
	public SearchResult userclickthesearchbuttons() {
    	btnSearch.click();
    	return new SearchResult(getDriver());
	}

}