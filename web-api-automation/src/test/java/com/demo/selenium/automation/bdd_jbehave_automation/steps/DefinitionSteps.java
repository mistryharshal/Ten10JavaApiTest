package com.demo.selenium.automation.bdd_jbehave_automation.steps;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.soap.*;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import com.demo.selenium.automation.bdd_jbehave_automation.steps.serenity.EndUserSteps;
import com.jcabi.aspects.Loggable;


import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {
	
	@Steps
    EndUserSteps endUser;
	
    
    @Loggable(Loggable.INFO)
    @Given("user navigates to the wikipedia home page")
    public void usernavigatestothewikipediahomepage() {
        endUser.usernavigatestothewikipediahomepage();
    }
    
    @Loggable(Loggable.INFO)
    @When("user search for a given string in $language")
    public void usersearchforagivenstringinlanguage(String language) {
        endUser.usersearchforagivenstringinlanguage(language);
    }
    

    @Loggable(Loggable.INFO)
    @When("user type in a string $parameter in the search input field")
    public void usertypeinastringinthesearchinputfield(String parameter) {
        endUser.usertypeinastringinthesearchinputfield(parameter);
    }
    
    @Loggable(Loggable.INFO)
    @When("user click the search button")
    public void userclickthesearchbutton() {
        endUser.userclickthesearchbuttons();
    }

    @Loggable(Loggable.INFO)
    @Then("user validate that the first heading of the search results page matches the search string $parameter")
    public void uservalidatethatthefirstheadingofthesearchresultspagematchesthesearchstring(String parameter) {
        endUser.uservalidatethatthefirstheadingofthesearchresultspagematchesthesearchstring(parameter);
    }

    @Loggable(Loggable.INFO)
    @Then("verify that the search results page is available in a language given as parameter $language")
    public void verifythatthesearchresultspageisavailableinalanguagegivenasparameter(String language) {
        endUser.verifythatthesearchresultspageisavailableinalanguagegivenasparameter(language);
    }
    
    @Loggable(Loggable.INFO)
    @When("navigate to the search results page in any other language $otherLanguage")
    public void navigatetothesearchresultspageinthatlanguage(String otherLanguage) {
        endUser.navigatetothesearchresultspageinthatlanguage(otherLanguage);
    }

    @Loggable(Loggable.INFO)
    @Then("validate that the search results page in the new language includes a link to the version in English")
    public void validatethatthesearchresultspagelinktotheversioninEnglish() {
        endUser.validatethatthesearchresultspagelinktotheversioninEnglish();
    }
    
    
    
    
    @Loggable(Loggable.INFO)
    @Given("an unordered array of integers as $input")
    public void anunorderedarrayofintegersasInput(String input) {
        endUser.anunorderedarrayofintegersasInput(input);
    }

    
    @Loggable(Loggable.INFO)
    @When("user program calculates lenght of longest order")
    public void userprogramcalculateslenghtoflongestorder() {
        endUser.userprogramcalculateslenghtoflongest();
    }
    
    @Loggable(Loggable.INFO)
    @Then("user get the length of ordered subsequence which equals to $output")
    public void usergetthelengthoforderedsubsequencewhichequalsto(int output) {
        endUser.usergetthelengthoforderedsubsequencewhichequalsto(output);
    }
    
    @Loggable(Loggable.INFO)
    @Given("the user searches for county $county")
    public void Giventheusersearchesforcounty(String county) {
        endUser.Giventheusersearchesforcounty(county);
       
    }
    
    @Loggable(Loggable.INFO)
    @Then("user retrieve the UK location and validate the result as per parameter $parameter")
    public void retrieveUKlocationValidateResult(String parameter) {
        endUser.retrieveUKlocationValidateResult(parameter);
    }

}