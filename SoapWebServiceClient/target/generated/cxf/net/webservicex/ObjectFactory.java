
package net.webservicex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.webservicex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://www.webserviceX.NET", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUKLocationByCounty }
     * 
     */
    public GetUKLocationByCounty createGetUKLocationByCounty() {
        return new GetUKLocationByCounty();
    }

    /**
     * Create an instance of {@link GetUKLocationByCountyResponse }
     * 
     */
    public GetUKLocationByCountyResponse createGetUKLocationByCountyResponse() {
        return new GetUKLocationByCountyResponse();
    }

    /**
     * Create an instance of {@link GetUKLocationByTown }
     * 
     */
    public GetUKLocationByTown createGetUKLocationByTown() {
        return new GetUKLocationByTown();
    }

    /**
     * Create an instance of {@link GetUKLocationByTownResponse }
     * 
     */
    public GetUKLocationByTownResponse createGetUKLocationByTownResponse() {
        return new GetUKLocationByTownResponse();
    }

    /**
     * Create an instance of {@link GetUKLocationByPostCode }
     * 
     */
    public GetUKLocationByPostCode createGetUKLocationByPostCode() {
        return new GetUKLocationByPostCode();
    }

    /**
     * Create an instance of {@link GetUKLocationByPostCodeResponse }
     * 
     */
    public GetUKLocationByPostCodeResponse createGetUKLocationByPostCodeResponse() {
        return new GetUKLocationByPostCodeResponse();
    }

    /**
     * Create an instance of {@link ValidateUKAddress }
     * 
     */
    public ValidateUKAddress createValidateUKAddress() {
        return new ValidateUKAddress();
    }

    /**
     * Create an instance of {@link ValidateUKAddressResponse }
     * 
     */
    public ValidateUKAddressResponse createValidateUKAddressResponse() {
        return new ValidateUKAddressResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
