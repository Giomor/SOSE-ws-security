package it.andreascanzani.sumservice.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2023-04-16T15:59:07.761+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://andreascanzani.it/SumService/wsdl", name = "SumServicePort")
@XmlSeeAlso({it.andreascanzani.sumservice.schema.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SumServicePort {

    @WebMethod(operationName = "GetSum", action = "http://andreascanzani.it/SumService/GetSum")
    @WebResult(name = "GetSumResponse", targetNamespace = "http://andreascanzani.it/SumService/schema", partName = "parameters")
    public it.andreascanzani.sumservice.schema.GetSumResponse getSum(
        @WebParam(partName = "parameters", name = "GetSumRequest", targetNamespace = "http://andreascanzani.it/SumService/schema")
        it.andreascanzani.sumservice.schema.GetSumRequest parameters
    );
}
