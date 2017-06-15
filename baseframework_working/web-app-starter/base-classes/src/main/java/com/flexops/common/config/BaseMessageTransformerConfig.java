package com.flexops.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.castor.CastorMarshaller;

import com.flexops.common.transformer.JsonTransformer;

@Configuration
public class BaseMessageTransformerConfig {
	
	@Bean(name={"marshaller,unmarshaller"})
	public Marshaller marshaller(){
		CastorMarshaller castorMarshaller = new CastorMarshaller();
		return castorMarshaller;
	}
	
	@Bean(name="jsonTransformer")
    public JsonTransformer getMapper() {
		return new JsonTransformer();
    }
}
