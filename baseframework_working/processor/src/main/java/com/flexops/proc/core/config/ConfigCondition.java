package com.flexops.proc.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConfigCondition implements Condition{

	@Autowired
	private Environment env;
  
	@Autowired
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println("Metadata:"  + metadata.toString());
		return context.getEnvironment().getProperty("jms.startup.enable").contains("true");  
	}
}