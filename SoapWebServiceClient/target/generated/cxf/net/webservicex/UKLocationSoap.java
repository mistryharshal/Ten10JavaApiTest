package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-05T19:45:59.147Z
 * Generated source version: 3.2.2
 *
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "UKLocationSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface UKLocationSoap {

    /**
     * Get UK town,Postcode and County by Postcode(First Section of Post Code)
     */
    @WebMethod(operationName = "GetUKLocationByPostCode", action = "http://www.webserviceX.NET/GetUKLocationByPostCode")
    @RequestWrapper(localName = "GetUKLocationByPostCode", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByPostCode")
    @ResponseWrapper(localName = "GetUKLocationByPostCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByPostCodeResponse")
    @WebResult(name = "GetUKLocationByPostCodeResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getUKLocationByPostCode(
        @WebParam(name = "PostCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String postCode
    );

    /**
     * Get UK town,Postcode and County by full /partial Town
     */
    @WebMethod(operationName = "GetUKLocationByTown", action = "http://www.webserviceX.NET/GetUKLocationByTown")
    @RequestWrapper(localName = "GetUKLocationByTown", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByTown")
    @ResponseWrapper(localName = "GetUKLocationByTownResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByTownResponse")
    @WebResult(name = "GetUKLocationByTownResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getUKLocationByTown(
        @WebParam(name = "Town", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String town
    );

    /**
     * Validate UK address,Use First Section of Poscode for Postcode atribute
     */
    @WebMethod(operationName = "ValidateUKAddress", action = "http://www.webserviceX.NET/ValidateUKAddress")
    @RequestWrapper(localName = "ValidateUKAddress", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.ValidateUKAddress")
    @ResponseWrapper(localName = "ValidateUKAddressResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.ValidateUKAddressResponse")
    @WebResult(name = "ValidateUKAddressResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String validateUKAddress(
        @WebParam(name = "Town", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String town,
        @WebParam(name = "County", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String county,
        @WebParam(name = "PostCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String postCode
    );

    /**
     * Get UK town,Postcode and County by full /partial County
     */
    @WebMethod(operationName = "GetUKLocationByCounty", action = "http://www.webserviceX.NET/GetUKLocationByCounty")
    @RequestWrapper(localName = "GetUKLocationByCounty", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCounty")
    @ResponseWrapper(localName = "GetUKLocationByCountyResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetUKLocationByCountyResponse")
    @WebResult(name = "GetUKLocationByCountyResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getUKLocationByCounty(
        @WebParam(name = "County", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String county
    );
}
