package it.univaq.sose.example.wssecurity.cxf.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.stereotype.Service;

import it.univaq.sose.example.wssecurity.cxf.WSSecurityInterceptor;
import it.univaq.sose.sumservice.schema.GetSumRequest;
import it.univaq.sose.sumservice.schema.GetSumResponse;
import it.univaq.sose.sumservice.wsdl.SumServicePort;

@Service
@SchemaValidation(type = SchemaValidationType.REQUEST)
@InInterceptors(classes = WSSecurityInterceptor.class)
public class SumServiceImpl implements SumServicePort {

	@Override
	public GetSumResponse getSum(GetSumRequest parameters) {
		GetSumResponse response = new GetSumResponse();
		response.setResult(parameters.getAddendOne() + parameters.getAddendTwo());
		return response;
	}

}