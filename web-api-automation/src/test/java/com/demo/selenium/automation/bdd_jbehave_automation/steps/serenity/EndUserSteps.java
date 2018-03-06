package com.demo.selenium.automation.bdd_jbehave_automation.steps.serenity;

import static org.junit.Assert.assertEquals;

import javax.xml.soap.*;

import com.demo.selenium.automation.bdd_jbehave_automation.pages.EnquiryPage;
import com.demo.selenium.automation.bdd_jbehave_automation.pages.MainPage;
import com.demo.selenium.automation.bdd_jbehave_automation.pages.SearchResult;
import com.demo.selenium.automation.bdd_jbehave_automation.steps.SoapInvokeHelper;
import com.jcabi.aspects.Loggable;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2863126367800874621L;
	MainPage mainPage;
	EnquiryPage enquiryPage;
	SearchResult serachResult;
	private String[] strArray;
	private int resultLength;
	private static String county;
	SoapInvokeHelper soapInvokerHelper;

	@Loggable(Loggable.INFO)
	@Step
	public void usernavigatestothewikipediahomepage() {
		mainPage.isUserOnHomePage();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void usersearchforagivenstringinlanguage(String language) {
		mainPage.usersearchforagivenstringinlanguage(language);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void usertypeinastringinthesearchinputfield(String parameter) {
		enquiryPage.usertypeinastringinthesearchinputfield(parameter);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userclickthesearchbuttons() {
		enquiryPage.userclickthesearchbuttons();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void uservalidatethatthefirstheadingofthesearchresultspagematchesthesearchstring(String parameter) {
		serachResult.uservalidatethatthefirstheadingofthesearchresultspagematchesthesearchstring(parameter);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void verifythatthesearchresultspageisavailableinalanguagegivenasparameter(String language) {
		serachResult.verifythatthesearchresultspageisavailableinalanguagegivenasparameter(language);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void navigatetothesearchresultspageinthatlanguage(String otherLanguage) {
		serachResult.navigatetothesearchresultspageinthatlanguage(otherLanguage);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void validatethatthesearchresultspagelinktotheversioninEnglish() {
		serachResult.validateLinkToEnglish();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void anunorderedarrayofintegersasInput(String input) {
		System.out.println(input);
		strArray = input.split("\\s");
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userprogramcalculateslenghtoflongest() {
		anUnorderedArrayOfIntegersInput(strArray);
	}

	public void anUnorderedArrayOfIntegersInput(String[] array) {

		int inputArr[] = strArrayToIntArray(array);
		int length = 1;
		resultLength = 1;

		for (int i = 0; i < inputArr.length - 1; i++) {

			if (inputArr[i + 1] > inputArr[i]) {
				length += 1;
			} else {
				length = 1;
			}
			if (resultLength < length) {
				resultLength = length;
			}

		}
		System.out.println("Output subsequence length :" + resultLength);
		System.out.println("Output subsequence length :" + resultLength);
	}

	public static int[] strArrayToIntArray(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}

		return b;
	}
	
	@Loggable(Loggable.INFO)
	@Step
	public void usergetthelengthoforderedsubsequencewhichequalsto(int output) {
		assertEquals("Array length not as expected", output, resultLength);
	}
	
	
	
	@Loggable(Loggable.INFO)
	@Step
	public void Giventheusersearchesforcounty(String county) {
		System.out.println("Giventheusersearchesforcounty ");
        
        /**
         * Get UK town,Postcode and County by full /partial County
         */
/*        @WebMethod(operationName = "GetUKLocationByCounty", action = "http://www.webserviceX.NET/GetUKLocationByCounty")
        @RequestWrapper(localName = "GetUKLocationByCounty", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCounty")
        @ResponseWrapper(localName = "GetUKLocationByCountyResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCountyResponse")
        @WebResult(name = "GetUKLocationByCountyResult", targetNamespace = "http://www.webserviceX.NET")
        public java.lang.String getUKLocationByCounty(
            @WebParam(name = "County", targetNamespace = "http://www.webserviceX.NET")
            java.lang.String county
        );*/
        
        
        //String soapEndpointUrl = "http://www.webservicex.net/uklocation.asmx?op=GetUKLocationByCounty";
        String soapEndpointUrl = "http://www.webservicex.net/uklocation.asmx?WSDL";
        
        String soapAction = "http://www.webserviceX.NET/GetUKLocationByCounty";

       		
        SoapInvokeHelper.callSoapWebService(soapEndpointUrl, soapAction, county);

		
	}

	@Loggable(Loggable.INFO)
	@Step
	public void retrieveUKlocationValidateResult(String parameter) {
		System.out.println("retrieveUKlocationValidateResult"+ parameter);
		
	}
	

}