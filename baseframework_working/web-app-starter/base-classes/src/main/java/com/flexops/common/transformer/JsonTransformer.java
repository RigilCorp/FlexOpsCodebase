package com.flexops.common.transformer;

import org.springframework.integration.support.json.Jackson2JsonObjectMapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTransformer{
	private Jackson2JsonObjectMapper objectMapper;

	public JsonTransformer() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		objectMapper = new Jackson2JsonObjectMapper(mapper);
	}

	public String toJson(Object value) throws RuntimeException {
		try {
			return objectMapper.toJson(value);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public Object toObject(String json, Class<?> valueType)
			throws RuntimeException {
		try {
			return objectMapper.fromJson(json, valueType);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
